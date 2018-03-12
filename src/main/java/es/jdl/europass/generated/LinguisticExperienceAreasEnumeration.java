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
 * <p>Clase Java para LinguisticExperienceAreasEnumeration.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="LinguisticExperienceAreasEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="studying_training_language"/>
 *     &lt;enumeration value="work_language"/>
 *     &lt;enumeration value="living_traveling_language"/>
 *     &lt;enumeration value="mediating_groups_language"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LinguisticExperienceAreasEnumeration", namespace = "http://europass.cedefop.europa.eu/Europass")
@XmlEnum
public enum LinguisticExperienceAreasEnumeration {

    @XmlEnumValue("studying_training_language")
    STUDYING_TRAINING_LANGUAGE("studying_training_language"),
    @XmlEnumValue("work_language")
    WORK_LANGUAGE("work_language"),
    @XmlEnumValue("living_traveling_language")
    LIVING_TRAVELING_LANGUAGE("living_traveling_language"),
    @XmlEnumValue("mediating_groups_language")
    MEDIATING_GROUPS_LANGUAGE("mediating_groups_language");
    private final String value;

    LinguisticExperienceAreasEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinguisticExperienceAreasEnumeration fromValue(String v) {
        for (LinguisticExperienceAreasEnumeration c: LinguisticExperienceAreasEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
