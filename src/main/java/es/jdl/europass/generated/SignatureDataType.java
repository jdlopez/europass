//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.03.10 a las 12:12:10 PM CET 
//


package es.jdl.europass.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains the base-64 encoded bytes of a JPEG or PNG image file that represents the signature an individual.
 * 				Restricts the FileDataType by excluding the Name sub-element and specifying that the MimeType accepts values from the ImageMimeTypeEnumeration.
 * 			
 * 
 * <p>Clase Java para SignatureDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SignatureDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://europass.cedefop.europa.eu/Europass}PhotoDataType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureDataType", namespace = "http://europass.cedefop.europa.eu/Europass")
public class SignatureDataType
    extends PhotoDataType
{


}
