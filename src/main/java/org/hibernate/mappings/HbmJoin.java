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
 *         &lt;element ref="{}subselect" minOccurs="0"/&gt;
 *         &lt;element ref="{}comment" minOccurs="0"/&gt;
 *         &lt;element ref="{}key"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{}property"/&gt;
 *           &lt;element ref="{}many-to-one"/&gt;
 *           &lt;element ref="{}component"/&gt;
 *           &lt;element ref="{}dynamic-component"/&gt;
 *           &lt;element ref="{}any"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}sql-insert" minOccurs="0"/&gt;
 *         &lt;element ref="{}sql-update" minOccurs="0"/&gt;
 *         &lt;element ref="{}sql-delete" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="table" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="schema" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="catalog" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="subselect" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="fetch" default="join"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="join"/&gt;
 *             &lt;enumeration value="select"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="inverse" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="optional" default="false"&gt;
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
        "subselect",
        "comment",
        "key",
        "propertyOrManyToOneOrComponent",
        "sqlInsert",
        "sqlUpdate",
        "sqlDelete"
})
@XmlRootElement(name = "join")
public class HbmJoin implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    protected String subselect;
    protected String comment;
    @XmlElement(required = true)
    protected HbmKey key;
    @XmlElements({
            @XmlElement(name = "property", type = HbmProperty.class),
            @XmlElement(name = "many-to-one", type = HbmManyToOne.class),
            @XmlElement(name = "component", type = HbmComponent.class),
            @XmlElement(name = "dynamic-component", type = HbmDynamicComponent.class),
            @XmlElement(name = "any", type = HbmAny.class)
    })
    protected List<IHbmNode> propertyOrManyToOneOrComponent;
    @XmlElement(name = "sql-insert")
    protected HbmSqlInsert sqlInsert;
    @XmlElement(name = "sql-update")
    protected HbmSqlUpdate sqlUpdate;
    @XmlElement(name = "sql-delete")
    protected HbmSqlDelete sqlDelete;
    @XmlAttribute(name = "table", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String table;
    @XmlAttribute(name = "schema")
    @XmlSchemaType(name = "anySimpleType")
    protected String schema;
    @XmlAttribute(name = "catalog")
    @XmlSchemaType(name = "anySimpleType")
    protected String catalog;
    @XmlAttribute(name = "subselect")
    @XmlSchemaType(name = "anySimpleType")
    protected String subselectAttr;
    @XmlAttribute(name = "fetch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fetch;
    @XmlAttribute(name = "inverse")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String inverse;
    @XmlAttribute(name = "optional")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String optional;

    /**
     * Obtient la valeur de la propriété subselect.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSubselect() {
        return subselect;
    }

    /**
     * Définit la valeur de la propriété subselect.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSubselect(String value) {
        this.subselect = value;
    }

    /**
     * Obtient la valeur de la propriété comment.
     *
     * @return possible object is
     * {@link String }
     */
    public String getComment() {
        return comment;
    }

    /**
     * Définit la valeur de la propriété comment.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Obtient la valeur de la propriété key.
     *
     * @return possible object is
     * {@link HbmKey }
     */
    public HbmKey getKey() {
        return key;
    }

    /**
     * Définit la valeur de la propriété key.
     *
     * @param value allowed object is
     *              {@link HbmKey }
     */
    public void setKey(HbmKey value) {
        this.key = value;
    }

    /**
     * Gets the value of the propertyOrManyToOneOrComponent property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the propertyOrManyToOneOrComponent property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyOrManyToOneOrComponent().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmProperty }
     * {@link HbmManyToOne }
     * {@link HbmComponent }
     * {@link HbmDynamicComponent }
     * {@link HbmAny }
     */
    public List<IHbmNode> getPropertyOrManyToOneOrComponent() {
        if (propertyOrManyToOneOrComponent == null) {
            propertyOrManyToOneOrComponent = new ArrayList<IHbmNode>();
        }
        return this.propertyOrManyToOneOrComponent;
    }

    /**
     * Obtient la valeur de la propriété sqlInsert.
     *
     * @return possible object is
     * {@link HbmSqlInsert }
     */
    public HbmSqlInsert getSqlInsert() {
        return sqlInsert;
    }

    /**
     * Définit la valeur de la propriété sqlInsert.
     *
     * @param value allowed object is
     *              {@link HbmSqlInsert }
     */
    public void setSqlInsert(HbmSqlInsert value) {
        this.sqlInsert = value;
    }

    /**
     * Obtient la valeur de la propriété sqlUpdate.
     *
     * @return possible object is
     * {@link HbmSqlUpdate }
     */
    public HbmSqlUpdate getSqlUpdate() {
        return sqlUpdate;
    }

    /**
     * Définit la valeur de la propriété sqlUpdate.
     *
     * @param value allowed object is
     *              {@link HbmSqlUpdate }
     */
    public void setSqlUpdate(HbmSqlUpdate value) {
        this.sqlUpdate = value;
    }

    /**
     * Obtient la valeur de la propriété sqlDelete.
     *
     * @return possible object is
     * {@link HbmSqlDelete }
     */
    public HbmSqlDelete getSqlDelete() {
        return sqlDelete;
    }

    /**
     * Définit la valeur de la propriété sqlDelete.
     *
     * @param value allowed object is
     *              {@link HbmSqlDelete }
     */
    public void setSqlDelete(HbmSqlDelete value) {
        this.sqlDelete = value;
    }

    /**
     * Obtient la valeur de la propriété table.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTable() {
        return table;
    }

    /**
     * Définit la valeur de la propriété table.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTable(String value) {
        this.table = value;
    }

    /**
     * Obtient la valeur de la propriété schema.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Définit la valeur de la propriété schema.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSchema(String value) {
        this.schema = value;
    }

    /**
     * Obtient la valeur de la propriété catalog.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCatalog() {
        return catalog;
    }

    /**
     * Définit la valeur de la propriété catalog.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCatalog(String value) {
        this.catalog = value;
    }

    /**
     * Obtient la valeur de la propriété subselectAttr.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSubselectAttr() {
        return subselectAttr;
    }

    /**
     * Définit la valeur de la propriété subselectAttr.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSubselectAttr(String value) {
        this.subselectAttr = value;
    }

    /**
     * Obtient la valeur de la propriété fetch.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFetch() {
        if (fetch == null) {
            return "join";
        } else {
            return fetch;
        }
    }

    /**
     * Définit la valeur de la propriété fetch.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFetch(String value) {
        this.fetch = value;
    }

    /**
     * Obtient la valeur de la propriété inverse.
     *
     * @return possible object is
     * {@link String }
     */
    public String getInverse() {
        if (inverse == null) {
            return "false";
        } else {
            return inverse;
        }
    }

    /**
     * Définit la valeur de la propriété inverse.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInverse(String value) {
        this.inverse = value;
    }

    /**
     * Obtient la valeur de la propriété optional.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOptional() {
        if (optional == null) {
            return "false";
        } else {
            return optional;
        }
    }

    /**
     * Définit la valeur de la propriété optional.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOptional(String value) {
        this.optional = value;
    }

}
