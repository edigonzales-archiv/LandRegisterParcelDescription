
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DauerndesRechtArt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DauerndesRechtArt"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="Baurecht"/&gt;
 *     &lt;enumeration value="Quellenrecht"/&gt;
 *     &lt;enumeration value="Konzession"/&gt;
 *     &lt;enumeration value="weitere"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DauerndesRechtArt")
@XmlEnum
public enum DauerndesRechtArt {

    @XmlEnumValue("Baurecht")
    BAURECHT("Baurecht"),
    @XmlEnumValue("Quellenrecht")
    QUELLENRECHT("Quellenrecht"),
    @XmlEnumValue("Konzession")
    KONZESSION("Konzession"),
    @XmlEnumValue("weitere")
    WEITERE("weitere");
    private final String value;

    DauerndesRechtArt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DauerndesRechtArt fromValue(String v) {
        for (DauerndesRechtArt c: DauerndesRechtArt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
