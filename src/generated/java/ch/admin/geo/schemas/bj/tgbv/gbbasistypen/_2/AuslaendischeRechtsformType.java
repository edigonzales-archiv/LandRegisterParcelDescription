
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AuslaendischeRechtsformType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuslaendischeRechtsformType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}JuristischePersonType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RechtsformStichwort" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}AuslaendischeRechtsform_RechtsformType" minOccurs="0"/&gt;
 *         &lt;element name="RechtsformZusatz" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}StichwortZusatz" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuslaendischeRechtsformType", propOrder = {
    "rechtsformStichwort",
    "rechtsformZusatz"
})
public class AuslaendischeRechtsformType
    extends JuristischePersonType
{

    @XmlElement(name = "RechtsformStichwort")
    protected AuslaendischeRechtsformRechtsform rechtsformStichwort;
    @XmlElement(name = "RechtsformZusatz")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String rechtsformZusatz;

    /**
     * Gets the value of the rechtsformStichwort property.
     * 
     * @return
     *     possible object is
     *     {@link AuslaendischeRechtsformRechtsform }
     *     
     */
    public AuslaendischeRechtsformRechtsform getRechtsformStichwort() {
        return rechtsformStichwort;
    }

    /**
     * Sets the value of the rechtsformStichwort property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuslaendischeRechtsformRechtsform }
     *     
     */
    public void setRechtsformStichwort(AuslaendischeRechtsformRechtsform value) {
        this.rechtsformStichwort = value;
    }

    /**
     * Gets the value of the rechtsformZusatz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechtsformZusatz() {
        return rechtsformZusatz;
    }

    /**
     * Sets the value of the rechtsformZusatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechtsformZusatz(String value) {
        this.rechtsformZusatz = value;
    }

}
