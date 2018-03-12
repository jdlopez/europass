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
 * <p>Clase Java para HeadlineTypesEnumeration.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="HeadlineTypesEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="preferred_job"/>
 *     &lt;enumeration value="job_applied_for"/>
 *     &lt;enumeration value="studies_applied_for"/>
 *     &lt;enumeration value="position"/>
 *     &lt;enumeration value="personal_statement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HeadlineTypesEnumeration", namespace = "http://europass.cedefop.europa.eu/Europass")
@XmlEnum
public enum HeadlineTypesEnumeration {

    @XmlEnumValue("preferred_job")
    PREFERRED_JOB("preferred_job"),
    @XmlEnumValue("job_applied_for")
    JOB_APPLIED_FOR("job_applied_for"),
    @XmlEnumValue("studies_applied_for")
    STUDIES_APPLIED_FOR("studies_applied_for"),
    @XmlEnumValue("position")
    POSITION("position"),
    @XmlEnumValue("personal_statement")
    PERSONAL_STATEMENT("personal_statement");
    private final String value;

    HeadlineTypesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeadlineTypesEnumeration fromValue(String v) {
        for (HeadlineTypesEnumeration c: HeadlineTypesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
