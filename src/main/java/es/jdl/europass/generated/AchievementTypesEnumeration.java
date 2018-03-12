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
 * <p>Clase Java para AchievementTypesEnumeration.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="AchievementTypesEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="honors_awards"/>
 *     &lt;enumeration value="presentations"/>
 *     &lt;enumeration value="publications"/>
 *     &lt;enumeration value="projects"/>
 *     &lt;enumeration value="citations"/>
 *     &lt;enumeration value="memberships"/>
 *     &lt;enumeration value="conferences"/>
 *     &lt;enumeration value="seminars"/>
 *     &lt;enumeration value="workshops"/>
 *     &lt;enumeration value="references"/>
 *     &lt;enumeration value="signature_equivalent"/>
 *     &lt;enumeration value="courses"/>
 *     &lt;enumeration value="certifications"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AchievementTypesEnumeration", namespace = "http://europass.cedefop.europa.eu/Europass")
@XmlEnum
public enum AchievementTypesEnumeration {

    @XmlEnumValue("honors_awards")
    HONORS_AWARDS("honors_awards"),
    @XmlEnumValue("presentations")
    PRESENTATIONS("presentations"),
    @XmlEnumValue("publications")
    PUBLICATIONS("publications"),
    @XmlEnumValue("projects")
    PROJECTS("projects"),
    @XmlEnumValue("citations")
    CITATIONS("citations"),
    @XmlEnumValue("memberships")
    MEMBERSHIPS("memberships"),
    @XmlEnumValue("conferences")
    CONFERENCES("conferences"),
    @XmlEnumValue("seminars")
    SEMINARS("seminars"),
    @XmlEnumValue("workshops")
    WORKSHOPS("workshops"),
    @XmlEnumValue("references")
    REFERENCES("references"),
    @XmlEnumValue("signature_equivalent")
    SIGNATURE_EQUIVALENT("signature_equivalent"),
    @XmlEnumValue("courses")
    COURSES("courses"),
    @XmlEnumValue("certifications")
    CERTIFICATIONS("certifications");
    private final String value;

    AchievementTypesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AchievementTypesEnumeration fromValue(String v) {
        for (AchievementTypesEnumeration c: AchievementTypesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
