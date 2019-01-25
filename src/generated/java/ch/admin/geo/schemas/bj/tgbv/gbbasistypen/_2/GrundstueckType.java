
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
import ch.ech.xmlns.ech_0007._6.Gemeinde;


/**
 * <p>Java class for GrundstueckType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrundstueckType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}BerechtigteType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nummer" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}GrundstueckNummer"/&gt;
 *         &lt;element name="istKopie" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}InhaltGrundstueck" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Flurname" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}GBPlan" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Gemeinde"/&gt;
 *         &lt;element name="alt" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}GrundstueckRefBegruendet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="neu" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}GrundstueckRefBegruendet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}AVBemerkung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}GrundstueckWert" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}GBAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Gebaeude" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}HaengigesGeschaeft" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Grundbuchname" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/&gt;
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
@XmlType(name = "GrundstueckType", propOrder = {
    "nummer",
    "istKopie",
    "inhaltGrundstuecks",
    "flurnames",
    "gbPlen",
    "gemeinde",
    "alts",
    "neus",
    "avBemerkungs",
    "grundstueckWerts",
    "gbAmt",
    "gebaeudes",
    "haengigesGeschaefts",
    "grundbuchname",
    "extensions"
})
@XmlSeeAlso({
    BergwerkType.class,
    LiegenschaftType.class,
    SelbstaendigesDauerndesRechtType.class,
    MiteigentumsAnteilType.class
})
public class GrundstueckType
    extends BerechtigteType
{

    @XmlElement(name = "Nummer", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String nummer;
    protected boolean istKopie;
    @XmlElementRef(name = "InhaltGrundstueck", namespace = "http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends InhaltGrundstueckType>> inhaltGrundstuecks;
    @XmlElement(name = "Flurname")
    protected List<Flurname> flurnames;
    @XmlElement(name = "GBPlan")
    protected List<GBPlan> gbPlen;
    @XmlElement(name = "Gemeinde", required = true)
    protected Gemeinde gemeinde;
    @XmlElement(name = "alt")
    protected List<GrundstueckRefBegruendet> alts;
    @XmlElement(name = "neu")
    protected List<GrundstueckRefBegruendet> neus;
    @XmlElement(name = "AVBemerkung")
    protected List<AVBemerkung> avBemerkungs;
    @XmlElement(name = "GrundstueckWert")
    protected List<GrundstueckWert> grundstueckWerts;
    @XmlElement(name = "GBAmt")
    protected GBAmt gbAmt;
    @XmlElement(name = "Gebaeude")
    protected List<Gebaeude> gebaeudes;
    @XmlElement(name = "HaengigesGeschaeft")
    protected List<HaengigesGeschaeft> haengigesGeschaefts;
    @XmlElement(name = "Grundbuchname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String grundbuchname;
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
     * Gets the value of the istKopie property.
     * 
     */
    public boolean isIstKopie() {
        return istKopie;
    }

    /**
     * Sets the value of the istKopie property.
     * 
     */
    public void setIstKopie(boolean value) {
        this.istKopie = value;
    }

    /**
     * Gets the value of the inhaltGrundstuecks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inhaltGrundstuecks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInhaltGrundstuecks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link InhaltSelbstaendigesDauerndesRechtType }{@code >}
     * {@link JAXBElement }{@code <}{@link InhaltGewoehnlichesMiteigentumType }{@code >}
     * {@link JAXBElement }{@code <}{@link InhaltGrundstueckType }{@code >}
     * {@link JAXBElement }{@code <}{@link InhaltGewoehnlichesSDRType }{@code >}
     * {@link JAXBElement }{@code <}{@link InhaltLiegenschaftType }{@code >}
     * {@link JAXBElement }{@code <}{@link InhaltBergwerkType }{@code >}
     * {@link JAXBElement }{@code <}{@link InhaltKonzessionType }{@code >}
     * {@link JAXBElement }{@code <}{@link InhaltMiteigentumsAnteilType }{@code >}
     * {@link JAXBElement }{@code <}{@link InhaltStockwerksEinheitType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends InhaltGrundstueckType>> getInhaltGrundstuecks() {
        if (inhaltGrundstuecks == null) {
            inhaltGrundstuecks = new ArrayList<JAXBElement<? extends InhaltGrundstueckType>>();
        }
        return this.inhaltGrundstuecks;
    }

    /**
     * Gets the value of the flurnames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flurnames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlurnames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Flurname }
     * 
     * 
     */
    public List<Flurname> getFlurnames() {
        if (flurnames == null) {
            flurnames = new ArrayList<Flurname>();
        }
        return this.flurnames;
    }

    /**
     * Gets the value of the gbPlen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gbPlen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGBPlen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GBPlan }
     * 
     * 
     */
    public List<GBPlan> getGBPlen() {
        if (gbPlen == null) {
            gbPlen = new ArrayList<GBPlan>();
        }
        return this.gbPlen;
    }

    /**
     * Gets the value of the gemeinde property.
     * 
     * @return
     *     possible object is
     *     {@link Gemeinde }
     *     
     */
    public Gemeinde getGemeinde() {
        return gemeinde;
    }

    /**
     * Sets the value of the gemeinde property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gemeinde }
     *     
     */
    public void setGemeinde(Gemeinde value) {
        this.gemeinde = value;
    }

    /**
     * Gets the value of the alts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrundstueckRefBegruendet }
     * 
     * 
     */
    public List<GrundstueckRefBegruendet> getAlts() {
        if (alts == null) {
            alts = new ArrayList<GrundstueckRefBegruendet>();
        }
        return this.alts;
    }

    /**
     * Gets the value of the neus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the neus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNeus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrundstueckRefBegruendet }
     * 
     * 
     */
    public List<GrundstueckRefBegruendet> getNeus() {
        if (neus == null) {
            neus = new ArrayList<GrundstueckRefBegruendet>();
        }
        return this.neus;
    }

    /**
     * Gets the value of the avBemerkungs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avBemerkungs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAVBemerkungs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AVBemerkung }
     * 
     * 
     */
    public List<AVBemerkung> getAVBemerkungs() {
        if (avBemerkungs == null) {
            avBemerkungs = new ArrayList<AVBemerkung>();
        }
        return this.avBemerkungs;
    }

    /**
     * Gets the value of the grundstueckWerts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grundstueckWerts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrundstueckWerts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrundstueckWert }
     * 
     * 
     */
    public List<GrundstueckWert> getGrundstueckWerts() {
        if (grundstueckWerts == null) {
            grundstueckWerts = new ArrayList<GrundstueckWert>();
        }
        return this.grundstueckWerts;
    }

    /**
     * Gets the value of the gbAmt property.
     * 
     * @return
     *     possible object is
     *     {@link GBAmt }
     *     
     */
    public GBAmt getGBAmt() {
        return gbAmt;
    }

    /**
     * Sets the value of the gbAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GBAmt }
     *     
     */
    public void setGBAmt(GBAmt value) {
        this.gbAmt = value;
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
     * Gets the value of the haengigesGeschaefts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the haengigesGeschaefts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHaengigesGeschaefts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HaengigesGeschaeft }
     * 
     * 
     */
    public List<HaengigesGeschaeft> getHaengigesGeschaefts() {
        if (haengigesGeschaefts == null) {
            haengigesGeschaefts = new ArrayList<HaengigesGeschaeft>();
        }
        return this.haengigesGeschaefts;
    }

    /**
     * Gets the value of the grundbuchname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrundbuchname() {
        return grundbuchname;
    }

    /**
     * Sets the value of the grundbuchname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrundbuchname(String value) {
        this.grundbuchname = value;
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
