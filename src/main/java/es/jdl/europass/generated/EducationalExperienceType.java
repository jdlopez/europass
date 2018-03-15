//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.03.10 a las 12:12:10 PM CET 
//


package es.jdl.europass.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Extends the generic ExperienceType to include information about a learning achievement or a training period. 
 * 				Contains information about the period the learning experience took place and the awarded title, as well as information about the skills acquired, the organisation providing the education, the educational field and level. 
 * 			
 * 
 * <p>Clase Java para EducationalExperienceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EducationalExperienceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://europass.cedefop.europa.eu/Europass}ExperienceType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Activities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation" type="{http://europass.cedefop.europa.eu/Europass}OrganisationType" minOccurs="0"/>
 *         &lt;element name="Level" type="{http://europass.cedefop.europa.eu/Europass}EducationalLevelType" minOccurs="0"/>
 *         &lt;element name="Field" type="{http://europass.cedefop.europa.eu/Europass}EducationalFieldType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EducationalExperienceType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "title",
    "activities",
    "organisation",
    "level",
    "field"
})
public class EducationalExperienceType
    extends ExperienceType
{

    @XmlElement(name = "Title", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected String title;
    @XmlElement(name = "Activities", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected String activities;
    @XmlElement(name = "Organisation", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected OrganisationType organisation;
    @XmlElement(name = "Level", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected EducationalLevelType level;
    @XmlElement(name = "Field", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected EducationalFieldType field;

    /**
     * Obtiene el valor de la propiedad title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Obtiene el valor de la propiedad organisation.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationType }
     *     
     */
    public OrganisationType getOrganisation() {
        return organisation;
    }

    /**
     * Define el valor de la propiedad organisation.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationType }
     *     
     */
    public void setOrganisation(OrganisationType value) {
        this.organisation = value;
    }

    /**
     * Obtiene el valor de la propiedad level.
     * 
     * @return
     *     possible object is
     *     {@link EducationalLevelType }
     *     
     */
    public EducationalLevelType getLevel() {
        return level;
    }

    /**
     * Define el valor de la propiedad level.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationalLevelType }
     *     
     */
    public void setLevel(EducationalLevelType value) {
        this.level = value;
    }

    /**
     * Obtiene el valor de la propiedad field.
     * 
     * @return
     *     possible object is
     *     {@link EducationalFieldType }
     *     
     */
    public EducationalFieldType getField() {
        return field;
    }

    /**
     * Define el valor de la propiedad field.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationalFieldType }
     *     
     */
    public void setField(EducationalFieldType value) {
        this.field = value;
    }

}