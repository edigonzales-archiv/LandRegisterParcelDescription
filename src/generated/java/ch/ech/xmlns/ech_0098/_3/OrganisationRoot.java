
package ch.ech.xmlns.ech_0098._3;

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
 *         &lt;element name="reportedOrganisation" type="{http://www.ech.ch/xmlns/eCH-0098/3}reportedOrganisationType"/&gt;
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
    "reportedOrganisation"
})
@XmlRootElement(name = "organisationRoot")
public class OrganisationRoot {

    @XmlElement(required = true)
    protected ReportedOrganisationType reportedOrganisation;

    /**
     * Gets the value of the reportedOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link ReportedOrganisationType }
     *     
     */
    public ReportedOrganisationType getReportedOrganisation() {
        return reportedOrganisation;
    }

    /**
     * Sets the value of the reportedOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportedOrganisationType }
     *     
     */
    public void setReportedOrganisation(ReportedOrganisationType value) {
        this.reportedOrganisation = value;
    }

}
