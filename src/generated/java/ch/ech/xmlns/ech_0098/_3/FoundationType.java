
package ch.ech.xmlns.ech_0098._3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foundationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foundationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="foundationDate" type="{http://www.ech.ch/xmlns/eCH-0098/3}datePartiallyKnownType" minOccurs="0"/&gt;
 *         &lt;element name="foundationReason" type="{http://www.ech.ch/xmlns/eCH-0098/3}foundationReasonType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "foundationType", propOrder = {
    "foundationDate",
    "foundationReason"
})
public class FoundationType {

    protected DatePartiallyKnownType foundationDate;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger foundationReason;

    /**
     * Gets the value of the foundationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePartiallyKnownType }
     *     
     */
    public DatePartiallyKnownType getFoundationDate() {
        return foundationDate;
    }

    /**
     * Sets the value of the foundationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePartiallyKnownType }
     *     
     */
    public void setFoundationDate(DatePartiallyKnownType value) {
        this.foundationDate = value;
    }

    /**
     * Gets the value of the foundationReason property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFoundationReason() {
        return foundationReason;
    }

    /**
     * Sets the value of the foundationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFoundationReason(BigInteger value) {
        this.foundationReason = value;
    }

}
