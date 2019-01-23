
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrundlastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrundlastType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}RechtType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beteiligtesGrundstueck" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}GrundstueckRefBegruendet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}LastRechtGrundlast" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "GrundlastType", propOrder = {
    "beteiligtesGrundstuecks",
    "lastRechtGrundlasts"
})
public class GrundlastType
    extends RechtType
{

    @XmlElement(name = "beteiligtesGrundstueck")
    protected List<GrundstueckRefBegruendet> beteiligtesGrundstuecks;
    @XmlElement(name = "LastRechtGrundlast")
    protected List<LastRechtGrundlast> lastRechtGrundlasts;

    /**
     * Gets the value of the beteiligtesGrundstuecks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beteiligtesGrundstuecks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeteiligtesGrundstuecks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrundstueckRefBegruendet }
     * 
     * 
     */
    public List<GrundstueckRefBegruendet> getBeteiligtesGrundstuecks() {
        if (beteiligtesGrundstuecks == null) {
            beteiligtesGrundstuecks = new ArrayList<GrundstueckRefBegruendet>();
        }
        return this.beteiligtesGrundstuecks;
    }

    /**
     * Gets the value of the lastRechtGrundlasts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastRechtGrundlasts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastRechtGrundlasts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LastRechtGrundlast }
     * 
     * 
     */
    public List<LastRechtGrundlast> getLastRechtGrundlasts() {
        if (lastRechtGrundlasts == null) {
            lastRechtGrundlasts = new ArrayList<LastRechtGrundlast>();
        }
        return this.lastRechtGrundlasts;
    }

}
