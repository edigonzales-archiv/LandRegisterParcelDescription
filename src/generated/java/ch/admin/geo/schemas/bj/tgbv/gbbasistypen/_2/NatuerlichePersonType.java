
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ch.ech.xmlns.ech_0011._8.PersonType;


/**
 * <p>Java class for NatuerlichePersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NatuerlichePersonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}PersonStammType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vornamen"&gt;
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
 *         &lt;element name="Zivilstand" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;enumeration value="ledig"/&gt;
 *               &lt;enumeration value="verheiratet"/&gt;
 *               &lt;enumeration value="verwitwet"/&gt;
 *               &lt;enumeration value="geschieden"/&gt;
 *               &lt;enumeration value="unverheiratet"/&gt;
 *               &lt;enumeration value="inEingetragenerPartnerschaft"/&gt;
 *               &lt;enumeration value="aufgeloestePartnerschaft"/&gt;
 *               &lt;enumeration value="unbekannt"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LedigerName" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}NamePerson" minOccurs="0"/&gt;
 *         &lt;element name="Rufname" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Buergerort" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NameDerEltern" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}NamePerson" minOccurs="0"/&gt;
 *         &lt;element name="Geschlecht" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;enumeration value="weiblich"/&gt;
 *               &lt;enumeration value="maennlich"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EPID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="detail" type="{http://www.ech.ch/xmlns/eCH-0011/8}personType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NatuerlichePersonType", propOrder = {
    "vornamen",
    "geburtsjahr",
    "geburtsmonat",
    "geburtstag",
    "zivilstand",
    "ledigerName",
    "rufname",
    "buergerort",
    "nameDerEltern",
    "geschlecht",
    "epid",
    "detail"
})
public class NatuerlichePersonType
    extends PersonStammType
{

    @XmlElement(name = "Vornamen", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vornamen;
    @XmlElement(name = "Geburtsjahr")
    protected BigInteger geburtsjahr;
    @XmlElement(name = "Geburtsmonat")
    protected Integer geburtsmonat;
    @XmlElement(name = "Geburtstag")
    protected Integer geburtstag;
    @XmlElement(name = "Zivilstand")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String zivilstand;
    @XmlElement(name = "LedigerName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ledigerName;
    @XmlElement(name = "Rufname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rufname;
    @XmlElement(name = "Buergerort")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String buergerort;
    @XmlElement(name = "NameDerEltern")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String nameDerEltern;
    @XmlElement(name = "Geschlecht")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String geschlecht;
    @XmlElement(name = "EPID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String epid;
    protected PersonType detail;

    /**
     * Gets the value of the vornamen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVornamen() {
        return vornamen;
    }

    /**
     * Sets the value of the vornamen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVornamen(String value) {
        this.vornamen = value;
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
     * Gets the value of the zivilstand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZivilstand() {
        return zivilstand;
    }

    /**
     * Sets the value of the zivilstand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZivilstand(String value) {
        this.zivilstand = value;
    }

    /**
     * Gets the value of the ledigerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLedigerName() {
        return ledigerName;
    }

    /**
     * Sets the value of the ledigerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLedigerName(String value) {
        this.ledigerName = value;
    }

    /**
     * Gets the value of the rufname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRufname() {
        return rufname;
    }

    /**
     * Sets the value of the rufname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRufname(String value) {
        this.rufname = value;
    }

    /**
     * Gets the value of the buergerort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuergerort() {
        return buergerort;
    }

    /**
     * Sets the value of the buergerort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuergerort(String value) {
        this.buergerort = value;
    }

    /**
     * Gets the value of the nameDerEltern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameDerEltern() {
        return nameDerEltern;
    }

    /**
     * Sets the value of the nameDerEltern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameDerEltern(String value) {
        this.nameDerEltern = value;
    }

    /**
     * Gets the value of the geschlecht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeschlecht() {
        return geschlecht;
    }

    /**
     * Sets the value of the geschlecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeschlecht(String value) {
        this.geschlecht = value;
    }

    /**
     * Gets the value of the epid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEPID() {
        return epid;
    }

    /**
     * Sets the value of the epid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEPID(String value) {
        this.epid = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setDetail(PersonType value) {
        this.detail = value;
    }

}
