
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
 * <p>Java class for PersonIdDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonIdDef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EGBPID" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}EGBPID" minOccurs="0"/&gt;
 *         &lt;element name="KantPersNr" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UID" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}UID" minOccurs="0"/&gt;
 *         &lt;element name="AHVN13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="localId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdDef", propOrder = {
    "egbpid",
    "kantPersNr",
    "uid",
    "ahvn13",
    "localId"
})
@XmlRootElement(name = "PersonIdDef")
public class PersonIdDef {

    @XmlElement(name = "EGBPID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String egbpid;
    @XmlElement(name = "KantPersNr")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String kantPersNr;
    @XmlElement(name = "UID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String uid;
    @XmlElement(name = "AHVN13")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ahvn13;
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String localId;

    /**
     * Gets the value of the egbpid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEGBPID() {
        return egbpid;
    }

    /**
     * Sets the value of the egbpid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEGBPID(String value) {
        this.egbpid = value;
    }

    /**
     * Gets the value of the kantPersNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKantPersNr() {
        return kantPersNr;
    }

    /**
     * Sets the value of the kantPersNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKantPersNr(String value) {
        this.kantPersNr = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUID() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUID(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the ahvn13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAHVN13() {
        return ahvn13;
    }

    /**
     * Sets the value of the ahvn13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAHVN13(String value) {
        this.ahvn13 = value;
    }

    /**
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalId(String value) {
        this.localId = value;
    }

}
