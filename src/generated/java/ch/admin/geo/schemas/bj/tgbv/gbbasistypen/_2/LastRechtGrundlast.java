
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LastRechtGrundlastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LastRechtGrundlastType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Berechtigte" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}BerechtigteRefBegruendet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="belastetesGrundstueck" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}GrundstueckRefBegruendet" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "LastRechtGrundlastType", propOrder = {
    "berechtigtes",
    "belastetesGrundstuecks",
    "extensions"
})
@XmlRootElement(name = "LastRechtGrundlast")
public class LastRechtGrundlast {

    @XmlElement(name = "Berechtigte")
    protected List<BerechtigteRefBegruendet> berechtigtes;
    @XmlElement(name = "belastetesGrundstueck", required = true)
    protected List<GrundstueckRefBegruendet> belastetesGrundstuecks;
    protected Extensions extensions;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the berechtigtes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the berechtigtes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBerechtigtes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BerechtigteRefBegruendet }
     * 
     * 
     */
    public List<BerechtigteRefBegruendet> getBerechtigtes() {
        if (berechtigtes == null) {
            berechtigtes = new ArrayList<BerechtigteRefBegruendet>();
        }
        return this.berechtigtes;
    }

    /**
     * Gets the value of the belastetesGrundstuecks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the belastetesGrundstuecks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBelastetesGrundstuecks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrundstueckRefBegruendet }
     * 
     * 
     */
    public List<GrundstueckRefBegruendet> getBelastetesGrundstuecks() {
        if (belastetesGrundstuecks == null) {
            belastetesGrundstuecks = new ArrayList<GrundstueckRefBegruendet>();
        }
        return this.belastetesGrundstuecks;
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
