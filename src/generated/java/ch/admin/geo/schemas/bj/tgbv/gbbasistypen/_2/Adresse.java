
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
 * <p>Java class for AdresseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdresseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZusatzinformationEmpfaenger" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="120"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GebaeudeBezeichnung" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PostDienstleistung" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BenanntesGebiet" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Ort" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}NameOrt" minOccurs="0"/&gt;
 *         &lt;element name="Land" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GWR_EGID" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}GWR_EGID" minOccurs="0"/&gt;
 *         &lt;element name="GWR_EDID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="99"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rolle"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;enumeration value="Rechtsdomizil"/&gt;
 *               &lt;enumeration value="Zustelladresse"/&gt;
 *               &lt;enumeration value="Weitere"/&gt;
 *               &lt;enumeration value="Verwalter"/&gt;
 *               &lt;enumeration value="Wohnadresse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RolleWeitereBeschreibung" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="20"/&gt;
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
@XmlType(name = "AdresseType", propOrder = {
    "zusatzinformationEmpfaenger",
    "strasse",
    "hausnummer",
    "gebaeudeBezeichnung",
    "postDienstleistung",
    "benanntesGebiet",
    "plz",
    "ort",
    "land",
    "gwregid",
    "gwredid",
    "rolle",
    "rolleWeitereBeschreibung",
    "extensions"
})
@XmlRootElement(name = "Adresse")
public class Adresse {

    @XmlElement(name = "ZusatzinformationEmpfaenger")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String zusatzinformationEmpfaenger;
    @XmlElement(name = "Strasse")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String strasse;
    @XmlElement(name = "Hausnummer")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hausnummer;
    @XmlElement(name = "GebaeudeBezeichnung")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String gebaeudeBezeichnung;
    @XmlElement(name = "PostDienstleistung")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String postDienstleistung;
    @XmlElement(name = "BenanntesGebiet")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String benanntesGebiet;
    @XmlElement(name = "PLZ")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String plz;
    @XmlElement(name = "Ort")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ort;
    @XmlElement(name = "Land")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String land;
    @XmlElement(name = "GWR_EGID")
    @XmlSchemaType(name = "integer")
    protected Integer gwregid;
    @XmlElement(name = "GWR_EDID")
    protected Integer gwredid;
    @XmlElement(name = "Rolle", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rolle;
    @XmlElement(name = "RolleWeitereBeschreibung")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rolleWeitereBeschreibung;
    protected Extensions extensions;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the zusatzinformationEmpfaenger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZusatzinformationEmpfaenger() {
        return zusatzinformationEmpfaenger;
    }

    /**
     * Sets the value of the zusatzinformationEmpfaenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZusatzinformationEmpfaenger(String value) {
        this.zusatzinformationEmpfaenger = value;
    }

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
     * Gets the value of the postDienstleistung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostDienstleistung() {
        return postDienstleistung;
    }

    /**
     * Sets the value of the postDienstleistung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostDienstleistung(String value) {
        this.postDienstleistung = value;
    }

    /**
     * Gets the value of the benanntesGebiet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenanntesGebiet() {
        return benanntesGebiet;
    }

    /**
     * Sets the value of the benanntesGebiet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenanntesGebiet(String value) {
        this.benanntesGebiet = value;
    }

    /**
     * Gets the value of the plz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLZ() {
        return plz;
    }

    /**
     * Sets the value of the plz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLZ(String value) {
        this.plz = value;
    }

    /**
     * Gets the value of the ort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrt() {
        return ort;
    }

    /**
     * Sets the value of the ort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrt(String value) {
        this.ort = value;
    }

    /**
     * Gets the value of the land property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLand() {
        return land;
    }

    /**
     * Sets the value of the land property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLand(String value) {
        this.land = value;
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
     * Gets the value of the rolle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolle() {
        return rolle;
    }

    /**
     * Sets the value of the rolle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolle(String value) {
        this.rolle = value;
    }

    /**
     * Gets the value of the rolleWeitereBeschreibung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolleWeitereBeschreibung() {
        return rolleWeitereBeschreibung;
    }

    /**
     * Sets the value of the rolleWeitereBeschreibung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolleWeitereBeschreibung(String value) {
        this.rolleWeitereBeschreibung = value;
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
