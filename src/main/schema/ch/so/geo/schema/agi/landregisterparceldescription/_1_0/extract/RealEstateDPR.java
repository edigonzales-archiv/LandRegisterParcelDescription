//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.02 at 05:17:31 PM CET 
//


package ch.so.geo.schema.agi.landregisterparceldescription._1_0.extract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RealEstate_DPR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealEstate_DPR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Number" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *               &lt;minLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IdentND" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *               &lt;minLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EGRID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *               &lt;minLength value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LocalNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LandCoverShare" type="{http://geo.so.ch/schema/AGI/LandRegisterParcelDescription/1.0/Extract}LandCoverShareType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SurveyorOffice" type="{http://geo.so.ch/schema/AGI/LandRegisterParcelDescription/1.0/Extract}Office"/>
 *         &lt;element name="LandRegisterOffice" type="{http://geo.so.ch/schema/AGI/LandRegisterParcelDescription/1.0/Extract}Office"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealEstate_DPR", propOrder = {
    "number",
    "identND",
    "egrid",
    "localNames",
    "landCoverShares",
    "surveyorOffice",
    "landRegisterOffice",
    "type"
})
public class RealEstateDPR {

    @XmlElement(name = "Number")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String number;
    @XmlElement(name = "IdentND")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String identND;
    @XmlElement(name = "EGRID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String egrid;
    @XmlElement(name = "LocalNames")
    protected String localNames;
    @XmlElement(name = "LandCoverShare")
    protected List<LandCoverShareType> landCoverShares;
    @XmlElement(name = "SurveyorOffice", required = true)
    protected Office surveyorOffice;
    @XmlElement(name = "LandRegisterOffice", required = true)
    protected Office landRegisterOffice;
    @XmlElement(name = "Type", required = true)
    protected String type;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the identND property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentND() {
        return identND;
    }

    /**
     * Sets the value of the identND property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentND(String value) {
        this.identND = value;
    }

    /**
     * Gets the value of the egrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEGRID() {
        return egrid;
    }

    /**
     * Sets the value of the egrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEGRID(String value) {
        this.egrid = value;
    }

    /**
     * Gets the value of the localNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalNames() {
        return localNames;
    }

    /**
     * Sets the value of the localNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalNames(String value) {
        this.localNames = value;
    }

    /**
     * Gets the value of the landCoverShares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the landCoverShares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLandCoverShares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LandCoverShareType }
     * 
     * 
     */
    public List<LandCoverShareType> getLandCoverShares() {
        if (landCoverShares == null) {
            landCoverShares = new ArrayList<LandCoverShareType>();
        }
        return this.landCoverShares;
    }

    /**
     * Gets the value of the surveyorOffice property.
     * 
     * @return
     *     possible object is
     *     {@link Office }
     *     
     */
    public Office getSurveyorOffice() {
        return surveyorOffice;
    }

    /**
     * Sets the value of the surveyorOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Office }
     *     
     */
    public void setSurveyorOffice(Office value) {
        this.surveyorOffice = value;
    }

    /**
     * Gets the value of the landRegisterOffice property.
     * 
     * @return
     *     possible object is
     *     {@link Office }
     *     
     */
    public Office getLandRegisterOffice() {
        return landRegisterOffice;
    }

    /**
     * Sets the value of the landRegisterOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Office }
     *     
     */
    public void setLandRegisterOffice(Office value) {
        this.landRegisterOffice = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
