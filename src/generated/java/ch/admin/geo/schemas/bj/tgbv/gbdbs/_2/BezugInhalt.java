
package ch.admin.geo.schemas.bj.tgbv.gbdbs._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BezugInhalt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BezugInhalt"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="Index"/&gt;
 *     &lt;enumeration value="IndexMitEigentum"/&gt;
 *     &lt;enumeration value="Oeffentlich"/&gt;
 *     &lt;enumeration value="Vollstaendig"/&gt;
 *     &lt;enumeration value="Datenbezug"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BezugInhalt")
@XmlEnum
public enum BezugInhalt {

    @XmlEnumValue("Index")
    INDEX("Index"),
    @XmlEnumValue("IndexMitEigentum")
    INDEX_MIT_EIGENTUM("IndexMitEigentum"),
    @XmlEnumValue("Oeffentlich")
    OEFFENTLICH("Oeffentlich"),
    @XmlEnumValue("Vollstaendig")
    VOLLSTAENDIG("Vollstaendig"),
    @XmlEnumValue("Datenbezug")
    DATENBEZUG("Datenbezug");
    private final String value;

    BezugInhalt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BezugInhalt fromValue(String v) {
        for (BezugInhalt c: BezugInhalt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
