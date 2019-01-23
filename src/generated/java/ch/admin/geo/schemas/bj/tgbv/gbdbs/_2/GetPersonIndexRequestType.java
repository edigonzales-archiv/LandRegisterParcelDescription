
package ch.admin.geo.schemas.bj.tgbv.gbdbs._2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.GemeinschaftArt;


/**
 * <p>Java class for GetPersonIndexRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPersonIndexRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}AbstractRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="includeHistory" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PersonenRolle" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}PersonenRolle"/&gt;
 *         &lt;element name="BFSNr" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}BFSNr" minOccurs="0"/&gt;
 *         &lt;element name="PersonenArt" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}PersonenArt"/&gt;
 *         &lt;element name="NamePerson" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}NameKriterium"/&gt;
 *         &lt;element name="Vorname" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}NameKriterium" minOccurs="0"/&gt;
 *         &lt;element name="Jahrgang" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Sitz" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}NameKriterium" minOccurs="0"/&gt;
 *         &lt;element name="GemeinschaftArt" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}GemeinschaftArt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPersonIndexRequestType", propOrder = {
    "includeHistory",
    "personenRolle",
    "bfsNr",
    "personenArt",
    "namePerson",
    "vorname",
    "jahrgang",
    "sitz",
    "gemeinschaftArt",
    "extensions"
})
public class GetPersonIndexRequestType
    extends AbstractRequestType
{

    protected boolean includeHistory;
    @XmlElement(name = "PersonenRolle", required = true)
    @XmlSchemaType(name = "normalizedString")
    protected PersonenRolle personenRolle;
    @XmlElement(name = "BFSNr")
    @XmlSchemaType(name = "integer")
    protected Integer bfsNr;
    @XmlElement(name = "PersonenArt", required = true)
    @XmlSchemaType(name = "normalizedString")
    protected PersonenArt personenArt;
    @XmlElement(name = "NamePerson", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String namePerson;
    @XmlElement(name = "Vorname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String vorname;
    @XmlElement(name = "Jahrgang")
    protected BigInteger jahrgang;
    @XmlElement(name = "Sitz")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sitz;
    @XmlElement(name = "GemeinschaftArt")
    @XmlSchemaType(name = "normalizedString")
    protected GemeinschaftArt gemeinschaftArt;
    protected Extensions extensions;

    /**
     * Gets the value of the includeHistory property.
     * 
     */
    public boolean isIncludeHistory() {
        return includeHistory;
    }

    /**
     * Sets the value of the includeHistory property.
     * 
     */
    public void setIncludeHistory(boolean value) {
        this.includeHistory = value;
    }

    /**
     * Gets the value of the personenRolle property.
     * 
     * @return
     *     possible object is
     *     {@link PersonenRolle }
     *     
     */
    public PersonenRolle getPersonenRolle() {
        return personenRolle;
    }

    /**
     * Sets the value of the personenRolle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonenRolle }
     *     
     */
    public void setPersonenRolle(PersonenRolle value) {
        this.personenRolle = value;
    }

    /**
     * Gets the value of the bfsNr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBFSNr() {
        return bfsNr;
    }

    /**
     * Sets the value of the bfsNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBFSNr(Integer value) {
        this.bfsNr = value;
    }

    /**
     * Gets the value of the personenArt property.
     * 
     * @return
     *     possible object is
     *     {@link PersonenArt }
     *     
     */
    public PersonenArt getPersonenArt() {
        return personenArt;
    }

    /**
     * Sets the value of the personenArt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonenArt }
     *     
     */
    public void setPersonenArt(PersonenArt value) {
        this.personenArt = value;
    }

    /**
     * Gets the value of the namePerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePerson() {
        return namePerson;
    }

    /**
     * Sets the value of the namePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePerson(String value) {
        this.namePerson = value;
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
     * Gets the value of the jahrgang property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJahrgang() {
        return jahrgang;
    }

    /**
     * Sets the value of the jahrgang property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJahrgang(BigInteger value) {
        this.jahrgang = value;
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
     * Gets the value of the gemeinschaftArt property.
     * 
     * @return
     *     possible object is
     *     {@link GemeinschaftArt }
     *     
     */
    public GemeinschaftArt getGemeinschaftArt() {
        return gemeinschaftArt;
    }

    /**
     * Sets the value of the gemeinschaftArt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GemeinschaftArt }
     *     
     */
    public void setGemeinschaftArt(GemeinschaftArt value) {
        this.gemeinschaftArt = value;
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

}
