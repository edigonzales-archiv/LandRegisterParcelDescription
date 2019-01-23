
package ch.ech.xmlns.ech_0011._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for otherResidenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="otherResidenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="secondaryResidence"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.ech.ch/xmlns/eCH-0011/8}residenceDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="reportingMunicipality" type="{http://www.ech.ch/xmlns/eCH-0007/5}swissMunicipalityType"/&gt;
 *                   &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="comesFrom" type="{http://www.ech.ch/xmlns/eCH-0011/8}destinationType"/&gt;
 *                   &lt;element name="dwellingAddress" type="{http://www.ech.ch/xmlns/eCH-0011/8}dwellingAddressType"/&gt;
 *                   &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="goesTo" type="{http://www.ech.ch/xmlns/eCH-0011/8}destinationType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otherResidenceType", propOrder = {
    "secondaryResidence"
})
public class OtherResidenceType {

    @XmlElement(required = true)
    protected OtherResidenceType.SecondaryResidence secondaryResidence;

    /**
     * Gets the value of the secondaryResidence property.
     * 
     * @return
     *     possible object is
     *     {@link OtherResidenceType.SecondaryResidence }
     *     
     */
    public OtherResidenceType.SecondaryResidence getSecondaryResidence() {
        return secondaryResidence;
    }

    /**
     * Sets the value of the secondaryResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherResidenceType.SecondaryResidence }
     *     
     */
    public void setSecondaryResidence(OtherResidenceType.SecondaryResidence value) {
        this.secondaryResidence = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.ech.ch/xmlns/eCH-0011/8}residenceDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="reportingMunicipality" type="{http://www.ech.ch/xmlns/eCH-0007/5}swissMunicipalityType"/&gt;
     *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="comesFrom" type="{http://www.ech.ch/xmlns/eCH-0011/8}destinationType"/&gt;
     *         &lt;element name="dwellingAddress" type="{http://www.ech.ch/xmlns/eCH-0011/8}dwellingAddressType"/&gt;
     *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="goesTo" type="{http://www.ech.ch/xmlns/eCH-0011/8}destinationType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SecondaryResidence
        extends ResidenceDataType
    {


    }

}
