
package ch.so.geo.schema.agi.landregisterparceldescription._1_0.extract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalPerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://geo.so.ch/schema/AGI/LandRegisterParcelDescription/1.0/Extract}Person"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessAddress" type="{http://geo.so.ch/schema/AGI/LandRegisterParcelDescription/1.0/Extract}Office"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalPerson", propOrder = {
    "businessAddress"
})
public class LegalPerson
    extends Person
{

    @XmlElement(name = "BusinessAddress", required = true)
    protected Office businessAddress;

    /**
     * Gets the value of the businessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Office }
     *     
     */
    public Office getBusinessAddress() {
        return businessAddress;
    }

    /**
     * Sets the value of the businessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Office }
     *     
     */
    public void setBusinessAddress(Office value) {
        this.businessAddress = value;
    }

}
