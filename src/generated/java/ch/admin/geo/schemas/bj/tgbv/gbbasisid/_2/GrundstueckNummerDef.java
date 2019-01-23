
package ch.admin.geo.schemas.bj.tgbv.gbbasisid._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GrundstueckNummerDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrundstueckNummerDef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EGRID" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}EGRID" minOccurs="0"/&gt;
 *         &lt;element name="Nummer"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NummerZusatz" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubKreis" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}SubKreis" minOccurs="0"/&gt;
 *         &lt;element name="Los" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}Los" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrundstueckNummerDef", propOrder = {
    "egrid",
    "nummer",
    "nummerZusatz",
    "subKreis",
    "los"
})
@XmlRootElement(name = "GrundstueckNummerDef")
public class GrundstueckNummerDef {

    @XmlElement(name = "EGRID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String egrid;
    @XmlElement(name = "Nummer", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nummer;
    @XmlElement(name = "NummerZusatz")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nummerZusatz;
    @XmlElement(name = "SubKreis")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String subKreis;
    @XmlElement(name = "Los")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String los;

    /**
     * Gets the value of the egrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEGRID() {
        return egrid;
    }

    /**
     * Sets the value of the egrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEGRID(String value) {
        this.egrid = value;
    }

    /**
     * Gets the value of the nummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNummer() {
        return nummer;
    }

    /**
     * Sets the value of the nummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNummer(String value) {
        this.nummer = value;
    }

    /**
     * Gets the value of the nummerZusatz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNummerZusatz() {
        return nummerZusatz;
    }

    /**
     * Sets the value of the nummerZusatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNummerZusatz(String value) {
        this.nummerZusatz = value;
    }

    /**
     * Gets the value of the subKreis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubKreis() {
        return subKreis;
    }

    /**
     * Sets the value of the subKreis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubKreis(String value) {
        this.subKreis = value;
    }

    /**
     * Gets the value of the los property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLos() {
        return los;
    }

    /**
     * Sets the value of the los property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLos(String value) {
        this.los = value;
    }

}
