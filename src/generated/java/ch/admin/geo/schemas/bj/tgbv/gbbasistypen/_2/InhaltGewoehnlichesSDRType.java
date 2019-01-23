
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InhaltGewoehnlichesSDRType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InhaltGewoehnlichesSDRType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}InhaltSelbstaendigesDauerndesRechtType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Art" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}DauerndesRechtArt" minOccurs="0"/&gt;
 *         &lt;element name="Beschreibung" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
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
@XmlType(name = "InhaltGewoehnlichesSDRType", propOrder = {
    "art",
    "beschreibung"
})
public class InhaltGewoehnlichesSDRType
    extends InhaltSelbstaendigesDauerndesRechtType
{

    @XmlElement(name = "Art")
    @XmlSchemaType(name = "normalizedString")
    protected DauerndesRechtArt art;
    @XmlElement(name = "Beschreibung")
    protected String beschreibung;

    /**
     * Gets the value of the art property.
     * 
     * @return
     *     possible object is
     *     {@link DauerndesRechtArt }
     *     
     */
    public DauerndesRechtArt getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     * 
     * @param value
     *     allowed object is
     *     {@link DauerndesRechtArt }
     *     
     */
    public void setArt(DauerndesRechtArt value) {
        this.art = value;
    }

    /**
     * Gets the value of the beschreibung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Sets the value of the beschreibung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeschreibung(String value) {
        this.beschreibung = value;
    }

}
