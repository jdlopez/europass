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
 * <p>Clase Java para ImageMimeTypeEnumeration.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageMimeTypeEnumeration">
 *   &lt;restriction base="{http://europass.cedefop.europa.eu/Europass}MimeTypeEnumeration">
 *     &lt;enumeration value="image/jpeg"/>
 *     &lt;enumeration value="image/pjpeg"/>
 *     &lt;enumeration value="image/png"/>
 *     &lt;enumeration value="image/x-png"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImageMimeTypeEnumeration", namespace = "http://europass.cedefop.europa.eu/Europass")
@XmlEnum(MimeTypeEnumeration.class)
public enum ImageMimeTypeEnumeration {

    @XmlEnumValue("image/jpeg")
    IMAGE_JPEG(MimeTypeEnumeration.IMAGE_JPEG),
    @XmlEnumValue("image/pjpeg")
    IMAGE_PJPEG(MimeTypeEnumeration.IMAGE_PJPEG),
    @XmlEnumValue("image/png")
    IMAGE_PNG(MimeTypeEnumeration.IMAGE_PNG),
    @XmlEnumValue("image/x-png")
    IMAGE_X_PNG(MimeTypeEnumeration.IMAGE_X_PNG);
    private final MimeTypeEnumeration value;

    ImageMimeTypeEnumeration(MimeTypeEnumeration v) {
        value = v;
    }

    public MimeTypeEnumeration value() {
        return value;
    }

    public static ImageMimeTypeEnumeration fromValue(MimeTypeEnumeration v) {
        for (ImageMimeTypeEnumeration c: ImageMimeTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
