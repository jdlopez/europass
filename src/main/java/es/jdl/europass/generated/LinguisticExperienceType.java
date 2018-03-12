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
 *                 Extends the generic ExperienceType to include information about an experience that results in acquiring linguistic skills.
 *                 Contains information about the period the linguistic experience took place and the area/context into which it is acquiared. 
 *             
 * 
 * <p>Clase Java para LinguisticExperienceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LinguisticExperienceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Period" type="{http://europass.cedefop.europa.eu/Europass}PeriodType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Documentation" type="{http://europass.cedefop.europa.eu/Europass}IntraDocumentDocumentationType" minOccurs="0"/>
 *         &lt;element name="Area" type="{http://europass.cedefop.europa.eu/Europass}LinguisticExperienceAreaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinguisticExperienceType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "period",
    "description",
    "documentation",
    "area"
})
public class LinguisticExperienceType {

    @XmlElement(name = "Period", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected PeriodType period;
    @XmlElement(name = "Description", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected String description;
    @XmlElement(name = "Documentation", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected IntraDocumentDocumentationType documentation;
    @XmlElement(name = "Area", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected LinguisticExperienceAreaType area;

    /**
     * Obtiene el valor de la propiedad period.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPeriod() {
        return period;
    }

    /**
     * Define el valor de la propiedad period.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPeriod(PeriodType value) {
        this.period = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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

    /**
     * Obtiene el valor de la propiedad area.
     * 
     * @return
     *     possible object is
     *     {@link LinguisticExperienceAreaType }
     *     
     */
    public LinguisticExperienceAreaType getArea() {
        return area;
    }

    /**
     * Define el valor de la propiedad area.
     * 
     * @param value
     *     allowed object is
     *     {@link LinguisticExperienceAreaType }
     *     
     */
    public void setArea(LinguisticExperienceAreaType value) {
        this.area = value;
    }

}
