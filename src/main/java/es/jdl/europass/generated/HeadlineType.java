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
 * 				Contains a headline label for the current document. It is optional and may accommodate various cases.
 * 			
 * 
 * <p>Clase Java para HeadlineType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HeadlineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://europass.cedefop.europa.eu/Europass}HeadlineTypeLabelType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://europass.cedefop.europa.eu/Europass}OccupationalFieldType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeadlineType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "type",
    "description"
})
@XmlSeeAlso({
    PositionType.class
})
public class HeadlineType {

    @XmlElement(name = "Type", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected HeadlineTypeLabelType type;
    @XmlElement(name = "Description", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected OccupationalFieldType description;

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link HeadlineTypeLabelType }
     *     
     */
    public HeadlineTypeLabelType getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link HeadlineTypeLabelType }
     *     
     */
    public void setType(HeadlineTypeLabelType value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link OccupationalFieldType }
     *     
     */
    public OccupationalFieldType getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupationalFieldType }
     *     
     */
    public void setDescription(OccupationalFieldType value) {
        this.description = value;
    }

}
