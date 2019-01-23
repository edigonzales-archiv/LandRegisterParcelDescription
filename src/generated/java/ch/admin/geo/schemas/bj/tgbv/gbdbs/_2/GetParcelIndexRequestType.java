
package ch.admin.geo.schemas.bj.tgbv.gbdbs._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetParcelIndexRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetParcelIndexRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}AbstractRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shortIndex" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="includeHistory" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Adresse" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}Adresse"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Grundstueck" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}Grundstueck"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Berechtigte" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}Berechtigte"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Recht" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}Recht"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetParcelIndexRequestType", propOrder = {
    "shortIndex",
    "includeHistory",
    "adresse",
    "grundstueck",
    "berechtigte",
    "recht",
    "extensions"
})
public class GetParcelIndexRequestType
    extends AbstractRequestType
{

    protected boolean shortIndex;
    protected boolean includeHistory;
    @XmlElement(name = "Adresse")
    protected GetParcelIndexRequestType.Adresse adresse;
    @XmlElement(name = "Grundstueck")
    protected GetParcelIndexRequestType.Grundstueck grundstueck;
    @XmlElement(name = "Berechtigte")
    protected GetParcelIndexRequestType.Berechtigte berechtigte;
    @XmlElement(name = "Recht")
    protected GetParcelIndexRequestType.Recht recht;
    protected Extensions extensions;

    /**
     * Gets the value of the shortIndex property.
     * 
     */
    public boolean isShortIndex() {
        return shortIndex;
    }

    /**
     * Sets the value of the shortIndex property.
     * 
     */
    public void setShortIndex(boolean value) {
        this.shortIndex = value;
    }

    /**
     * Gets the value of the includeHistory property.
     * 
     */
    public boolean isIncludeHistory() {
        return includeHistory;
    }

    /**
     * Sets the value of the includeHistory property.
     * 
     */
    public void setIncludeHistory(boolean value) {
        this.includeHistory = value;
    }

    /**
     * Gets the value of the adresse property.
     * 
     * @return
     *     possible object is
     *     {@link GetParcelIndexRequestType.Adresse }
     *     
     */
    public GetParcelIndexRequestType.Adresse getAdresse() {
        return adresse;
    }

    /**
     * Sets the value of the adresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetParcelIndexRequestType.Adresse }
     *     
     */
    public void setAdresse(GetParcelIndexRequestType.Adresse value) {
        this.adresse = value;
    }

    /**
     * Gets the value of the grundstueck property.
     * 
     * @return
     *     possible object is
     *     {@link GetParcelIndexRequestType.Grundstueck }
     *     
     */
    public GetParcelIndexRequestType.Grundstueck getGrundstueck() {
        return grundstueck;
    }

    /**
     * Sets the value of the grundstueck property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetParcelIndexRequestType.Grundstueck }
     *     
     */
    public void setGrundstueck(GetParcelIndexRequestType.Grundstueck value) {
        this.grundstueck = value;
    }

    /**
     * Gets the value of the berechtigte property.
     * 
     * @return
     *     possible object is
     *     {@link GetParcelIndexRequestType.Berechtigte }
     *     
     */
    public GetParcelIndexRequestType.Berechtigte getBerechtigte() {
        return berechtigte;
    }

    /**
     * Sets the value of the berechtigte property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetParcelIndexRequestType.Berechtigte }
     *     
     */
    public void setBerechtigte(GetParcelIndexRequestType.Berechtigte value) {
        this.berechtigte = value;
    }

    /**
     * Gets the value of the recht property.
     * 
     * @return
     *     possible object is
     *     {@link GetParcelIndexRequestType.Recht }
     *     
     */
    public GetParcelIndexRequestType.Recht getRecht() {
        return recht;
    }

    /**
     * Sets the value of the recht property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetParcelIndexRequestType.Recht }
     *     
     */
    public void setRecht(GetParcelIndexRequestType.Recht value) {
        this.recht = value;
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
     *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}Adresse"/&gt;
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
        "adresse"
    })
    public static class Adresse {

        @XmlElement(name = "Adresse", required = true)
        protected ch.admin.geo.schemas.bj.tgbv.gbdbs._2.Adresse adresse;

        /**
         * Gets the value of the adresse property.
         * 
         * @return
         *     possible object is
         *     {@link ch.admin.geo.schemas.bj.tgbv.gbdbs._2.Adresse }
         *     
         */
        public ch.admin.geo.schemas.bj.tgbv.gbdbs._2.Adresse getAdresse() {
            return adresse;
        }

        /**
         * Sets the value of the adresse property.
         * 
         * @param value
         *     allowed object is
         *     {@link ch.admin.geo.schemas.bj.tgbv.gbdbs._2.Adresse }
         *     
         */
        public void setAdresse(ch.admin.geo.schemas.bj.tgbv.gbdbs._2.Adresse value) {
            this.adresse = value;
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
     *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}Berechtigte"/&gt;
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
        "berechtigte"
    })
    public static class Berechtigte {

        @XmlElement(name = "Berechtigte", required = true)
        protected ch.admin.geo.schemas.bj.tgbv.gbdbs._2.Berechtigte berechtigte;

        /**
         * Gets the value of the berechtigte property.
         * 
         * @return
         *     possible object is
         *     {@link ch.admin.geo.schemas.bj.tgbv.gbdbs._2.Berechtigte }
         *     
         */
        public ch.admin.geo.schemas.bj.tgbv.gbdbs._2.Berechtigte getBerechtigte() {
            return berechtigte;
        }

        /**
         * Sets the value of the berechtigte property.
         * 
         * @param value
         *     allowed object is
         *     {@link ch.admin.geo.schemas.bj.tgbv.gbdbs._2.Berechtigte }
         *     
         */
        public void setBerechtigte(ch.admin.geo.schemas.bj.tgbv.gbdbs._2.Berechtigte value) {
            this.berechtigte = value;
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
     *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}Grundstueck"/&gt;
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
        "grundstueck"
    })
    public static class Grundstueck {

        @XmlElement(name = "Grundstueck", required = true)
        protected ch.admin.geo.schemas.bj.tgbv.gbdbs._2.Grundstueck grundstueck;

        /**
         * Gets the value of the grundstueck property.
         * 
         * @return
         *     possible object is
         *     {@link ch.admin.geo.schemas.bj.tgbv.gbdbs._2.Grundstueck }
         *     
         */
        public ch.admin.geo.schemas.bj.tgbv.gbdbs._2.Grundstueck getGrundstueck() {
            return grundstueck;
        }

        /**
         * Sets the value of the grundstueck property.
         * 
         * @param value
         *     allowed object is
         *     {@link ch.admin.geo.schemas.bj.tgbv.gbdbs._2.Grundstueck }
         *     
         */
        public void setGrundstueck(ch.admin.geo.schemas.bj.tgbv.gbdbs._2.Grundstueck value) {
            this.grundstueck = value;
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
     *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}Recht"/&gt;
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
        "recht"
    })
    public static class Recht {

        @XmlElement(name = "Recht", required = true)
        protected ch.admin.geo.schemas.bj.tgbv.gbdbs._2.Recht recht;

        /**
         * Gets the value of the recht property.
         * 
         * @return
         *     possible object is
         *     {@link ch.admin.geo.schemas.bj.tgbv.gbdbs._2.Recht }
         *     
         */
        public ch.admin.geo.schemas.bj.tgbv.gbdbs._2.Recht getRecht() {
            return recht;
        }

        /**
         * Sets the value of the recht property.
         * 
         * @param value
         *     allowed object is
         *     {@link ch.admin.geo.schemas.bj.tgbv.gbdbs._2.Recht }
         *     
         */
        public void setRecht(ch.admin.geo.schemas.bj.tgbv.gbdbs._2.Recht value) {
            this.recht = value;
        }

    }

}
