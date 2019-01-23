
package ch.admin.geo.schemas.bj.tgbv.gbdbs._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonenRolle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonenRolle"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="Alle"/&gt;
 *     &lt;enumeration value="Eigentum"/&gt;
 *     &lt;enumeration value="Glaeubiger"/&gt;
 *     &lt;enumeration value="Dienstbarkeit"/&gt;
 *     &lt;enumeration value="Grundlast"/&gt;
 *     &lt;enumeration value="Vormerkung"/&gt;
 *     &lt;enumeration value="Anmerkung"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PersonenRolle")
@XmlEnum
public enum PersonenRolle {

    @XmlEnumValue("Alle")
    ALLE("Alle"),
    @XmlEnumValue("Eigentum")
    EIGENTUM("Eigentum"),
    @XmlEnumValue("Glaeubiger")
    GLAEUBIGER("Glaeubiger"),
    @XmlEnumValue("Dienstbarkeit")
    DIENSTBARKEIT("Dienstbarkeit"),
    @XmlEnumValue("Grundlast")
    GRUNDLAST("Grundlast"),
    @XmlEnumValue("Vormerkung")
    VORMERKUNG("Vormerkung"),
    @XmlEnumValue("Anmerkung")
    ANMERKUNG("Anmerkung");
    private final String value;

    PersonenRolle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonenRolle fromValue(String v) {
        for (PersonenRolle c: PersonenRolle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
