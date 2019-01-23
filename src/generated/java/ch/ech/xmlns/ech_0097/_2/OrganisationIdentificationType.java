
package ch.ech.xmlns.ech_0097._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for organisationIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organisationIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uid" type="{http://www.ech.ch/xmlns/eCH-0097/2}uidStructureType" minOccurs="0"/&gt;
 *         &lt;element name="localOrganisationId" type="{http://www.ech.ch/xmlns/eCH-0097/2}namedOrganisationIdType"/&gt;
 *         &lt;element name="OtherOrganisationId" type="{http://www.ech.ch/xmlns/eCH-0097/2}namedOrganisationIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="organisationName" type="{http://www.ech.ch/xmlns/eCH-0097/2}organisationNameType"/&gt;
 *         &lt;element name="organisationLegalName" type="{http://www.ech.ch/xmlns/eCH-0097/2}organisationNameType" minOccurs="0"/&gt;
 *         &lt;element name="organisationAdditionalName" type="{http://www.ech.ch/xmlns/eCH-0097/2}organisationNameType" minOccurs="0"/&gt;
 *         &lt;element name="legalForm" type="{http://www.ech.ch/xmlns/eCH-0097/2}legalFormType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organisationIdentificationType", propOrder = {
    "uid",
    "localOrganisationId",
    "otherOrganisationIds",
    "organisationName",
    "organisationLegalName",
    "organisationAdditionalName",
    "legalForm"
})
public class OrganisationIdentificationType {

    protected UidStructureType uid;
    @XmlElement(required = true)
    protected NamedOrganisationIdType localOrganisationId;
    @XmlElement(name = "OtherOrganisationId")
    protected List<NamedOrganisationIdType> otherOrganisationIds;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organisationName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organisationLegalName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organisationAdditionalName;
    protected String legalForm;

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link UidStructureType }
     *     
     */
    public UidStructureType getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link UidStructureType }
     *     
     */
    public void setUid(UidStructureType value) {
        this.uid = value;
    }

    /**
     * Gets the value of the localOrganisationId property.
     * 
     * @return
     *     possible object is
     *     {@link NamedOrganisationIdType }
     *     
     */
    public NamedOrganisationIdType getLocalOrganisationId() {
        return localOrganisationId;
    }

    /**
     * Sets the value of the localOrganisationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedOrganisationIdType }
     *     
     */
    public void setLocalOrganisationId(NamedOrganisationIdType value) {
        this.localOrganisationId = value;
    }

    /**
     * Gets the value of the otherOrganisationIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherOrganisationIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherOrganisationIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedOrganisationIdType }
     * 
     * 
     */
    public List<NamedOrganisationIdType> getOtherOrganisationIds() {
        if (otherOrganisationIds == null) {
            otherOrganisationIds = new ArrayList<NamedOrganisationIdType>();
        }
        return this.otherOrganisationIds;
    }

    /**
     * Gets the value of the organisationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationName() {
        return organisationName;
    }

    /**
     * Sets the value of the organisationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationName(String value) {
        this.organisationName = value;
    }

    /**
     * Gets the value of the organisationLegalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationLegalName() {
        return organisationLegalName;
    }

    /**
     * Sets the value of the organisationLegalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationLegalName(String value) {
        this.organisationLegalName = value;
    }

    /**
     * Gets the value of the organisationAdditionalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationAdditionalName() {
        return organisationAdditionalName;
    }

    /**
     * Sets the value of the organisationAdditionalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationAdditionalName(String value) {
        this.organisationAdditionalName = value;
    }

    /**
     * Gets the value of the legalForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalForm() {
        return legalForm;
    }

    /**
     * Sets the value of the legalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalForm(String value) {
        this.legalForm = value;
    }

}
