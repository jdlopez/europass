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
 * <p>Clase Java para OrderNames.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FirstName Surname"/>
 *     &lt;enumeration value="Surname FirstName"/>
 *     &lt;enumeration value="Title FirstName Surname"/>
 *     &lt;enumeration value="Title Surname FirstName"/>
 *     &lt;enumeration value="FirstName Surname Title"/>
 *     &lt;enumeration value="Surname FirstName Title"/>
 *     &lt;enumeration value="Identification Headline WorkExperience Education Skills Achievement ReferenceTo"/>
 *     &lt;enumeration value="Identification Headline Education WorkExperience Skills Achievement ReferenceTo"/>
 *     &lt;enumeration value="Identification Skills ReferenceTo"/>
 *     &lt;enumeration value="Addressee Letter.SubjectLine Letter.OpeningSalutation Letter.Body Letter.Localisation Letter.ClosingSalutation"/>
 *     &lt;enumeration value="Letter.SubjectLine Addressee Letter.OpeningSalutation Letter.Body Letter.Localisation Letter.ClosingSalutation"/>
 *     &lt;enumeration value="Letter.Localisation Addressee Letter.SubjectLine Letter.OpeningSalutation Letter.Body Letter.ClosingSalutation"/>
 *     &lt;enumeration value="Letter.SubjectLine Addressee Letter.Localisation Letter.OpeningSalutation Letter.Body Letter.ClosingSalutation"/>
 *     &lt;enumeration value="Letter.Localisation Letter.SubjectLine Addressee Letter.OpeningSalutation Letter.Body Letter.ClosingSalutation"/>
 *     &lt;enumeration value="Addressee Letter.Localisation Letter.SubjectLine Letter.OpeningSalutation Letter.Body Letter.ClosingSalutation"/>
 *     &lt;enumeration value="Addressee Letter.SubjectLine Letter.Localisation Letter.OpeningSalutation Letter.Body Letter.ClosingSalutation"/>
 *     &lt;enumeration value="Date Place"/>
 *     &lt;enumeration value="Place Date"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderNames", namespace = "http://europass.cedefop.europa.eu/Europass")
@XmlEnum
public enum OrderNames {

    @XmlEnumValue("FirstName Surname")
    FIRST_NAME_SURNAME("FirstName Surname"),
    @XmlEnumValue("Surname FirstName")
    SURNAME_FIRST_NAME("Surname FirstName"),
    @XmlEnumValue("Title FirstName Surname")
    TITLE_FIRST_NAME_SURNAME("Title FirstName Surname"),
    @XmlEnumValue("Title Surname FirstName")
    TITLE_SURNAME_FIRST_NAME("Title Surname FirstName"),
    @XmlEnumValue("FirstName Surname Title")
    FIRST_NAME_SURNAME_TITLE("FirstName Surname Title"),
    @XmlEnumValue("Surname FirstName Title")
    SURNAME_FIRST_NAME_TITLE("Surname FirstName Title"),
    @XmlEnumValue("Identification Headline WorkExperience Education Skills Achievement ReferenceTo")
    IDENTIFICATION_HEADLINE_WORK_EXPERIENCE_EDUCATION_SKILLS_ACHIEVEMENT_REFERENCE_TO("Identification Headline WorkExperience Education Skills Achievement ReferenceTo"),
    @XmlEnumValue("Identification Headline Education WorkExperience Skills Achievement ReferenceTo")
    IDENTIFICATION_HEADLINE_EDUCATION_WORK_EXPERIENCE_SKILLS_ACHIEVEMENT_REFERENCE_TO("Identification Headline Education WorkExperience Skills Achievement ReferenceTo"),
    @XmlEnumValue("Identification Skills ReferenceTo")
    IDENTIFICATION_SKILLS_REFERENCE_TO("Identification Skills ReferenceTo"),
    @XmlEnumValue("Addressee Letter.SubjectLine Letter.OpeningSalutation Letter.Body Letter.Localisation Letter.ClosingSalutation")
    ADDRESSEE_LETTER_SUBJECT_LINE_LETTER_OPENING_SALUTATION_LETTER_BODY_LETTER_LOCALISATION_LETTER_CLOSING_SALUTATION("Addressee Letter.SubjectLine Letter.OpeningSalutation Letter.Body Letter.Localisation Letter.ClosingSalutation"),
    @XmlEnumValue("Letter.SubjectLine Addressee Letter.OpeningSalutation Letter.Body Letter.Localisation Letter.ClosingSalutation")
    LETTER_SUBJECT_LINE_ADDRESSEE_LETTER_OPENING_SALUTATION_LETTER_BODY_LETTER_LOCALISATION_LETTER_CLOSING_SALUTATION("Letter.SubjectLine Addressee Letter.OpeningSalutation Letter.Body Letter.Localisation Letter.ClosingSalutation"),
    @XmlEnumValue("Letter.Localisation Addressee Letter.SubjectLine Letter.OpeningSalutation Letter.Body Letter.ClosingSalutation")
    LETTER_LOCALISATION_ADDRESSEE_LETTER_SUBJECT_LINE_LETTER_OPENING_SALUTATION_LETTER_BODY_LETTER_CLOSING_SALUTATION("Letter.Localisation Addressee Letter.SubjectLine Letter.OpeningSalutation Letter.Body Letter.ClosingSalutation"),
    @XmlEnumValue("Letter.SubjectLine Addressee Letter.Localisation Letter.OpeningSalutation Letter.Body Letter.ClosingSalutation")
    LETTER_SUBJECT_LINE_ADDRESSEE_LETTER_LOCALISATION_LETTER_OPENING_SALUTATION_LETTER_BODY_LETTER_CLOSING_SALUTATION("Letter.SubjectLine Addressee Letter.Localisation Letter.OpeningSalutation Letter.Body Letter.ClosingSalutation"),
    @XmlEnumValue("Letter.Localisation Letter.SubjectLine Addressee Letter.OpeningSalutation Letter.Body Letter.ClosingSalutation")
    LETTER_LOCALISATION_LETTER_SUBJECT_LINE_ADDRESSEE_LETTER_OPENING_SALUTATION_LETTER_BODY_LETTER_CLOSING_SALUTATION("Letter.Localisation Letter.SubjectLine Addressee Letter.OpeningSalutation Letter.Body Letter.ClosingSalutation"),
    @XmlEnumValue("Addressee Letter.Localisation Letter.SubjectLine Letter.OpeningSalutation Letter.Body Letter.ClosingSalutation")
    ADDRESSEE_LETTER_LOCALISATION_LETTER_SUBJECT_LINE_LETTER_OPENING_SALUTATION_LETTER_BODY_LETTER_CLOSING_SALUTATION("Addressee Letter.Localisation Letter.SubjectLine Letter.OpeningSalutation Letter.Body Letter.ClosingSalutation"),
    @XmlEnumValue("Addressee Letter.SubjectLine Letter.Localisation Letter.OpeningSalutation Letter.Body Letter.ClosingSalutation")
    ADDRESSEE_LETTER_SUBJECT_LINE_LETTER_LOCALISATION_LETTER_OPENING_SALUTATION_LETTER_BODY_LETTER_CLOSING_SALUTATION("Addressee Letter.SubjectLine Letter.Localisation Letter.OpeningSalutation Letter.Body Letter.ClosingSalutation"),
    @XmlEnumValue("Date Place")
    DATE_PLACE("Date Place"),
    @XmlEnumValue("Place Date")
    PLACE_DATE("Place Date");
    private final String value;

    OrderNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderNames fromValue(String v) {
        for (OrderNames c: OrderNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
