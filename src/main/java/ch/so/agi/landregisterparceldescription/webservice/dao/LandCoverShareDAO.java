package ch.so.agi.landregisterparceldescription.webservice.dao;

import java.util.List;
import ch.so.agi.landregisterparceldescription.webservice.models.LandCoverShare;

public interface LandCoverShareDAO {
    List<LandCoverShare> getLandCoverShareByEgrid(String egrid);
}
