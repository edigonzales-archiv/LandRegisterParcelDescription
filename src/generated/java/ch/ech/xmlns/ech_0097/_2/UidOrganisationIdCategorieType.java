
package ch.ech.xmlns.ech_0097._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uidOrganisationIdCategorieType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="uidOrganisationIdCategorieType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="3"/&gt;
 *     &lt;minLength value="3"/&gt;
 *     &lt;enumeration value="CHE"/&gt;
 *     &lt;enumeration value="ADM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "uidOrganisationIdCategorieType")
@XmlEnum
public enum UidOrganisationIdCategorieType {

    CHE,
    ADM;

    public String value() {
        return name();
    }

    public static UidOrganisationIdCategorieType fromValue(String v) {
        return valueOf(v);
    }

}
