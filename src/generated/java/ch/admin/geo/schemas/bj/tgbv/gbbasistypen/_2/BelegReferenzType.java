
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BelegReferenzType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BelegReferenzType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EGBTBID" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}EGBTBID" minOccurs="0"/&gt;
 *         &lt;element name="TagebuchNummer" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}TagebuchNummer"/&gt;
 *         &lt;element name="TagebuchDatumZeit" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}DatumInklZeit"/&gt;
 *         &lt;element name="Idx" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}TagebuchIdx" minOccurs="0"/&gt;
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
@XmlType(name = "BelegReferenzType", propOrder = {
    "egbtbid",
    "tagebuchNummer",
    "tagebuchDatumZeit",
    "idx",
    "extensions"
})
public class BelegReferenzType {

    @XmlElement(name = "EGBTBID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String egbtbid;
    @XmlElement(name = "TagebuchNummer", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String tagebuchNummer;
    @XmlElement(name = "TagebuchDatumZeit", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tagebuchDatumZeit;
    @XmlElement(name = "Idx")
    @XmlSchemaType(name = "integer")
    protected Integer idx;
    protected Extensions extensions;

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
     * Gets the value of the idx property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdx() {
        return idx;
    }

    /**
     * Sets the value of the idx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdx(Integer value) {
        this.idx = value;
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
