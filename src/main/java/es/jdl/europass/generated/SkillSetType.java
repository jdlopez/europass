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
 * 				Contains a sequence of skills and competences that the learner has acquired during any formal or informal experience.
 * 			
 * 
 * <p>Clase Java para SkillSetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SkillSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Linguistic" type="{http://europass.cedefop.europa.eu/Europass}LinguisticSkillType" minOccurs="0"/>
 *         &lt;element name="Communication" type="{http://europass.cedefop.europa.eu/Europass}GenericSkillType" minOccurs="0"/>
 *         &lt;element name="Organisational" type="{http://europass.cedefop.europa.eu/Europass}GenericSkillType" minOccurs="0"/>
 *         &lt;element name="JobRelated" type="{http://europass.cedefop.europa.eu/Europass}GenericSkillType" minOccurs="0"/>
 *         &lt;element name="Computer" type="{http://europass.cedefop.europa.eu/Europass}ComputerSkillType" minOccurs="0"/>
 *         &lt;element name="Driving" type="{http://europass.cedefop.europa.eu/Europass}DrivingSkillType" minOccurs="0"/>
 *         &lt;element name="Other" type="{http://europass.cedefop.europa.eu/Europass}GenericSkillType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SkillSetType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "linguistic",
    "communication",
    "organisational",
    "jobRelated",
    "computer",
    "driving",
    "other"
})
public class SkillSetType {

    @XmlElement(name = "Linguistic", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected LinguisticSkillType linguistic;
    @XmlElement(name = "Communication", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected GenericSkillType communication;
    @XmlElement(name = "Organisational", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected GenericSkillType organisational;
    @XmlElement(name = "JobRelated", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected GenericSkillType jobRelated;
    @XmlElement(name = "Computer", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected ComputerSkillType computer;
    @XmlElement(name = "Driving", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected DrivingSkillType driving;
    @XmlElement(name = "Other", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected GenericSkillType other;

    /**
     * Obtiene el valor de la propiedad linguistic.
     * 
     * @return
     *     possible object is
     *     {@link LinguisticSkillType }
     *     
     */
    public LinguisticSkillType getLinguistic() {
        return linguistic;
    }

    /**
     * Define el valor de la propiedad linguistic.
     * 
     * @param value
     *     allowed object is
     *     {@link LinguisticSkillType }
     *     
     */
    public void setLinguistic(LinguisticSkillType value) {
        this.linguistic = value;
    }

    /**
     * Obtiene el valor de la propiedad communication.
     * 
     * @return
     *     possible object is
     *     {@link GenericSkillType }
     *     
     */
    public GenericSkillType getCommunication() {
        return communication;
    }

    /**
     * Define el valor de la propiedad communication.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericSkillType }
     *     
     */
    public void setCommunication(GenericSkillType value) {
        this.communication = value;
    }

    /**
     * Obtiene el valor de la propiedad organisational.
     * 
     * @return
     *     possible object is
     *     {@link GenericSkillType }
     *     
     */
    public GenericSkillType getOrganisational() {
        return organisational;
    }

    /**
     * Define el valor de la propiedad organisational.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericSkillType }
     *     
     */
    public void setOrganisational(GenericSkillType value) {
        this.organisational = value;
    }

    /**
     * Obtiene el valor de la propiedad jobRelated.
     * 
     * @return
     *     possible object is
     *     {@link GenericSkillType }
     *     
     */
    public GenericSkillType getJobRelated() {
        return jobRelated;
    }

    /**
     * Define el valor de la propiedad jobRelated.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericSkillType }
     *     
     */
    public void setJobRelated(GenericSkillType value) {
        this.jobRelated = value;
    }

    /**
     * Obtiene el valor de la propiedad computer.
     * 
     * @return
     *     possible object is
     *     {@link ComputerSkillType }
     *     
     */
    public ComputerSkillType getComputer() {
        return computer;
    }

    /**
     * Define el valor de la propiedad computer.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputerSkillType }
     *     
     */
    public void setComputer(ComputerSkillType value) {
        this.computer = value;
    }

    /**
     * Obtiene el valor de la propiedad driving.
     * 
     * @return
     *     possible object is
     *     {@link DrivingSkillType }
     *     
     */
    public DrivingSkillType getDriving() {
        return driving;
    }

    /**
     * Define el valor de la propiedad driving.
     * 
     * @param value
     *     allowed object is
     *     {@link DrivingSkillType }
     *     
     */
    public void setDriving(DrivingSkillType value) {
        this.driving = value;
    }

    /**
     * Obtiene el valor de la propiedad other.
     * 
     * @return
     *     possible object is
     *     {@link GenericSkillType }
     *     
     */
    public GenericSkillType getOther() {
        return other;
    }

    /**
     * Define el valor de la propiedad other.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericSkillType }
     *     
     */
    public void setOther(GenericSkillType value) {
        this.other = value;
    }

}
