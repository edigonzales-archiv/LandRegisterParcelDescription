
package ch.admin.geo.schemas.bj.tgbv.gbdbs._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GetParcelsByIdRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetParcelsByIdRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}AbstractRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BezugInhalt" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}BezugInhalt"/&gt;
 *         &lt;element name="includeHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}GrundstueckNummer" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "GetParcelsByIdRequestType", propOrder = {
    "bezugInhalt",
    "includeHistory",
    "ids",
    "extensions"
})
public class GetParcelsByIdRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "BezugInhalt", required = true)
    @XmlSchemaType(name = "normalizedString")
    protected BezugInhalt bezugInhalt;
    protected Boolean includeHistory;
    @XmlElement(name = "Id", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> ids;
    protected Extensions extensions;

    /**
     * Gets the value of the bezugInhalt property.
     * 
     * @return
     *     possible object is
     *     {@link BezugInhalt }
     *     
     */
    public BezugInhalt getBezugInhalt() {
        return bezugInhalt;
    }

    /**
     * Sets the value of the bezugInhalt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BezugInhalt }
     *     
     */
    public void setBezugInhalt(BezugInhalt value) {
        this.bezugInhalt = value;
    }

    /**
     * Gets the value of the includeHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeHistory() {
        return includeHistory;
    }

    /**
     * Sets the value of the includeHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeHistory(Boolean value) {
        this.includeHistory = value;
    }

    /**
     * Gets the value of the ids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIds() {
        if (ids == null) {
            ids = new ArrayList<String>();
        }
        return this.ids;
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

}
