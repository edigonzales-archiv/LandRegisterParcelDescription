
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrundpfandrechtArt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GrundpfandrechtArt"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="NamenSchuldbrief"/&gt;
 *     &lt;enumeration value="InhaberSchuldbrief"/&gt;
 *     &lt;enumeration value="NamenGuelt"/&gt;
 *     &lt;enumeration value="InhaberGuelt"/&gt;
 *     &lt;enumeration value="KapitalGrundpfandverschreibung"/&gt;
 *     &lt;enumeration value="MaximalGrundpfandverschreibung"/&gt;
 *     &lt;enumeration value="Altrechtlich"/&gt;
 *     &lt;enumeration value="vorbehaltenerVorgang"/&gt;
 *     &lt;enumeration value="leerePfandstelle"/&gt;
 *     &lt;enumeration value="GrundpfandverschreibungAlsInhaberobligation"/&gt;
 *     &lt;enumeration value="RegisterPfand"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GrundpfandrechtArt")
@XmlEnum
public enum GrundpfandrechtArt {

    @XmlEnumValue("NamenSchuldbrief")
    NAMEN_SCHULDBRIEF("NamenSchuldbrief"),
    @XmlEnumValue("InhaberSchuldbrief")
    INHABER_SCHULDBRIEF("InhaberSchuldbrief"),
    @XmlEnumValue("NamenGuelt")
    NAMEN_GUELT("NamenGuelt"),
    @XmlEnumValue("InhaberGuelt")
    INHABER_GUELT("InhaberGuelt"),
    @XmlEnumValue("KapitalGrundpfandverschreibung")
    KAPITAL_GRUNDPFANDVERSCHREIBUNG("KapitalGrundpfandverschreibung"),
    @XmlEnumValue("MaximalGrundpfandverschreibung")
    MAXIMAL_GRUNDPFANDVERSCHREIBUNG("MaximalGrundpfandverschreibung"),
    @XmlEnumValue("Altrechtlich")
    ALTRECHTLICH("Altrechtlich"),
    @XmlEnumValue("vorbehaltenerVorgang")
    VORBEHALTENER_VORGANG("vorbehaltenerVorgang"),
    @XmlEnumValue("leerePfandstelle")
    LEERE_PFANDSTELLE("leerePfandstelle"),
    @XmlEnumValue("GrundpfandverschreibungAlsInhaberobligation")
    GRUNDPFANDVERSCHREIBUNG_ALS_INHABEROBLIGATION("GrundpfandverschreibungAlsInhaberobligation"),
    @XmlEnumValue("RegisterPfand")
    REGISTER_PFAND("RegisterPfand");
    private final String value;

    GrundpfandrechtArt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GrundpfandrechtArt fromValue(String v) {
        for (GrundpfandrechtArt c: GrundpfandrechtArt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
