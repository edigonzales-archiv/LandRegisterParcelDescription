
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PersonGBType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonGBType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}BerechtigteType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nummer" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}PersonId"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}InhaltPersonGB" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}PersonStamm" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}extensions" minOccurs="0"/&gt;
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
@XmlType(name = "PersonGBType", propOrder = {
    "nummer",
    "inhaltPersonGBs",
    "personStamm",
    "extensions"
})
@XmlSeeAlso({
    GemeinschaftType.class,
    JuristischePersonGBType.class,
    NatuerlichePersonGBType.class
})
public class PersonGBType
    extends BerechtigteType
{

    @XmlElement(name = "Nummer", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String nummer;
    @XmlElementRef(name = "InhaltPersonGB", namespace = "http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1", type = JAXBElement.class)
    protected List<JAXBElement<? extends InhaltPersonGBType>> inhaltPersonGBs;
    @XmlElementRef(name = "PersonStamm", namespace = "http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PersonStammType> personStamm;
    protected Extensions extensions;

    /**
     * Gets the value of the nummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNummer() {
        return nummer;
    }

    /**
     * Sets the value of the nummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNummer(String value) {
        this.nummer = value;
    }

    /**
     * Gets the value of the inhaltPersonGBs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inhaltPersonGBs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInhaltPersonGBs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link InhaltJuristischePersonGBType }{@code >}
     * {@link JAXBElement }{@code <}{@link InhaltPersonGBType }{@code >}
     * {@link JAXBElement }{@code <}{@link InhaltGemeinschaftType }{@code >}
     * {@link JAXBElement }{@code <}{@link InhaltNatuerlichePersonGBType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends InhaltPersonGBType>> getInhaltPersonGBs() {
        if (inhaltPersonGBs == null) {
            inhaltPersonGBs = new ArrayList<JAXBElement<? extends InhaltPersonGBType>>();
        }
        return this.inhaltPersonGBs;
    }

    /**
     * Gets the value of the personStamm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuslaendischeRechtsformType }{@code >}
     *     {@link JAXBElement }{@code <}{@link JuristischePersonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchweizerischeJuristischePersonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NatuerlichePersonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OeffentlicheKoerperschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonStammType }{@code >}
     *     
     */
    public JAXBElement<? extends PersonStammType> getPersonStamm() {
        return personStamm;
    }

    /**
     * Sets the value of the personStamm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuslaendischeRechtsformType }{@code >}
     *     {@link JAXBElement }{@code <}{@link JuristischePersonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchweizerischeJuristischePersonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NatuerlichePersonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OeffentlicheKoerperschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PersonStammType }{@code >}
     *     
     */
    public void setPersonStamm(JAXBElement<? extends PersonStammType> value) {
        this.personStamm = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

}
