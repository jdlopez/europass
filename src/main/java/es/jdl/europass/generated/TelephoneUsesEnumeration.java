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
 * <p>Clase Java para TelephoneUsesEnumeration.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TelephoneUsesEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="home"/>
 *     &lt;enumeration value="work"/>
 *     &lt;enumeration value="mobile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TelephoneUsesEnumeration", namespace = "http://europass.cedefop.europa.eu/Europass")
@XmlEnum
public enum TelephoneUsesEnumeration {

    @XmlEnumValue("home")
    HOME("home"),
    @XmlEnumValue("work")
    WORK("work"),
    @XmlEnumValue("mobile")
    MOBILE("mobile");
    private final String value;

    TelephoneUsesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelephoneUsesEnumeration fromValue(String v) {
        for (TelephoneUsesEnumeration c: TelephoneUsesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
