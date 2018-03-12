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
 *                 Describes the date and place of the writing of the specific cover letter.
 *             
 * 
 * <p>Clase Java para LetterLocalisationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LetterLocalisationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{http://europass.cedefop.europa.eu/Europass}DateType" minOccurs="0"/>
 *         &lt;element name="Place" type="{http://europass.cedefop.europa.eu/Europass}LocalisationPlaceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LetterLocalisationType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "date",
    "place"
})
public class LetterLocalisationType {

    @XmlElement(name = "Date", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected DateType date;
    @XmlElement(name = "Place", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected LocalisationPlaceType place;

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
     * Obtiene el valor de la propiedad place.
     * 
     * @return
     *     possible object is
     *     {@link LocalisationPlaceType }
     *     
     */
    public LocalisationPlaceType getPlace() {
        return place;
    }

    /**
     * Define el valor de la propiedad place.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalisationPlaceType }
     *     
     */
    public void setPlace(LocalisationPlaceType value) {
        this.place = value;
    }

}
