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
 * <p>Clase Java para InstantMessagingUsesEnumeration.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="InstantMessagingUsesEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="gtalk"/>
 *     &lt;enumeration value="skype"/>
 *     &lt;enumeration value="icq"/>
 *     &lt;enumeration value="aim"/>
 *     &lt;enumeration value="msn"/>
 *     &lt;enumeration value="yahoo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InstantMessagingUsesEnumeration", namespace = "http://europass.cedefop.europa.eu/Europass")
@XmlEnum
public enum InstantMessagingUsesEnumeration {

    @XmlEnumValue("gtalk")
    GTALK("gtalk"),
    @XmlEnumValue("skype")
    SKYPE("skype"),
    @XmlEnumValue("icq")
    ICQ("icq"),
    @XmlEnumValue("aim")
    AIM("aim"),
    @XmlEnumValue("msn")
    MSN("msn"),
    @XmlEnumValue("yahoo")
    YAHOO("yahoo");
    private final String value;

    InstantMessagingUsesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InstantMessagingUsesEnumeration fromValue(String v) {
        for (InstantMessagingUsesEnumeration c: InstantMessagingUsesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
