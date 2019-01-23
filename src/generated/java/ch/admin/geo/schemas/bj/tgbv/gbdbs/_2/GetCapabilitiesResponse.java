
package ch.admin.geo.schemas.bj.tgbv.gbdbs._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetCapabilitiesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCapabilitiesResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="supportedVersion" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}Version" maxOccurs="unbounded"/&gt;
 *         &lt;element name="inclEGRID" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="inclUID" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="inclAHVN13" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="inclGebaeudeArt" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="inclGWR_EGID" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="inclGemeinschaftArt" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="inclDokumente" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="historyBackTo" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Datum" minOccurs="0"/&gt;
 *         &lt;element name="grundbuch" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SubKreis" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}SubKreis"/&gt;
 *                   &lt;element name="Los" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}Los" minOccurs="0"/&gt;
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/&gt;
 *                   &lt;element name="BFSNr" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}BFSNr"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCapabilitiesResponseType", propOrder = {
    "supportedVersions",
    "inclEGRID",
    "inclUID",
    "inclAHVN13",
    "inclGebaeudeArt",
    "inclGWREGID",
    "inclGemeinschaftArt",
    "inclDokumente",
    "historyBackTo",
    "grundbuches",
    "extensions"
})
@XmlRootElement(name = "GetCapabilitiesResponse")
public class GetCapabilitiesResponse {

    @XmlElement(name = "supportedVersion", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> supportedVersions;
    protected boolean inclEGRID;
    protected boolean inclUID;
    protected boolean inclAHVN13;
    protected boolean inclGebaeudeArt;
    @XmlElement(name = "inclGWR_EGID")
    protected boolean inclGWREGID;
    protected boolean inclGemeinschaftArt;
    protected boolean inclDokumente;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar historyBackTo;
    @XmlElement(name = "grundbuch", required = true)
    protected List<GetCapabilitiesResponse.Grundbuch> grundbuches;
    protected Extensions extensions;

    /**
     * Gets the value of the supportedVersions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedVersions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedVersions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSupportedVersions() {
        if (supportedVersions == null) {
            supportedVersions = new ArrayList<String>();
        }
        return this.supportedVersions;
    }

    /**
     * Gets the value of the inclEGRID property.
     * 
     */
    public boolean isInclEGRID() {
        return inclEGRID;
    }

    /**
     * Sets the value of the inclEGRID property.
     * 
     */
    public void setInclEGRID(boolean value) {
        this.inclEGRID = value;
    }

    /**
     * Gets the value of the inclUID property.
     * 
     */
    public boolean isInclUID() {
        return inclUID;
    }

    /**
     * Sets the value of the inclUID property.
     * 
     */
    public void setInclUID(boolean value) {
        this.inclUID = value;
    }

    /**
     * Gets the value of the inclAHVN13 property.
     * 
     */
    public boolean isInclAHVN13() {
        return inclAHVN13;
    }

    /**
     * Sets the value of the inclAHVN13 property.
     * 
     */
    public void setInclAHVN13(boolean value) {
        this.inclAHVN13 = value;
    }

    /**
     * Gets the value of the inclGebaeudeArt property.
     * 
     */
    public boolean isInclGebaeudeArt() {
        return inclGebaeudeArt;
    }

    /**
     * Sets the value of the inclGebaeudeArt property.
     * 
     */
    public void setInclGebaeudeArt(boolean value) {
        this.inclGebaeudeArt = value;
    }

    /**
     * Gets the value of the inclGWREGID property.
     * 
     */
    public boolean isInclGWREGID() {
        return inclGWREGID;
    }

    /**
     * Sets the value of the inclGWREGID property.
     * 
     */
    public void setInclGWREGID(boolean value) {
        this.inclGWREGID = value;
    }

    /**
     * Gets the value of the inclGemeinschaftArt property.
     * 
     */
    public boolean isInclGemeinschaftArt() {
        return inclGemeinschaftArt;
    }

    /**
     * Sets the value of the inclGemeinschaftArt property.
     * 
     */
    public void setInclGemeinschaftArt(boolean value) {
        this.inclGemeinschaftArt = value;
    }

    /**
     * Gets the value of the inclDokumente property.
     * 
     */
    public boolean isInclDokumente() {
        return inclDokumente;
    }

    /**
     * Sets the value of the inclDokumente property.
     * 
     */
    public void setInclDokumente(boolean value) {
        this.inclDokumente = value;
    }

    /**
     * Gets the value of the historyBackTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHistoryBackTo() {
        return historyBackTo;
    }

    /**
     * Sets the value of the historyBackTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHistoryBackTo(XMLGregorianCalendar value) {
        this.historyBackTo = value;
    }

    /**
     * Gets the value of the grundbuches property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grundbuches property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrundbuches().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetCapabilitiesResponse.Grundbuch }
     * 
     * 
     */
    public List<GetCapabilitiesResponse.Grundbuch> getGrundbuches() {
        if (grundbuches == null) {
            grundbuches = new ArrayList<GetCapabilitiesResponse.Grundbuch>();
        }
        return this.grundbuches;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="SubKreis" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}SubKreis"/&gt;
     *         &lt;element name="Los" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}Los" minOccurs="0"/&gt;
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/&gt;
     *         &lt;element name="BFSNr" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}BFSNr"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subKreis",
        "los",
        "name",
        "bfsNr"
    })
    public static class Grundbuch {

        @XmlElement(name = "SubKreis", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String subKreis;
        @XmlElement(name = "Los")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String los;
        @XmlElement(name = "Name", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlElement(name = "BFSNr")
        @XmlSchemaType(name = "integer")
        protected int bfsNr;

        /**
         * Gets the value of the subKreis property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubKreis() {
            return subKreis;
        }

        /**
         * Sets the value of the subKreis property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubKreis(String value) {
            this.subKreis = value;
        }

        /**
         * Gets the value of the los property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLos() {
            return los;
        }

        /**
         * Sets the value of the los property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLos(String value) {
            this.los = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the bfsNr property.
         * 
         */
        public int getBFSNr() {
            return bfsNr;
        }

        /**
         * Sets the value of the bfsNr property.
         * 
         */
        public void setBFSNr(int value) {
            this.bfsNr = value;
        }

    }

}
