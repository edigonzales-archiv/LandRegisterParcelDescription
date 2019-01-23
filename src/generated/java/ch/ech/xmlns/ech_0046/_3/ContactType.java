
package ch.ech.xmlns.ech_0046._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.ech.xmlns.ech_0044._4.NamedPersonIdType;


/**
 * <p>Java class for contactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="localID" type="{http://www.ech.ch/xmlns/eCH-0044/4}namedPersonIdType" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.ech.ch/xmlns/eCH-0046/3}addressType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.ech.ch/xmlns/eCH-0046/3}emailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.ech.ch/xmlns/eCH-0046/3}phoneType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="internet" type="{http://www.ech.ch/xmlns/eCH-0046/3}internetType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactType", propOrder = {
    "localID",
    "addresses",
    "emails",
    "phones",
    "internets"
})
public class ContactType {

    protected NamedPersonIdType localID;
    @XmlElement(name = "address")
    protected List<AddressType> addresses;
    @XmlElement(name = "email")
    protected List<EmailType> emails;
    @XmlElement(name = "phone")
    protected List<PhoneType> phones;
    @XmlElement(name = "internet")
    protected List<InternetType> internets;

    /**
     * Gets the value of the localID property.
     * 
     * @return
     *     possible object is
     *     {@link NamedPersonIdType }
     *     
     */
    public NamedPersonIdType getLocalID() {
        return localID;
    }

    /**
     * Sets the value of the localID property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedPersonIdType }
     *     
     */
    public void setLocalID(NamedPersonIdType value) {
        this.localID = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<AddressType>();
        }
        return this.addresses;
    }

    /**
     * Gets the value of the emails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailType }
     * 
     * 
     */
    public List<EmailType> getEmails() {
        if (emails == null) {
            emails = new ArrayList<EmailType>();
        }
        return this.emails;
    }

    /**
     * Gets the value of the phones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneType }
     * 
     * 
     */
    public List<PhoneType> getPhones() {
        if (phones == null) {
            phones = new ArrayList<PhoneType>();
        }
        return this.phones;
    }

    /**
     * Gets the value of the internets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternetType }
     * 
     * 
     */
    public List<InternetType> getInternets() {
        if (internets == null) {
            internets = new ArrayList<InternetType>();
        }
        return this.internets;
    }

}
