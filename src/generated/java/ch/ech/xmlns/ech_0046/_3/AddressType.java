
package ch.ech.xmlns.ech_0046._3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ch.ech.xmlns.ech_0010._6.MailAddress;


/**
 * <p>Java class for addressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="addressCategory" type="{http://www.ech.ch/xmlns/eCH-0046/3}addressCategoryType"/&gt;
 *           &lt;element name="otherAddressCategory" type="{http://www.ech.ch/xmlns/eCH-0046/3}freeKategoryTextType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="postalAddress" type="{http://www.ech.ch/xmlns/eCH-0010/6}mailAddressType"/&gt;
 *         &lt;element name="validity" type="{http://www.ech.ch/xmlns/eCH-0046/3}dateRangeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressType", propOrder = {
    "otherAddressCategory",
    "addressCategory",
    "postalAddress",
    "validity"
})
public class AddressType {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String otherAddressCategory;
    protected BigInteger addressCategory;
    @XmlElement(required = true)
    protected MailAddress postalAddress;
    protected DateRangeType validity;

    /**
     * Gets the value of the otherAddressCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherAddressCategory() {
        return otherAddressCategory;
    }

    /**
     * Sets the value of the otherAddressCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherAddressCategory(String value) {
        this.otherAddressCategory = value;
    }

    /**
     * Gets the value of the addressCategory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAddressCategory() {
        return addressCategory;
    }

    /**
     * Sets the value of the addressCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAddressCategory(BigInteger value) {
        this.addressCategory = value;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link MailAddress }
     *     
     */
    public MailAddress getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailAddress }
     *     
     */
    public void setPostalAddress(MailAddress value) {
        this.postalAddress = value;
    }

    /**
     * Gets the value of the validity property.
     * 
     * @return
     *     possible object is
     *     {@link DateRangeType }
     *     
     */
    public DateRangeType getValidity() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRangeType }
     *     
     */
    public void setValidity(DateRangeType value) {
        this.validity = value;
    }

}
