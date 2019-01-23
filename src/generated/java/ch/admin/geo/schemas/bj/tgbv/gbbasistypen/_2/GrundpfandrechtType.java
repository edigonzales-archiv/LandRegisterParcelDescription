
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrundpfandrechtType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrundpfandrechtType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}RechtType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Glaeubiger" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}Schuldner" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}VerpfaendetesGrundstueckGrundpfandrecht" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "GrundpfandrechtType", propOrder = {
    "glaeubigers",
    "schuldners",
    "verpfaendetesGrundstueckGrundpfandrechts"
})
public class GrundpfandrechtType
    extends RechtType
{

    @XmlElement(name = "Glaeubiger")
    protected List<Glaeubiger> glaeubigers;
    @XmlElement(name = "Schuldner")
    protected List<Schuldner> schuldners;
    @XmlElement(name = "VerpfaendetesGrundstueckGrundpfandrecht", required = true)
    protected List<VerpfaendetesGrundstueckGrundpfandrecht> verpfaendetesGrundstueckGrundpfandrechts;

    /**
     * Gets the value of the glaeubigers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glaeubigers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlaeubigers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Glaeubiger }
     * 
     * 
     */
    public List<Glaeubiger> getGlaeubigers() {
        if (glaeubigers == null) {
            glaeubigers = new ArrayList<Glaeubiger>();
        }
        return this.glaeubigers;
    }

    /**
     * Gets the value of the schuldners property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schuldners property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchuldners().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Schuldner }
     * 
     * 
     */
    public List<Schuldner> getSchuldners() {
        if (schuldners == null) {
            schuldners = new ArrayList<Schuldner>();
        }
        return this.schuldners;
    }

    /**
     * Gets the value of the verpfaendetesGrundstueckGrundpfandrechts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verpfaendetesGrundstueckGrundpfandrechts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerpfaendetesGrundstueckGrundpfandrechts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerpfaendetesGrundstueckGrundpfandrecht }
     * 
     * 
     */
    public List<VerpfaendetesGrundstueckGrundpfandrecht> getVerpfaendetesGrundstueckGrundpfandrechts() {
        if (verpfaendetesGrundstueckGrundpfandrechts == null) {
            verpfaendetesGrundstueckGrundpfandrechts = new ArrayList<VerpfaendetesGrundstueckGrundpfandrecht>();
        }
        return this.verpfaendetesGrundstueckGrundpfandrechts;
    }

}
