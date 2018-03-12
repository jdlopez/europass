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
 * <p>Clase Java para LetterType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LetterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Localisation" type="{http://europass.cedefop.europa.eu/Europass}LetterLocalisationType" minOccurs="0"/>
 *         &lt;element name="SubjectLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpeningSalutation" type="{http://europass.cedefop.europa.eu/Europass}OpeningSalutationType" minOccurs="0"/>
 *         &lt;element name="Body" type="{http://europass.cedefop.europa.eu/Europass}BodyType" minOccurs="0"/>
 *         &lt;element name="ClosingSalutation" type="{http://europass.cedefop.europa.eu/Europass}ClosingSalutationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LetterType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "localisation",
    "subjectLine",
    "openingSalutation",
    "body",
    "closingSalutation"
})
public class LetterType {

    @XmlElement(name = "Localisation", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected LetterLocalisationType localisation;
    @XmlElement(name = "SubjectLine", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected String subjectLine;
    @XmlElement(name = "OpeningSalutation", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected OpeningSalutationType openingSalutation;
    @XmlElement(name = "Body", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected BodyType body;
    @XmlElement(name = "ClosingSalutation", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected ClosingSalutationType closingSalutation;

    /**
     * Obtiene el valor de la propiedad localisation.
     * 
     * @return
     *     possible object is
     *     {@link LetterLocalisationType }
     *     
     */
    public LetterLocalisationType getLocalisation() {
        return localisation;
    }

    /**
     * Define el valor de la propiedad localisation.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterLocalisationType }
     *     
     */
    public void setLocalisation(LetterLocalisationType value) {
        this.localisation = value;
    }

    /**
     * Obtiene el valor de la propiedad subjectLine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectLine() {
        return subjectLine;
    }

    /**
     * Define el valor de la propiedad subjectLine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectLine(String value) {
        this.subjectLine = value;
    }

    /**
     * Obtiene el valor de la propiedad openingSalutation.
     * 
     * @return
     *     possible object is
     *     {@link OpeningSalutationType }
     *     
     */
    public OpeningSalutationType getOpeningSalutation() {
        return openingSalutation;
    }

    /**
     * Define el valor de la propiedad openingSalutation.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningSalutationType }
     *     
     */
    public void setOpeningSalutation(OpeningSalutationType value) {
        this.openingSalutation = value;
    }

    /**
     * Obtiene el valor de la propiedad body.
     * 
     * @return
     *     possible object is
     *     {@link BodyType }
     *     
     */
    public BodyType getBody() {
        return body;
    }

    /**
     * Define el valor de la propiedad body.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyType }
     *     
     */
    public void setBody(BodyType value) {
        this.body = value;
    }

    /**
     * Obtiene el valor de la propiedad closingSalutation.
     * 
     * @return
     *     possible object is
     *     {@link ClosingSalutationType }
     *     
     */
    public ClosingSalutationType getClosingSalutation() {
        return closingSalutation;
    }

    /**
     * Define el valor de la propiedad closingSalutation.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingSalutationType }
     *     
     */
    public void setClosingSalutation(ClosingSalutationType value) {
        this.closingSalutation = value;
    }

}
