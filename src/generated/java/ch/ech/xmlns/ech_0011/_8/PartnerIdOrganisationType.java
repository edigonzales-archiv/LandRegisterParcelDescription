
package ch.ech.xmlns.ech_0011._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.ech.xmlns.ech_0044._4.NamedPersonIdType;


/**
 * <p>Java class for partnerIdOrganisationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partnerIdOrganisationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="localPersonId" type="{http://www.ech.ch/xmlns/eCH-0044/4}namedPersonIdType"/&gt;
 *         &lt;element name="otherPersonId" type="{http://www.ech.ch/xmlns/eCH-0044/4}namedPersonIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partnerIdOrganisationType", propOrder = {
    "localPersonId",
    "otherPersonIds"
})
public class PartnerIdOrganisationType {

    @XmlElement(required = true)
    protected NamedPersonIdType localPersonId;
    @XmlElement(name = "otherPersonId")
    protected List<NamedPersonIdType> otherPersonIds;

    /**
     * Gets the value of the localPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link NamedPersonIdType }
     *     
     */
    public NamedPersonIdType getLocalPersonId() {
        return localPersonId;
    }

    /**
     * Sets the value of the localPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedPersonIdType }
     *     
     */
    public void setLocalPersonId(NamedPersonIdType value) {
        this.localPersonId = value;
    }

    /**
     * Gets the value of the otherPersonIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPersonIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPersonIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedPersonIdType }
     * 
     * 
     */
    public List<NamedPersonIdType> getOtherPersonIds() {
        if (otherPersonIds == null) {
            otherPersonIds = new ArrayList<NamedPersonIdType>();
        }
        return this.otherPersonIds;
    }

}
