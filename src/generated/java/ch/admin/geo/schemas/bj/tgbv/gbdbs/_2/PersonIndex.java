
package ch.admin.geo.schemas.bj.tgbv.gbdbs._2;

import java.math.BigInteger;
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
 * <p>Java class for PersonIndexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonIndexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Vorname" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Geburtsjahr" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Geburtsmonat" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Geburtstag" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="31"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WohnadresseOrt" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WohnadressePLZ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Sitz" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PersonId" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}PersonId"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}extensions" minOccurs="0"/&gt;
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
@XmlType(name = "PersonIndexType", propOrder = {
    "name",
    "vorname",
    "geburtsjahr",
    "geburtsmonat",
    "geburtstag",
    "wohnadresseOrt",
    "wohnadressePLZ",
    "sitz",
    "personId",
    "extensions"
})
@XmlRootElement(name = "PersonIndex")
public class PersonIndex {

    @XmlElement(name = "Name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlElement(name = "Vorname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vorname;
    @XmlElement(name = "Geburtsjahr")
    protected BigInteger geburtsjahr;
    @XmlElement(name = "Geburtsmonat")
    protected Integer geburtsmonat;
    @XmlElement(name = "Geburtstag")
    protected Integer geburtstag;
    @XmlElement(name = "WohnadresseOrt")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String wohnadresseOrt;
    @XmlElement(name = "WohnadressePLZ")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String wohnadressePLZ;
    @XmlElement(name = "Sitz")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sitz;
    @XmlElement(name = "PersonId", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String personId;
    protected Extensions extensions;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the vorname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * Sets the value of the vorname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVorname(String value) {
        this.vorname = value;
    }

    /**
     * Gets the value of the geburtsjahr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGeburtsjahr() {
        return geburtsjahr;
    }

    /**
     * Sets the value of the geburtsjahr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGeburtsjahr(BigInteger value) {
        this.geburtsjahr = value;
    }

    /**
     * Gets the value of the geburtsmonat property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGeburtsmonat() {
        return geburtsmonat;
    }

    /**
     * Sets the value of the geburtsmonat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGeburtsmonat(Integer value) {
        this.geburtsmonat = value;
    }

    /**
     * Gets the value of the geburtstag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGeburtstag() {
        return geburtstag;
    }

    /**
     * Sets the value of the geburtstag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGeburtstag(Integer value) {
        this.geburtstag = value;
    }

    /**
     * Gets the value of the wohnadresseOrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWohnadresseOrt() {
        return wohnadresseOrt;
    }

    /**
     * Sets the value of the wohnadresseOrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWohnadresseOrt(String value) {
        this.wohnadresseOrt = value;
    }

    /**
     * Gets the value of the wohnadressePLZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWohnadressePLZ() {
        return wohnadressePLZ;
    }

    /**
     * Sets the value of the wohnadressePLZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWohnadressePLZ(String value) {
        this.wohnadressePLZ = value;
    }

    /**
     * Gets the value of the sitz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitz() {
        return sitz;
    }

    /**
     * Sets the value of the sitz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitz(String value) {
        this.sitz = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonId(String value) {
        this.personId = value;
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
