
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InhaltBergwerkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InhaltBergwerkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}InhaltGrundstueckType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Flaechenmass" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}FlaecheMitNachkomma" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InhaltBergwerkType", propOrder = {
    "flaechenmass"
})
public class InhaltBergwerkType
    extends InhaltGrundstueckType
{

    @XmlElement(name = "Flaechenmass")
    protected BigDecimal flaechenmass;

    /**
     * Gets the value of the flaechenmass property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlaechenmass() {
        return flaechenmass;
    }

    /**
     * Sets the value of the flaechenmass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlaechenmass(BigDecimal value) {
        this.flaechenmass = value;
    }

}
