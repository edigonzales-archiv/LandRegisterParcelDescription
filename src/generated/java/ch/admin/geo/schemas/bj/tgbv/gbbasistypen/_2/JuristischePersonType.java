
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ch.ech.xmlns.ech_0098._3.OrganisationType;


/**
 * <p>Java class for JuristischePersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JuristischePersonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}PersonStammType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sitz" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NameUebersetzung" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}UebersetzungType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="detail" type="{http://www.ech.ch/xmlns/eCH-0098/3}organisationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JuristischePersonType", propOrder = {
    "sitz",
    "nameUebersetzungs",
    "detail"
})
@XmlSeeAlso({
    AuslaendischeRechtsformType.class,
    OeffentlicheKoerperschaftType.class,
    SchweizerischeJuristischePersonType.class
})
public class JuristischePersonType
    extends PersonStammType
{

    @XmlElement(name = "Sitz")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sitz;
    @XmlElement(name = "NameUebersetzung")
    protected List<Uebersetzung> nameUebersetzungs;
    protected OrganisationType detail;

    /**
     * Gets the value of the sitz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitz() {
        return sitz;
    }

    /**
     * Sets the value of the sitz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitz(String value) {
        this.sitz = value;
    }

    /**
     * Gets the value of the nameUebersetzungs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameUebersetzungs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameUebersetzungs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Uebersetzung }
     * 
     * 
     */
    public List<Uebersetzung> getNameUebersetzungs() {
        if (nameUebersetzungs == null) {
            nameUebersetzungs = new ArrayList<Uebersetzung>();
        }
        return this.nameUebersetzungs;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationType }
     *     
     */
    public OrganisationType getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationType }
     *     
     */
    public void setDetail(OrganisationType value) {
        this.detail = value;
    }

}
