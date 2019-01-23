
package ch.ech.xmlns.ech_0098._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.ech.xmlns.ech_0007._6.Gemeinde;
import ch.ech.xmlns.ech_0010._6.OrganisationMailAddressInfoType;
import ch.ech.xmlns.ech_0010._6.PersonMailAddressInfoType;
import ch.ech.xmlns.ech_0010._6.SwissAddressInformationType;
import ch.ech.xmlns.ech_0097._2.OrganisationIdentificationType;


/**
 * <p>Java class for swissHeadquarterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="swissHeadquarterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organisationIdentification" type="{http://www.ech.ch/xmlns/eCH-0097/2}organisationIdentificationType" minOccurs="0"/&gt;
 *         &lt;element name="headquarterMunicipality" type="{http://www.ech.ch/xmlns/eCH-0007/6}swissMunicipalityType" minOccurs="0"/&gt;
 *         &lt;element name="businessAddress" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="organisation" type="{http://www.ech.ch/xmlns/eCH-0010/6}organisationMailAddressInfoType"/&gt;
 *                     &lt;element name="person" type="{http://www.ech.ch/xmlns/eCH-0010/6}personMailAddressInfoType"/&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="addressInformation" type="{http://www.ech.ch/xmlns/eCH-0010/6}swissAddressInformationType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "swissHeadquarterType", propOrder = {
    "organisationIdentification",
    "headquarterMunicipality",
    "businessAddress"
})
public class SwissHeadquarterType {

    protected OrganisationIdentificationType organisationIdentification;
    protected Gemeinde headquarterMunicipality;
    protected SwissHeadquarterType.BusinessAddress businessAddress;

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
     * Gets the value of the headquarterMunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link Gemeinde }
     *     
     */
    public Gemeinde getHeadquarterMunicipality() {
        return headquarterMunicipality;
    }

    /**
     * Sets the value of the headquarterMunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gemeinde }
     *     
     */
    public void setHeadquarterMunicipality(Gemeinde value) {
        this.headquarterMunicipality = value;
    }

    /**
     * Gets the value of the businessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link SwissHeadquarterType.BusinessAddress }
     *     
     */
    public SwissHeadquarterType.BusinessAddress getBusinessAddress() {
        return businessAddress;
    }

    /**
     * Sets the value of the businessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwissHeadquarterType.BusinessAddress }
     *     
     */
    public void setBusinessAddress(SwissHeadquarterType.BusinessAddress value) {
        this.businessAddress = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;choice&gt;
     *           &lt;element name="organisation" type="{http://www.ech.ch/xmlns/eCH-0010/6}organisationMailAddressInfoType"/&gt;
     *           &lt;element name="person" type="{http://www.ech.ch/xmlns/eCH-0010/6}personMailAddressInfoType"/&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="addressInformation" type="{http://www.ech.ch/xmlns/eCH-0010/6}swissAddressInformationType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "person",
        "organisation",
        "addressInformation"
    })
    public static class BusinessAddress {

        protected PersonMailAddressInfoType person;
        protected OrganisationMailAddressInfoType organisation;
        @XmlElement(required = true)
        protected SwissAddressInformationType addressInformation;

        /**
         * Gets the value of the person property.
         * 
         * @return
         *     possible object is
         *     {@link PersonMailAddressInfoType }
         *     
         */
        public PersonMailAddressInfoType getPerson() {
            return person;
        }

        /**
         * Sets the value of the person property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonMailAddressInfoType }
         *     
         */
        public void setPerson(PersonMailAddressInfoType value) {
            this.person = value;
        }

        /**
         * Gets the value of the organisation property.
         * 
         * @return
         *     possible object is
         *     {@link OrganisationMailAddressInfoType }
         *     
         */
        public OrganisationMailAddressInfoType getOrganisation() {
            return organisation;
        }

        /**
         * Sets the value of the organisation property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganisationMailAddressInfoType }
         *     
         */
        public void setOrganisation(OrganisationMailAddressInfoType value) {
            this.organisation = value;
        }

        /**
         * Gets the value of the addressInformation property.
         * 
         * @return
         *     possible object is
         *     {@link SwissAddressInformationType }
         *     
         */
        public SwissAddressInformationType getAddressInformation() {
            return addressInformation;
        }

        /**
         * Sets the value of the addressInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link SwissAddressInformationType }
         *     
         */
        public void setAddressInformation(SwissAddressInformationType value) {
            this.addressInformation = value;
        }

    }

}
