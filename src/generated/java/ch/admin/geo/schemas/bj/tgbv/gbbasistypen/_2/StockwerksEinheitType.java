
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StockwerksEinheitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockwerksEinheitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}MiteigentumsAnteilType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KantonaleUnterartStichwort" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}StockwerksEinheit_KantonaleUnterartType" minOccurs="0"/&gt;
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
@XmlType(name = "StockwerksEinheitType", propOrder = {
    "kantonaleUnterartStichwort"
})
public class StockwerksEinheitType
    extends MiteigentumsAnteilType
{

    @XmlElement(name = "KantonaleUnterartStichwort")
    protected StockwerksEinheitKantonaleUnterart kantonaleUnterartStichwort;

    /**
     * Gets the value of the kantonaleUnterartStichwort property.
     * 
     * @return
     *     possible object is
     *     {@link StockwerksEinheitKantonaleUnterart }
     *     
     */
    public StockwerksEinheitKantonaleUnterart getKantonaleUnterartStichwort() {
        return kantonaleUnterartStichwort;
    }

    /**
     * Sets the value of the kantonaleUnterartStichwort property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockwerksEinheitKantonaleUnterart }
     *     
     */
    public void setKantonaleUnterartStichwort(StockwerksEinheitKantonaleUnterart value) {
        this.kantonaleUnterartStichwort = value;
    }

}
