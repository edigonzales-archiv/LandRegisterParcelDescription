
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DokumentArt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DokumentArt"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="Karte"/&gt;
 *     &lt;enumeration value="AndereArt"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DokumentArt")
@XmlEnum
public enum DokumentArt {

    @XmlEnumValue("Karte")
    KARTE("Karte"),
    @XmlEnumValue("AndereArt")
    ANDERE_ART("AndereArt");
    private final String value;

    DokumentArt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DokumentArt fromValue(String v) {
        for (DokumentArt c: DokumentArt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
