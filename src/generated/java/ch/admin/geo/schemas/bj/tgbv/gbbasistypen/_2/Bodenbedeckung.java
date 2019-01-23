
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import java.math.BigDecimal;
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
 * <p>Java class for BodenbedeckungType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodenbedeckungType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Art" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}BBArt" minOccurs="0"/&gt;
 *         &lt;element name="Flaechenmass" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}FlaecheMitNachkomma" minOccurs="0"/&gt;
 *         &lt;element name="ArtBezeichnung" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="80"/&gt;
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
@XmlType(name = "BodenbedeckungType", propOrder = {
    "art",
    "flaechenmass",
    "artBezeichnung",
    "extensions"
})
@XmlRootElement(name = "Bodenbedeckung")
public class Bodenbedeckung {

    @XmlElement(name = "Art")
    @XmlSchemaType(name = "normalizedString")
    protected BBArt art;
    @XmlElement(name = "Flaechenmass")
    protected BigDecimal flaechenmass;
    @XmlElement(name = "ArtBezeichnung")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String artBezeichnung;
    protected Extensions extensions;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the art property.
     * 
     * @return
     *     possible object is
     *     {@link BBArt }
     *     
     */
    public BBArt getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     * 
     * @param value
     *     allowed object is
     *     {@link BBArt }
     *     
     */
    public void setArt(BBArt value) {
        this.art = value;
    }

    /**
     * Gets the value of the flaechenmass property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlaechenmass() {
        return flaechenmass;
    }

    /**
     * Sets the value of the flaechenmass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlaechenmass(BigDecimal value) {
        this.flaechenmass = value;
    }

    /**
     * Gets the value of the artBezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtBezeichnung() {
        return artBezeichnung;
    }

    /**
     * Sets the value of the artBezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtBezeichnung(String value) {
        this.artBezeichnung = value;
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
