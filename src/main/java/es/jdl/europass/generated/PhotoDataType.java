//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.03.10 a las 12:12:10 PM CET 
//


package es.jdl.europass.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains the base-64 encoded bytes of a JPEG or PNG image file that represents the personal photo of an individual.
 * 				Restricts the FileDataType by excluding the Name sub-element and specifying that the MimeType accepts values from the ImageMimeTypeEnumeration.
 * 			
 * 
 * <p>Clase Java para PhotoDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PhotoDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://europass.cedefop.europa.eu/Europass}FileDataType">
 *       &lt;sequence>
 *         &lt;element name="MimeType" type="{http://europass.cedefop.europa.eu/Europass}ImageMimeTypeEnumeration"/>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="MetadataList" type="{http://europass.cedefop.europa.eu/Europass}MetadataListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhotoDataType", namespace = "http://europass.cedefop.europa.eu/Europass")
@XmlSeeAlso({
    SignatureDataType.class
})
public class PhotoDataType
    extends FileDataType
{


}
