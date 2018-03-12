//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.03.10 a las 12:12:10 PM CET 
//


package es.jdl.europass.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Defines a skill. A Skill has a description and may be accompanied by sutiable documentation.
 *                 Morever a Skill may be acquired during one or more experience periods, and be verified by one or more certificates
 *             
 * 
 * <p>Clase Java para SkillType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SkillType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="ProficiencyLevel" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="AcquiredDuring" type="{http://europass.cedefop.europa.eu/Europass}AbstractExperienceListType" minOccurs="0"/>
 *         &lt;element name="VerifiedBy" type="{http://europass.cedefop.europa.eu/Europass}CertificateListType" minOccurs="0"/>
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
@XmlType(name = "SkillType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "description",
    "proficiencyLevel",
    "acquiredDuring",
    "verifiedBy",
    "documentation"
})
@XmlSeeAlso({
    MotherTongueSkillType.class,
    GenericSkillType.class,
    ForeignLanguageSkillType.class,
    ComputerSkillType.class,
    DrivingSkillType.class
})
public abstract class SkillType {

    @XmlElement(name = "Description", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected Object description;
    @XmlElement(name = "ProficiencyLevel", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected Object proficiencyLevel;
    @XmlElement(name = "AcquiredDuring", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected AbstractExperienceListType acquiredDuring;
    @XmlElement(name = "VerifiedBy", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected CertificateListType verifiedBy;
    @XmlElement(name = "Documentation", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected IntraDocumentDocumentationType documentation;

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDescription(Object value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad proficiencyLevel.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProficiencyLevel() {
        return proficiencyLevel;
    }

    /**
     * Define el valor de la propiedad proficiencyLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProficiencyLevel(Object value) {
        this.proficiencyLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad acquiredDuring.
     * 
     * @return
     *     possible object is
     *     {@link AbstractExperienceListType }
     *     
     */
    public AbstractExperienceListType getAcquiredDuring() {
        return acquiredDuring;
    }

    /**
     * Define el valor de la propiedad acquiredDuring.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractExperienceListType }
     *     
     */
    public void setAcquiredDuring(AbstractExperienceListType value) {
        this.acquiredDuring = value;
    }

    /**
     * Obtiene el valor de la propiedad verifiedBy.
     * 
     * @return
     *     possible object is
     *     {@link CertificateListType }
     *     
     */
    public CertificateListType getVerifiedBy() {
        return verifiedBy;
    }

    /**
     * Define el valor de la propiedad verifiedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateListType }
     *     
     */
    public void setVerifiedBy(CertificateListType value) {
        this.verifiedBy = value;
    }

    /**
     * Obtiene el valor de la propiedad documentation.
     * 
     * @return
     *     possible object is
     *     {@link IntraDocumentDocumentationType }
     *     
     */
    public IntraDocumentDocumentationType getDocumentation() {
        return documentation;
    }

    /**
     * Define el valor de la propiedad documentation.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraDocumentDocumentationType }
     *     
     */
    public void setDocumentation(IntraDocumentDocumentationType value) {
        this.documentation = value;
    }

}
