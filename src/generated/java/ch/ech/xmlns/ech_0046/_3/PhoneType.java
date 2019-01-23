
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
 * <p>Java class for phoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phoneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="phoneCategory" type="{http://www.ech.ch/xmlns/eCH-0046/3}phoneCategoryType"/&gt;
 *           &lt;element name="otherPhoneCategory" type="{http://www.ech.ch/xmlns/eCH-0046/3}freeKategoryTextType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="phoneNumber" type="{http://www.ech.ch/xmlns/eCH-0046/3}phoneNumberType"/&gt;
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
@XmlType(name = "phoneType", propOrder = {
    "otherPhoneCategory",
    "phoneCategory",
    "phoneNumber",
    "validity"
})
public class PhoneType {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String otherPhoneCategory;
    protected BigInteger phoneCategory;
    @XmlElement(required = true)
    protected String phoneNumber;
    protected DateRangeType validity;

    /**
     * Gets the value of the otherPhoneCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPhoneCategory() {
        return otherPhoneCategory;
    }

    /**
     * Sets the value of the otherPhoneCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPhoneCategory(String value) {
        this.otherPhoneCategory = value;
    }

    /**
     * Gets the value of the phoneCategory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPhoneCategory() {
        return phoneCategory;
    }

    /**
     * Sets the value of the phoneCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPhoneCategory(BigInteger value) {
        this.phoneCategory = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
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
