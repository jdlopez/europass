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
 * <p>Clase Java para MimeTypeEnumeration.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="MimeTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="image/jpeg"/>
 *     &lt;enumeration value="image/pjpeg"/>
 *     &lt;enumeration value="image/png"/>
 *     &lt;enumeration value="image/x-png"/>
 *     &lt;enumeration value="application/pdf"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MimeTypeEnumeration", namespace = "http://europass.cedefop.europa.eu/Europass")
@XmlEnum
public enum MimeTypeEnumeration {

    @XmlEnumValue("image/jpeg")
    IMAGE_JPEG("image/jpeg"),
    @XmlEnumValue("image/pjpeg")
    IMAGE_PJPEG("image/pjpeg"),
    @XmlEnumValue("image/png")
    IMAGE_PNG("image/png"),
    @XmlEnumValue("image/x-png")
    IMAGE_X_PNG("image/x-png"),
    @XmlEnumValue("application/pdf")
    APPLICATION_PDF("application/pdf");
    private final String value;

    MimeTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MimeTypeEnumeration fromValue(String v) {
        for (MimeTypeEnumeration c: MimeTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
