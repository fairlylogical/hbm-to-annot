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


/**
 * <p>Classe Java pour anonymous complex type.
 *
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element ref="{}column"/&gt;
 *         &lt;element ref="{}formula"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="column" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="formula" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="string" /&gt;
 *       &lt;attribute name="not-null" default="true"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="force" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="insert" default="true"&gt;
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
        "column",
        "formula"
})
@XmlRootElement(name = "discriminator")
public class HbmDiscriminator implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    protected HbmColumn column;
    protected String formula;
    @XmlAttribute(name = "column")
    protected String columnAttr;
    @XmlAttribute(name = "formula")
    @XmlSchemaType(name = "anySimpleType")
    protected String formulaAttr;
    @XmlAttribute(name = "type")
    @XmlSchemaType(name = "anySimpleType")
    protected String type;
    @XmlAttribute(name = "not-null")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String notNull;
    @XmlAttribute(name = "length")
    @XmlSchemaType(name = "anySimpleType")
    protected String length;
    @XmlAttribute(name = "force")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String force;
    @XmlAttribute(name = "insert")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String insert;

    /**
     * Obtient la valeur de la propriété column.
     *
     * @return possible object is
     * {@link HbmColumn }
     */
    public HbmColumn getColumn() {
        return column;
    }

    /**
     * Définit la valeur de la propriété column.
     *
     * @param value allowed object is
     *              {@link HbmColumn }
     */
    public void setColumn(HbmColumn value) {
        this.column = value;
    }

    /**
     * Obtient la valeur de la propriété formula.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Définit la valeur de la propriété formula.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFormula(String value) {
        this.formula = value;
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
     * Obtient la valeur de la propriété type.
     *
     * @return possible object is
     * {@link String }
     */
    public String getType() {
        if (type == null) {
            return "string";
        } else {
            return type;
        }
    }

    /**
     * Définit la valeur de la propriété type.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propriété notNull.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNotNull() {
        if (notNull == null) {
            return "true";
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
     * Obtient la valeur de la propriété force.
     *
     * @return possible object is
     * {@link String }
     */
    public String getForce() {
        if (force == null) {
            return "false";
        } else {
            return force;
        }
    }

    /**
     * Définit la valeur de la propriété force.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setForce(String value) {
        this.force = value;
    }

    /**
     * Obtient la valeur de la propriété insert.
     *
     * @return possible object is
     * {@link String }
     */
    public String getInsert() {
        if (insert == null) {
            return "true";
        } else {
            return insert;
        }
    }

    /**
     * Définit la valeur de la propriété insert.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInsert(String value) {
        this.insert = value;
    }

}
