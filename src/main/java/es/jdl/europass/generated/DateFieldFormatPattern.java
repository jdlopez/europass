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
 * <p>Clase Java para DateFieldFormatPattern.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="DateFieldFormatPattern">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="text/short"/>
 *     &lt;enumeration value="text/long"/>
 *     &lt;enumeration value="text/long/suffix"/>
 *     &lt;enumeration value="text/long/texts"/>
 *     &lt;enumeration value="numeric/long"/>
 *     &lt;enumeration value="numeric/medium"/>
 *     &lt;enumeration value="numeric/short"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DateFieldFormatPattern", namespace = "http://europass.cedefop.europa.eu/Europass")
@XmlEnum
public enum DateFieldFormatPattern {

    @XmlEnumValue("text/short")
    TEXT_SHORT("text/short"),
    @XmlEnumValue("text/long")
    TEXT_LONG("text/long"),
    @XmlEnumValue("text/long/suffix")
    TEXT_LONG_SUFFIX("text/long/suffix"),
    @XmlEnumValue("text/long/texts")
    TEXT_LONG_TEXTS("text/long/texts"),
    @XmlEnumValue("numeric/long")
    NUMERIC_LONG("numeric/long"),
    @XmlEnumValue("numeric/medium")
    NUMERIC_MEDIUM("numeric/medium"),
    @XmlEnumValue("numeric/short")
    NUMERIC_SHORT("numeric/short");
    private final String value;

    DateFieldFormatPattern(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateFieldFormatPattern fromValue(String v) {
        for (DateFieldFormatPattern c: DateFieldFormatPattern.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
