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
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{}column"/&gt;
 *           &lt;element ref="{}formula"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="column" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="formula" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="precision" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="scale" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="not-null" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="unique" default="false"&gt;
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
        "columnOrFormula",
        "type"
})
@XmlRootElement(name = "element")
public class HbmElement implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    @XmlElements({
            @XmlElement(name = "column", type = HbmColumn.class),
            @XmlElement(name = "formula", type = String.class)
    })
    protected List<IHbmNode> columnOrFormula;
    protected HbmType type;
    @XmlAttribute(name = "column")
    protected String columnAttr;
    @XmlAttribute(name = "node")
    @XmlSchemaType(name = "anySimpleType")
    protected String node;
    @XmlAttribute(name = "formula")
    @XmlSchemaType(name = "anySimpleType")
    protected String formulaAttr;
    @XmlAttribute(name = "type")
    @XmlSchemaType(name = "anySimpleType")
    protected String typeAttr;
    @XmlAttribute(name = "length")
    @XmlSchemaType(name = "anySimpleType")
    protected String length;
    @XmlAttribute(name = "precision")
    @XmlSchemaType(name = "anySimpleType")
    protected String precision;
    @XmlAttribute(name = "scale")
    @XmlSchemaType(name = "anySimpleType")
    protected String scale;
    @XmlAttribute(name = "not-null")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String notNull;
    @XmlAttribute(name = "unique")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unique;

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
     * Obtient la valeur de la propriété type.
     *
     * @return possible object is
     * {@link HbmType }
     */
    public HbmType getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     *
     * @param value allowed object is
     *              {@link HbmType }
     */
    public void setType(HbmType value) {
        this.type = value;
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
     * Obtient la valeur de la propriété node.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNode() {
        return node;
    }

    /**
     * Définit la valeur de la propriété node.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNode(String value) {
        this.node = value;
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
     * Obtient la valeur de la propriété typeAttr.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTypeAttr() {
        return typeAttr;
    }

    /**
     * Définit la valeur de la propriété typeAttr.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTypeAttr(String value) {
        this.typeAttr = value;
    }

    /**
     * Obtient la valeur de la propriété length.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLength() {
        return length;
    }

    /**
     * Définit la valeur de la propriété length.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLength(String value) {
        this.length = value;
    }

    /**
     * Obtient la valeur de la propriété precision.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPrecision() {
        return precision;
    }

    /**
     * Définit la valeur de la propriété precision.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPrecision(String value) {
        this.precision = value;
    }

    /**
     * Obtient la valeur de la propriété scale.
     *
     * @return possible object is
     * {@link String }
     */
    public String getScale() {
        return scale;
    }

    /**
     * Définit la valeur de la propriété scale.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setScale(String value) {
        this.scale = value;
    }

    /**
     * Obtient la valeur de la propriété notNull.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNotNull() {
        if (notNull == null) {
            return "false";
        } else {
            return notNull;
        }
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
     * Obtient la valeur de la propriété unique.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnique() {
        if (unique == null) {
            return "false";
        } else {
            return unique;
        }
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
