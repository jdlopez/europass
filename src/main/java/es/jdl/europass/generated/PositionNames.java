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
 * <p>Clase Java para PositionNames.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PositionNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="left-align"/>
 *     &lt;enumeration value="right-align"/>
 *     &lt;enumeration value="middle-align"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PositionNames", namespace = "http://europass.cedefop.europa.eu/Europass")
@XmlEnum
public enum PositionNames {

    @XmlEnumValue("left-align")
    LEFT_ALIGN("left-align"),
    @XmlEnumValue("right-align")
    RIGHT_ALIGN("right-align"),
    @XmlEnumValue("middle-align")
    MIDDLE_ALIGN("middle-align");
    private final String value;

    PositionNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionNames fromValue(String v) {
        for (PositionNames c: PositionNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
