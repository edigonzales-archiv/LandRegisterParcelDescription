
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
 * <p>Java class for RechtIdDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RechtIdDef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EREID" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}EREID" minOccurs="0"/&gt;
 *         &lt;element name="alteNummer" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="20"/&gt;
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
@XmlType(name = "RechtIdDef", propOrder = {
    "ereid",
    "alteNummer",
    "localId"
})
@XmlRootElement(name = "RechtIdDef")
public class RechtIdDef {

    @XmlElement(name = "EREID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ereid;
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String alteNummer;
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String localId;

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
