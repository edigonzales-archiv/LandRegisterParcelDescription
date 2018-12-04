package ch.so.agi.landregisterparceldescription.webservice.services;

import java.io.IOException;
import java.net.URISyntaxException;

import ch.so.agi.landregisterparceldescription.webservice.models.Parcel;

public interface ImageService {
    byte[] getWmsImage(String url, String layerName, Parcel parcel) throws ImageServiceException;
}
