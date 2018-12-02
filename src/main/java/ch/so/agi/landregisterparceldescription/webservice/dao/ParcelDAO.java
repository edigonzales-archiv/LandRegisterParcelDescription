package ch.so.agi.landregisterparceldescription.webservice.dao;

import ch.so.agi.landregisterparceldescription.webservice.models.Parcel;

public interface ParcelDAO {
    Parcel getParcelByEgrid(String egrid);
}
