package ch.so.agi.landregisterparceldescription.webservice.dao;

import java.util.List;

import ch.so.agi.landregisterparceldescription.webservice.models.BuildingAddress;

public interface BuildingAddressDAO {
    List<BuildingAddress> getBuildingAddressByEgrid(String egrid);
}
