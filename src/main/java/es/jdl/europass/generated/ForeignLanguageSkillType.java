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
 *                 Restricts the generic skill type by specifying the data type of the elements that describe the level of knowledge of the language and related linguistic diplomas and/or experiences. 
 *             
 * 
 * <p>Clase Java para ForeignLanguageSkillType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ForeignLanguageSkillType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://europass.cedefop.europa.eu/Europass}SkillType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://europass.cedefop.europa.eu/Europass}ForeignLanguageType" minOccurs="0"/>
 *         &lt;element name="ProficiencyLevel" type="{http://europass.cedefop.europa.eu/Europass}ProficiencyLevelType" minOccurs="0"/>
 *         &lt;element name="AcquiredDuring" type="{http://europass.cedefop.europa.eu/Europass}LinguisticExperienceListType" minOccurs="0"/>
 *         &lt;element name="VerifiedBy" type="{http://europass.cedefop.europa.eu/Europass}LinguisticCertificateListType" minOccurs="0"/>
 *         &lt;element name="Documentation" type="{http://europass.cedefop.europa.eu/Europass}IntraDocumentDocumentationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignLanguageSkillType", namespace = "http://europass.cedefop.europa.eu/Europass")
public class ForeignLanguageSkillType
    extends SkillType
{


}
