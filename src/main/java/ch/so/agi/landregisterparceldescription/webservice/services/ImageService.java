package ch.so.agi.landregisterparceldescription.webservice.services;

import java.io.IOException;
import java.net.URISyntaxException;

public interface ImageService {
    byte[] getWmsImage(String url, String layerName, double xMin, double xMax, double yMin, double yMax) throws IOException, URISyntaxException;
}
