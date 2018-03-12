//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.03.10 a las 12:12:10 PM CET 
//


package es.jdl.europass.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para drivinglicence.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="drivinglicence">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="A1"/>
 *     &lt;enumeration value="A2"/>
 *     &lt;enumeration value="AM"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="B1"/>
 *     &lt;enumeration value="BE"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="C1"/>
 *     &lt;enumeration value="C1E"/>
 *     &lt;enumeration value="CE"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="D1"/>
 *     &lt;enumeration value="D1E"/>
 *     &lt;enumeration value="DE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "drivinglicence", namespace = "http://europass.cedefop.europa.eu/EUDriving")
@XmlEnum
public enum Drivinglicence {

    A("A"),
    @XmlEnumValue("A1")
    A_1("A1"),
    @XmlEnumValue("A2")
    A_2("A2"),
    AM("AM"),
    B("B"),
    @XmlEnumValue("B1")
    B_1("B1"),
    BE("BE"),
    C("C"),
    @XmlEnumValue("C1")
    C_1("C1"),
    @XmlEnumValue("C1E")
    C_1_E("C1E"),
    CE("CE"),
    D("D"),
    @XmlEnumValue("D1")
    D_1("D1"),
    @XmlEnumValue("D1E")
    D_1_E("D1E"),
    DE("DE");
    private final String value;

    Drivinglicence(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Drivinglicence fromValue(String v) {
        for (Drivinglicence c: Drivinglicence.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
