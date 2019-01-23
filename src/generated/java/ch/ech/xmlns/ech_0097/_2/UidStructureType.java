
package ch.ech.xmlns.ech_0097._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uidStructureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uidStructureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uidOrganisationIdCategorie" type="{http://www.ech.ch/xmlns/eCH-0097/2}uidOrganisationIdCategorieType"/&gt;
 *         &lt;element name="uidOrganisationId" type="{http://www.ech.ch/xmlns/eCH-0097/2}uidOrganisationIdType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uidStructureType", propOrder = {
    "uidOrganisationIdCategorie",
    "uidOrganisationId"
})
public class UidStructureType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected UidOrganisationIdCategorieType uidOrganisationIdCategorie;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected int uidOrganisationId;

    /**
     * Gets the value of the uidOrganisationIdCategorie property.
     * 
     * @return
     *     possible object is
     *     {@link UidOrganisationIdCategorieType }
     *     
     */
    public UidOrganisationIdCategorieType getUidOrganisationIdCategorie() {
        return uidOrganisationIdCategorie;
    }

    /**
     * Sets the value of the uidOrganisationIdCategorie property.
     * 
     * @param value
     *     allowed object is
     *     {@link UidOrganisationIdCategorieType }
     *     
     */
    public void setUidOrganisationIdCategorie(UidOrganisationIdCategorieType value) {
        this.uidOrganisationIdCategorie = value;
    }

    /**
     * Gets the value of the uidOrganisationId property.
     * 
     */
    public int getUidOrganisationId() {
        return uidOrganisationId;
    }

    /**
     * Sets the value of the uidOrganisationId property.
     * 
     */
    public void setUidOrganisationId(int value) {
        this.uidOrganisationId = value;
    }

}
