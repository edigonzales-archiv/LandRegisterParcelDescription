
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SchweizerischeJuristischePersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchweizerischeJuristischePersonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}JuristischePersonType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Gesellschaftsform" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;enumeration value="Aktiengesellschaft"/&gt;
 *               &lt;enumeration value="Kommanditaktiengesellschaft"/&gt;
 *               &lt;enumeration value="GmbH"/&gt;
 *               &lt;enumeration value="Genossenschaft"/&gt;
 *               &lt;enumeration value="Verein"/&gt;
 *               &lt;enumeration value="Stiftung"/&gt;
 *               &lt;enumeration value="weitere"/&gt;
 *               &lt;enumeration value="KollektiveGesellschaft"/&gt;
 *               &lt;enumeration value="KommanditGesellschaft"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchweizerischeJuristischePersonType", propOrder = {
    "gesellschaftsform",
    "uid"
})
public class SchweizerischeJuristischePersonType
    extends JuristischePersonType
{

    @XmlElement(name = "Gesellschaftsform")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String gesellschaftsform;
    @XmlElement(name = "UID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String uid;

    /**
     * Gets the value of the gesellschaftsform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGesellschaftsform() {
        return gesellschaftsform;
    }

    /**
     * Sets the value of the gesellschaftsform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGesellschaftsform(String value) {
        this.gesellschaftsform = value;
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

}
