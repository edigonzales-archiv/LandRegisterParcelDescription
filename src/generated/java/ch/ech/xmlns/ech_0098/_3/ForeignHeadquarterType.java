
package ch.ech.xmlns.ech_0098._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.ech.xmlns.ech_0010._6.MailAddress;


/**
 * <p>Java class for foreignHeadquarterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foreignHeadquarterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="businessAddress" type="{http://www.ech.ch/xmlns/eCH-0010/6}mailAddressType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "foreignHeadquarterType", propOrder = {
    "businessAddress"
})
public class ForeignHeadquarterType {

    @XmlElement(required = true)
    protected MailAddress businessAddress;

    /**
     * Gets the value of the businessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link MailAddress }
     *     
     */
    public MailAddress getBusinessAddress() {
        return businessAddress;
    }

    /**
     * Sets the value of the businessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailAddress }
     *     
     */
    public void setBusinessAddress(MailAddress value) {
        this.businessAddress = value;
    }

}
