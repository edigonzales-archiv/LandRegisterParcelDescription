
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
 * <p>Java class for internetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="internetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="internetCategory" type="{http://www.ech.ch/xmlns/eCH-0046/3}internetCategoryType"/&gt;
 *           &lt;element name="otherInternetCategory" type="{http://www.ech.ch/xmlns/eCH-0046/3}freeKategoryTextType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="internetAddress" type="{http://www.ech.ch/xmlns/eCH-0046/3}internetAddressType"/&gt;
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
@XmlType(name = "internetType", propOrder = {
    "otherInternetCategory",
    "internetCategory",
    "internetAddress",
    "validity"
})
public class InternetType {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String otherInternetCategory;
    protected BigInteger internetCategory;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String internetAddress;
    protected DateRangeType validity;

    /**
     * Gets the value of the otherInternetCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInternetCategory() {
        return otherInternetCategory;
    }

    /**
     * Sets the value of the otherInternetCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInternetCategory(String value) {
        this.otherInternetCategory = value;
    }

    /**
     * Gets the value of the internetCategory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInternetCategory() {
        return internetCategory;
    }

    /**
     * Sets the value of the internetCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInternetCategory(BigInteger value) {
        this.internetCategory = value;
    }

    /**
     * Gets the value of the internetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetAddress() {
        return internetAddress;
    }

    /**
     * Sets the value of the internetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetAddress(String value) {
        this.internetAddress = value;
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
