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
 * <p>Clase Java para SimpleFieldNames.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SimpleFieldNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LearnerInfo"/>
 *     &lt;enumeration value="LearnerInfo.Identification.PersonName"/>
 *     &lt;enumeration value="LearnerInfo.Identification.Demographics.Birthdate"/>
 *     &lt;enumeration value="LearnerInfo.CEFLanguageLevelsGrid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SimpleFieldNames", namespace = "http://europass.cedefop.europa.eu/Europass")
@XmlEnum
public enum SimpleFieldNames {

    @XmlEnumValue("LearnerInfo")
    LEARNER_INFO("LearnerInfo"),
    @XmlEnumValue("LearnerInfo.Identification.PersonName")
    LEARNER_INFO_IDENTIFICATION_PERSON_NAME("LearnerInfo.Identification.PersonName"),
    @XmlEnumValue("LearnerInfo.Identification.Demographics.Birthdate")
    LEARNER_INFO_IDENTIFICATION_DEMOGRAPHICS_BIRTHDATE("LearnerInfo.Identification.Demographics.Birthdate"),
    @XmlEnumValue("LearnerInfo.CEFLanguageLevelsGrid")
    LEARNER_INFO_CEF_LANGUAGE_LEVELS_GRID("LearnerInfo.CEFLanguageLevelsGrid");
    private final String value;

    SimpleFieldNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SimpleFieldNames fromValue(String v) {
        for (SimpleFieldNames c: SimpleFieldNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
