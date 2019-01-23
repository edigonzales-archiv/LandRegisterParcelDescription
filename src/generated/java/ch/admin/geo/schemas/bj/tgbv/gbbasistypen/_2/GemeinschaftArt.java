
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GemeinschaftArt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GemeinschaftArt"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="EinfacheGesellschaft"/&gt;
 *     &lt;enumeration value="Guetergemeinschaft"/&gt;
 *     &lt;enumeration value="Erbengemeinschaft"/&gt;
 *     &lt;enumeration value="Gemeinderschaft"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GemeinschaftArt")
@XmlEnum
public enum GemeinschaftArt {

    @XmlEnumValue("EinfacheGesellschaft")
    EINFACHE_GESELLSCHAFT("EinfacheGesellschaft"),
    @XmlEnumValue("Guetergemeinschaft")
    GUETERGEMEINSCHAFT("Guetergemeinschaft"),
    @XmlEnumValue("Erbengemeinschaft")
    ERBENGEMEINSCHAFT("Erbengemeinschaft"),
    @XmlEnumValue("Gemeinderschaft")
    GEMEINDERSCHAFT("Gemeinderschaft");
    private final String value;

    GemeinschaftArt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GemeinschaftArt fromValue(String v) {
        for (GemeinschaftArt c: GemeinschaftArt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
