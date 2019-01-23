
package ch.ech.xmlns.ech_0011._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for maritalDataRestrictedPartnershipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="maritalDataRestrictedPartnershipType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.ech.ch/xmlns/eCH-0011/8}maritalDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maritalStatus"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.ech.ch/xmlns/eCH-0011/8}maritalStatusType"&gt;
 *               &lt;enumeration value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dateOfMaritalStatus" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="officialProofOfMaritalStatusYesNo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "maritalDataRestrictedPartnershipType")
public class MaritalDataRestrictedPartnershipType
    extends MaritalDataType
{


}
