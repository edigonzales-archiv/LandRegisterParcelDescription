
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SelbstaendigesDauerndesRechtType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelbstaendigesDauerndesRechtType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}GrundstueckType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="letzteVollzogeneMutation" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}MutationsNummerType" minOccurs="0"/&gt;
 *         &lt;element name="liegt_auf" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}GrundstueckNummer" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "SelbstaendigesDauerndesRechtType", propOrder = {
    "letzteVollzogeneMutation",
    "liegtAuves"
})
@XmlSeeAlso({
    GewoehnlichesSDRType.class,
    KonzessionType.class
})
public class SelbstaendigesDauerndesRechtType
    extends GrundstueckType
{

    protected MutationsNummer letzteVollzogeneMutation;
    @XmlElement(name = "liegt_auf")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> liegtAuves;

    /**
     * Gets the value of the letzteVollzogeneMutation property.
     * 
     * @return
     *     possible object is
     *     {@link MutationsNummer }
     *     
     */
    public MutationsNummer getLetzteVollzogeneMutation() {
        return letzteVollzogeneMutation;
    }

    /**
     * Sets the value of the letzteVollzogeneMutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MutationsNummer }
     *     
     */
    public void setLetzteVollzogeneMutation(MutationsNummer value) {
        this.letzteVollzogeneMutation = value;
    }

    /**
     * Gets the value of the liegtAuves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liegtAuves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLiegtAuves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLiegtAuves() {
        if (liegtAuves == null) {
            liegtAuves = new ArrayList<String>();
        }
        return this.liegtAuves;
    }

}
