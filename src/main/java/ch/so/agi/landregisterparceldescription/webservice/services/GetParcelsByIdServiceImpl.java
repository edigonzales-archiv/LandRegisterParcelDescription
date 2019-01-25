package ch.so.agi.landregisterparceldescription.webservice.services;

import java.io.ByteArrayOutputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.InhaltNatuerlichePersonGBType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.InhaltPersonGBType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.NatuerlichePersonType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.PersonGBType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.PersonStammType;
import ch.admin.geo.schemas.bj.tgbv.gbdbs._2.GetParcelsByIdResponse;
import ch.admin.geo.schemas.bj.tgbv.gbdbs._2.GetParcelsByIdResponse.Person;

@Service
public class GetParcelsByIdServiceImpl implements GetParcelsByIdService {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Value("${gbdbs.soap.endpointurl}")
    private String soapEndpointUrl;
    @Value("${gbdbs.soap.action}")
    private String soapAction;

    @Override
    public GetParcelsByIdResponse getParcelById(String egrid) throws Exception {
        return callSoapWebService(soapEndpointUrl, soapAction, egrid);        
    }

    private GetParcelsByIdResponse callSoapWebService(String soapEndpointUrl, String soapAction, String egrid) {
        GetParcelsByIdResponse getParcelsByIdResponse = null;
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send SOAP Message to SOAP Server
            SOAPMessage soapResponse = soapConnection.call(createSoapRequest(soapAction, egrid), soapEndpointUrl);

            // Print the SOAP Response
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            soapResponse.writeTo(out);
            String strMsg = new String(out.toByteArray());
            log.info("Response SOAP Message:");
            log.info(strMsg);
           
            soapConnection.close();
            
            Unmarshaller unmarshaller = JAXBContext.newInstance(GetParcelsByIdResponse.class).createUnmarshaller();
            getParcelsByIdResponse = (GetParcelsByIdResponse)unmarshaller.unmarshal(soapResponse.getSOAPBody().extractContentAsDocument());
            return getParcelsByIdResponse;
            
        } catch (Exception e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
        return getParcelsByIdResponse;
    }

    private SOAPMessage createSoapRequest(String soapAction, String egrid) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();

        createSoapEnvelope(soapMessage, egrid);

        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", soapAction);

        soapMessage.saveChanges();
                
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        soapMessage.writeTo(out);
        String strMsg = new String(out.toByteArray());
        log.info("Request SOAP Message:");
        log.info(strMsg);

        return soapMessage;
    }
    
    private static void createSoapEnvelope(SOAPMessage soapMessage, String egrid) throws SOAPException {
        SOAPPart soapPart = soapMessage.getSOAPPart();

        String myNamespace = "gdbds";
        String myNamespaceURI = "http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1";

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);

        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElemRoot = soapBody.addChildElement("GetParcelsByIdRequest", myNamespace);
        SOAPElement soapBodyElemVersion = soapBodyElemRoot.addChildElement("version", myNamespace);
        soapBodyElemVersion.addTextNode("2.1");
        SOAPElement soapBodyElemTransactionId = soapBodyElemRoot.addChildElement("transactionId", myNamespace);
        soapBodyElemTransactionId.addTextNode("RAUM-14922-1");
        SOAPElement soapBodyElemBezugInhalt = soapBodyElemRoot.addChildElement("BezugInhalt", myNamespace);
        soapBodyElemBezugInhalt.addTextNode("IndexMitEigentum");
        SOAPElement soapBodyElemIncludeHistory = soapBodyElemRoot.addChildElement("includeHistory", myNamespace);
        soapBodyElemIncludeHistory.addTextNode("false");
        SOAPElement soapBodyElemId = soapBodyElemRoot.addChildElement("Id", myNamespace);
        soapBodyElemId.addTextNode(egrid + "::::");
    }


}
