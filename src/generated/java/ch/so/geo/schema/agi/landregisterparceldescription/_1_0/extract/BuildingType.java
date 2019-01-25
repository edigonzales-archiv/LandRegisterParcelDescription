
package ch.so.geo.schema.agi.landregisterparceldescription._1_0.extract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuildingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuildingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Egid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Edid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PostalAddress" type="{http://geo.so.ch/schema/AGI/LandRegisterParcelDescription/1.0/Extract}Address" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuildingType", propOrder = {
    "egid",
    "edid",
    "postalAddress"
})
public class BuildingType {

    @XmlElement(name = "Egid")
    protected Integer egid;
    @XmlElement(name = "Edid")
    protected Integer edid;
    @XmlElement(name = "PostalAddress")
    protected Address postalAddress;

    /**
     * Gets the value of the egid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEgid() {
        return egid;
    }

    /**
     * Sets the value of the egid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEgid(Integer value) {
        this.egid = value;
    }

    /**
     * Gets the value of the edid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEdid() {
        return edid;
    }

    /**
     * Sets the value of the edid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEdid(Integer value) {
        this.edid = value;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setPostalAddress(Address value) {
        this.postalAddress = value;
    }

}
