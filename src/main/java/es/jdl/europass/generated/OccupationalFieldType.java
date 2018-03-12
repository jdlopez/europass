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
 * 				Defines an occupational field. The occupational field is described by a code and a label. E.g. code: 41150, label: Secretary.
 * 			
 * 
 * <p>Clase Java para OccupationalFieldType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OccupationalFieldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://europass.cedefop.europa.eu/Europass}LabelType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://europass.cedefop.europa.eu/Europass}isco88com-level5" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OccupationalFieldType", namespace = "http://europass.cedefop.europa.eu/Europass")
public class OccupationalFieldType
    extends LabelType
{


}
