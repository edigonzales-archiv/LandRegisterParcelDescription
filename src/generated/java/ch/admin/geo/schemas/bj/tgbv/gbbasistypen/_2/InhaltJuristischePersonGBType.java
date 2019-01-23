
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InhaltJuristischePersonGBType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InhaltJuristischePersonGBType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}InhaltPersonGBType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name_Firma"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Sitz" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AuszugOhneSitz" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RechtsformStichwort" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}JuristischePersonGB_RechtsformType" minOccurs="0"/&gt;
 *         &lt;element name="RechtsformZusatz" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}StichwortZusatz" minOccurs="0"/&gt;
 *         &lt;element name="AuszugOhneRechtsform" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Firmennummer" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UID" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}UID" minOccurs="0"/&gt;
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
@XmlType(name = "InhaltJuristischePersonGBType", propOrder = {
    "nameFirma",
    "sitz",
    "auszugOhneSitz",
    "rechtsformStichwort",
    "rechtsformZusatz",
    "auszugOhneRechtsform",
    "firmennummer",
    "uid"
})
public class InhaltJuristischePersonGBType
    extends InhaltPersonGBType
{

    @XmlElement(name = "Name_Firma", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nameFirma;
    @XmlElement(name = "Sitz")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sitz;
    @XmlElement(name = "AuszugOhneSitz")
    protected Boolean auszugOhneSitz;
    @XmlElement(name = "RechtsformStichwort")
    protected JuristischePersonGBRechtsform rechtsformStichwort;
    @XmlElement(name = "RechtsformZusatz")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String rechtsformZusatz;
    @XmlElement(name = "AuszugOhneRechtsform")
    protected Boolean auszugOhneRechtsform;
    @XmlElement(name = "Firmennummer")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String firmennummer;
    @XmlElement(name = "UID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String uid;

    /**
     * Gets the value of the nameFirma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFirma() {
        return nameFirma;
    }

    /**
     * Sets the value of the nameFirma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFirma(String value) {
        this.nameFirma = value;
    }

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
     * Gets the value of the auszugOhneSitz property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuszugOhneSitz() {
        return auszugOhneSitz;
    }

    /**
     * Sets the value of the auszugOhneSitz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuszugOhneSitz(Boolean value) {
        this.auszugOhneSitz = value;
    }

    /**
     * Gets the value of the rechtsformStichwort property.
     * 
     * @return
     *     possible object is
     *     {@link JuristischePersonGBRechtsform }
     *     
     */
    public JuristischePersonGBRechtsform getRechtsformStichwort() {
        return rechtsformStichwort;
    }

    /**
     * Sets the value of the rechtsformStichwort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JuristischePersonGBRechtsform }
     *     
     */
    public void setRechtsformStichwort(JuristischePersonGBRechtsform value) {
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

    /**
     * Gets the value of the auszugOhneRechtsform property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuszugOhneRechtsform() {
        return auszugOhneRechtsform;
    }

    /**
     * Sets the value of the auszugOhneRechtsform property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuszugOhneRechtsform(Boolean value) {
        this.auszugOhneRechtsform = value;
    }

    /**
     * Gets the value of the firmennummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmennummer() {
        return firmennummer;
    }

    /**
     * Sets the value of the firmennummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmennummer(String value) {
        this.firmennummer = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUID() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUID(String value) {
        this.uid = value;
    }

}
