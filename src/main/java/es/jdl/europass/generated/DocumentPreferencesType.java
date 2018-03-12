//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.03.10 a las 12:12:10 PM CET 
//


package es.jdl.europass.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DocumentPreferencesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DocumentPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Field" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="name" use="required" type="{http://europass.cedefop.europa.eu/Europass}FieldNames" />
 *                 &lt;attribute name="show" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="format" type="{http://europass.cedefop.europa.eu/Europass}SimpleFieldFormats" />
 *                 &lt;attribute name="order" type="{http://europass.cedefop.europa.eu/Europass}OrderNames" />
 *                 &lt;attribute name="position" type="{http://europass.cedefop.europa.eu/Europass}PositionNames" />
 *                 &lt;attribute name="justify" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://europass.cedefop.europa.eu/Europass}DocumentTypeEnumeration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentPreferencesType", namespace = "http://europass.cedefop.europa.eu/Europass", propOrder = {
    "field"
})
public class DocumentPreferencesType {

    @XmlElement(name = "Field", namespace = "http://europass.cedefop.europa.eu/Europass")
    protected List<DocumentPreferencesType.Field> field;
    @XmlAttribute(name = "type", required = true)
    protected DocumentTypeEnumeration type;

    /**
     * Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentPreferencesType.Field }
     * 
     * 
     */
    public List<DocumentPreferencesType.Field> getField() {
        if (field == null) {
            field = new ArrayList<DocumentPreferencesType.Field>();
        }
        return this.field;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTypeEnumeration }
     *     
     */
    public DocumentTypeEnumeration getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTypeEnumeration }
     *     
     */
    public void setType(DocumentTypeEnumeration value) {
        this.type = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="name" use="required" type="{http://europass.cedefop.europa.eu/Europass}FieldNames" />
     *       &lt;attribute name="show" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="format" type="{http://europass.cedefop.europa.eu/Europass}SimpleFieldFormats" />
     *       &lt;attribute name="order" type="{http://europass.cedefop.europa.eu/Europass}OrderNames" />
     *       &lt;attribute name="position" type="{http://europass.cedefop.europa.eu/Europass}PositionNames" />
     *       &lt;attribute name="justify" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Field {

        @XmlAttribute(name = "name", required = true)
        protected String name;
        @XmlAttribute(name = "show")
        protected Boolean show;
        @XmlAttribute(name = "format")
        protected String format;
        @XmlAttribute(name = "order")
        protected OrderNames order;
        @XmlAttribute(name = "position")
        protected PositionNames position;
        @XmlAttribute(name = "justify")
        protected Boolean justify;

        /**
         * Obtiene el valor de la propiedad name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Define el valor de la propiedad name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Obtiene el valor de la propiedad show.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShow() {
            return show;
        }

        /**
         * Define el valor de la propiedad show.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShow(Boolean value) {
            this.show = value;
        }

        /**
         * Obtiene el valor de la propiedad format.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFormat() {
            return format;
        }

        /**
         * Define el valor de la propiedad format.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFormat(String value) {
            this.format = value;
        }

        /**
         * Obtiene el valor de la propiedad order.
         * 
         * @return
         *     possible object is
         *     {@link OrderNames }
         *     
         */
        public OrderNames getOrder() {
            return order;
        }

        /**
         * Define el valor de la propiedad order.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderNames }
         *     
         */
        public void setOrder(OrderNames value) {
            this.order = value;
        }

        /**
         * Obtiene el valor de la propiedad position.
         * 
         * @return
         *     possible object is
         *     {@link PositionNames }
         *     
         */
        public PositionNames getPosition() {
            return position;
        }

        /**
         * Define el valor de la propiedad position.
         * 
         * @param value
         *     allowed object is
         *     {@link PositionNames }
         *     
         */
        public void setPosition(PositionNames value) {
            this.position = value;
        }

        /**
         * Obtiene el valor de la propiedad justify.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isJustify() {
            return justify;
        }

        /**
         * Define el valor de la propiedad justify.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setJustify(Boolean value) {
            this.justify = value;
        }

    }

}
