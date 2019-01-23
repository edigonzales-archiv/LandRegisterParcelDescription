
package ch.admin.geo.schemas.bj.tgbv.gbdbs._2;

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
 * <p>Java class for RechtType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RechtType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alteNummer" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BFSNr" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}BFSNr" minOccurs="0"/&gt;
 *         &lt;element name="EREID" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}EREID" minOccurs="0"/&gt;
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
@XmlType(name = "RechtType", propOrder = {
    "alteNummer",
    "bfsNr",
    "ereid",
    "extensions"
})
@XmlRootElement(name = "Recht")
public class Recht {

    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String alteNummer;
    @XmlElement(name = "BFSNr")
    @XmlSchemaType(name = "integer")
    protected Integer bfsNr;
    @XmlElement(name = "EREID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ereid;
    protected Extensions extensions;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the alteNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlteNummer() {
        return alteNummer;
    }

    /**
     * Sets the value of the alteNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlteNummer(String value) {
        this.alteNummer = value;
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
     * Gets the value of the ereid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEREID() {
        return ereid;
    }

    /**
     * Sets the value of the ereid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEREID(String value) {
        this.ereid = value;
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
