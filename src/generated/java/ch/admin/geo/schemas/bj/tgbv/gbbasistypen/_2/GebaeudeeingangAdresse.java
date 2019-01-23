
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GebaeudeeingangAdresseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GebaeudeeingangAdresseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Strasse" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Hausnummer" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GebaeudeBezeichnung" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="1000"/&gt;
 *               &lt;maxInclusive value="9999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PlzZusatzziffern" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="99"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Ortschaft" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}NameOrt" minOccurs="0"/&gt;
 *         &lt;element name="GWR_EGID" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}GWR_EGID" minOccurs="0"/&gt;
 *         &lt;element name="GWR_EDID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="99"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GebaeudeeingangAdresseType", propOrder = {
    "strasse",
    "hausnummer",
    "gebaeudeBezeichnung",
    "plz",
    "plzZusatzziffern",
    "ortschaft",
    "gwregid",
    "gwredid",
    "extensions"
})
@XmlRootElement(name = "GebaeudeeingangAdresse")
public class GebaeudeeingangAdresse {

    @XmlElement(name = "Strasse")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String strasse;
    @XmlElement(name = "Hausnummer")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hausnummer;
    @XmlElement(name = "GebaeudeBezeichnung")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String gebaeudeBezeichnung;
    @XmlElement(name = "PLZ")
    protected Integer plz;
    @XmlElement(name = "PlzZusatzziffern")
    protected Integer plzZusatzziffern;
    @XmlElement(name = "Ortschaft")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ortschaft;
    @XmlElement(name = "GWR_EGID")
    @XmlSchemaType(name = "integer")
    protected Integer gwregid;
    @XmlElement(name = "GWR_EDID")
    protected Integer gwredid;
    protected Extensions extensions;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the strasse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrasse() {
        return strasse;
    }

    /**
     * Sets the value of the strasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrasse(String value) {
        this.strasse = value;
    }

    /**
     * Gets the value of the hausnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHausnummer() {
        return hausnummer;
    }

    /**
     * Sets the value of the hausnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHausnummer(String value) {
        this.hausnummer = value;
    }

    /**
     * Gets the value of the gebaeudeBezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGebaeudeBezeichnung() {
        return gebaeudeBezeichnung;
    }

    /**
     * Sets the value of the gebaeudeBezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGebaeudeBezeichnung(String value) {
        this.gebaeudeBezeichnung = value;
    }

    /**
     * Gets the value of the plz property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPLZ() {
        return plz;
    }

    /**
     * Sets the value of the plz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPLZ(Integer value) {
        this.plz = value;
    }

    /**
     * Gets the value of the plzZusatzziffern property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlzZusatzziffern() {
        return plzZusatzziffern;
    }

    /**
     * Sets the value of the plzZusatzziffern property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlzZusatzziffern(Integer value) {
        this.plzZusatzziffern = value;
    }

    /**
     * Gets the value of the ortschaft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrtschaft() {
        return ortschaft;
    }

    /**
     * Sets the value of the ortschaft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrtschaft(String value) {
        this.ortschaft = value;
    }

    /**
     * Gets the value of the gwregid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGWREGID() {
        return gwregid;
    }

    /**
     * Sets the value of the gwregid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGWREGID(Integer value) {
        this.gwregid = value;
    }

    /**
     * Gets the value of the gwredid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGWREDID() {
        return gwredid;
    }

    /**
     * Sets the value of the gwredid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGWREDID(Integer value) {
        this.gwredid = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
