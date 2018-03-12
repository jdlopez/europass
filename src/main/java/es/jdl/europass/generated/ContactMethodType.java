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
 * 				Contains information about the available contact methods for the individual.
 * 			
 * 
 * <p>Clase Java para ContactMethodType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContactMethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contact" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="Use" type="{http://europass.cedefop.europa.eu/Europass}LabelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactMethodType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "contact",
    "use"
})
@XmlSeeAlso({
    TelephoneType.class,
    ContactEmailType.class,
    ContactAddressType.class,
    WebsiteType.class,
    OrganisationalWebsiteType.class,
    InstantMessagingType.class
})
public abstract class ContactMethodType {

    @XmlElement(name = "Contact", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected Object contact;
    @XmlElement(name = "Use", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected LabelType use;

    /**
     * Obtiene el valor de la propiedad contact.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContact() {
        return contact;
    }

    /**
     * Define el valor de la propiedad contact.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContact(Object value) {
        this.contact = value;
    }

    /**
     * Obtiene el valor de la propiedad use.
     * 
     * @return
     *     possible object is
     *     {@link LabelType }
     *     
     */
    public LabelType getUse() {
        return use;
    }

    /**
     * Define el valor de la propiedad use.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelType }
     *     
     */
    public void setUse(LabelType value) {
        this.use = value;
    }

}
