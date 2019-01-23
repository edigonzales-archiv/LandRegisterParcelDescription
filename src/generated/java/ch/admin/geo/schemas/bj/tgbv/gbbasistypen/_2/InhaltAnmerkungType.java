
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InhaltAnmerkungType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InhaltAnmerkungType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}InhaltRechtType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtStichwort" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Anmerkung_ArtType" minOccurs="0"/&gt;
 *         &lt;element name="ArtZusatz" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}StichwortZusatz" minOccurs="0"/&gt;
 *         &lt;element name="Ablaufdatum" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Datum" minOccurs="0"/&gt;
 *         &lt;element name="Wert" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}WertCHF" minOccurs="0"/&gt;
 *         &lt;element name="istOeffentlich" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "InhaltAnmerkungType", propOrder = {
    "artStichwort",
    "artZusatz",
    "ablaufdatum",
    "wert",
    "istOeffentlich"
})
public class InhaltAnmerkungType
    extends InhaltRechtType
{

    @XmlElement(name = "ArtStichwort")
    protected AnmerkungArt artStichwort;
    @XmlElement(name = "ArtZusatz")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String artZusatz;
    @XmlElement(name = "Ablaufdatum")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ablaufdatum;
    @XmlElement(name = "Wert")
    protected BigDecimal wert;
    protected Boolean istOeffentlich;

    /**
     * Gets the value of the artStichwort property.
     * 
     * @return
     *     possible object is
     *     {@link AnmerkungArt }
     *     
     */
    public AnmerkungArt getArtStichwort() {
        return artStichwort;
    }

    /**
     * Sets the value of the artStichwort property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnmerkungArt }
     *     
     */
    public void setArtStichwort(AnmerkungArt value) {
        this.artStichwort = value;
    }

    /**
     * Gets the value of the artZusatz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtZusatz() {
        return artZusatz;
    }

    /**
     * Sets the value of the artZusatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtZusatz(String value) {
        this.artZusatz = value;
    }

    /**
     * Gets the value of the ablaufdatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAblaufdatum() {
        return ablaufdatum;
    }

    /**
     * Sets the value of the ablaufdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAblaufdatum(XMLGregorianCalendar value) {
        this.ablaufdatum = value;
    }

    /**
     * Gets the value of the wert property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWert() {
        return wert;
    }

    /**
     * Sets the value of the wert property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWert(BigDecimal value) {
        this.wert = value;
    }

    /**
     * Gets the value of the istOeffentlich property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIstOeffentlich() {
        return istOeffentlich;
    }

    /**
     * Sets the value of the istOeffentlich property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstOeffentlich(Boolean value) {
        this.istOeffentlich = value;
    }

}
