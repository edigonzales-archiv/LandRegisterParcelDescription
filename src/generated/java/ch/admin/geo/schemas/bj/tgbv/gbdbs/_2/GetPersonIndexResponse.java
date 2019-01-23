
package ch.admin.geo.schemas.bj.tgbv.gbdbs._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPersonIndexResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPersonIndexResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonIndex" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}PersonIndex"/&gt;
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
@XmlType(name = "GetPersonIndexResponseType", propOrder = {
    "personIndices",
    "extensions"
})
@XmlRootElement(name = "GetPersonIndexResponse")
public class GetPersonIndexResponse {

    @XmlElement(name = "PersonIndex")
    protected List<GetPersonIndexResponse.PersonIndex> personIndices;
    protected Extensions extensions;

    /**
     * Gets the value of the personIndices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personIndices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonIndices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetPersonIndexResponse.PersonIndex }
     * 
     * 
     */
    public List<GetPersonIndexResponse.PersonIndex> getPersonIndices() {
        if (personIndices == null) {
            personIndices = new ArrayList<GetPersonIndexResponse.PersonIndex>();
        }
        return this.personIndices;
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
     *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}PersonIndex"/&gt;
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
        "personIndex"
    })
    public static class PersonIndex {

        @XmlElement(name = "PersonIndex", required = true)
        protected ch.admin.geo.schemas.bj.tgbv.gbdbs._2.PersonIndex personIndex;

        /**
         * Gets the value of the personIndex property.
         * 
         * @return
         *     possible object is
         *     {@link ch.admin.geo.schemas.bj.tgbv.gbdbs._2.PersonIndex }
         *     
         */
        public ch.admin.geo.schemas.bj.tgbv.gbdbs._2.PersonIndex getPersonIndex() {
            return personIndex;
        }

        /**
         * Sets the value of the personIndex property.
         * 
         * @param value
         *     allowed object is
         *     {@link ch.admin.geo.schemas.bj.tgbv.gbdbs._2.PersonIndex }
         *     
         */
        public void setPersonIndex(ch.admin.geo.schemas.bj.tgbv.gbdbs._2.PersonIndex value) {
            this.personIndex = value;
        }

    }

}
