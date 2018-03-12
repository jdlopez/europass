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
 * <p>Clase Java para LabelType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LabelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "code",
    "label"
})
@XmlSeeAlso({
    NationalityType.class,
    AchievementTypeLabelType.class,
    ForeignLanguageType.class,
    InstantMessagingUseLabelType.class,
    EducationalFieldType.class,
    BusinesSectorType.class,
    GenderLabelType.class,
    MotherLanguageType.class,
    TelephoneUseLabelType.class,
    OrganisationalWebsiteUseType.class,
    DocumentationHeadingLabelType.class,
    HeadlineTypeLabelType.class,
    CountryType.class,
    WebsiteUseLabelType.class,
    LinguisticExperienceAreaType.class,
    ClosingSalutationType.class,
    LanguageType.class,
    EducationalLevelType.class,
    PersonTitleLabelType.class,
    OccupationalFieldType.class,
    OpeningSalutationSalutationType.class
})
public class LabelType {

    @XmlElement(name = "Code", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected String code;
    @XmlElement(name = "Label", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected String label;

    /**
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad label.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Define el valor de la propiedad label.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

}
