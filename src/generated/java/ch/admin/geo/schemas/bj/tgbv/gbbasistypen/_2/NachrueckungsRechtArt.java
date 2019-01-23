
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NachrueckungsRechtArt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NachrueckungsRechtArt"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="schiebend"/&gt;
 *     &lt;enumeration value="springend"/&gt;
 *     &lt;enumeration value="inDenNebenrang"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NachrueckungsRechtArt")
@XmlEnum
public enum NachrueckungsRechtArt {

    @XmlEnumValue("schiebend")
    SCHIEBEND("schiebend"),
    @XmlEnumValue("springend")
    SPRINGEND("springend"),
    @XmlEnumValue("inDenNebenrang")
    IN_DEN_NEBENRANG("inDenNebenrang");
    private final String value;

    NachrueckungsRechtArt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NachrueckungsRechtArt fromValue(String v) {
        for (NachrueckungsRechtArt c: NachrueckungsRechtArt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
