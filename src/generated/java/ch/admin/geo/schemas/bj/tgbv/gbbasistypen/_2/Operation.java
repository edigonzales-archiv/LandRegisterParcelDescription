
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Operation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Operation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="INSERT"/&gt;
 *     &lt;enumeration value="CANCEL"/&gt;
 *     &lt;enumeration value="INSERTCANCEL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Operation")
@XmlEnum
public enum Operation {

    INSERT,
    CANCEL,

    /**
     * nur bei kaskadierenden Mutationen (fuer das Einfuegen von Zustaenden die in der selben Mutation wieder geloescht werden)
     * 
     */
    INSERTCANCEL;

    public String value() {
        return name();
    }

    public static Operation fromValue(String v) {
        return valueOf(v);
    }

}
