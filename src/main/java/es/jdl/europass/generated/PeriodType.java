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
import javax.xml.datatype.Duration;


/**
 * 
 * 				A period is comprised of three sub elements for the start and end dates of the period, as well as an idicator whether the specific period is current. 
 * 				The end date and the current indicator are optional.
 * 			
 * 
 * <p>Clase Java para PeriodType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="From" type="{http://europass.cedefop.europa.eu/Europass}DateType"/>
 *         &lt;element name="To" type="{http://europass.cedefop.europa.eu/Europass}DateType" minOccurs="0"/>
 *         &lt;element name="Current" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="DurationEquivalent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "from",
    "to",
    "current",
    "duration",
    "durationEquivalent"
})
public class PeriodType {

    @XmlElement(name = "From", namespace = "http://europass.cedefop.europa.eu/Europass", required = true)
    protected DateType from;
    @XmlElement(name = "To", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected DateType to;
    @XmlElement(name = "Current", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected Boolean current;
    @XmlElement(name = "Duration", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected Duration duration;
    @XmlElement(name = "DurationEquivalent", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected String durationEquivalent;

    /**
     * Obtiene el valor de la propiedad from.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getFrom() {
        return from;
    }

    /**
     * Define el valor de la propiedad from.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setFrom(DateType value) {
        this.from = value;
    }

    /**
     * Obtiene el valor de la propiedad to.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getTo() {
        return to;
    }

    /**
     * Define el valor de la propiedad to.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setTo(DateType value) {
        this.to = value;
    }

    /**
     * Obtiene el valor de la propiedad current.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrent() {
        return current;
    }

    /**
     * Define el valor de la propiedad current.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrent(Boolean value) {
        this.current = value;
    }

    /**
     * Obtiene el valor de la propiedad duration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Define el valor de la propiedad duration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Obtiene el valor de la propiedad durationEquivalent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationEquivalent() {
        return durationEquivalent;
    }

    /**
     * Define el valor de la propiedad durationEquivalent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationEquivalent(String value) {
        this.durationEquivalent = value;
    }

}
