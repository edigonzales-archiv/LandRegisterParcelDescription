
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
 * <p>Java class for HaengigesGeschaeftType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HaengigesGeschaeftType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EGBTBID" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}EGBTBID" minOccurs="0"/&gt;
 *         &lt;element name="TagebuchNummer" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}TagebuchNummer" minOccurs="0"/&gt;
 *         &lt;element name="TagebuchDatumZeit" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}DatumInklZeit" minOccurs="0"/&gt;
 *         &lt;element name="GeschaeftsfallbeschreibungStichwort" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Stichwort" minOccurs="0"/&gt;
 *         &lt;element name="GeschaeftsfallbeschreibungZusatz" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}StichwortZusatz" minOccurs="0"/&gt;
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
@XmlType(name = "HaengigesGeschaeftType", propOrder = {
    "egbtbid",
    "tagebuchNummer",
    "tagebuchDatumZeit",
    "geschaeftsfallbeschreibungStichwort",
    "geschaeftsfallbeschreibungZusatz",
    "extensions"
})
@XmlRootElement(name = "HaengigesGeschaeft")
public class HaengigesGeschaeft {

    @XmlElement(name = "EGBTBID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String egbtbid;
    @XmlElement(name = "TagebuchNummer")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String tagebuchNummer;
    @XmlElement(name = "TagebuchDatumZeit")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tagebuchDatumZeit;
    @XmlElement(name = "GeschaeftsfallbeschreibungStichwort")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String geschaeftsfallbeschreibungStichwort;
    @XmlElement(name = "GeschaeftsfallbeschreibungZusatz")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String geschaeftsfallbeschreibungZusatz;
    protected Extensions extensions;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the egbtbid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEGBTBID() {
        return egbtbid;
    }

    /**
     * Sets the value of the egbtbid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEGBTBID(String value) {
        this.egbtbid = value;
    }

    /**
     * Gets the value of the tagebuchNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagebuchNummer() {
        return tagebuchNummer;
    }

    /**
     * Sets the value of the tagebuchNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagebuchNummer(String value) {
        this.tagebuchNummer = value;
    }

    /**
     * Gets the value of the tagebuchDatumZeit property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTagebuchDatumZeit() {
        return tagebuchDatumZeit;
    }

    /**
     * Sets the value of the tagebuchDatumZeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTagebuchDatumZeit(XMLGregorianCalendar value) {
        this.tagebuchDatumZeit = value;
    }

    /**
     * Gets the value of the geschaeftsfallbeschreibungStichwort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeschaeftsfallbeschreibungStichwort() {
        return geschaeftsfallbeschreibungStichwort;
    }

    /**
     * Sets the value of the geschaeftsfallbeschreibungStichwort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeschaeftsfallbeschreibungStichwort(String value) {
        this.geschaeftsfallbeschreibungStichwort = value;
    }

    /**
     * Gets the value of the geschaeftsfallbeschreibungZusatz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeschaeftsfallbeschreibungZusatz() {
        return geschaeftsfallbeschreibungZusatz;
    }

    /**
     * Sets the value of the geschaeftsfallbeschreibungZusatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeschaeftsfallbeschreibungZusatz(String value) {
        this.geschaeftsfallbeschreibungZusatz = value;
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
