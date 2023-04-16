//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.04.16 à 06:57:33 PM CEST 
//


package org.hibernate.mappings;

import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.hibernate.mappings.visitor.HbmNodeVisitor;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Classe Java pour anonymous complex type.
 *
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}column" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="column" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="property-ref" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="foreign-key" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="on-delete" default="noaction"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="cascade"/&gt;
 *             &lt;enumeration value="noaction"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="not-null"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="update"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="unique"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "column"
})
@XmlRootElement(name = "key")
public class HbmKey implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    protected List<HbmColumn> column;
    @XmlAttribute(name = "column")
    protected String columnAttr;
    @XmlAttribute(name = "property-ref")
    @XmlSchemaType(name = "anySimpleType")
    protected String propertyRef;
    @XmlAttribute(name = "foreign-key")
    @XmlSchemaType(name = "anySimpleType")
    protected String foreignKey;
    @XmlAttribute(name = "on-delete")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String onDelete;
    @XmlAttribute(name = "not-null")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String notNull;
    @XmlAttribute(name = "update")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String update;
    @XmlAttribute(name = "unique")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unique;

    /**
     * Gets the value of the column property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the column property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumn().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmColumn }
     */
    public List<HbmColumn> getColumn() {
        if (column == null) {
            column = new ArrayList<HbmColumn>();
        }
        return this.column;
    }

    /**
     * Obtient la valeur de la propriété columnAttr.
     *
     * @return possible object is
     * {@link String }
     */
    public String getColumnAttr() {
        return columnAttr;
    }

    /**
     * Définit la valeur de la propriété columnAttr.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setColumnAttr(String value) {
        this.columnAttr = value;
    }

    /**
     * Obtient la valeur de la propriété propertyRef.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPropertyRef() {
        return propertyRef;
    }

    /**
     * Définit la valeur de la propriété propertyRef.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPropertyRef(String value) {
        this.propertyRef = value;
    }

    /**
     * Obtient la valeur de la propriété foreignKey.
     *
     * @return possible object is
     * {@link String }
     */
    public String getForeignKey() {
        return foreignKey;
    }

    /**
     * Définit la valeur de la propriété foreignKey.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setForeignKey(String value) {
        this.foreignKey = value;
    }

    /**
     * Obtient la valeur de la propriété onDelete.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOnDelete() {
        if (onDelete == null) {
            return "noaction";
        } else {
            return onDelete;
        }
    }

    /**
     * Définit la valeur de la propriété onDelete.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOnDelete(String value) {
        this.onDelete = value;
    }

    /**
     * Obtient la valeur de la propriété notNull.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNotNull() {
        return notNull;
    }

    /**
     * Définit la valeur de la propriété notNull.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNotNull(String value) {
        this.notNull = value;
    }

    /**
     * Obtient la valeur de la propriété update.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUpdate() {
        return update;
    }

    /**
     * Définit la valeur de la propriété update.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUpdate(String value) {
        this.update = value;
    }

    /**
     * Obtient la valeur de la propriété unique.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnique() {
        return unique;
    }

    /**
     * Définit la valeur de la propriété unique.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnique(String value) {
        this.unique = value;
    }

}
