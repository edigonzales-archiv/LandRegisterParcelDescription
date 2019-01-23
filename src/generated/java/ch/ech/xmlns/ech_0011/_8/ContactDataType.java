
package ch.ech.xmlns.ech_0011._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.ech.xmlns.ech_0010._5.MailAddress;
import ch.ech.xmlns.ech_0044._4.PersonIdentificationLightType;
import ch.ech.xmlns.ech_0044._4.PersonIdentificationType;


/**
 * <p>Java class for contactDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="personIdentification" type="{http://www.ech.ch/xmlns/eCH-0044/4}personIdentificationType"/&gt;
 *           &lt;element name="personIdentificationPartner" type="{http://www.ech.ch/xmlns/eCH-0044/4}personIdentificationLightType"/&gt;
 *           &lt;element name="partnerIdOrganisation" type="{http://www.ech.ch/xmlns/eCH-0011/8}partnerIdOrganisationType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="contactAddress" type="{http://www.ech.ch/xmlns/eCH-0010/5}mailAddressType"/&gt;
 *         &lt;element name="contactValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="contactValidTill" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactDataType", propOrder = {
    "partnerIdOrganisation",
    "personIdentificationPartner",
    "personIdentification",
    "contactAddress",
    "contactValidFrom",
    "contactValidTill"
})
public class ContactDataType {

    protected PartnerIdOrganisationType partnerIdOrganisation;
    protected PersonIdentificationLightType personIdentificationPartner;
    protected PersonIdentificationType personIdentification;
    @XmlElement(required = true)
    protected MailAddress contactAddress;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contactValidFrom;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contactValidTill;

    /**
     * Gets the value of the partnerIdOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerIdOrganisationType }
     *     
     */
    public PartnerIdOrganisationType getPartnerIdOrganisation() {
        return partnerIdOrganisation;
    }

    /**
     * Sets the value of the partnerIdOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerIdOrganisationType }
     *     
     */
    public void setPartnerIdOrganisation(PartnerIdOrganisationType value) {
        this.partnerIdOrganisation = value;
    }

    /**
     * Gets the value of the personIdentificationPartner property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentificationLightType }
     *     
     */
    public PersonIdentificationLightType getPersonIdentificationPartner() {
        return personIdentificationPartner;
    }

    /**
     * Sets the value of the personIdentificationPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentificationLightType }
     *     
     */
    public void setPersonIdentificationPartner(PersonIdentificationLightType value) {
        this.personIdentificationPartner = value;
    }

    /**
     * Gets the value of the personIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentificationType }
     *     
     */
    public PersonIdentificationType getPersonIdentification() {
        return personIdentification;
    }

    /**
     * Sets the value of the personIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentificationType }
     *     
     */
    public void setPersonIdentification(PersonIdentificationType value) {
        this.personIdentification = value;
    }

    /**
     * Gets the value of the contactAddress property.
     * 
     * @return
     *     possible object is
     *     {@link MailAddress }
     *     
     */
    public MailAddress getContactAddress() {
        return contactAddress;
    }

    /**
     * Sets the value of the contactAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailAddress }
     *     
     */
    public void setContactAddress(MailAddress value) {
        this.contactAddress = value;
    }

    /**
     * Gets the value of the contactValidFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContactValidFrom() {
        return contactValidFrom;
    }

    /**
     * Sets the value of the contactValidFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContactValidFrom(XMLGregorianCalendar value) {
        this.contactValidFrom = value;
    }

    /**
     * Gets the value of the contactValidTill property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContactValidTill() {
        return contactValidTill;
    }

    /**
     * Sets the value of the contactValidTill property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContactValidTill(XMLGregorianCalendar value) {
        this.contactValidTill = value;
    }

}
