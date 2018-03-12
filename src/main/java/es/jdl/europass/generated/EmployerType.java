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
 *                 Defines an organisation providing employment by extending the abstract organisation type to include information about the business sector the company belongs to.
 *             
 * 
 * <p>Clase Java para EmployerType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EmployerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://europass.cedefop.europa.eu/Europass}OrganisationType">
 *       &lt;sequence>
 *         &lt;element name="Sector" type="{http://europass.cedefop.europa.eu/Europass}BusinesSectorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployerType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "sector"
})
public class EmployerType
    extends OrganisationType
{

    @XmlElement(name = "Sector", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected BusinesSectorType sector;

    /**
     * Obtiene el valor de la propiedad sector.
     * 
     * @return
     *     possible object is
     *     {@link BusinesSectorType }
     *     
     */
    public BusinesSectorType getSector() {
        return sector;
    }

    /**
     * Define el valor de la propiedad sector.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinesSectorType }
     *     
     */
    public void setSector(BusinesSectorType value) {
        this.sector = value;
    }

}
