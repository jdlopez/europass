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
 * <p>Clase Java para CoverLetterFieldNames.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="CoverLetterFieldNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CoverLetter"/>
 *     &lt;enumeration value="CoverLetter.Addressee"/>
 *     &lt;enumeration value="CoverLetter.Addressee.PersonName"/>
 *     &lt;enumeration value="CoverLetter.Letter.Localisation"/>
 *     &lt;enumeration value="CoverLetter.Letter.Localisation.Date"/>
 *     &lt;enumeration value="CoverLetter.Letter.ClosingSalutation"/>
 *     &lt;enumeration value="CoverLetter.Justification"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CoverLetterFieldNames", namespace = "http://europass.cedefop.europa.eu/Europass")
@XmlEnum
public enum CoverLetterFieldNames {

    @XmlEnumValue("CoverLetter")
    COVER_LETTER("CoverLetter"),
    @XmlEnumValue("CoverLetter.Addressee")
    COVER_LETTER_ADDRESSEE("CoverLetter.Addressee"),
    @XmlEnumValue("CoverLetter.Addressee.PersonName")
    COVER_LETTER_ADDRESSEE_PERSON_NAME("CoverLetter.Addressee.PersonName"),
    @XmlEnumValue("CoverLetter.Letter.Localisation")
    COVER_LETTER_LETTER_LOCALISATION("CoverLetter.Letter.Localisation"),
    @XmlEnumValue("CoverLetter.Letter.Localisation.Date")
    COVER_LETTER_LETTER_LOCALISATION_DATE("CoverLetter.Letter.Localisation.Date"),
    @XmlEnumValue("CoverLetter.Letter.ClosingSalutation")
    COVER_LETTER_LETTER_CLOSING_SALUTATION("CoverLetter.Letter.ClosingSalutation"),
    @XmlEnumValue("CoverLetter.Justification")
    COVER_LETTER_JUSTIFICATION("CoverLetter.Justification");
    private final String value;

    CoverLetterFieldNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CoverLetterFieldNames fromValue(String v) {
        for (CoverLetterFieldNames c: CoverLetterFieldNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
