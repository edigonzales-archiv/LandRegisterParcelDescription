
package ch.ech.xmlns.ech_0135._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="placeOfOrigins"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="placeOfOrigin" type="{http://www.ech.ch/xmlns/eCH-0135/1}placeOfOriginType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "placeOfOrigins"
})
@XmlRootElement(name = "placeOfOriginNomenclature")
public class PlaceOfOriginNomenclature {

    @XmlElement(required = true)
    protected PlaceOfOriginNomenclature.PlaceOfOrigins placeOfOrigins;

    /**
     * Gets the value of the placeOfOrigins property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfOriginNomenclature.PlaceOfOrigins }
     *     
     */
    public PlaceOfOriginNomenclature.PlaceOfOrigins getPlaceOfOrigins() {
        return placeOfOrigins;
    }

    /**
     * Sets the value of the placeOfOrigins property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfOriginNomenclature.PlaceOfOrigins }
     *     
     */
    public void setPlaceOfOrigins(PlaceOfOriginNomenclature.PlaceOfOrigins value) {
        this.placeOfOrigins = value;
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
     *         &lt;element name="placeOfOrigin" type="{http://www.ech.ch/xmlns/eCH-0135/1}placeOfOriginType" maxOccurs="unbounded"/&gt;
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
        "placeOfOrigins"
    })
    public static class PlaceOfOrigins {

        @XmlElement(name = "placeOfOrigin", required = true)
        protected List<PlaceOfOriginType> placeOfOrigins;

        /**
         * Gets the value of the placeOfOrigins property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the placeOfOrigins property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlaceOfOrigins().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PlaceOfOriginType }
         * 
         * 
         */
        public List<PlaceOfOriginType> getPlaceOfOrigins() {
            if (placeOfOrigins == null) {
                placeOfOrigins = new ArrayList<PlaceOfOriginType>();
            }
            return this.placeOfOrigins;
        }

    }

}
