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
 * <p>Clase Java para ProficiencyLevelType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProficiencyLevelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Listening" type="{http://europass.cedefop.europa.eu/Europass}CEFLanguageLevelType" minOccurs="0"/>
 *         &lt;element name="Reading" type="{http://europass.cedefop.europa.eu/Europass}CEFLanguageLevelType" minOccurs="0"/>
 *         &lt;element name="SpokenInteraction" type="{http://europass.cedefop.europa.eu/Europass}CEFLanguageLevelType" minOccurs="0"/>
 *         &lt;element name="SpokenProduction" type="{http://europass.cedefop.europa.eu/Europass}CEFLanguageLevelType" minOccurs="0"/>
 *         &lt;element name="Writing" type="{http://europass.cedefop.europa.eu/Europass}CEFLanguageLevelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProficiencyLevelType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "listening",
    "reading",
    "spokenInteraction",
    "spokenProduction",
    "writing"
})
public class ProficiencyLevelType {

    @XmlElement(name = "Listening", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected String listening;
    @XmlElement(name = "Reading", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected String reading;
    @XmlElement(name = "SpokenInteraction", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected String spokenInteraction;
    @XmlElement(name = "SpokenProduction", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected String spokenProduction;
    @XmlElement(name = "Writing", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected String writing;

    /**
     * Obtiene el valor de la propiedad listening.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListening() {
        return listening;
    }

    /**
     * Define el valor de la propiedad listening.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListening(String value) {
        this.listening = value;
    }

    /**
     * Obtiene el valor de la propiedad reading.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReading() {
        return reading;
    }

    /**
     * Define el valor de la propiedad reading.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReading(String value) {
        this.reading = value;
    }

    /**
     * Obtiene el valor de la propiedad spokenInteraction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpokenInteraction() {
        return spokenInteraction;
    }

    /**
     * Define el valor de la propiedad spokenInteraction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpokenInteraction(String value) {
        this.spokenInteraction = value;
    }

    /**
     * Obtiene el valor de la propiedad spokenProduction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpokenProduction() {
        return spokenProduction;
    }

    /**
     * Define el valor de la propiedad spokenProduction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpokenProduction(String value) {
        this.spokenProduction = value;
    }

    /**
     * Obtiene el valor de la propiedad writing.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWriting() {
        return writing;
    }

    /**
     * Define el valor de la propiedad writing.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWriting(String value) {
        this.writing = value;
    }

}
