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
 * <p>Clase Java para AddresseeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AddresseeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonName" type="{http://europass.cedefop.europa.eu/Europass}PersonNameType" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://europass.cedefop.europa.eu/Europass}OccupationalFieldType" minOccurs="0"/>
 *         &lt;element name="Organisation" type="{http://europass.cedefop.europa.eu/Europass}OrganisationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddresseeType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "personName",
    "position",
    "organisation"
})
public class AddresseeType {

    @XmlElement(name = "PersonName", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected PersonNameType personName;
    @XmlElement(name = "Position", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected OccupationalFieldType position;
    @XmlElement(name = "Organisation", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected OrganisationType organisation;

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

    /**
     * Obtiene el valor de la propiedad position.
     * 
     * @return
     *     possible object is
     *     {@link OccupationalFieldType }
     *     
     */
    public OccupationalFieldType getPosition() {
        return position;
    }

    /**
     * Define el valor de la propiedad position.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupationalFieldType }
     *     
     */
    public void setPosition(OccupationalFieldType value) {
        this.position = value;
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

}
