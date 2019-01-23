
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Geschaeftstyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Geschaeftstyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Berichtigung"/&gt;
 *     &lt;enumeration value="Ersterfassung"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Geschaeftstyp")
@XmlEnum
public enum Geschaeftstyp {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Berichtigung")
    BERICHTIGUNG("Berichtigung"),
    @XmlEnumValue("Ersterfassung")
    ERSTERFASSUNG("Ersterfassung");
    private final String value;

    Geschaeftstyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Geschaeftstyp fromValue(String v) {
        for (Geschaeftstyp c: Geschaeftstyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
