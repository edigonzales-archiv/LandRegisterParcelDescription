
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GrundstueckWertType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrundstueckWertType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Wert" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="NameWert" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/&gt;
 *         &lt;element name="TypWert" type="{http://www.w3.org/2001/XMLSchema}NCName"/&gt;
 *         &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="NameDatum" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrundstueckWertType", propOrder = {
    "wert",
    "nameWert",
    "typWert",
    "datum",
    "nameDatum",
    "extensions"
})
@XmlRootElement(name = "GrundstueckWert")
public class GrundstueckWert {

    @XmlElement(name = "Wert", required = true)
    protected BigDecimal wert;
    @XmlElement(name = "NameWert", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String nameWert;
    @XmlElement(name = "TypWert", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String typWert;
    @XmlElement(name = "Datum")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    @XmlElement(name = "NameDatum")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String nameDatum;
    protected Extensions extensions;

    /**
     * Gets the value of the wert property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWert() {
        return wert;
    }

    /**
     * Sets the value of the wert property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWert(BigDecimal value) {
        this.wert = value;
    }

    /**
     * Gets the value of the nameWert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameWert() {
        return nameWert;
    }

    /**
     * Sets the value of the nameWert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameWert(String value) {
        this.nameWert = value;
    }

    /**
     * Gets the value of the typWert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypWert() {
        return typWert;
    }

    /**
     * Sets the value of the typWert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypWert(String value) {
        this.typWert = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatum(XMLGregorianCalendar value) {
        this.datum = value;
    }

    /**
     * Gets the value of the nameDatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameDatum() {
        return nameDatum;
    }

    /**
     * Sets the value of the nameDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameDatum(String value) {
        this.nameDatum = value;
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
