
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * <p>Java class for AnmeldungType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnmeldungType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EGBTBID" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}EGBTBID"/&gt;
 *         &lt;element name="TagebuchNummer" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}TagebuchNummer" minOccurs="0"/&gt;
 *         &lt;element name="TagebuchDatumZeit" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}DatumInklZeit"/&gt;
 *         &lt;element name="GeschaeftsfallbeschreibungStichwort" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Anmeldung_GeschaeftsfallbeschreibungType" minOccurs="0"/&gt;
 *         &lt;element name="GeschaeftsfallbeschreibungZusatz" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}StichwortZusatz" minOccurs="0"/&gt;
 *         &lt;element name="Bemerkungen" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DossierNummer" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Geschaeftstyp" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Geschaeftstyp"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}MutationsNummer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="betroffenesGrundstueck" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}GrundstueckNummer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="anmeldendePerson" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}PersonId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gescanntesDokument" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}DokumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Geschaeftsstand" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AnmeldungType", propOrder = {
    "egbtbid",
    "tagebuchNummer",
    "tagebuchDatumZeit",
    "geschaeftsfallbeschreibungStichwort",
    "geschaeftsfallbeschreibungZusatz",
    "bemerkungen",
    "dossierNummer",
    "geschaeftstyp",
    "mutationsNummers",
    "betroffenesGrundstuecks",
    "anmeldendePersons",
    "gescanntesDokuments",
    "geschaeftsstands",
    "extensions"
})
@XmlRootElement(name = "Anmeldung")
public class Anmeldung {

    @XmlElement(name = "EGBTBID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String egbtbid;
    @XmlElement(name = "TagebuchNummer")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String tagebuchNummer;
    @XmlElement(name = "TagebuchDatumZeit", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tagebuchDatumZeit;
    @XmlElement(name = "GeschaeftsfallbeschreibungStichwort")
    protected AnmeldungGeschaeftsfallbeschreibung geschaeftsfallbeschreibungStichwort;
    @XmlElement(name = "GeschaeftsfallbeschreibungZusatz")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String geschaeftsfallbeschreibungZusatz;
    @XmlElement(name = "Bemerkungen")
    protected String bemerkungen;
    @XmlElement(name = "DossierNummer")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dossierNummer;
    @XmlElement(name = "Geschaeftstyp", required = true)
    @XmlSchemaType(name = "normalizedString")
    protected Geschaeftstyp geschaeftstyp;
    @XmlElement(name = "MutationsNummer")
    protected List<MutationsNummer> mutationsNummers;
    @XmlElement(name = "betroffenesGrundstueck")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> betroffenesGrundstuecks;
    @XmlElement(name = "anmeldendePerson")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> anmeldendePersons;
    @XmlElement(name = "gescanntesDokument")
    protected List<Dokument> gescanntesDokuments;
    @XmlElement(name = "Geschaeftsstand")
    protected List<Geschaeftsstand> geschaeftsstands;
    protected Extensions extensions;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the egbtbid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEGBTBID() {
        return egbtbid;
    }

    /**
     * Sets the value of the egbtbid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEGBTBID(String value) {
        this.egbtbid = value;
    }

    /**
     * Gets the value of the tagebuchNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagebuchNummer() {
        return tagebuchNummer;
    }

    /**
     * Sets the value of the tagebuchNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagebuchNummer(String value) {
        this.tagebuchNummer = value;
    }

    /**
     * Gets the value of the tagebuchDatumZeit property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTagebuchDatumZeit() {
        return tagebuchDatumZeit;
    }

    /**
     * Sets the value of the tagebuchDatumZeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTagebuchDatumZeit(XMLGregorianCalendar value) {
        this.tagebuchDatumZeit = value;
    }

    /**
     * Gets the value of the geschaeftsfallbeschreibungStichwort property.
     * 
     * @return
     *     possible object is
     *     {@link AnmeldungGeschaeftsfallbeschreibung }
     *     
     */
    public AnmeldungGeschaeftsfallbeschreibung getGeschaeftsfallbeschreibungStichwort() {
        return geschaeftsfallbeschreibungStichwort;
    }

    /**
     * Sets the value of the geschaeftsfallbeschreibungStichwort property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnmeldungGeschaeftsfallbeschreibung }
     *     
     */
    public void setGeschaeftsfallbeschreibungStichwort(AnmeldungGeschaeftsfallbeschreibung value) {
        this.geschaeftsfallbeschreibungStichwort = value;
    }

    /**
     * Gets the value of the geschaeftsfallbeschreibungZusatz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeschaeftsfallbeschreibungZusatz() {
        return geschaeftsfallbeschreibungZusatz;
    }

    /**
     * Sets the value of the geschaeftsfallbeschreibungZusatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeschaeftsfallbeschreibungZusatz(String value) {
        this.geschaeftsfallbeschreibungZusatz = value;
    }

    /**
     * Gets the value of the bemerkungen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBemerkungen() {
        return bemerkungen;
    }

    /**
     * Sets the value of the bemerkungen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBemerkungen(String value) {
        this.bemerkungen = value;
    }

    /**
     * Gets the value of the dossierNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierNummer() {
        return dossierNummer;
    }

    /**
     * Sets the value of the dossierNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierNummer(String value) {
        this.dossierNummer = value;
    }

    /**
     * Gets the value of the geschaeftstyp property.
     * 
     * @return
     *     possible object is
     *     {@link Geschaeftstyp }
     *     
     */
    public Geschaeftstyp getGeschaeftstyp() {
        return geschaeftstyp;
    }

    /**
     * Sets the value of the geschaeftstyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geschaeftstyp }
     *     
     */
    public void setGeschaeftstyp(Geschaeftstyp value) {
        this.geschaeftstyp = value;
    }

    /**
     * Gets the value of the mutationsNummers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mutationsNummers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMutationsNummers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MutationsNummer }
     * 
     * 
     */
    public List<MutationsNummer> getMutationsNummers() {
        if (mutationsNummers == null) {
            mutationsNummers = new ArrayList<MutationsNummer>();
        }
        return this.mutationsNummers;
    }

    /**
     * Gets the value of the betroffenesGrundstuecks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the betroffenesGrundstuecks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBetroffenesGrundstuecks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBetroffenesGrundstuecks() {
        if (betroffenesGrundstuecks == null) {
            betroffenesGrundstuecks = new ArrayList<String>();
        }
        return this.betroffenesGrundstuecks;
    }

    /**
     * Gets the value of the anmeldendePersons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anmeldendePersons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnmeldendePersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAnmeldendePersons() {
        if (anmeldendePersons == null) {
            anmeldendePersons = new ArrayList<String>();
        }
        return this.anmeldendePersons;
    }

    /**
     * Gets the value of the gescanntesDokuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gescanntesDokuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGescanntesDokuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dokument }
     * 
     * 
     */
    public List<Dokument> getGescanntesDokuments() {
        if (gescanntesDokuments == null) {
            gescanntesDokuments = new ArrayList<Dokument>();
        }
        return this.gescanntesDokuments;
    }

    /**
     * Gets the value of the geschaeftsstands property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geschaeftsstands property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeschaeftsstands().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Geschaeftsstand }
     * 
     * 
     */
    public List<Geschaeftsstand> getGeschaeftsstands() {
        if (geschaeftsstands == null) {
            geschaeftsstands = new ArrayList<Geschaeftsstand>();
        }
        return this.geschaeftsstands;
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

}
