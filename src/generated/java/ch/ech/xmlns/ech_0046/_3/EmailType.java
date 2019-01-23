
package ch.ech.xmlns.ech_0046._3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for emailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="emailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="emailCategory" type="{http://www.ech.ch/xmlns/eCH-0046/3}emailCategoryType"/&gt;
 *           &lt;element name="otherEmailCategory" type="{http://www.ech.ch/xmlns/eCH-0046/3}freeKategoryTextType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="emailAddress" type="{http://www.ech.ch/xmlns/eCH-0046/3}emailAddressType"/&gt;
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
@XmlType(name = "emailType", propOrder = {
    "otherEmailCategory",
    "emailCategory",
    "emailAddress",
    "validity"
})
public class EmailType {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String otherEmailCategory;
    protected BigInteger emailCategory;
    @XmlElement(required = true)
    protected String emailAddress;
    protected DateRangeType validity;

    /**
     * Gets the value of the otherEmailCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherEmailCategory() {
        return otherEmailCategory;
    }

    /**
     * Sets the value of the otherEmailCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherEmailCategory(String value) {
        this.otherEmailCategory = value;
    }

    /**
     * Gets the value of the emailCategory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmailCategory() {
        return emailCategory;
    }

    /**
     * Sets the value of the emailCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmailCategory(BigInteger value) {
        this.emailCategory = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
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
