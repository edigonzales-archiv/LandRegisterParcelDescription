
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GeschaeftsstandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeschaeftsstandType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZustandStichwort" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Geschaeftsstand_ZustandType" minOccurs="0"/&gt;
 *         &lt;element name="ZustandZusatz" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}StichwortZusatz" minOccurs="0"/&gt;
 *         &lt;element name="ArtDerErledigung"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;enumeration value="Eingetragen"/&gt;
 *               &lt;enumeration value="Rueckzug"/&gt;
 *               &lt;enumeration value="Abweisung"/&gt;
 *               &lt;enumeration value="Ungueltig"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Datum" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Datum"/&gt;
 *         &lt;element name="AnfechtungsDatum" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Datum" minOccurs="0"/&gt;
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
@XmlType(name = "GeschaeftsstandType", propOrder = {
    "zustandStichwort",
    "zustandZusatz",
    "artDerErledigung",
    "datum",
    "anfechtungsDatum",
    "extensions"
})
@XmlRootElement(name = "Geschaeftsstand")
public class Geschaeftsstand {

    @XmlElement(name = "ZustandStichwort")
    protected GeschaeftsstandZustand zustandStichwort;
    @XmlElement(name = "ZustandZusatz")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String zustandZusatz;
    @XmlElement(name = "ArtDerErledigung", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String artDerErledigung;
    @XmlElement(name = "Datum", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    @XmlElement(name = "AnfechtungsDatum")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar anfechtungsDatum;
    protected Extensions extensions;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the zustandStichwort property.
     * 
     * @return
     *     possible object is
     *     {@link GeschaeftsstandZustand }
     *     
     */
    public GeschaeftsstandZustand getZustandStichwort() {
        return zustandStichwort;
    }

    /**
     * Sets the value of the zustandStichwort property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeschaeftsstandZustand }
     *     
     */
    public void setZustandStichwort(GeschaeftsstandZustand value) {
        this.zustandStichwort = value;
    }

    /**
     * Gets the value of the zustandZusatz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZustandZusatz() {
        return zustandZusatz;
    }

    /**
     * Sets the value of the zustandZusatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZustandZusatz(String value) {
        this.zustandZusatz = value;
    }

    /**
     * Gets the value of the artDerErledigung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtDerErledigung() {
        return artDerErledigung;
    }

    /**
     * Sets the value of the artDerErledigung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtDerErledigung(String value) {
        this.artDerErledigung = value;
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
     * Gets the value of the anfechtungsDatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnfechtungsDatum() {
        return anfechtungsDatum;
    }

    /**
     * Sets the value of the anfechtungsDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnfechtungsDatum(XMLGregorianCalendar value) {
        this.anfechtungsDatum = value;
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
