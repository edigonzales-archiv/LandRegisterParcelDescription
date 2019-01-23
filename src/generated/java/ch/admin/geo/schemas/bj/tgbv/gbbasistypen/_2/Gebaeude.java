
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GebaeudeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GebaeudeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GWR_EGID" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}GWR_EGID" minOccurs="0"/&gt;
 *         &lt;element name="istProjektiert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="istUnterirdisch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Nummer" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GebaeudeartStichwort" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Gebaeude_GebaeudeartType" minOccurs="0"/&gt;
 *         &lt;element name="GebaeudeartZusatz" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}StichwortZusatz" minOccurs="0"/&gt;
 *         &lt;element name="GebaeudeartCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Flaechenmass" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}FlaecheMitNachkomma" minOccurs="0"/&gt;
 *         &lt;element name="FlaechenmassAnteil" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}FlaecheMitNachkomma" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}GebaeudeeingangAdresse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GebaeudeType", propOrder = {
    "gwregid",
    "istProjektiert",
    "istUnterirdisch",
    "nummer",
    "gebaeudeartStichwort",
    "gebaeudeartZusatz",
    "gebaeudeartCode",
    "flaechenmass",
    "flaechenmassAnteil",
    "gebaeudeeingangAdresses",
    "extensions"
})
@XmlRootElement(name = "Gebaeude")
public class Gebaeude {

    @XmlElement(name = "GWR_EGID")
    @XmlSchemaType(name = "integer")
    protected Integer gwregid;
    protected Boolean istProjektiert;
    protected Boolean istUnterirdisch;
    @XmlElement(name = "Nummer")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nummer;
    @XmlElement(name = "GebaeudeartStichwort")
    protected GebaeudeGebaeudeart gebaeudeartStichwort;
    @XmlElement(name = "GebaeudeartZusatz")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String gebaeudeartZusatz;
    @XmlElement(name = "GebaeudeartCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String gebaeudeartCode;
    @XmlElement(name = "Flaechenmass")
    protected BigDecimal flaechenmass;
    @XmlElement(name = "FlaechenmassAnteil")
    protected BigDecimal flaechenmassAnteil;
    @XmlElement(name = "GebaeudeeingangAdresse")
    protected List<GebaeudeeingangAdresse> gebaeudeeingangAdresses;
    protected Extensions extensions;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the gwregid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGWREGID() {
        return gwregid;
    }

    /**
     * Sets the value of the gwregid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGWREGID(Integer value) {
        this.gwregid = value;
    }

    /**
     * Gets the value of the istProjektiert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIstProjektiert() {
        return istProjektiert;
    }

    /**
     * Sets the value of the istProjektiert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstProjektiert(Boolean value) {
        this.istProjektiert = value;
    }

    /**
     * Gets the value of the istUnterirdisch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIstUnterirdisch() {
        return istUnterirdisch;
    }

    /**
     * Sets the value of the istUnterirdisch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstUnterirdisch(Boolean value) {
        this.istUnterirdisch = value;
    }

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
     * Gets the value of the gebaeudeartStichwort property.
     * 
     * @return
     *     possible object is
     *     {@link GebaeudeGebaeudeart }
     *     
     */
    public GebaeudeGebaeudeart getGebaeudeartStichwort() {
        return gebaeudeartStichwort;
    }

    /**
     * Sets the value of the gebaeudeartStichwort property.
     * 
     * @param value
     *     allowed object is
     *     {@link GebaeudeGebaeudeart }
     *     
     */
    public void setGebaeudeartStichwort(GebaeudeGebaeudeart value) {
        this.gebaeudeartStichwort = value;
    }

    /**
     * Gets the value of the gebaeudeartZusatz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGebaeudeartZusatz() {
        return gebaeudeartZusatz;
    }

    /**
     * Sets the value of the gebaeudeartZusatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGebaeudeartZusatz(String value) {
        this.gebaeudeartZusatz = value;
    }

    /**
     * Gets the value of the gebaeudeartCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGebaeudeartCode() {
        return gebaeudeartCode;
    }

    /**
     * Sets the value of the gebaeudeartCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGebaeudeartCode(String value) {
        this.gebaeudeartCode = value;
    }

    /**
     * Gets the value of the flaechenmass property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlaechenmass() {
        return flaechenmass;
    }

    /**
     * Sets the value of the flaechenmass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlaechenmass(BigDecimal value) {
        this.flaechenmass = value;
    }

    /**
     * Gets the value of the flaechenmassAnteil property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlaechenmassAnteil() {
        return flaechenmassAnteil;
    }

    /**
     * Sets the value of the flaechenmassAnteil property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlaechenmassAnteil(BigDecimal value) {
        this.flaechenmassAnteil = value;
    }

    /**
     * Gets the value of the gebaeudeeingangAdresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gebaeudeeingangAdresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGebaeudeeingangAdresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GebaeudeeingangAdresse }
     * 
     * 
     */
    public List<GebaeudeeingangAdresse> getGebaeudeeingangAdresses() {
        if (gebaeudeeingangAdresses == null) {
            gebaeudeeingangAdresses = new ArrayList<GebaeudeeingangAdresse>();
        }
        return this.gebaeudeeingangAdresses;
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

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
