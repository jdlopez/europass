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
 * <p>Clase Java para BodyType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Opening" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Closing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "opening",
    "mainBody",
    "closing"
})
public class BodyType {

    @XmlElement(name = "Opening", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected String opening;
    @XmlElement(name = "MainBody", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected String mainBody;
    @XmlElement(name = "Closing", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected String closing;

    /**
     * Obtiene el valor de la propiedad opening.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpening() {
        return opening;
    }

    /**
     * Define el valor de la propiedad opening.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpening(String value) {
        this.opening = value;
    }

    /**
     * Obtiene el valor de la propiedad mainBody.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainBody() {
        return mainBody;
    }

    /**
     * Define el valor de la propiedad mainBody.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainBody(String value) {
        this.mainBody = value;
    }

    /**
     * Obtiene el valor de la propiedad closing.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosing() {
        return closing;
    }

    /**
     * Define el valor de la propiedad closing.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosing(String value) {
        this.closing = value;
    }

}
