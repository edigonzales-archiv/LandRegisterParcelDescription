
package ch.ech.xmlns.ech_0098._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.ech.xmlns.ech_0007._6.Gemeinde;


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
 *         &lt;element name="foreignHeadquarter" type="{http://www.ech.ch/xmlns/eCH-0098/3}foreignHeadquarterType" minOccurs="0"/&gt;
 *         &lt;element name="reportingMunicipality" type="{http://www.ech.ch/xmlns/eCH-0007/6}swissMunicipalityType"/&gt;
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="comesFrom" type="{http://www.ech.ch/xmlns/eCH-0098/3}destinationType" minOccurs="0"/&gt;
 *         &lt;element name="businessAddress" type="{http://www.ech.ch/xmlns/eCH-0098/3}dwellingAddressType"/&gt;
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="goesTo" type="{http://www.ech.ch/xmlns/eCH-0098/3}destinationType" minOccurs="0"/&gt;
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
    "foreignHeadquarter",
    "reportingMunicipality",
    "arrivalDate",
    "comesFrom",
    "businessAddress",
    "departureDate",
    "goesTo"
})
public class OtherResidenceType {

    protected ForeignHeadquarterType foreignHeadquarter;
    @XmlElement(required = true)
    protected Gemeinde reportingMunicipality;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar arrivalDate;
    protected DestinationType comesFrom;
    @XmlElement(required = true)
    protected DwellingAddressType businessAddress;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar departureDate;
    protected DestinationType goesTo;

    /**
     * Gets the value of the foreignHeadquarter property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignHeadquarterType }
     *     
     */
    public ForeignHeadquarterType getForeignHeadquarter() {
        return foreignHeadquarter;
    }

    /**
     * Sets the value of the foreignHeadquarter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignHeadquarterType }
     *     
     */
    public void setForeignHeadquarter(ForeignHeadquarterType value) {
        this.foreignHeadquarter = value;
    }

    /**
     * Gets the value of the reportingMunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link Gemeinde }
     *     
     */
    public Gemeinde getReportingMunicipality() {
        return reportingMunicipality;
    }

    /**
     * Sets the value of the reportingMunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gemeinde }
     *     
     */
    public void setReportingMunicipality(Gemeinde value) {
        this.reportingMunicipality = value;
    }

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDate(XMLGregorianCalendar value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the comesFrom property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationType }
     *     
     */
    public DestinationType getComesFrom() {
        return comesFrom;
    }

    /**
     * Sets the value of the comesFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationType }
     *     
     */
    public void setComesFrom(DestinationType value) {
        this.comesFrom = value;
    }

    /**
     * Gets the value of the businessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DwellingAddressType }
     *     
     */
    public DwellingAddressType getBusinessAddress() {
        return businessAddress;
    }

    /**
     * Sets the value of the businessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DwellingAddressType }
     *     
     */
    public void setBusinessAddress(DwellingAddressType value) {
        this.businessAddress = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the goesTo property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationType }
     *     
     */
    public DestinationType getGoesTo() {
        return goesTo;
    }

    /**
     * Sets the value of the goesTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationType }
     *     
     */
    public void setGoesTo(DestinationType value) {
        this.goesTo = value;
    }

}
