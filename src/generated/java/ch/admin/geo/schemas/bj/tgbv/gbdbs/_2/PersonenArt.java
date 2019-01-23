
package ch.admin.geo.schemas.bj.tgbv.gbdbs._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonenArt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonenArt"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="Alle"/&gt;
 *     &lt;enumeration value="NatuerlichePerson"/&gt;
 *     &lt;enumeration value="JuristischePerson"/&gt;
 *     &lt;enumeration value="Gemeinschaft"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PersonenArt")
@XmlEnum
public enum PersonenArt {

    @XmlEnumValue("Alle")
    ALLE("Alle"),
    @XmlEnumValue("NatuerlichePerson")
    NATUERLICHE_PERSON("NatuerlichePerson"),
    @XmlEnumValue("JuristischePerson")
    JURISTISCHE_PERSON("JuristischePerson"),
    @XmlEnumValue("Gemeinschaft")
    GEMEINSCHAFT("Gemeinschaft");
    private final String value;

    PersonenArt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonenArt fromValue(String v) {
        for (PersonenArt c: PersonenArt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
