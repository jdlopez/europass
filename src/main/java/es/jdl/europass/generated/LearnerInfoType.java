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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Defines a sequence of elements that fully describe a Europass XML document.
 * 			
 * 
 * <p>Clase Java para LearnerInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LearnerInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identification" type="{http://europass.cedefop.europa.eu/Europass}IdentificationType" minOccurs="0"/>
 *         &lt;element name="Headline" type="{http://europass.cedefop.europa.eu/Europass}HeadlineType" minOccurs="0"/>
 *         &lt;element name="WorkExperienceList" type="{http://europass.cedefop.europa.eu/Europass}WorkExperienceListType" minOccurs="0"/>
 *         &lt;element name="EducationList" type="{http://europass.cedefop.europa.eu/Europass}EducationalExperienceListType" minOccurs="0"/>
 *         &lt;element name="Skills" type="{http://europass.cedefop.europa.eu/Europass}SkillSetType" minOccurs="0"/>
 *         &lt;element name="AchievementList" type="{http://europass.cedefop.europa.eu/Europass}AchievementListType" minOccurs="0"/>
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
@XmlType(name = "LearnerInfoType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "identification",
    "headline",
    "workExperienceList",
    "educationList",
    "skills",
    "achievementList",
    "documentation"
})
public class LearnerInfoType {

    @XmlElement(name = "Identification", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected IdentificationType identification;
    @XmlElement(name = "Headline", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected HeadlineType headline;
    @XmlElement(name = "WorkExperienceList", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected WorkExperienceListType workExperienceList;
    @XmlElement(name = "EducationList", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected EducationalExperienceListType educationList;
    @XmlElement(name = "Skills", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected SkillSetType skills;
    @XmlElement(name = "AchievementList", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected AchievementListType achievementList;
    @XmlElement(name = "Documentation", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected IntraDocumentDocumentationType documentation;

    /**
     * Obtiene el valor de la propiedad identification.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType }
     *     
     */
    public IdentificationType getIdentification() {
        return identification;
    }

    /**
     * Define el valor de la propiedad identification.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType }
     *     
     */
    public void setIdentification(IdentificationType value) {
        this.identification = value;
    }

    /**
     * Obtiene el valor de la propiedad headline.
     * 
     * @return
     *     possible object is
     *     {@link HeadlineType }
     *     
     */
    public HeadlineType getHeadline() {
        return headline;
    }

    /**
     * Define el valor de la propiedad headline.
     * 
     * @param value
     *     allowed object is
     *     {@link HeadlineType }
     *     
     */
    public void setHeadline(HeadlineType value) {
        this.headline = value;
    }

    /**
     * Obtiene el valor de la propiedad workExperienceList.
     * 
     * @return
     *     possible object is
     *     {@link WorkExperienceListType }
     *     
     */
    public WorkExperienceListType getWorkExperienceList() {
        return workExperienceList;
    }

    /**
     * Define el valor de la propiedad workExperienceList.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkExperienceListType }
     *     
     */
    public void setWorkExperienceList(WorkExperienceListType value) {
        this.workExperienceList = value;
    }

    /**
     * Obtiene el valor de la propiedad educationList.
     * 
     * @return
     *     possible object is
     *     {@link EducationalExperienceListType }
     *     
     */
    public EducationalExperienceListType getEducationList() {
        return educationList;
    }

    /**
     * Define el valor de la propiedad educationList.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationalExperienceListType }
     *     
     */
    public void setEducationList(EducationalExperienceListType value) {
        this.educationList = value;
    }

    /**
     * Obtiene el valor de la propiedad skills.
     * 
     * @return
     *     possible object is
     *     {@link SkillSetType }
     *     
     */
    public SkillSetType getSkills() {
        return skills;
    }

    /**
     * Define el valor de la propiedad skills.
     * 
     * @param value
     *     allowed object is
     *     {@link SkillSetType }
     *     
     */
    public void setSkills(SkillSetType value) {
        this.skills = value;
    }

    /**
     * Obtiene el valor de la propiedad achievementList.
     * 
     * @return
     *     possible object is
     *     {@link AchievementListType }
     *     
     */
    public AchievementListType getAchievementList() {
        return achievementList;
    }

    /**
     * Define el valor de la propiedad achievementList.
     * 
     * @param value
     *     allowed object is
     *     {@link AchievementListType }
     *     
     */
    public void setAchievementList(AchievementListType value) {
        this.achievementList = value;
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
