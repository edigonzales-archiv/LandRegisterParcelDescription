package ch.so.agi.landregisterparceldescription.webservice.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

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

import ch.so.agi.landregisterparceldescription.webservice.services.GetExtractByIdResponseTypeServiceImpl;
import ch.so.agi.landregisterparceldescription.webservice.services.GetPdfExtractByIdServiceImpl;
import ch.so.geo.schema.agi.landregisterparceldescription._1_0.extract.GetExtractByIdResponse;
import net.sf.saxon.s9api.SaxonApiException;

@RestController
public class MainController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    GetExtractByIdResponseTypeServiceImpl getExtractByIdResponseTypeService;
    
    @Autowired
    GetPdfExtractByIdServiceImpl getPdfExtractByIdService;
    
    @RequestMapping(value="/extract/xml/{egrid:.{14,14}}", method=RequestMethod.GET,
            produces={MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<?> getXmlExtractById (
            @PathVariable("egrid") String egrid) throws DatatypeConfigurationException {
        GetExtractByIdResponse extractResponse = getExtractByIdResponseTypeService.getExtractById(egrid);
        return ResponseEntity.ok(extractResponse);
    }

    @RequestMapping(value="/extract/pdf/{egrid:.{14,14}}", method=RequestMethod.GET,
            produces={MediaType.APPLICATION_PDF_VALUE})
    public @ResponseBody byte[] getPdfExtractById (
            @PathVariable("egrid") String egrid) throws DatatypeConfigurationException, IOException, JAXBException, SaxonApiException, SAXException, TransformerException {
        File pdf = getPdfExtractByIdService.getExtract(egrid);
        InputStream in = new FileInputStream(pdf);
        return IOUtils.toByteArray(in);
    }
    
    @ExceptionHandler({IllegalArgumentException.class, NumberFormatException.class, org.springframework.web.bind.UnsatisfiedServletRequestParameterException.class, DatatypeConfigurationException.class, SAXException.class, TransformerConfigurationException.class, TransformerException.class})
    private ResponseEntity<?> handleBadRequests(Exception e) {
        log.error(e.getMessage());      
        return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
