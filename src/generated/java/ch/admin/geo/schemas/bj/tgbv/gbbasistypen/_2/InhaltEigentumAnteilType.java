
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InhaltEigentumAnteilType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InhaltEigentumAnteilType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}InhaltRechtType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AnteilZaehler" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="1000000000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AnteilNenner" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="1000000000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubjektivDinglich" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Eigentumsform"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;enumeration value="AlleinEigentum"/&gt;
 *               &lt;enumeration value="MitEigentum"/&gt;
 *               &lt;enumeration value="GesamtEigentum"/&gt;
 *               &lt;enumeration value="Herrenlos"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AnteilInProsa" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="300"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "InhaltEigentumAnteilType", propOrder = {
    "anteilZaehler",
    "anteilNenner",
    "subjektivDinglich",
    "eigentumsform",
    "anteilInProsa"
})
public class InhaltEigentumAnteilType
    extends InhaltRechtType
{

    @XmlElement(name = "AnteilZaehler")
    protected Integer anteilZaehler;
    @XmlElement(name = "AnteilNenner")
    protected Integer anteilNenner;
    @XmlElement(name = "SubjektivDinglich")
    protected boolean subjektivDinglich;
    @XmlElement(name = "Eigentumsform", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String eigentumsform;
    @XmlElement(name = "AnteilInProsa")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String anteilInProsa;

    /**
     * Gets the value of the anteilZaehler property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnteilZaehler() {
        return anteilZaehler;
    }

    /**
     * Sets the value of the anteilZaehler property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnteilZaehler(Integer value) {
        this.anteilZaehler = value;
    }

    /**
     * Gets the value of the anteilNenner property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnteilNenner() {
        return anteilNenner;
    }

    /**
     * Sets the value of the anteilNenner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnteilNenner(Integer value) {
        this.anteilNenner = value;
    }

    /**
     * Gets the value of the subjektivDinglich property.
     * 
     */
    public boolean isSubjektivDinglich() {
        return subjektivDinglich;
    }

    /**
     * Sets the value of the subjektivDinglich property.
     * 
     */
    public void setSubjektivDinglich(boolean value) {
        this.subjektivDinglich = value;
    }

    /**
     * Gets the value of the eigentumsform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEigentumsform() {
        return eigentumsform;
    }

    /**
     * Sets the value of the eigentumsform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEigentumsform(String value) {
        this.eigentumsform = value;
    }

    /**
     * Gets the value of the anteilInProsa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnteilInProsa() {
        return anteilInProsa;
    }

    /**
     * Sets the value of the anteilInProsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnteilInProsa(String value) {
        this.anteilInProsa = value;
    }

}
