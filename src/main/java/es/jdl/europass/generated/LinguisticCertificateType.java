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
 *                 Defines a Linguistic Certificate by restricting the allowed type for the level element to be "CEFLanguageLevel"
 *             
 * 
 * <p>Clase Java para LinguisticCertificateType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LinguisticCertificateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://europass.cedefop.europa.eu/Europass}CertificateType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AwardingBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://europass.cedefop.europa.eu/Europass}DateType" minOccurs="0"/>
 *         &lt;element name="Level" type="{http://europass.cedefop.europa.eu/Europass}CEFLanguageLevelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinguisticCertificateType", namespace = "http://europass.cedefop.europa.eu/Europass")
public class LinguisticCertificateType
    extends CertificateType
{


}
