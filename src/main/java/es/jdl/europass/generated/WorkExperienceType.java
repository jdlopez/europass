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
 *                 Extends the generic ExperienceType to include information about a work experience. 
 *                 Contains information about the period the experience took place and the title of the position, as well as the activities/ tasks and information of the employer. 
 *             
 * 
 * <p>Clase Java para WorkExperienceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WorkExperienceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://europass.cedefop.europa.eu/Europass}ExperienceType">
 *       &lt;sequence>
 *         &lt;element name="Position" type="{http://europass.cedefop.europa.eu/Europass}OccupationalFieldType" minOccurs="0"/>
 *         &lt;element name="Activities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Employer" type="{http://europass.cedefop.europa.eu/Europass}EmployerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkExperienceType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "position",
    "activities",
    "employer"
})
public class WorkExperienceType
    extends ExperienceType
{

    @XmlElement(name = "Position", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected OccupationalFieldType position;
    @XmlElement(name = "Activities", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected String activities;
    @XmlElement(name = "Employer", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected EmployerType employer;

    /**
     * Obtiene el valor de la propiedad position.
     * 
     * @return
     *     possible object is
     *     {@link OccupationalFieldType }
     *     
     */
    public OccupationalFieldType getPosition() {
        return position;
    }

    /**
     * Define el valor de la propiedad position.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupationalFieldType }
     *     
     */
    public void setPosition(OccupationalFieldType value) {
        this.position = value;
    }

    /**
     * Obtiene el valor de la propiedad activities.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivities() {
        return activities;
    }

    /**
     * Define el valor de la propiedad activities.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivities(String value) {
        this.activities = value;
    }

    /**
     * Obtiene el valor de la propiedad employer.
     * 
     * @return
     *     possible object is
     *     {@link EmployerType }
     *     
     */
    public EmployerType getEmployer() {
        return employer;
    }

    /**
     * Define el valor de la propiedad employer.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployerType }
     *     
     */
    public void setEmployer(EmployerType value) {
        this.employer = value;
    }

}
