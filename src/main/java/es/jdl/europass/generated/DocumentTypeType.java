//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.03.10 a las 12:12:10 PM CET 
//


package es.jdl.europass.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DocumentTypeType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ECV_ESP"/>
 *     &lt;enumeration value="ESP"/>
 *     &lt;enumeration value="ECV"/>
 *     &lt;enumeration value="ELP"/>
 *     &lt;enumeration value="ECL"/>
 *     &lt;enumeration value="EX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentTypeType", namespace = "http://europass.cedefop.europa.eu/Europass")
@XmlEnum
public enum DocumentTypeType {

    ECV_ESP,
    ESP,
    ECV,
    ELP,
    ECL,
    EX;

    public String value() {
        return name();
    }

    public static DocumentTypeType fromValue(String v) {
        return valueOf(v);
    }

}
