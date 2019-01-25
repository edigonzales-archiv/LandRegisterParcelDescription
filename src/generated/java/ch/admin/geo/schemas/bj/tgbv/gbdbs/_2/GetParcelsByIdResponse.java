
package ch.admin.geo.schemas.bj.tgbv.gbdbs._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.AnmerkungType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.BergwerkType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.DienstbarkeitType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.EigentumAnteilType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.GemeinschaftType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.GewoehnlichesMiteigentumType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.GewoehnlichesSDRType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.GrundlastType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.GrundpfandrechtType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.GrundstueckType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.JuristischePersonGBType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.KonzessionType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.LiegenschaftType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.MiteigentumsAnteilType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.NatuerlichePersonGBType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.PersonGBType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.RechtType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.SelbstaendigesDauerndesRechtType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.StockwerksEinheitType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.VormerkungType;


/**
 * <p>Java class for GetParcelsByIdResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetParcelsByIdResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="standDerDaten" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Grundstueck" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Grundstueck"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Person" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}PersonGB"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Recht" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Recht"/&gt;
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
@XmlType(name = "GetParcelsByIdResponseType", propOrder = {
    "standDerDaten",
    "grundstuecks",
    "persons",
    "rechts",
    "extensions"
})
@XmlRootElement(name = "GetParcelsByIdResponse")
public class GetParcelsByIdResponse {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar standDerDaten;
    @XmlElement(name = "Grundstueck")
    protected List<GetParcelsByIdResponse.Grundstueck> grundstuecks;
    @XmlElement(name = "Person")
    protected List<GetParcelsByIdResponse.Person> persons;
    @XmlElement(name = "Recht")
    protected List<GetParcelsByIdResponse.Recht> rechts;
    protected Extensions extensions;

    /**
     * Gets the value of the standDerDaten property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStandDerDaten() {
        return standDerDaten;
    }

    /**
     * Sets the value of the standDerDaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStandDerDaten(XMLGregorianCalendar value) {
        this.standDerDaten = value;
    }

    /**
     * Gets the value of the grundstuecks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grundstuecks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrundstuecks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetParcelsByIdResponse.Grundstueck }
     * 
     * 
     */
    public List<GetParcelsByIdResponse.Grundstueck> getGrundstuecks() {
        if (grundstuecks == null) {
            grundstuecks = new ArrayList<GetParcelsByIdResponse.Grundstueck>();
        }
        return this.grundstuecks;
    }

    /**
     * Gets the value of the persons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the persons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetParcelsByIdResponse.Person }
     * 
     * 
     */
    public List<GetParcelsByIdResponse.Person> getPersons() {
        if (persons == null) {
            persons = new ArrayList<GetParcelsByIdResponse.Person>();
        }
        return this.persons;
    }

    /**
     * Gets the value of the rechts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rechts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRechts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetParcelsByIdResponse.Recht }
     * 
     * 
     */
    public List<GetParcelsByIdResponse.Recht> getRechts() {
        if (rechts == null) {
            rechts = new ArrayList<GetParcelsByIdResponse.Recht>();
        }
        return this.rechts;
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
     *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Grundstueck"/&gt;
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

        @XmlElementRef(name = "Grundstueck", namespace = "http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1", type = JAXBElement.class)
        protected JAXBElement<? extends GrundstueckType> grundstueck;

        /**
         * Gets the value of the grundstueck property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link KonzessionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link MiteigentumsAnteilType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GrundstueckType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GewoehnlichesSDRType }{@code >}
         *     {@link JAXBElement }{@code <}{@link LiegenschaftType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StockwerksEinheitType }{@code >}
         *     {@link JAXBElement }{@code <}{@link SelbstaendigesDauerndesRechtType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GewoehnlichesMiteigentumType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BergwerkType }{@code >}
         *     
         */
        public JAXBElement<? extends GrundstueckType> getGrundstueck() {
            return grundstueck;
        }

        /**
         * Sets the value of the grundstueck property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link KonzessionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link MiteigentumsAnteilType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GrundstueckType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GewoehnlichesSDRType }{@code >}
         *     {@link JAXBElement }{@code <}{@link LiegenschaftType }{@code >}
         *     {@link JAXBElement }{@code <}{@link StockwerksEinheitType }{@code >}
         *     {@link JAXBElement }{@code <}{@link SelbstaendigesDauerndesRechtType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GewoehnlichesMiteigentumType }{@code >}
         *     {@link JAXBElement }{@code <}{@link BergwerkType }{@code >}
         *     
         */
        public void setGrundstueck(JAXBElement<? extends GrundstueckType> value) {
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
     *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}PersonGB"/&gt;
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
        "personGB"
    })
    public static class Person {

        @XmlElementRef(name = "PersonGB", namespace = "http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1", type = JAXBElement.class)
        protected JAXBElement<? extends PersonGBType> personGB;

        /**
         * Gets the value of the personGB property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link GemeinschaftType }{@code >}
         *     {@link JAXBElement }{@code <}{@link NatuerlichePersonGBType }{@code >}
         *     {@link JAXBElement }{@code <}{@link PersonGBType }{@code >}
         *     {@link JAXBElement }{@code <}{@link JuristischePersonGBType }{@code >}
         *     
         */
        public JAXBElement<? extends PersonGBType> getPersonGB() {
            return personGB;
        }

        /**
         * Sets the value of the personGB property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link GemeinschaftType }{@code >}
         *     {@link JAXBElement }{@code <}{@link NatuerlichePersonGBType }{@code >}
         *     {@link JAXBElement }{@code <}{@link PersonGBType }{@code >}
         *     {@link JAXBElement }{@code <}{@link JuristischePersonGBType }{@code >}
         *     
         */
        public void setPersonGB(JAXBElement<? extends PersonGBType> value) {
            this.personGB = value;
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
     *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Recht"/&gt;
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

        @XmlElementRef(name = "Recht", namespace = "http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1", type = JAXBElement.class)
        protected JAXBElement<? extends RechtType> recht;

        /**
         * Gets the value of the recht property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link GrundpfandrechtType }{@code >}
         *     {@link JAXBElement }{@code <}{@link RechtType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EigentumAnteilType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GrundlastType }{@code >}
         *     {@link JAXBElement }{@code <}{@link DienstbarkeitType }{@code >}
         *     {@link JAXBElement }{@code <}{@link VormerkungType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AnmerkungType }{@code >}
         *     
         */
        public JAXBElement<? extends RechtType> getRecht() {
            return recht;
        }

        /**
         * Sets the value of the recht property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link GrundpfandrechtType }{@code >}
         *     {@link JAXBElement }{@code <}{@link RechtType }{@code >}
         *     {@link JAXBElement }{@code <}{@link EigentumAnteilType }{@code >}
         *     {@link JAXBElement }{@code <}{@link GrundlastType }{@code >}
         *     {@link JAXBElement }{@code <}{@link DienstbarkeitType }{@code >}
         *     {@link JAXBElement }{@code <}{@link VormerkungType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AnmerkungType }{@code >}
         *     
         */
        public void setRecht(JAXBElement<? extends RechtType> value) {
            this.recht = value;
        }

    }

}
