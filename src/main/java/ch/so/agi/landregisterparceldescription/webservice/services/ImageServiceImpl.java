package ch.so.agi.landregisterparceldescription.webservice.services;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.LaxRedirectStrategy;
import org.geotools.data.DataUtilities;
import org.geotools.factory.CommonFactoryFinder;
import org.geotools.factory.Hints;
import org.geotools.feature.DefaultFeatureCollection;
import org.geotools.feature.FeatureCollection;
import org.geotools.feature.SchemaException;
import org.geotools.feature.simple.SimpleFeatureBuilder;
import org.geotools.geometry.jts.ReferencedEnvelope;
import org.geotools.map.FeatureLayer;
import org.geotools.map.MapContent;
import org.geotools.map.MapViewport;
import org.geotools.referencing.CRS;
import org.geotools.renderer.GTRenderer;
import org.geotools.renderer.lite.StreamingRenderer;
import org.geotools.styling.FeatureTypeStyle;
import org.geotools.styling.PolygonSymbolizer;
import org.geotools.styling.Rule;
import org.geotools.styling.Stroke;
import org.geotools.styling.Style;
import org.geotools.styling.StyleFactory;
import org.geotools.styling.StyleFactoryImpl;
import org.locationtech.jts.geom.Envelope;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.io.ParseException;
import org.locationtech.jts.io.WKBReader;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;
import org.opengis.filter.FilterFactory2;
import org.opengis.referencing.FactoryException;
import org.opengis.referencing.crs.CoordinateReferenceSystem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import ch.so.agi.landregisterparceldescription.webservice.models.Parcel;
import ch.so.agi.landregisterparceldescription.webservice.util.ScalebarGenerator;

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

    final private String imageFormat = "png";

    @Override
    public byte[] getWmsImage(String url, String layerName, Parcel parcel) throws ImageServiceException {
        WKBReader wkbReader = new WKBReader();
        Geometry polygon = null;
        try {
            polygon = wkbReader.read(parcel.getGeometry());
        } catch (ParseException e) {
            e.printStackTrace();
            throw new ImageServiceException(e.getMessage());
        }

        Envelope mapEnvelope = calculateBoundingBox(polygon);
        log.info(mapEnvelope.toString());

        String getMapRequest = createGetMapRequest(url, layerName, mapEnvelope);
        log.info(getMapRequest);

        // LaxRedirectStrategy() adds HTTP REDIRECT support to GET and POST methods
        CloseableHttpClient httpclient = HttpClients.custom().setRedirectStrategy(new LaxRedirectStrategy()).build();

        byte[] mapImageInByte = null;
        try {

            HttpGet get = new HttpGet(new URL(getMapRequest).toURI());
            log.info("Start wms request.");
            CloseableHttpResponse response = httpclient.execute(get);
            log.info("End wms request.");
            InputStream inputStream = response.getEntity().getContent();
            BufferedImage image = ImageIO.read(inputStream);

//            ImageIO.write(image, imageFormat, new File("/Users/stefan/tmp/grundbuchplan.png"));

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(image, imageFormat, baos);
            baos.flush();
            mapImageInByte = baos.toByteArray();
            baos.close();
        } catch (MalformedURLException | URISyntaxException e) {
            e.printStackTrace();
            throw new ImageServiceException(e.getMessage());
        } catch (ClientProtocolException e) {
            e.printStackTrace();
            throw new ImageServiceException(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new ImageServiceException(e.getMessage());
        } finally {
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
                log.error(e.getMessage());
            }
        }

        // Combine the images.
        byte[] combinedImageInByte = null;
        try {
            byte[] overlayImageInByte = createOverlayImage(parcel, mapEnvelope);
            byte[] scalebarImageInByte = createScalebarImage(mapEnvelope);

            InputStream insMapImage = new ByteArrayInputStream(mapImageInByte);
            BufferedImage mapBufferedImage = ImageIO.read(insMapImage);

            InputStream insOverlayImage = new ByteArrayInputStream(overlayImageInByte);
            BufferedImage overlayBufferedImage = ImageIO.read(insOverlayImage);

            InputStream insScalebarImage = new ByteArrayInputStream(scalebarImageInByte);
            BufferedImage scalebarBufferedImage = ImageIO.read(insScalebarImage);

            int imageWidthPx = (int) Math.round(mapWidthMM / 25.4 * dpi);
            int imageHeightPx = (int) Math.round(imageWidthPx / (mapWidthMM / mapHeightMM));
            BufferedImage combinedImage = new BufferedImage(imageWidthPx, imageHeightPx, BufferedImage.TYPE_INT_RGB);

            Graphics g = combinedImage.getGraphics();
            g.drawImage(mapBufferedImage, 0, 0, null);
            g.drawImage(overlayBufferedImage, 0, 0, null);
            g.drawImage(scalebarBufferedImage, 0, imageHeightPx - 100, null); // TODO: scalebar height!!

//            Path tmpDirectory = Files.createTempDirectory(Paths.get(System.getProperty("java.io.tmpdir")), "parceldescription_extract_");
//            Path outputfilePath = Paths.get(tmpDirectory.toString(), parcel.getEgrid()+".png");
////            ImageIO.write(combinedImage, imageFormat, outputfilePath.toFile());        
//            ImageIO.write(combinedImage, imageFormat, new File("/Users/stefan/tmp/combined.png"));
//            combinedImageInByte = Files.readAllBytes(outputfilePath);
//            log.info(outputfilePath.toString());

            ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
            ImageIO.write(combinedImage, imageFormat, baos2);
            baos2.flush();
            combinedImageInByte = baos2.toByteArray();
            baos2.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new ImageServiceException(e.getMessage());
        }
        return combinedImageInByte;
    }

    private byte[] createScalebarImage(Envelope mapEnvelope) throws ImageServiceException {
        double scale = mapEnvelope.getWidth() / (mapWidthMM / 1000);

        try {
            ScalebarGenerator scalebarGenerator = new ScalebarGenerator();
            scalebarGenerator.setColorText(Color.BLACK);
            scalebarGenerator.setDrawScaleText(false);
            scalebarGenerator.setHeight(75);
            scalebarGenerator.setTopMargin(20);
            scalebarGenerator.setLrbMargin(40);
            scalebarGenerator.setNumberOfSegments(3);
            byte[] image = scalebarGenerator.getImageAsByte(new Double(scale), 400, dpi);
            return image;
        } catch (IOException e) {
            e.printStackTrace();
            throw new ImageServiceException(e.getMessage());
        }
    }

    private byte[] createOverlayImage(Parcel parcel, Envelope mapEnvelope) throws ImageServiceException {
        FeatureCollection<SimpleFeatureType, SimpleFeature> collection = new DefaultFeatureCollection();
        SimpleFeatureType TYPE;
        try {
            // Create the feature, feature collection and a feature layer that can
            // be added to a map content.
            TYPE = DataUtilities.createType("Parcel", "the_geom:Polygon:srid=2056," + "egrid:String");
            SimpleFeatureBuilder featureBuilder = new SimpleFeatureBuilder(TYPE);

            WKBReader wkbReader = new WKBReader();
            Geometry polygon = wkbReader.read(parcel.getGeometry());
            polygon.setSRID(2056);

            featureBuilder.add(polygon);
            featureBuilder.add(parcel.getEgrid());
            SimpleFeature feature = featureBuilder.buildFeature(null);
            ((DefaultFeatureCollection) collection).add(feature);

            FilterFactory2 ff = CommonFactoryFinder.getFilterFactory2();
            StyleFactory sf = new StyleFactoryImpl();
            sf.stroke(ff.literal("#000000"), null, ff.literal(2.0), null, null, null, null);
            Style style = sf.createStyle();

            // This is a bitch...
            PolygonSymbolizer polygonSymbolizer = sf.createPolygonSymbolizer();
            Stroke stroke = sf.createStroke(ff.literal("#e60000"), ff.literal(6));
            stroke.setOpacity(ff.literal(0.4)); // opacity vs transparency?
            polygonSymbolizer.setStroke(stroke);
            Rule rl = sf.createRule();
            rl.symbolizers().add(polygonSymbolizer);
            FeatureTypeStyle ft = sf.createFeatureTypeStyle();
            ft.rules().add(rl);
            style.featureTypeStyles().add(ft);

            FeatureLayer fl = new FeatureLayer(collection, style);
            fl.setVisible(true);

            // Create the map content from which we export the image.
            MapContent map = new MapContent();
            MapViewport vp = new MapViewport();
            CoordinateReferenceSystem crs = CRS.decode("EPSG:2056");
            vp.setCoordinateReferenceSystem(crs);

            ReferencedEnvelope re = new ReferencedEnvelope(mapEnvelope, crs);
            vp.setBounds(re);
            map.setViewport(vp);
            map.addLayer(fl);

            // We need a renderer for exporting the image.
            GTRenderer renderer = new StreamingRenderer();
            renderer.setMapContent(map);

            int wmsWidthPx = (int) Math.round(mapWidthMM / 25.4 * dpi);
            int wmsHeightPx = (int) Math.round(wmsWidthPx / (mapWidthMM / mapHeightMM));
            Rectangle imageBounds = new Rectangle(wmsWidthPx, wmsHeightPx);
            BufferedImage image = new BufferedImage(imageBounds.width, imageBounds.height,
                    BufferedImage.TYPE_4BYTE_ABGR_PRE);

            Graphics2D gr = image.createGraphics();
            int type = AlphaComposite.SRC;
            gr.setComposite(AlphaComposite.getInstance(type));

            // TODO: not quite sure how this works
            // e.g. http://www.informit.com/articles/article.aspx?p=26349&seqNum=5
            Color c = new Color(255, 255, 255, 0);
            gr.setBackground(Color.white);
            gr.setColor(c);
            gr.fillRect(0, 0, image.getWidth(), image.getHeight());
            gr.setComposite(AlphaComposite.getInstance(type));

            RenderingHints renderingHints = new Hints();
            renderingHints.put(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            renderer.setJava2DHints(renderingHints);

            Map<Object, Object> rendererHints = new HashMap<Object, Object>();
            rendererHints.put(StreamingRenderer.DPI_KEY, dpi);
            renderer.setRendererHints(rendererHints);

            renderer.paint(gr, imageBounds, vp.getBounds());

//            ImageIO.write(image, imageFormat, new File("/Users/stefan/tmp/fubar3.png"));

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(image, imageFormat, baos);
            baos.flush();
            byte[] imageInByte = baos.toByteArray();
            baos.close();
            map.dispose();
            return imageInByte;
        } catch (FactoryException e) {
            e.printStackTrace();
            throw new ImageServiceException(e.getMessage());
        } catch (SchemaException e) {
            e.printStackTrace();
            throw new ImageServiceException(e.getMessage());
        } catch (ParseException e) {
            e.printStackTrace();
            throw new ImageServiceException(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new ImageServiceException(e.getMessage());
        }
    }

    private String createGetMapRequest(String url, String layerName, Envelope envelope) {
        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append(url);
        queryBuilder.append("?SERVICE=WMS&VERSION=1.3.0&REQUEST=GetMap&FORMAT=image/" + imageFormat);
        queryBuilder.append("&SRS=EPSG:2056&CRS=EPSG:2056&LAYERS=" + layerName);
        queryBuilder.append("&DPI=" + dpi);

        double wmsWidthPx = mapWidthMM / 25.4 * dpi;
        double wmsHeightPx = wmsWidthPx / (mapWidthMM / mapHeightMM);
        queryBuilder.append("&WIDTH=" + Math.round(wmsWidthPx));
        queryBuilder.append("&HEIGHT=" + Math.round(wmsHeightPx));

        String bbox = envelope.getMinX() + "," + envelope.getMinY() + "," + envelope.getMaxX() + ","
                + envelope.getMaxY();
        queryBuilder.append("&BBOX=" + bbox);

        return queryBuilder.toString();
    }

    private Envelope calculateBoundingBox(Geometry geom) {
        Envelope objectEnvelope = geom.getBoundary().getEnvelopeInternal();

        // Verhältnis von Breite und Höhe der BBOX des Original-Objekts.
        double objectExtentRatio = objectEnvelope.getWidth() / objectEnvelope.getHeight(); 
        double minX;
        double minY;
        double maxX;
        double maxY;
        double midpointX = objectEnvelope.getMinX() + objectEnvelope.getWidth() / 2;
        double midpointY = objectEnvelope.getMinY() + objectEnvelope.getHeight() / 2;
        double extractMapRatio = mapWidthMM / mapHeightMM; // Verhältnis von Breite und Höhe der Karte im PDF.

        if (extractMapRatio < objectExtentRatio) {
            minX = midpointX - objectEnvelope.getWidth() / 2;
            minY = midpointY - (objectEnvelope.getWidth() / 2 / extractMapRatio);

            maxX = midpointX + objectEnvelope.getWidth() / 2;
            maxY = midpointY + (objectEnvelope.getWidth() / 2 / extractMapRatio);
        } else {
            minX = midpointX - objectEnvelope.getHeight() / 2 * extractMapRatio;
            minY = midpointY - (objectEnvelope.getHeight() / 2);

            maxX = midpointX + objectEnvelope.getHeight() / 2 * extractMapRatio;
            maxY = midpointY + (objectEnvelope.getHeight() / 2);
        }

        // Must be the same as extractMapRatio.
        double l = maxX - minX;
        double h = maxY - minY;
        log.info(String.valueOf("bboxRatio: " + l / h) + " -- extractMapRatio: " + extractMapRatio);

        // Expand bbox to get a better visual result.
        Envelope bboxEnvelope = new Envelope(minX, maxX, minY, maxY);
        double expandDistance = (bboxEnvelope.getMaxX() - bboxEnvelope.getMinX()) * mapScaleFactor
                - (bboxEnvelope.getMaxX() - bboxEnvelope.getMinX());
        bboxEnvelope.expandBy(expandDistance, expandDistance / extractMapRatio);

        return bboxEnvelope;
    }
}
