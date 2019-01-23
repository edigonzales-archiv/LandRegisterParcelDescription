
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DienstbarkeitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DienstbarkeitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}RechtType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beteiligtesGrundstueck" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}GrundstueckRefBegruendet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}LastRechtDienstbarkeit" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DienstbarkeitType", propOrder = {
    "beteiligtesGrundstuecks",
    "lastRechtDienstbarkeits"
})
public class DienstbarkeitType
    extends RechtType
{

    @XmlElement(name = "beteiligtesGrundstueck")
    protected List<GrundstueckRefBegruendet> beteiligtesGrundstuecks;
    @XmlElement(name = "LastRechtDienstbarkeit")
    protected List<LastRechtDienstbarkeit> lastRechtDienstbarkeits;

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
     * Gets the value of the lastRechtDienstbarkeits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastRechtDienstbarkeits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastRechtDienstbarkeits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LastRechtDienstbarkeit }
     * 
     * 
     */
    public List<LastRechtDienstbarkeit> getLastRechtDienstbarkeits() {
        if (lastRechtDienstbarkeits == null) {
            lastRechtDienstbarkeits = new ArrayList<LastRechtDienstbarkeit>();
        }
        return this.lastRechtDienstbarkeits;
    }

}
