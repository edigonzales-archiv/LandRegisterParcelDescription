
package ch.ech.xmlns.ech_0098._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ch.ech.xmlns.ech_0046._3.ContactType;
import ch.ech.xmlns.ech_0097._2.OrganisationIdentificationType;


/**
 * <p>Java class for organisationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organisationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organisationIdentification" type="{http://www.ech.ch/xmlns/eCH-0097/2}organisationIdentificationType"/&gt;
 *         &lt;element name="uidBrancheText" type="{http://www.ech.ch/xmlns/eCH-0098/3}uidBrancheTextType" minOccurs="0"/&gt;
 *         &lt;element name="nogaCode" type="{http://www.ech.ch/xmlns/eCH-0098/3}nogaCodeType" minOccurs="0"/&gt;
 *         &lt;element name="foundation" type="{http://www.ech.ch/xmlns/eCH-0098/3}foundationType" minOccurs="0"/&gt;
 *         &lt;element name="liquidation" type="{http://www.ech.ch/xmlns/eCH-0098/3}liquidationType" minOccurs="0"/&gt;
 *         &lt;element name="contact" type="{http://www.ech.ch/xmlns/eCH-0046/3}contactType" minOccurs="0"/&gt;
 *         &lt;element name="languageOfCorrespondance" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.ech.ch/xmlns/eCH-0098/3}languageType"&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organisationType", propOrder = {
    "organisationIdentification",
    "uidBrancheText",
    "nogaCode",
    "foundation",
    "liquidation",
    "contact",
    "languageOfCorrespondance"
})
public class OrganisationType {

    @XmlElement(required = true)
    protected OrganisationIdentificationType organisationIdentification;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String uidBrancheText;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String nogaCode;
    protected FoundationType foundation;
    protected LiquidationType liquidation;
    protected ContactType contact;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String languageOfCorrespondance;

    /**
     * Gets the value of the organisationIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentificationType }
     *     
     */
    public OrganisationIdentificationType getOrganisationIdentification() {
        return organisationIdentification;
    }

    /**
     * Sets the value of the organisationIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentificationType }
     *     
     */
    public void setOrganisationIdentification(OrganisationIdentificationType value) {
        this.organisationIdentification = value;
    }

    /**
     * Gets the value of the uidBrancheText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidBrancheText() {
        return uidBrancheText;
    }

    /**
     * Sets the value of the uidBrancheText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidBrancheText(String value) {
        this.uidBrancheText = value;
    }

    /**
     * Gets the value of the nogaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNogaCode() {
        return nogaCode;
    }

    /**
     * Sets the value of the nogaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNogaCode(String value) {
        this.nogaCode = value;
    }

    /**
     * Gets the value of the foundation property.
     * 
     * @return
     *     possible object is
     *     {@link FoundationType }
     *     
     */
    public FoundationType getFoundation() {
        return foundation;
    }

    /**
     * Sets the value of the foundation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoundationType }
     *     
     */
    public void setFoundation(FoundationType value) {
        this.foundation = value;
    }

    /**
     * Gets the value of the liquidation property.
     * 
     * @return
     *     possible object is
     *     {@link LiquidationType }
     *     
     */
    public LiquidationType getLiquidation() {
        return liquidation;
    }

    /**
     * Sets the value of the liquidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquidationType }
     *     
     */
    public void setLiquidation(LiquidationType value) {
        this.liquidation = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setContact(ContactType value) {
        this.contact = value;
    }

    /**
     * Gets the value of the languageOfCorrespondance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageOfCorrespondance() {
        return languageOfCorrespondance;
    }

    /**
     * Sets the value of the languageOfCorrespondance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageOfCorrespondance(String value) {
        this.languageOfCorrespondance = value;
    }

}
