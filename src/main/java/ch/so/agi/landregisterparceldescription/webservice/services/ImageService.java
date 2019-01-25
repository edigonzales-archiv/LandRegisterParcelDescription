package ch.so.agi.landregisterparceldescription.webservice.services;

import ch.so.agi.landregisterparceldescription.webservice.models.Parcel;

public interface ImageService {
    byte[] getWmsImage(String url, String layerName, Parcel parcel) throws ImageServiceException;
    
    String getWmsGetMapRequest(String url, String layerName, Parcel parcel) throws Exception;
}
