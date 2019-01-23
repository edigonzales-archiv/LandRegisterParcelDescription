
package ch.ech.xmlns.ech_0011._8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.ech.xmlns.ech_0007._5.SwissMunicipalityType;


/**
 * <p>Java class for mainResidenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mainResidenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mainResidence" type="{http://www.ech.ch/xmlns/eCH-0011/8}residenceDataType"/&gt;
 *         &lt;element name="secondaryResidence" type="{http://www.ech.ch/xmlns/eCH-0007/5}swissMunicipalityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mainResidenceType", propOrder = {
    "mainResidence",
    "secondaryResidences"
})
public class MainResidenceType {

    @XmlElement(required = true)
    protected ResidenceDataType mainResidence;
    @XmlElement(name = "secondaryResidence")
    protected List<SwissMunicipalityType> secondaryResidences;

    /**
     * Gets the value of the mainResidence property.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceDataType }
     *     
     */
    public ResidenceDataType getMainResidence() {
        return mainResidence;
    }

    /**
     * Sets the value of the mainResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceDataType }
     *     
     */
    public void setMainResidence(ResidenceDataType value) {
        this.mainResidence = value;
    }

    /**
     * Gets the value of the secondaryResidences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryResidences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryResidences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwissMunicipalityType }
     * 
     * 
     */
    public List<SwissMunicipalityType> getSecondaryResidences() {
        if (secondaryResidences == null) {
            secondaryResidences = new ArrayList<SwissMunicipalityType>();
        }
        return this.secondaryResidences;
    }

}
