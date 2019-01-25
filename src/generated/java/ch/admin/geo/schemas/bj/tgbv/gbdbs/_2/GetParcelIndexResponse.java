
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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.BergwerkType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.GewoehnlichesMiteigentumType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.GewoehnlichesSDRType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.GrundstueckType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.KonzessionType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.LiegenschaftType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.MiteigentumsAnteilType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.SelbstaendigesDauerndesRechtType;
import ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2.StockwerksEinheitType;


/**
 * <p>Java class for GetParcelIndexResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetParcelIndexResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shortIndex" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}GrundstueckNummer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Index" maxOccurs="unbounded" minOccurs="0"&gt;
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
@XmlType(name = "GetParcelIndexResponseType", propOrder = {
    "shortIndices",
    "indices",
    "extensions"
})
@XmlRootElement(name = "GetParcelIndexResponse")
public class GetParcelIndexResponse {

    @XmlElement(name = "shortIndex")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> shortIndices;
    @XmlElement(name = "Index")
    protected List<GetParcelIndexResponse.Index> indices;
    protected Extensions extensions;

    /**
     * Gets the value of the shortIndices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shortIndices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShortIndices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getShortIndices() {
        if (shortIndices == null) {
            shortIndices = new ArrayList<String>();
        }
        return this.shortIndices;
    }

    /**
     * Gets the value of the indices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetParcelIndexResponse.Index }
     * 
     * 
     */
    public List<GetParcelIndexResponse.Index> getIndices() {
        if (indices == null) {
            indices = new ArrayList<GetParcelIndexResponse.Index>();
        }
        return this.indices;
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
    public static class Index {

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

}
