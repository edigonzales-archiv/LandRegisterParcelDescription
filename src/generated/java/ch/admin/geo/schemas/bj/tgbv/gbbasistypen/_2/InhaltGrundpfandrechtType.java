
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InhaltGrundpfandrechtType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InhaltGrundpfandrechtType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}InhaltRechtType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Art" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}GrundpfandrechtArt"/&gt;
 *         &lt;element name="Pfandsumme" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}WertCHF"/&gt;
 *         &lt;element name="maxZinsfuss" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="altRechtlichKantonaleArtStichwort" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Grundpfandrecht_altRechtlichKantonaleArtType" minOccurs="0"/&gt;
 *         &lt;element name="altRechtlichKantonaleArtZusatz" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}StichwortZusatz" minOccurs="0"/&gt;
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
@XmlType(name = "InhaltGrundpfandrechtType", propOrder = {
    "art",
    "pfandsumme",
    "maxZinsfuss",
    "altRechtlichKantonaleArtStichwort",
    "altRechtlichKantonaleArtZusatz"
})
public class InhaltGrundpfandrechtType
    extends InhaltRechtType
{

    @XmlElement(name = "Art", required = true)
    @XmlSchemaType(name = "normalizedString")
    protected GrundpfandrechtArt art;
    @XmlElement(name = "Pfandsumme", required = true)
    protected BigDecimal pfandsumme;
    protected BigDecimal maxZinsfuss;
    protected GrundpfandrechtAltRechtlichKantonaleArt altRechtlichKantonaleArtStichwort;
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String altRechtlichKantonaleArtZusatz;

    /**
     * Gets the value of the art property.
     * 
     * @return
     *     possible object is
     *     {@link GrundpfandrechtArt }
     *     
     */
    public GrundpfandrechtArt getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrundpfandrechtArt }
     *     
     */
    public void setArt(GrundpfandrechtArt value) {
        this.art = value;
    }

    /**
     * Gets the value of the pfandsumme property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPfandsumme() {
        return pfandsumme;
    }

    /**
     * Sets the value of the pfandsumme property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPfandsumme(BigDecimal value) {
        this.pfandsumme = value;
    }

    /**
     * Gets the value of the maxZinsfuss property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxZinsfuss() {
        return maxZinsfuss;
    }

    /**
     * Sets the value of the maxZinsfuss property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxZinsfuss(BigDecimal value) {
        this.maxZinsfuss = value;
    }

    /**
     * Gets the value of the altRechtlichKantonaleArtStichwort property.
     * 
     * @return
     *     possible object is
     *     {@link GrundpfandrechtAltRechtlichKantonaleArt }
     *     
     */
    public GrundpfandrechtAltRechtlichKantonaleArt getAltRechtlichKantonaleArtStichwort() {
        return altRechtlichKantonaleArtStichwort;
    }

    /**
     * Sets the value of the altRechtlichKantonaleArtStichwort property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrundpfandrechtAltRechtlichKantonaleArt }
     *     
     */
    public void setAltRechtlichKantonaleArtStichwort(GrundpfandrechtAltRechtlichKantonaleArt value) {
        this.altRechtlichKantonaleArtStichwort = value;
    }

    /**
     * Gets the value of the altRechtlichKantonaleArtZusatz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltRechtlichKantonaleArtZusatz() {
        return altRechtlichKantonaleArtZusatz;
    }

    /**
     * Sets the value of the altRechtlichKantonaleArtZusatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltRechtlichKantonaleArtZusatz(String value) {
        this.altRechtlichKantonaleArtZusatz = value;
    }

}
