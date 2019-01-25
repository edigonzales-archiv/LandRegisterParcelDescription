package ch.so.agi.landregisterparceldescription.webservice.services;

import ch.admin.geo.schemas.bj.tgbv.gbdbs._2.GetParcelsByIdResponse;

public interface GetParcelsByIdService {
    GetParcelsByIdResponse getParcelById(String egrid) throws Exception;
}
