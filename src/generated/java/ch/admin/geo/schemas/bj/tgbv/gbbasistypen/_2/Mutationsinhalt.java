
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MutationsinhaltType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MutationsinhaltType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Grundstueck"/&gt;
 *           &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}PersonGB"/&gt;
 *           &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Recht"/&gt;
 *           &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}extensions"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MutationsinhaltType", propOrder = {
    "grundstuecksAndPersonGBsAndRechts"
})
@XmlRootElement(name = "Mutationsinhalt")
public class Mutationsinhalt {

    @XmlElementRefs({
        @XmlElementRef(name = "Grundstueck", namespace = "http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PersonGB", namespace = "http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extensions", namespace = "http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1", type = Extensions.class, required = false),
        @XmlElementRef(name = "Recht", namespace = "http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1", type = JAXBElement.class, required = false)
    })
    protected List<Object> grundstuecksAndPersonGBsAndRechts;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the grundstuecksAndPersonGBsAndRechts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grundstuecksAndPersonGBsAndRechts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrundstuecksAndPersonGBsAndRechts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link GrundstueckType }{@code >}
     * {@link JAXBElement }{@code <}{@link BergwerkType }{@code >}
     * {@link JAXBElement }{@code <}{@link LiegenschaftType }{@code >}
     * {@link JAXBElement }{@code <}{@link KonzessionType }{@code >}
     * {@link Extensions }
     * {@link JAXBElement }{@code <}{@link RechtType }{@code >}
     * {@link JAXBElement }{@code <}{@link GewoehnlichesMiteigentumType }{@code >}
     * {@link JAXBElement }{@code <}{@link NatuerlichePersonGBType }{@code >}
     * {@link JAXBElement }{@code <}{@link GemeinschaftType }{@code >}
     * {@link JAXBElement }{@code <}{@link VormerkungType }{@code >}
     * {@link JAXBElement }{@code <}{@link GrundpfandrechtType }{@code >}
     * {@link JAXBElement }{@code <}{@link SelbstaendigesDauerndesRechtType }{@code >}
     * {@link JAXBElement }{@code <}{@link JuristischePersonGBType }{@code >}
     * {@link JAXBElement }{@code <}{@link DienstbarkeitType }{@code >}
     * {@link JAXBElement }{@code <}{@link PersonGBType }{@code >}
     * {@link JAXBElement }{@code <}{@link GrundlastType }{@code >}
     * {@link JAXBElement }{@code <}{@link GewoehnlichesSDRType }{@code >}
     * {@link JAXBElement }{@code <}{@link StockwerksEinheitType }{@code >}
     * {@link JAXBElement }{@code <}{@link AnmerkungType }{@code >}
     * {@link JAXBElement }{@code <}{@link EigentumAnteilType }{@code >}
     * {@link JAXBElement }{@code <}{@link MiteigentumsAnteilType }{@code >}
     * 
     * 
     */
    public List<Object> getGrundstuecksAndPersonGBsAndRechts() {
        if (grundstuecksAndPersonGBsAndRechts == null) {
            grundstuecksAndPersonGBsAndRechts = new ArrayList<Object>();
        }
        return this.grundstuecksAndPersonGBsAndRechts;
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

}
