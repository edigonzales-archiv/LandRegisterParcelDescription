
package ch.ech.xmlns.ech_0098._3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for liquidationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="liquidationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="liquidationDate" type="{http://www.ech.ch/xmlns/eCH-0098/3}datePartiallyKnownType" minOccurs="0"/&gt;
 *         &lt;element name="liquidationStartDate" type="{http://www.ech.ch/xmlns/eCH-0098/3}datePartiallyKnownType" minOccurs="0"/&gt;
 *         &lt;element name="liquidationReason" type="{http://www.ech.ch/xmlns/eCH-0098/3}liquidationReasonType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "liquidationType", propOrder = {
    "liquidationDate",
    "liquidationStartDate",
    "liquidationReason"
})
public class LiquidationType {

    protected DatePartiallyKnownType liquidationDate;
    protected DatePartiallyKnownType liquidationStartDate;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger liquidationReason;

    /**
     * Gets the value of the liquidationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePartiallyKnownType }
     *     
     */
    public DatePartiallyKnownType getLiquidationDate() {
        return liquidationDate;
    }

    /**
     * Sets the value of the liquidationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePartiallyKnownType }
     *     
     */
    public void setLiquidationDate(DatePartiallyKnownType value) {
        this.liquidationDate = value;
    }

    /**
     * Gets the value of the liquidationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePartiallyKnownType }
     *     
     */
    public DatePartiallyKnownType getLiquidationStartDate() {
        return liquidationStartDate;
    }

    /**
     * Sets the value of the liquidationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePartiallyKnownType }
     *     
     */
    public void setLiquidationStartDate(DatePartiallyKnownType value) {
        this.liquidationStartDate = value;
    }

    /**
     * Gets the value of the liquidationReason property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLiquidationReason() {
        return liquidationReason;
    }

    /**
     * Sets the value of the liquidationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLiquidationReason(BigInteger value) {
        this.liquidationReason = value;
    }

}
