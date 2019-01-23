
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InhaltNatuerlichePersonGBType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InhaltNatuerlichePersonGBType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}InhaltPersonGBType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
 *         &lt;element name="Geschlecht" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;enumeration value="weiblich"/&gt;
 *               &lt;enumeration value="maennlich"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Heimatort" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Staatsangehoerigkeit" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InhaltNatuerlichePersonGBType", propOrder = {
    "name",
    "vornamen",
    "geburtsjahr",
    "geburtsmonat",
    "geburtstag",
    "geschlecht",
    "heimatort",
    "staatsangehoerigkeit"
})
public class InhaltNatuerlichePersonGBType
    extends InhaltPersonGBType
{

    @XmlElement(name = "Name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlElement(name = "Vornamen", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vornamen;
    @XmlElement(name = "Geburtsjahr")
    protected BigInteger geburtsjahr;
    @XmlElement(name = "Geburtsmonat")
    protected Integer geburtsmonat;
    @XmlElement(name = "Geburtstag")
    protected Integer geburtstag;
    @XmlElement(name = "Geschlecht")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String geschlecht;
    @XmlElement(name = "Heimatort")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String heimatort;
    @XmlElement(name = "Staatsangehoerigkeit")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String staatsangehoerigkeit;

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
     * Gets the value of the heimatort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeimatort() {
        return heimatort;
    }

    /**
     * Sets the value of the heimatort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeimatort(String value) {
        this.heimatort = value;
    }

    /**
     * Gets the value of the staatsangehoerigkeit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaatsangehoerigkeit() {
        return staatsangehoerigkeit;
    }

    /**
     * Sets the value of the staatsangehoerigkeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaatsangehoerigkeit(String value) {
        this.staatsangehoerigkeit = value;
    }

}
