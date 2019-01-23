
package ch.admin.geo.schemas.bj.tgbv.gbdbs._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GetDocumentsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDocumentsRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}AbstractRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="egbtbid" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}EGBTBID"/&gt;
 *         &lt;element name="responseScope"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="public"/&gt;
 *               &lt;enumeration value="owner"/&gt;
 *               &lt;enumeration value="notary"/&gt;
 *               &lt;enumeration value="surveyor"/&gt;
 *               &lt;enumeration value="beneficiary"/&gt;
 *               &lt;enumeration value="bank"/&gt;
 *               &lt;enumeration value="pensionFund"/&gt;
 *               &lt;enumeration value="federalTaxOffice"/&gt;
 *               &lt;enumeration value="cantonalTaxOffice"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="beneficiaryUid" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}UID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDocumentsRequestType", propOrder = {
    "egbtbid",
    "responseScope",
    "beneficiaryUid",
    "extensions"
})
public class GetDocumentsRequestType
    extends AbstractRequestType
{

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String egbtbid;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String responseScope;
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String beneficiaryUid;
    protected Extensions extensions;

    /**
     * Gets the value of the egbtbid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgbtbid() {
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
    public void setEgbtbid(String value) {
        this.egbtbid = value;
    }

    /**
     * Gets the value of the responseScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseScope() {
        return responseScope;
    }

    /**
     * Sets the value of the responseScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseScope(String value) {
        this.responseScope = value;
    }

    /**
     * Gets the value of the beneficiaryUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryUid() {
        return beneficiaryUid;
    }

    /**
     * Sets the value of the beneficiaryUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryUid(String value) {
        this.beneficiaryUid = value;
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
