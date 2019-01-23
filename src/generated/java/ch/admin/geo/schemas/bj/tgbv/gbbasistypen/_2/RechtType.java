
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * <p>Java class for RechtType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RechtType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}InhaltRecht" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Rangverschiebung" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}RangNachfolge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Vorrang" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}OperationAttrs"/&gt;
 *                 &lt;attGroup ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}gueltigBis"/&gt;
 *                 &lt;attGroup ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}gueltigVon"/&gt;
 *                 &lt;anyAttribute processContents='lax'/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GestuetzAufGehoertZu" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}GestuetzAuf" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}GehoertZu" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}gueltigBis"/&gt;
 *                 &lt;attGroup ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}gueltigVon"/&gt;
 *                 &lt;attGroup ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}OperationAttrs"/&gt;
 *                 &lt;anyAttribute processContents='lax'/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Fortsetzung" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}RechtRefBegruendet" minOccurs="0"/&gt;
 *         &lt;element name="Nummer" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}RechtId"/&gt;
 *         &lt;element name="Ursprung" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}RechtRefBegruendet" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
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
@XmlType(name = "RechtType", propOrder = {
    "inhaltRechts",
    "rangverschiebungs",
    "gestuetzAufGehoertZus",
    "fortsetzung",
    "nummer",
    "ursprung",
    "extensions"
})
@XmlSeeAlso({
    AnmerkungType.class,
    DienstbarkeitType.class,
    EigentumAnteilType.class,
    GrundlastType.class,
    GrundpfandrechtType.class,
    VormerkungType.class
})
public class RechtType {

    @XmlElementRef(name = "InhaltRecht", namespace = "http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1", type = JAXBElement.class)
    protected List<JAXBElement<? extends InhaltRechtType>> inhaltRechts;
    @XmlElement(name = "Rangverschiebung")
    protected List<RechtType.Rangverschiebung> rangverschiebungs;
    @XmlElement(name = "GestuetzAufGehoertZu")
    protected List<RechtType.GestuetzAufGehoertZu> gestuetzAufGehoertZus;
    @XmlElement(name = "Fortsetzung")
    protected RechtRefBegruendet fortsetzung;
    @XmlElement(name = "Nummer", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String nummer;
    @XmlElement(name = "Ursprung")
    protected RechtRefBegruendet ursprung;
    protected Extensions extensions;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the inhaltRechts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inhaltRechts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInhaltRechts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link InhaltVormerkungType }{@code >}
     * {@link JAXBElement }{@code <}{@link InhaltAnmerkungType }{@code >}
     * {@link JAXBElement }{@code <}{@link InhaltEigentumAnteilType }{@code >}
     * {@link JAXBElement }{@code <}{@link InhaltGrundlastType }{@code >}
     * {@link JAXBElement }{@code <}{@link InhaltRechtType }{@code >}
     * {@link JAXBElement }{@code <}{@link InhaltDienstbarkeitType }{@code >}
     * {@link JAXBElement }{@code <}{@link InhaltGrundpfandrechtType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends InhaltRechtType>> getInhaltRechts() {
        if (inhaltRechts == null) {
            inhaltRechts = new ArrayList<JAXBElement<? extends InhaltRechtType>>();
        }
        return this.inhaltRechts;
    }

    /**
     * Gets the value of the rangverschiebungs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rangverschiebungs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRangverschiebungs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RechtType.Rangverschiebung }
     * 
     * 
     */
    public List<RechtType.Rangverschiebung> getRangverschiebungs() {
        if (rangverschiebungs == null) {
            rangverschiebungs = new ArrayList<RechtType.Rangverschiebung>();
        }
        return this.rangverschiebungs;
    }

    /**
     * Gets the value of the gestuetzAufGehoertZus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gestuetzAufGehoertZus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGestuetzAufGehoertZus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RechtType.GestuetzAufGehoertZu }
     * 
     * 
     */
    public List<RechtType.GestuetzAufGehoertZu> getGestuetzAufGehoertZus() {
        if (gestuetzAufGehoertZus == null) {
            gestuetzAufGehoertZus = new ArrayList<RechtType.GestuetzAufGehoertZu>();
        }
        return this.gestuetzAufGehoertZus;
    }

    /**
     * Gets the value of the fortsetzung property.
     * 
     * @return
     *     possible object is
     *     {@link RechtRefBegruendet }
     *     
     */
    public RechtRefBegruendet getFortsetzung() {
        return fortsetzung;
    }

    /**
     * Sets the value of the fortsetzung property.
     * 
     * @param value
     *     allowed object is
     *     {@link RechtRefBegruendet }
     *     
     */
    public void setFortsetzung(RechtRefBegruendet value) {
        this.fortsetzung = value;
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
     * Gets the value of the ursprung property.
     * 
     * @return
     *     possible object is
     *     {@link RechtRefBegruendet }
     *     
     */
    public RechtRefBegruendet getUrsprung() {
        return ursprung;
    }

    /**
     * Sets the value of the ursprung property.
     * 
     * @param value
     *     allowed object is
     *     {@link RechtRefBegruendet }
     *     
     */
    public void setUrsprung(RechtRefBegruendet value) {
        this.ursprung = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}GestuetzAuf" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}GehoertZu" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}gueltigBis"/&gt;
     *       &lt;attGroup ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}gueltigVon"/&gt;
     *       &lt;attGroup ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}OperationAttrs"/&gt;
     *       &lt;anyAttribute processContents='lax'/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gestuetzAuves",
        "gehoertZus"
    })
    public static class GestuetzAufGehoertZu {

        @XmlElement(name = "GestuetzAuf")
        protected List<GestuetzAuf> gestuetzAuves;
        @XmlElement(name = "GehoertZu")
        protected List<GehoertZu> gehoertZus;
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
        @XmlAttribute(name = "operation")
        protected Operation operation;
        @XmlAttribute(name = "operationOrder")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger operationOrder;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the gestuetzAuves property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gestuetzAuves property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGestuetzAuves().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GestuetzAuf }
         * 
         * 
         */
        public List<GestuetzAuf> getGestuetzAuves() {
            if (gestuetzAuves == null) {
                gestuetzAuves = new ArrayList<GestuetzAuf>();
            }
            return this.gestuetzAuves;
        }

        /**
         * Gets the value of the gehoertZus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gehoertZus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGehoertZus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GehoertZu }
         * 
         * 
         */
        public List<GehoertZu> getGehoertZus() {
            if (gehoertZus == null) {
                gehoertZus = new ArrayList<GehoertZu>();
            }
            return this.gehoertZus;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}RangNachfolge" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Vorrang" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}OperationAttrs"/&gt;
     *       &lt;attGroup ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}gueltigBis"/&gt;
     *       &lt;attGroup ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}gueltigVon"/&gt;
     *       &lt;anyAttribute processContents='lax'/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rangNachfolges",
        "vorrangs"
    })
    public static class Rangverschiebung {

        @XmlElement(name = "RangNachfolge")
        protected List<RangNachfolge> rangNachfolges;
        @XmlElement(name = "Vorrang")
        protected List<Vorrang> vorrangs;
        @XmlAttribute(name = "operation")
        protected Operation operation;
        @XmlAttribute(name = "operationOrder")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger operationOrder;
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
         * Gets the value of the rangNachfolges property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rangNachfolges property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRangNachfolges().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RangNachfolge }
         * 
         * 
         */
        public List<RangNachfolge> getRangNachfolges() {
            if (rangNachfolges == null) {
                rangNachfolges = new ArrayList<RangNachfolge>();
            }
            return this.rangNachfolges;
        }

        /**
         * Gets the value of the vorrangs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vorrangs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVorrangs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Vorrang }
         * 
         * 
         */
        public List<Vorrang> getVorrangs() {
            if (vorrangs == null) {
                vorrangs = new ArrayList<Vorrang>();
            }
            return this.vorrangs;
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

}
