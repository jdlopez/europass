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
 *                 Contains an list of work experiences. The order of those experiences is defined by the related printing preferences.
 *             
 * 
 * <p>Clase Java para WorkExperienceListType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WorkExperienceListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WorkExperience" type="{http://europass.cedefop.europa.eu/Europass}WorkExperienceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkExperienceListType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "workExperience"
})
public class WorkExperienceListType {

    @XmlElement(name = "WorkExperience", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected List<WorkExperienceType> workExperience;

    /**
     * Gets the value of the workExperience property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workExperience property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkExperience().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkExperienceType }
     * 
     * 
     */
    public List<WorkExperienceType> getWorkExperience() {
        if (workExperience == null) {
            workExperience = new ArrayList<WorkExperienceType>();
        }
        return this.workExperience;
    }

}
