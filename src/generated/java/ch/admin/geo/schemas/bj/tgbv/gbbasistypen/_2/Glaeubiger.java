
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * <p>Java class for GlaeubigerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlaeubigerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rolle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;enumeration value="Grundpfand"/&gt;
 *               &lt;enumeration value="Faustpfand"/&gt;
 *               &lt;enumeration value="Nutzniesser"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Person" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}PersonId"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}gueltigBis"/&gt;
 *       &lt;attGroup ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}OperationAttrs"/&gt;
 *       &lt;attGroup ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}gueltigVon"/&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlaeubigerType", propOrder = {
    "rolle",
    "person",
    "extensions"
})
@XmlRootElement(name = "Glaeubiger")
public class Glaeubiger {

    @XmlElement(name = "Rolle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rolle;
    @XmlElement(name = "Person", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String person;
    protected Extensions extensions;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "bisEGBTBID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String bisEGBTBID;
    @XmlAttribute(name = "bisTagebuchNummer")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String bisTagebuchNummer;
    @XmlAttribute(name = "bisTagebuchDatumZeit")
    protected XMLGregorianCalendar bisTagebuchDatumZeit;
    @XmlAttribute(name = "bisIdx")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger bisIdx;
    @XmlAttribute(name = "operation")
    protected Operation operation;
    @XmlAttribute(name = "operationOrder")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger operationOrder;
    @XmlAttribute(name = "vonEGBTBID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vonEGBTBID;
    @XmlAttribute(name = "vonTagebuchNummer")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vonTagebuchNummer;
    @XmlAttribute(name = "vonTagebuchDatumZeit")
    protected XMLGregorianCalendar vonTagebuchDatumZeit;
    @XmlAttribute(name = "vonIdx")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger vonIdx;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the rolle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolle() {
        return rolle;
    }

    /**
     * Sets the value of the rolle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolle(String value) {
        this.rolle = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerson(String value) {
        this.person = value;
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

    /**
     * Gets the value of the bisEGBTBID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBisEGBTBID() {
        return bisEGBTBID;
    }

    /**
     * Sets the value of the bisEGBTBID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBisEGBTBID(String value) {
        this.bisEGBTBID = value;
    }

    /**
     * Gets the value of the bisTagebuchNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBisTagebuchNummer() {
        return bisTagebuchNummer;
    }

    /**
     * Sets the value of the bisTagebuchNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBisTagebuchNummer(String value) {
        this.bisTagebuchNummer = value;
    }

    /**
     * Gets the value of the bisTagebuchDatumZeit property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBisTagebuchDatumZeit() {
        return bisTagebuchDatumZeit;
    }

    /**
     * Sets the value of the bisTagebuchDatumZeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBisTagebuchDatumZeit(XMLGregorianCalendar value) {
        this.bisTagebuchDatumZeit = value;
    }

    /**
     * Gets the value of the bisIdx property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBisIdx() {
        return bisIdx;
    }

    /**
     * Sets the value of the bisIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBisIdx(BigInteger value) {
        this.bisIdx = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link Operation }
     *     
     */
    public Operation getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operation }
     *     
     */
    public void setOperation(Operation value) {
        this.operation = value;
    }

    /**
     * Gets the value of the operationOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOperationOrder() {
        return operationOrder;
    }

    /**
     * Sets the value of the operationOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOperationOrder(BigInteger value) {
        this.operationOrder = value;
    }

    /**
     * Gets the value of the vonEGBTBID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVonEGBTBID() {
        return vonEGBTBID;
    }

    /**
     * Sets the value of the vonEGBTBID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVonEGBTBID(String value) {
        this.vonEGBTBID = value;
    }

    /**
     * Gets the value of the vonTagebuchNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVonTagebuchNummer() {
        return vonTagebuchNummer;
    }

    /**
     * Sets the value of the vonTagebuchNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVonTagebuchNummer(String value) {
        this.vonTagebuchNummer = value;
    }

    /**
     * Gets the value of the vonTagebuchDatumZeit property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVonTagebuchDatumZeit() {
        return vonTagebuchDatumZeit;
    }

    /**
     * Sets the value of the vonTagebuchDatumZeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVonTagebuchDatumZeit(XMLGregorianCalendar value) {
        this.vonTagebuchDatumZeit = value;
    }

    /**
     * Gets the value of the vonIdx property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVonIdx() {
        return vonIdx;
    }

    /**
     * Sets the value of the vonIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVonIdx(BigInteger value) {
        this.vonIdx = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
