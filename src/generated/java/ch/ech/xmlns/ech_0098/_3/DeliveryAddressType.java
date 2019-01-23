
package ch.ech.xmlns.ech_0098._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.ech.xmlns.ech_0010._6.MailAddress;


/**
 * <p>Java class for deliveryAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deliveryAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deliveryAddress" type="{http://www.ech.ch/xmlns/eCH-0010/6}mailAddressType"/&gt;
 *         &lt;element name="addressValidSince" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deliveryAddressType", propOrder = {
    "deliveryAddress",
    "addressValidSince"
})
public class DeliveryAddressType {

    @XmlElement(required = true)
    protected MailAddress deliveryAddress;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar addressValidSince;

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link MailAddress }
     *     
     */
    public MailAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailAddress }
     *     
     */
    public void setDeliveryAddress(MailAddress value) {
        this.deliveryAddress = value;
    }

    /**
     * Gets the value of the addressValidSince property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAddressValidSince() {
        return addressValidSince;
    }

    /**
     * Sets the value of the addressValidSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAddressValidSince(XMLGregorianCalendar value) {
        this.addressValidSince = value;
    }

}
