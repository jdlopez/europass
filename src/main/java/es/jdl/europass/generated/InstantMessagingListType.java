//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.03.10 a las 12:12:10 PM CET 
//


package es.jdl.europass.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Lists the instant messaging accounts numbers owned by the individual.
 * 			
 * 
 * <p>Clase Java para InstantMessagingListType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InstantMessagingListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstantMessaging" type="{http://europass.cedefop.europa.eu/Europass}InstantMessagingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstantMessagingListType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "instantMessaging"
})
public class InstantMessagingListType {

    @XmlElement(name = "InstantMessaging", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected List<InstantMessagingType> instantMessaging;

    /**
     * Gets the value of the instantMessaging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instantMessaging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstantMessaging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstantMessagingType }
     * 
     * 
     */
    public List<InstantMessagingType> getInstantMessaging() {
        if (instantMessaging == null) {
            instantMessaging = new ArrayList<InstantMessagingType>();
        }
        return this.instantMessaging;
    }

}