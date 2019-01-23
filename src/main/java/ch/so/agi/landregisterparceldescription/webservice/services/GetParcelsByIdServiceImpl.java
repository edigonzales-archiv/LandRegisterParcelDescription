package ch.so.agi.landregisterparceldescription.webservice.services;

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

    @Override
    public void getParcelById(String parcelId) throws Exception {

        String soapEndpointUrl = "http://srsofaioi18626.verw.rootso.org:41007/gbdbs/gbdbs";
        String soapAction = "http://schemas.geo.admin.ch/BJ/TGBV/GBDBSSvc/2.1/GetParcelsById";

        callSoapWebService(soapEndpointUrl, soapAction);
        
        log.info("fubar"); 
    }

    private void callSoapWebService(String soapEndpointUrl, String soapAction) {
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send SOAP Message to SOAP Server
            SOAPMessage soapResponse = soapConnection.call(createSoapRequest(soapAction), soapEndpointUrl);

            // Print the SOAP Response
            System.out.println("Response SOAP Message:");
            soapResponse.writeTo(System.out);
            System.out.println();
           
            soapConnection.close();
            
            Unmarshaller unmarshaller = JAXBContext.newInstance(GetParcelsByIdResponse.class).createUnmarshaller();
            GetParcelsByIdResponse getParcelsByIdResponse = (GetParcelsByIdResponse)unmarshaller.unmarshal(soapResponse.getSOAPBody().extractContentAsDocument());

            for (Person person : getParcelsByIdResponse.getPersons()) {
                log.info("*********");
                PersonGBType personGbType = person.getPersonGB().getValue();
                
                // TODO: braucht es vielleicht nicht resp. wo anders.
                if (personGbType instanceof ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.NatuerlichePersonGBType) {                    
                    JAXBElement<? extends PersonStammType> element = personGbType.getPersonStamm();
                    NatuerlichePersonType natuerlichePersonType = (NatuerlichePersonType) element.getValue();
                    log.info(natuerlichePersonType.getName());
                    log.info(natuerlichePersonType.getVornamen());

                }
                


            }
            
            
        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
            e.printStackTrace();
        }
    }

    private static SOAPMessage createSoapRequest(String soapAction) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();

        createSoapEnvelope(soapMessage);

        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", soapAction);

        soapMessage.saveChanges();

        /* Print the request message, just for debugging purposes */
        System.out.println("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println("\n");

        return soapMessage;
    }
    
    private static void createSoapEnvelope(SOAPMessage soapMessage) throws SOAPException {
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
        soapBodyElemId.addTextNode("CH240632707339::::");
    }


}
