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
 *         &lt;element ref="{}column" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="access" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="column" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="integer" /&gt;
 *       &lt;attribute name="unsaved-value" default="undefined"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="null"/&gt;
 *             &lt;enumeration value="negative"/&gt;
 *             &lt;enumeration value="undefined"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="generated" default="never"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="never"/&gt;
 *             &lt;enumeration value="always"/&gt;
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
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "meta",
        "column"
})
@XmlRootElement(name = "version")
public class HbmVersion implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    protected List<HbmMeta> meta;
    protected List<HbmColumn> column;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "node")
    @XmlSchemaType(name = "anySimpleType")
    protected String node;
    @XmlAttribute(name = "access")
    @XmlSchemaType(name = "anySimpleType")
    protected String access;
    @XmlAttribute(name = "column")
    protected String columnAttr;
    @XmlAttribute(name = "type")
    @XmlSchemaType(name = "anySimpleType")
    protected String type;
    @XmlAttribute(name = "unsaved-value")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unsavedValue;
    @XmlAttribute(name = "generated")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String generated;
    @XmlAttribute(name = "insert")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String insert;

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
     * Obtient la valeur de la propriété type.
     *
     * @return possible object is
     * {@link String }
     */
    public String getType() {
        if (type == null) {
            return "integer";
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
     * Obtient la valeur de la propriété unsavedValue.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnsavedValue() {
        if (unsavedValue == null) {
            return "undefined";
        } else {
            return unsavedValue;
        }
    }

    /**
     * Définit la valeur de la propriété unsavedValue.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnsavedValue(String value) {
        this.unsavedValue = value;
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

}
