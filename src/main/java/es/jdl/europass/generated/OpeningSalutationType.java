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
 *                 Describes the opening salutation to the expected reader of this cover letter.
 *             
 * 
 * <p>Clase Java para OpeningSalutationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OpeningSalutationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Salutation" type="{http://europass.cedefop.europa.eu/Europass}OpeningSalutationSalutationType" minOccurs="0"/>
 *         &lt;element name="PersonName" type="{http://europass.cedefop.europa.eu/Europass}PersonNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpeningSalutationType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "salutation",
    "personName"
})
public class OpeningSalutationType {

    @XmlElement(name = "Salutation", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected OpeningSalutationSalutationType salutation;
    @XmlElement(name = "PersonName", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected PersonNameType personName;

    /**
     * Obtiene el valor de la propiedad salutation.
     * 
     * @return
     *     possible object is
     *     {@link OpeningSalutationSalutationType }
     *     
     */
    public OpeningSalutationSalutationType getSalutation() {
        return salutation;
    }

    /**
     * Define el valor de la propiedad salutation.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningSalutationSalutationType }
     *     
     */
    public void setSalutation(OpeningSalutationSalutationType value) {
        this.salutation = value;
    }

    /**
     * Obtiene el valor de la propiedad personName.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Define el valor de la propiedad personName.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
    }

}
