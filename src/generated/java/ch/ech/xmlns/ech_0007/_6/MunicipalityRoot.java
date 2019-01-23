
package ch.ech.xmlns.ech_0007._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="swissMunicipality" type="{http://www.ech.ch/xmlns/eCH-0007/6}swissMunicipalityType"/&gt;
 *         &lt;element name="swissAndFlMunicipality" type="{http://www.ech.ch/xmlns/eCH-0007/6}swissAndFlMunicipalityType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "swissAndFlMunicipality",
    "swissMunicipality"
})
@XmlRootElement(name = "municipalityRoot")
public class MunicipalityRoot {

    protected SwissAndFlMunicipalityType swissAndFlMunicipality;
    protected Gemeinde swissMunicipality;

    /**
     * Gets the value of the swissAndFlMunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link SwissAndFlMunicipalityType }
     *     
     */
    public SwissAndFlMunicipalityType getSwissAndFlMunicipality() {
        return swissAndFlMunicipality;
    }

    /**
     * Sets the value of the swissAndFlMunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwissAndFlMunicipalityType }
     *     
     */
    public void setSwissAndFlMunicipality(SwissAndFlMunicipalityType value) {
        this.swissAndFlMunicipality = value;
    }

    /**
     * Gets the value of the swissMunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link Gemeinde }
     *     
     */
    public Gemeinde getSwissMunicipality() {
        return swissMunicipality;
    }

    /**
     * Sets the value of the swissMunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gemeinde }
     *     
     */
    public void setSwissMunicipality(Gemeinde value) {
        this.swissMunicipality = value;
    }

}
