package ch.so.agi.landregisterparceldescription.webservice.services;

import javax.xml.datatype.DatatypeConfigurationException;

import ch.so.geo.schema.agi.landregisterparceldescription._1_0.extract.GetExtractByIdResponse;

public interface GetExtractByIdResponseTypeService {
    GetExtractByIdResponse getExtractById(String egrid) throws DatatypeConfigurationException;
}
