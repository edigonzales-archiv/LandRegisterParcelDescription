
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MutationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MutationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Anmeldung"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Mutationsinhalt" minOccurs="0"/&gt;
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
@XmlType(name = "MutationType", propOrder = {
    "anmeldung",
    "mutationsinhalt",
    "extensions"
})
public class MutationType {

    @XmlElement(name = "Anmeldung", required = true)
    protected Anmeldung anmeldung;
    @XmlElement(name = "Mutationsinhalt")
    protected Mutationsinhalt mutationsinhalt;
    protected Extensions extensions;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the anmeldung property.
     * 
     * @return
     *     possible object is
     *     {@link Anmeldung }
     *     
     */
    public Anmeldung getAnmeldung() {
        return anmeldung;
    }

    /**
     * Sets the value of the anmeldung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anmeldung }
     *     
     */
    public void setAnmeldung(Anmeldung value) {
        this.anmeldung = value;
    }

    /**
     * Gets the value of the mutationsinhalt property.
     * 
     * @return
     *     possible object is
     *     {@link Mutationsinhalt }
     *     
     */
    public Mutationsinhalt getMutationsinhalt() {
        return mutationsinhalt;
    }

    /**
     * Sets the value of the mutationsinhalt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mutationsinhalt }
     *     
     */
    public void setMutationsinhalt(Mutationsinhalt value) {
        this.mutationsinhalt = value;
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
