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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ComputerLevelType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ComputerLevelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Information" type="{http://europass.cedefop.europa.eu/Europass}ICTLevelType" minOccurs="0"/>
 *         &lt;element name="Communication" type="{http://europass.cedefop.europa.eu/Europass}ICTLevelType" minOccurs="0"/>
 *         &lt;element name="ContentCreation" type="{http://europass.cedefop.europa.eu/Europass}ICTLevelType" minOccurs="0"/>
 *         &lt;element name="Safety" type="{http://europass.cedefop.europa.eu/Europass}ICTLevelType" minOccurs="0"/>
 *         &lt;element name="ProblemSolving" type="{http://europass.cedefop.europa.eu/Europass}ICTLevelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputerLevelType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "information",
    "communication",
    "contentCreation",
    "safety",
    "problemSolving"
})
public class ComputerLevelType {

    @XmlElement(name = "Information", namespace = "http://europass.cedefop.europa.eu/Europass")
    @XmlSchemaType(name = "string")
    protected ICTLevelType information;
    @XmlElement(name = "Communication", namespace = "http://europass.cedefop.europa.eu/Europass")
    @XmlSchemaType(name = "string")
    protected ICTLevelType communication;
    @XmlElement(name = "ContentCreation", namespace = "http://europass.cedefop.europa.eu/Europass")
    @XmlSchemaType(name = "string")
    protected ICTLevelType contentCreation;
    @XmlElement(name = "Safety", namespace = "http://europass.cedefop.europa.eu/Europass")
    @XmlSchemaType(name = "string")
    protected ICTLevelType safety;
    @XmlElement(name = "ProblemSolving", namespace = "http://europass.cedefop.europa.eu/Europass")
    @XmlSchemaType(name = "string")
    protected ICTLevelType problemSolving;

    /**
     * Obtiene el valor de la propiedad information.
     * 
     * @return
     *     possible object is
     *     {@link ICTLevelType }
     *     
     */
    public ICTLevelType getInformation() {
        return information;
    }

    /**
     * Define el valor de la propiedad information.
     * 
     * @param value
     *     allowed object is
     *     {@link ICTLevelType }
     *     
     */
    public void setInformation(ICTLevelType value) {
        this.information = value;
    }

    /**
     * Obtiene el valor de la propiedad communication.
     * 
     * @return
     *     possible object is
     *     {@link ICTLevelType }
     *     
     */
    public ICTLevelType getCommunication() {
        return communication;
    }

    /**
     * Define el valor de la propiedad communication.
     * 
     * @param value
     *     allowed object is
     *     {@link ICTLevelType }
     *     
     */
    public void setCommunication(ICTLevelType value) {
        this.communication = value;
    }

    /**
     * Obtiene el valor de la propiedad contentCreation.
     * 
     * @return
     *     possible object is
     *     {@link ICTLevelType }
     *     
     */
    public ICTLevelType getContentCreation() {
        return contentCreation;
    }

    /**
     * Define el valor de la propiedad contentCreation.
     * 
     * @param value
     *     allowed object is
     *     {@link ICTLevelType }
     *     
     */
    public void setContentCreation(ICTLevelType value) {
        this.contentCreation = value;
    }

    /**
     * Obtiene el valor de la propiedad safety.
     * 
     * @return
     *     possible object is
     *     {@link ICTLevelType }
     *     
     */
    public ICTLevelType getSafety() {
        return safety;
    }

    /**
     * Define el valor de la propiedad safety.
     * 
     * @param value
     *     allowed object is
     *     {@link ICTLevelType }
     *     
     */
    public void setSafety(ICTLevelType value) {
        this.safety = value;
    }

    /**
     * Obtiene el valor de la propiedad problemSolving.
     * 
     * @return
     *     possible object is
     *     {@link ICTLevelType }
     *     
     */
    public ICTLevelType getProblemSolving() {
        return problemSolving;
    }

    /**
     * Define el valor de la propiedad problemSolving.
     * 
     * @param value
     *     allowed object is
     *     {@link ICTLevelType }
     *     
     */
    public void setProblemSolving(ICTLevelType value) {
        this.problemSolving = value;
    }

}
