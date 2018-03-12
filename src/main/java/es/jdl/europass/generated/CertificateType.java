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
 * 				Defines a generic type for a Certificate. A Certificate contains information about the title name, the awarding body and the date of awarding. It also contains information about the level that corresponds to this diploma.
 * 			
 * 
 * <p>Clase Java para CertificateType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CertificateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AwardingBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://europass.cedefop.europa.eu/Europass}DateType" minOccurs="0"/>
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "title",
    "awardingBody",
    "date",
    "level"
})
@XmlSeeAlso({
    ComputerCertificateType.class,
    LinguisticCertificateType.class
})
public class CertificateType {

    @XmlElement(name = "Title", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected String title;
    @XmlElement(name = "AwardingBody", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected String awardingBody;
    @XmlElement(name = "Date", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected DateType date;
    @XmlElement(name = "Level", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected Object level;

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
     * Obtiene el valor de la propiedad awardingBody.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardingBody() {
        return awardingBody;
    }

    /**
     * Define el valor de la propiedad awardingBody.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardingBody(String value) {
        this.awardingBody = value;
    }

    /**
     * Obtiene el valor de la propiedad date.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getDate() {
        return date;
    }

    /**
     * Define el valor de la propiedad date.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setDate(DateType value) {
        this.date = value;
    }

    /**
     * Obtiene el valor de la propiedad level.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLevel() {
        return level;
    }

    /**
     * Define el valor de la propiedad level.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLevel(Object value) {
        this.level = value;
    }

}
