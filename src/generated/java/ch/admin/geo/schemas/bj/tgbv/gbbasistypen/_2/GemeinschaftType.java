
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GemeinschaftType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GemeinschaftType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}PersonGBType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mitglieder" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}PersonRefBegruendet" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "GemeinschaftType", propOrder = {
    "mitglieders"
})
public class GemeinschaftType
    extends PersonGBType
{

    @XmlElement(name = "Mitglieder")
    protected List<PersonRefBegruendet> mitglieders;

    /**
     * Gets the value of the mitglieders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mitglieders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMitglieders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonRefBegruendet }
     * 
     * 
     */
    public List<PersonRefBegruendet> getMitglieders() {
        if (mitglieders == null) {
            mitglieders = new ArrayList<PersonRefBegruendet>();
        }
        return this.mitglieders;
    }

}
