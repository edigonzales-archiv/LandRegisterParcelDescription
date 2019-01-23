
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InhaltDienstbarkeitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InhaltDienstbarkeitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}InhaltRechtType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtStichwort" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Dienstbarkeit_ArtType" minOccurs="0"/&gt;
 *         &lt;element name="ArtZusatz" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}StichwortZusatz" minOccurs="0"/&gt;
 *         &lt;element name="Ablaufdatum" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Datum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Gebaeude" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mitNebenleistungspflicht" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="istVerselbstaendigt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "InhaltDienstbarkeitType", propOrder = {
    "artStichwort",
    "artZusatz",
    "ablaufdatum",
    "gebaeudes",
    "mitNebenleistungspflicht",
    "istVerselbstaendigt"
})
public class InhaltDienstbarkeitType
    extends InhaltRechtType
{

    @XmlElement(name = "ArtStichwort")
    protected DienstbarkeitArt artStichwort;
    @XmlElement(name = "ArtZusatz")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String artZusatz;
    @XmlElement(name = "Ablaufdatum")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ablaufdatum;
    @XmlElement(name = "Gebaeude")
    protected List<Gebaeude> gebaeudes;
    protected Boolean mitNebenleistungspflicht;
    protected Boolean istVerselbstaendigt;

    /**
     * Gets the value of the artStichwort property.
     * 
     * @return
     *     possible object is
     *     {@link DienstbarkeitArt }
     *     
     */
    public DienstbarkeitArt getArtStichwort() {
        return artStichwort;
    }

    /**
     * Sets the value of the artStichwort property.
     * 
     * @param value
     *     allowed object is
     *     {@link DienstbarkeitArt }
     *     
     */
    public void setArtStichwort(DienstbarkeitArt value) {
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
     * Gets the value of the gebaeudes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gebaeudes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGebaeudes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Gebaeude }
     * 
     * 
     */
    public List<Gebaeude> getGebaeudes() {
        if (gebaeudes == null) {
            gebaeudes = new ArrayList<Gebaeude>();
        }
        return this.gebaeudes;
    }

    /**
     * Gets the value of the mitNebenleistungspflicht property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMitNebenleistungspflicht() {
        return mitNebenleistungspflicht;
    }

    /**
     * Sets the value of the mitNebenleistungspflicht property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMitNebenleistungspflicht(Boolean value) {
        this.mitNebenleistungspflicht = value;
    }

    /**
     * Gets the value of the istVerselbstaendigt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIstVerselbstaendigt() {
        return istVerselbstaendigt;
    }

    /**
     * Sets the value of the istVerselbstaendigt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstVerselbstaendigt(Boolean value) {
        this.istVerselbstaendigt = value;
    }

}
