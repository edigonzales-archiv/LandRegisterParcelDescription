
package ch.ech.xmlns.ech_0011._8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for separationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="separationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="separation" type="{http://www.ech.ch/xmlns/eCH-0011/8}separationType" minOccurs="0"/&gt;
 *         &lt;element name="separationValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="separationValidTill" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "separationDataType", propOrder = {
    "separation",
    "separationValidFrom",
    "separationValidTill"
})
public class SeparationDataType {

    protected String separation;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar separationValidFrom;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar separationValidTill;

    /**
     * Gets the value of the separation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeparation() {
        return separation;
    }

    /**
     * Sets the value of the separation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeparation(String value) {
        this.separation = value;
    }

    /**
     * Gets the value of the separationValidFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSeparationValidFrom() {
        return separationValidFrom;
    }

    /**
     * Sets the value of the separationValidFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSeparationValidFrom(XMLGregorianCalendar value) {
        this.separationValidFrom = value;
    }

    /**
     * Gets the value of the separationValidTill property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSeparationValidTill() {
        return separationValidTill;
    }

    /**
     * Sets the value of the separationValidTill property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSeparationValidTill(XMLGregorianCalendar value) {
        this.separationValidTill = value;
    }

}
