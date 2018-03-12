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
 * <p>Clase Java para PersonTitleCodesEnumeration.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonTitleCodesEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="mr"/>
 *     &lt;enumeration value="ms"/>
 *     &lt;enumeration value="mrs"/>
 *     &lt;enumeration value="miss"/>
 *     &lt;enumeration value="dr"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonTitleCodesEnumeration", namespace = "http://europass.cedefop.europa.eu/Europass")
@XmlEnum
public enum PersonTitleCodesEnumeration {

    @XmlEnumValue("mr")
    MR("mr"),
    @XmlEnumValue("ms")
    MS("ms"),
    @XmlEnumValue("mrs")
    MRS("mrs"),
    @XmlEnumValue("miss")
    MISS("miss"),
    @XmlEnumValue("dr")
    DR("dr");
    private final String value;

    PersonTitleCodesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonTitleCodesEnumeration fromValue(String v) {
        for (PersonTitleCodesEnumeration c: PersonTitleCodesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
