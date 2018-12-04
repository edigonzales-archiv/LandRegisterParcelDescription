package ch.so.agi.landregisterparceldescription.webservice.services;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.LaxRedirectStrategy;
import org.locationtech.jts.geom.Envelope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Value("${parcel.description.map.map-width-mm}")
    private double mapWidthMM;
    
    @Value("${parcel.description.map.map-height-mm}")
    private double mapHeightMM;
    
    @Value("${parcel.description.map.dpi}")
    private int dpi;
    
    final private double mapScaleFactor = 1.05;

    @Override
    public byte[] getWmsImage(String url, String layerName, double xMin, double xMax, double yMin, double yMax) throws IOException, URISyntaxException {
                
        String wmsBbox = calculateBoundingBox(xMin, xMax, yMin, yMax);
        log.info(wmsBbox);

        String getMapRequest = createGetMapRequest(url, layerName, wmsBbox);
        log.info(getMapRequest);
            
        CloseableHttpClient httpclient = HttpClients.custom()
                .setRedirectStrategy(new LaxRedirectStrategy()) // adds HTTP REDIRECT support to GET and POST methods 
                .build(); 
        
        byte[] imageInByte;
        try {
            
            HttpGet get = new HttpGet(new URL(getMapRequest).toURI()); 
            CloseableHttpResponse response = httpclient.execute(get);
            InputStream inputStream = response.getEntity().getContent();
            BufferedImage image = ImageIO.read(inputStream);

//            Path tmpDirectory = Files.createTempDirectory(Paths.get(System.getProperty("java.io.tmpdir")), "oereb");
//            Path outputfilePath = Paths.get(tmpDirectory.toString(), "image.png");
//            ImageIO.write(image, "png", outputfilePath.toFile());
//            log.info(outputfilePath.toString());

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(image, "png", baos); 
            baos.flush();
            imageInByte = baos.toByteArray();
            baos.close();
        } finally {
            httpclient.close();
        }
        return imageInByte;
    }
    
    private String createGetMapRequest(String url, String layerName, String bbox) {
        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append(url);
        queryBuilder.append("?SERVICE=WMS&VERSION=1.3.0&REQUEST=GetMap&FORMAT=image/png");
        queryBuilder.append("&SRS=EPSG:2056&CRS=EPSG:2056&LAYERS="+layerName);
        queryBuilder.append("&DPI="+dpi);
        
        double wmsWidthPx = mapWidthMM / 25.4 * dpi;
        double wmsHeightPx = wmsWidthPx / (mapWidthMM / mapHeightMM);
        queryBuilder.append("&WIDTH="+Math.round(wmsWidthPx));
        queryBuilder.append("&HEIGHT="+Math.round(wmsHeightPx));
        
        queryBuilder.append("&BBOX="+bbox);
        
        return queryBuilder.toString();
    }
    
    private String calculateBoundingBox(double xMin, double xMax, double yMin, double yMax) {
        double parcelExtentRatio = (xMax - xMin) / (yMax - yMin);
        double minX;
        double minY;
        double maxX;
        double maxY;
        double midpointX = xMin + (xMax - xMin)/2;
        double midpointY = yMin + (yMax - yMin)/2;

        double extractMapRatio = mapWidthMM / mapHeightMM;
        
        if (extractMapRatio < parcelExtentRatio) {
            minX = midpointX - (xMax - xMin)/2;
            minY = midpointY - ((xMax - xMin)/2 / extractMapRatio);
            
            maxX = midpointX + (xMax - xMin)/2;
            maxY = midpointY + ((xMax - xMin)/2 / extractMapRatio);
        } else {
            minX = midpointX - (yMax - yMin)/2 * extractMapRatio;
            minY = midpointY - ((yMax - yMin)/2 );
            
            maxX = midpointX + (yMax - yMin)/2 * extractMapRatio;
            maxY = midpointY + ((yMax - yMin)/2 );
        }
        
        // Must be the same as extractMapRatio.
        double l = maxX - minX;
        double h = maxY - minY;
        log.info(String.valueOf("bboxRatio: " + l/h) + " -- extractMapRatio: " + extractMapRatio);

        // Expand bbox to get a better visual result.
        Envelope bboxEnvelope = new Envelope(minX, maxX, minY, maxY);
        double expandDistance = (bboxEnvelope.getMaxX() - bboxEnvelope.getMinX()) * mapScaleFactor - (bboxEnvelope.getMaxX() - bboxEnvelope.getMinX());
        bboxEnvelope.expandBy(expandDistance, expandDistance / extractMapRatio);
        
        String wmsBbox = bboxEnvelope.getMinX() + "," + bboxEnvelope.getMinY() + "," + bboxEnvelope.getMaxX()  + "," + bboxEnvelope.getMaxY();
        return wmsBbox;
    }
}
