
package ch.ech.xmlns.ech_0011._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.ech.xmlns.ech_0008._3.CountryType;


/**
 * <p>Java class for nationalityDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nationalityDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nationalityStatus" type="{http://www.ech.ch/xmlns/eCH-0011/8}nationalityStatusType"/&gt;
 *         &lt;element name="countryInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="country" type="{http://www.ech.ch/xmlns/eCH-0008/3}countryType"/&gt;
 *                   &lt;element name="nationalityValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
@XmlType(name = "nationalityDataType", propOrder = {
    "nationalityStatus",
    "countryInfos"
})
public class NationalityDataType {

    @XmlElement(required = true)
    protected String nationalityStatus;
    @XmlElement(name = "countryInfo")
    protected List<NationalityDataType.CountryInfo> countryInfos;

    /**
     * Gets the value of the nationalityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityStatus() {
        return nationalityStatus;
    }

    /**
     * Sets the value of the nationalityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityStatus(String value) {
        this.nationalityStatus = value;
    }

    /**
     * Gets the value of the countryInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NationalityDataType.CountryInfo }
     * 
     * 
     */
    public List<NationalityDataType.CountryInfo> getCountryInfos() {
        if (countryInfos == null) {
            countryInfos = new ArrayList<NationalityDataType.CountryInfo>();
        }
        return this.countryInfos;
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
     *         &lt;element name="nationalityValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
        "nationalityValidFrom"
    })
    public static class CountryInfo {

        @XmlElement(required = true)
        protected CountryType country;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar nationalityValidFrom;

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
         * Gets the value of the nationalityValidFrom property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getNationalityValidFrom() {
            return nationalityValidFrom;
        }

        /**
         * Sets the value of the nationalityValidFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setNationalityValidFrom(XMLGregorianCalendar value) {
            this.nationalityValidFrom = value;
        }

    }

}
