//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.04.16 à 06:57:33 PM CEST 
//


package org.hibernate.mappings;

import jakarta.xml.bind.annotation.*;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{}column"/&gt;
 *         &lt;element ref="{}formula"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="entity-name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="column" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="formula" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="foreign-key" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "columnOrFormula"
})
@XmlRootElement(name = "map-key-many-to-many")
public class HbmMapKeyManyToMany implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    @XmlElements({
            @XmlElement(name = "column", type = HbmColumn.class),
            @XmlElement(name = "formula", type = String.class)
    })
    protected List<IHbmNode> columnOrFormula;
    @XmlAttribute(name = "class")
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute(name = "entity-name")
    @XmlSchemaType(name = "anySimpleType")
    protected String entityName;
    @XmlAttribute(name = "column")
    protected String columnAttr;
    @XmlAttribute(name = "formula")
    @XmlSchemaType(name = "anySimpleType")
    protected String formulaAttr;
    @XmlAttribute(name = "foreign-key")
    @XmlSchemaType(name = "anySimpleType")
    protected String foreignKey;

    /**
     * Gets the value of the columnOrFormula property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the columnOrFormula property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnOrFormula().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmColumn }
     * {@link String }
     */
    public List<IHbmNode> getColumnOrFormula() {
        if (columnOrFormula == null) {
            columnOrFormula = new ArrayList<IHbmNode>();
        }
        return this.columnOrFormula;
    }

    /**
     * Obtient la valeur de la propriété clazz.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Définit la valeur de la propriété clazz.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Obtient la valeur de la propriété entityName.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Définit la valeur de la propriété entityName.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEntityName(String value) {
        this.entityName = value;
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
     * Obtient la valeur de la propriété formulaAttr.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFormulaAttr() {
        return formulaAttr;
    }

    /**
     * Définit la valeur de la propriété formulaAttr.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFormulaAttr(String value) {
        this.formulaAttr = value;
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

}
