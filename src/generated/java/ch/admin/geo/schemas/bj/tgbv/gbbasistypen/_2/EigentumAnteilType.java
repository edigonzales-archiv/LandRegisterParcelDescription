
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EigentumAnteilType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EigentumAnteilType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}RechtType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Berechtigte" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}BerechtigteId" minOccurs="0"/&gt;
 *         &lt;element name="belastetesGrundstueck" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}GrundstueckNummer"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Erwerbsgrund" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "EigentumAnteilType", propOrder = {
    "berechtigte",
    "belastetesGrundstueck",
    "erwerbsgrunds"
})
public class EigentumAnteilType
    extends RechtType
{

    @XmlElement(name = "Berechtigte")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String berechtigte;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String belastetesGrundstueck;
    @XmlElement(name = "Erwerbsgrund")
    protected List<Erwerbsgrund> erwerbsgrunds;

    /**
     * Gets the value of the berechtigte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBerechtigte() {
        return berechtigte;
    }

    /**
     * Sets the value of the berechtigte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBerechtigte(String value) {
        this.berechtigte = value;
    }

    /**
     * Gets the value of the belastetesGrundstueck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelastetesGrundstueck() {
        return belastetesGrundstueck;
    }

    /**
     * Sets the value of the belastetesGrundstueck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelastetesGrundstueck(String value) {
        this.belastetesGrundstueck = value;
    }

    /**
     * Gets the value of the erwerbsgrunds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the erwerbsgrunds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErwerbsgrunds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Erwerbsgrund }
     * 
     * 
     */
    public List<Erwerbsgrund> getErwerbsgrunds() {
        if (erwerbsgrunds == null) {
            erwerbsgrunds = new ArrayList<Erwerbsgrund>();
        }
        return this.erwerbsgrunds;
    }

}
