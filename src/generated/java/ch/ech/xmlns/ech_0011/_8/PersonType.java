
package ch.ech.xmlns.ech_0011._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ch.ech.xmlns.ech_0044._4.PersonIdentificationType;


/**
 * <p>Java class for personType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="personIdentification" type="{http://www.ech.ch/xmlns/eCH-0044/4}personIdentificationType"/&gt;
 *         &lt;element name="nameData" type="{http://www.ech.ch/xmlns/eCH-0011/8}nameDataType"/&gt;
 *         &lt;element name="birthData" type="{http://www.ech.ch/xmlns/eCH-0011/8}birthDataType"/&gt;
 *         &lt;element name="religionData" type="{http://www.ech.ch/xmlns/eCH-0011/8}religionDataType"/&gt;
 *         &lt;element name="maritalData" type="{http://www.ech.ch/xmlns/eCH-0011/8}maritalDataType"/&gt;
 *         &lt;element name="nationalityData" type="{http://www.ech.ch/xmlns/eCH-0011/8}nationalityDataType"/&gt;
 *         &lt;element name="deathData" type="{http://www.ech.ch/xmlns/eCH-0011/8}deathDataType" minOccurs="0"/&gt;
 *         &lt;element name="contactData" type="{http://www.ech.ch/xmlns/eCH-0011/8}contactDataType" minOccurs="0"/&gt;
 *         &lt;element name="languageOfCorrespondance" type="{http://www.ech.ch/xmlns/eCH-0011/8}languageType" minOccurs="0"/&gt;
 *         &lt;element name="restrictedVotingAndElectionRightFederation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="placeOfOrigin" type="{http://www.ech.ch/xmlns/eCH-0011/8}placeOfOriginType" maxOccurs="unbounded"/&gt;
 *           &lt;element name="residencePermit" type="{http://www.ech.ch/xmlns/eCH-0011/8}residencePermitDataType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personType", propOrder = {
    "personIdentification",
    "nameData",
    "birthData",
    "religionData",
    "maritalData",
    "nationalityData",
    "deathData",
    "contactData",
    "languageOfCorrespondance",
    "restrictedVotingAndElectionRightFederation",
    "residencePermit",
    "placeOfOrigins"
})
public class PersonType {

    @XmlElement(required = true)
    protected PersonIdentificationType personIdentification;
    @XmlElement(required = true)
    protected NameDataType nameData;
    @XmlElement(required = true)
    protected BirthDataType birthData;
    @XmlElement(required = true)
    protected ReligionDataType religionData;
    @XmlElement(required = true)
    protected MaritalDataType maritalData;
    @XmlElement(required = true)
    protected NationalityDataType nationalityData;
    protected DeathDataType deathData;
    protected ContactDataType contactData;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String languageOfCorrespondance;
    protected Boolean restrictedVotingAndElectionRightFederation;
    protected ResidencePermitDataType residencePermit;
    @XmlElement(name = "placeOfOrigin")
    protected List<PlaceOfOriginType> placeOfOrigins;

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
     * Gets the value of the nameData property.
     * 
     * @return
     *     possible object is
     *     {@link NameDataType }
     *     
     */
    public NameDataType getNameData() {
        return nameData;
    }

    /**
     * Sets the value of the nameData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameDataType }
     *     
     */
    public void setNameData(NameDataType value) {
        this.nameData = value;
    }

    /**
     * Gets the value of the birthData property.
     * 
     * @return
     *     possible object is
     *     {@link BirthDataType }
     *     
     */
    public BirthDataType getBirthData() {
        return birthData;
    }

    /**
     * Sets the value of the birthData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthDataType }
     *     
     */
    public void setBirthData(BirthDataType value) {
        this.birthData = value;
    }

    /**
     * Gets the value of the religionData property.
     * 
     * @return
     *     possible object is
     *     {@link ReligionDataType }
     *     
     */
    public ReligionDataType getReligionData() {
        return religionData;
    }

    /**
     * Sets the value of the religionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReligionDataType }
     *     
     */
    public void setReligionData(ReligionDataType value) {
        this.religionData = value;
    }

    /**
     * Gets the value of the maritalData property.
     * 
     * @return
     *     possible object is
     *     {@link MaritalDataType }
     *     
     */
    public MaritalDataType getMaritalData() {
        return maritalData;
    }

    /**
     * Sets the value of the maritalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritalDataType }
     *     
     */
    public void setMaritalData(MaritalDataType value) {
        this.maritalData = value;
    }

    /**
     * Gets the value of the nationalityData property.
     * 
     * @return
     *     possible object is
     *     {@link NationalityDataType }
     *     
     */
    public NationalityDataType getNationalityData() {
        return nationalityData;
    }

    /**
     * Sets the value of the nationalityData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalityDataType }
     *     
     */
    public void setNationalityData(NationalityDataType value) {
        this.nationalityData = value;
    }

    /**
     * Gets the value of the deathData property.
     * 
     * @return
     *     possible object is
     *     {@link DeathDataType }
     *     
     */
    public DeathDataType getDeathData() {
        return deathData;
    }

    /**
     * Sets the value of the deathData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeathDataType }
     *     
     */
    public void setDeathData(DeathDataType value) {
        this.deathData = value;
    }

    /**
     * Gets the value of the contactData property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDataType }
     *     
     */
    public ContactDataType getContactData() {
        return contactData;
    }

    /**
     * Sets the value of the contactData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDataType }
     *     
     */
    public void setContactData(ContactDataType value) {
        this.contactData = value;
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

    /**
     * Gets the value of the restrictedVotingAndElectionRightFederation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedVotingAndElectionRightFederation() {
        return restrictedVotingAndElectionRightFederation;
    }

    /**
     * Sets the value of the restrictedVotingAndElectionRightFederation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedVotingAndElectionRightFederation(Boolean value) {
        this.restrictedVotingAndElectionRightFederation = value;
    }

    /**
     * Gets the value of the residencePermit property.
     * 
     * @return
     *     possible object is
     *     {@link ResidencePermitDataType }
     *     
     */
    public ResidencePermitDataType getResidencePermit() {
        return residencePermit;
    }

    /**
     * Sets the value of the residencePermit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidencePermitDataType }
     *     
     */
    public void setResidencePermit(ResidencePermitDataType value) {
        this.residencePermit = value;
    }

    /**
     * Gets the value of the placeOfOrigins property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placeOfOrigins property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceOfOrigins().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlaceOfOriginType }
     * 
     * 
     */
    public List<PlaceOfOriginType> getPlaceOfOrigins() {
        if (placeOfOrigins == null) {
            placeOfOrigins = new ArrayList<PlaceOfOriginType>();
        }
        return this.placeOfOrigins;
    }

}
