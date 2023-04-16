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
 *         &lt;element ref="{}meta" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{}column"/&gt;
 *           &lt;element ref="{}formula"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="access" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="column" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="precision" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="scale" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="not-null"&gt;
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
 *       &lt;attribute name="unique-key" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="update"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="insert"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="optimistic-lock" default="true"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="formula" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="lazy" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="generated" default="never"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="never"/&gt;
 *             &lt;enumeration value="insert"/&gt;
 *             &lt;enumeration value="always"/&gt;
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
        "meta",
        "columnOrFormula",
        "type"
})
@XmlRootElement(name = "property")
public class HbmProperty implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    protected List<HbmMeta> meta;
    @XmlElements({
            @XmlElement(name = "column", type = HbmColumn.class),
            @XmlElement(name = "formula", type = String.class)
    })
    protected List<IHbmNode> columnOrFormula;
    protected HbmType type;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "node")
    @XmlSchemaType(name = "anySimpleType")
    protected String node;
    @XmlAttribute(name = "access")
    @XmlSchemaType(name = "anySimpleType")
    protected String access;
    @XmlAttribute(name = "type")
    @XmlSchemaType(name = "anySimpleType")
    protected String typeAttr;
    @XmlAttribute(name = "column")
    protected String columnAttr;
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
    @XmlAttribute(name = "unique-key")
    @XmlSchemaType(name = "anySimpleType")
    protected String uniqueKey;
    @XmlAttribute(name = "index")
    @XmlSchemaType(name = "anySimpleType")
    protected String index;
    @XmlAttribute(name = "update")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String update;
    @XmlAttribute(name = "insert")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String insert;
    @XmlAttribute(name = "optimistic-lock")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String optimisticLock;
    @XmlAttribute(name = "formula")
    @XmlSchemaType(name = "anySimpleType")
    protected String formulaAttr;
    @XmlAttribute(name = "lazy")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lazy;
    @XmlAttribute(name = "generated")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String generated;

    /**
     * Gets the value of the meta property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the meta property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeta().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmMeta }
     */
    public List<HbmMeta> getMeta() {
        if (meta == null) {
            meta = new ArrayList<HbmMeta>();
        }
        return this.meta;
    }

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
     * Obtient la valeur de la propriété name.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
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
     * Obtient la valeur de la propriété access.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAccess() {
        return access;
    }

    /**
     * Définit la valeur de la propriété access.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAccess(String value) {
        this.access = value;
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

    /**
     * Obtient la valeur de la propriété uniqueKey.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUniqueKey() {
        return uniqueKey;
    }

    /**
     * Définit la valeur de la propriété uniqueKey.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUniqueKey(String value) {
        this.uniqueKey = value;
    }

    /**
     * Obtient la valeur de la propriété index.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIndex() {
        return index;
    }

    /**
     * Définit la valeur de la propriété index.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIndex(String value) {
        this.index = value;
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
     * Obtient la valeur de la propriété insert.
     *
     * @return possible object is
     * {@link String }
     */
    public String getInsert() {
        return insert;
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

    /**
     * Obtient la valeur de la propriété optimisticLock.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOptimisticLock() {
        if (optimisticLock == null) {
            return "true";
        } else {
            return optimisticLock;
        }
    }

    /**
     * Définit la valeur de la propriété optimisticLock.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOptimisticLock(String value) {
        this.optimisticLock = value;
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
     * Obtient la valeur de la propriété lazy.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLazy() {
        if (lazy == null) {
            return "false";
        } else {
            return lazy;
        }
    }

    /**
     * Définit la valeur de la propriété lazy.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLazy(String value) {
        this.lazy = value;
    }

    /**
     * Obtient la valeur de la propriété generated.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGenerated() {
        if (generated == null) {
            return "never";
        } else {
            return generated;
        }
    }

    /**
     * Définit la valeur de la propriété generated.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGenerated(String value) {
        this.generated = value;
    }

}
