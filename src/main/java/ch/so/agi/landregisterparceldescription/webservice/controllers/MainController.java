package ch.so.agi.landregisterparceldescription.webservice.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;
import org.springframework.beans.factory.annotation.Autowired;

import ch.so.agi.landregisterparceldescription.webservice.services.GetExtractByIdResponseServiceImpl;
import ch.so.agi.landregisterparceldescription.webservice.services.GetParcelsByIdServiceImpl;
import ch.so.agi.landregisterparceldescription.webservice.services.GetPdfExtractByIdServiceImpl;
import ch.so.agi.landregisterparceldescription.webservice.services.ImageServiceException;
import ch.so.geo.schema.agi.landregisterparceldescription._1_0.extract.GetExtractByIdResponse;
import net.sf.saxon.s9api.SaxonApiException;

@RestController
public class MainController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    GetExtractByIdResponseServiceImpl getExtractByIdResponseTypeService;
    
    @Autowired
    GetPdfExtractByIdServiceImpl getPdfExtractByIdService;
    
    @Autowired
    GetParcelsByIdServiceImpl getParcelsByIdService;
    
    @RequestMapping(value="/extract/xml/{egrid:.{14,14}}", method=RequestMethod.GET,
            produces={MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<?> getXmlExtractById (
            @PathVariable("egrid") String egrid) throws Exception {
        GetExtractByIdResponse extractResponse = getExtractByIdResponseTypeService.getExtractById(egrid);
        return ResponseEntity.ok(extractResponse);
    }

    @RequestMapping(value="/extract/pdf/{egrid:.{14,14}}", method=RequestMethod.GET,
            produces={MediaType.APPLICATION_PDF_VALUE})
    public @ResponseBody byte[] getPdfExtractById (
            @PathVariable("egrid") String egrid) throws Exception {
        File pdf = getPdfExtractByIdService.getExtract(egrid);
        InputStream in = new FileInputStream(pdf);
        return IOUtils.toByteArray(in);
    }
    
//    @RequestMapping(value="/fubar/xml/{egrid:.{14,14}}", method=RequestMethod.GET)
//    public @ResponseBody void getParcelsById (
//            @PathVariable("egrid") String egrid) throws Exception {
//            
//        try {
//            getParcelsByIdService.getParcelById(egrid);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    @ExceptionHandler({Exception.class})
    private ResponseEntity<?> handleBadRequests(Exception e) {
        log.error(e.getMessage());      
        return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
