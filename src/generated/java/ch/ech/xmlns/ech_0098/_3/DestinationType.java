
package ch.ech.xmlns.ech_0098._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ch.ech.xmlns.ech_0007._6.Gemeinde;
import ch.ech.xmlns.ech_0008._3.CountryType;
import ch.ech.xmlns.ech_0010._6.AddressInformationType;


/**
 * <p>Java class for destinationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="destinationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="unknown" type="{http://www.ech.ch/xmlns/eCH-0098/3}unknownType"/&gt;
 *           &lt;element name="swissTown" type="{http://www.ech.ch/xmlns/eCH-0007/6}swissMunicipalityType"/&gt;
 *           &lt;element name="foreignCountry"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="country" type="{http://www.ech.ch/xmlns/eCH-0008/3}countryType"/&gt;
 *                     &lt;element name="town" minOccurs="0"&gt;
 *                       &lt;simpleType&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                           &lt;whiteSpace value="collapse"/&gt;
 *                           &lt;maxLength value="100"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/simpleType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="mailAddress" type="{http://www.ech.ch/xmlns/eCH-0010/6}addressInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "destinationType", propOrder = {
    "foreignCountry",
    "swissTown",
    "unknown",
    "mailAddress"
})
public class DestinationType {

    protected DestinationType.ForeignCountry foreignCountry;
    protected Gemeinde swissTown;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String unknown;
    protected AddressInformationType mailAddress;

    /**
     * Gets the value of the foreignCountry property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationType.ForeignCountry }
     *     
     */
    public DestinationType.ForeignCountry getForeignCountry() {
        return foreignCountry;
    }

    /**
     * Sets the value of the foreignCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationType.ForeignCountry }
     *     
     */
    public void setForeignCountry(DestinationType.ForeignCountry value) {
        this.foreignCountry = value;
    }

    /**
     * Gets the value of the swissTown property.
     * 
     * @return
     *     possible object is
     *     {@link Gemeinde }
     *     
     */
    public Gemeinde getSwissTown() {
        return swissTown;
    }

    /**
     * Sets the value of the swissTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gemeinde }
     *     
     */
    public void setSwissTown(Gemeinde value) {
        this.swissTown = value;
    }

    /**
     * Gets the value of the unknown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnknown() {
        return unknown;
    }

    /**
     * Sets the value of the unknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnknown(String value) {
        this.unknown = value;
    }

    /**
     * Gets the value of the mailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInformationType }
     *     
     */
    public AddressInformationType getMailAddress() {
        return mailAddress;
    }

    /**
     * Sets the value of the mailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInformationType }
     *     
     */
    public void setMailAddress(AddressInformationType value) {
        this.mailAddress = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="country" type="{http://www.ech.ch/xmlns/eCH-0008/3}countryType"/&gt;
     *         &lt;element name="town" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;whiteSpace value="collapse"/&gt;
     *               &lt;maxLength value="100"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
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
    @XmlType(name = "", propOrder = {
        "country",
        "town"
    })
    public static class ForeignCountry {

        @XmlElement(required = true)
        protected CountryType country;
        protected String town;

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link CountryType }
         *     
         */
        public CountryType getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link CountryType }
         *     
         */
        public void setCountry(CountryType value) {
            this.country = value;
        }

        /**
         * Gets the value of the town property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTown() {
            return town;
        }

        /**
         * Sets the value of the town property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTown(String value) {
            this.town = value;
        }

    }

}
