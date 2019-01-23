
package ch.admin.geo.schemas.bj.tgbv.gbdbs._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BerechtigteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BerechtigteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonenRolle" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}PersonenRolle"/&gt;
 *         &lt;element name="BFSNr" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisTypen/2.1}BFSNr" minOccurs="0"/&gt;
 *         &lt;element name="Person" type="{http://schemas.geo.admin.ch/BJ/TGBV/GBBasisId/2.1}PersonId" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://schemas.geo.admin.ch/BJ/TGBV/GBDBS/2.1}extensions" minOccurs="0"/&gt;
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
@XmlType(name = "BerechtigteType", propOrder = {
    "personenRolle",
    "bfsNr",
    "persons",
    "extensions"
})
@XmlRootElement(name = "Berechtigte")
public class Berechtigte {

    @XmlElement(name = "PersonenRolle", required = true)
    @XmlSchemaType(name = "normalizedString")
    protected PersonenRolle personenRolle;
    @XmlElement(name = "BFSNr")
    @XmlSchemaType(name = "integer")
    protected Integer bfsNr;
    @XmlElement(name = "Person", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> persons;
    protected Extensions extensions;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the personenRolle property.
     * 
     * @return
     *     possible object is
     *     {@link PersonenRolle }
     *     
     */
    public PersonenRolle getPersonenRolle() {
        return personenRolle;
    }

    /**
     * Sets the value of the personenRolle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonenRolle }
     *     
     */
    public void setPersonenRolle(PersonenRolle value) {
        this.personenRolle = value;
    }

    /**
     * Gets the value of the bfsNr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBFSNr() {
        return bfsNr;
    }

    /**
     * Sets the value of the bfsNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBFSNr(Integer value) {
        this.bfsNr = value;
    }

    /**
     * Gets the value of the persons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the persons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPersons() {
        if (persons == null) {
            persons = new ArrayList<String>();
        }
        return this.persons;
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
