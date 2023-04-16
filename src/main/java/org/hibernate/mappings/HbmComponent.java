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
 *         &lt;element ref="{}tuplizer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}parent" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{}property"/&gt;
 *           &lt;element ref="{}many-to-one"/&gt;
 *           &lt;element ref="{}one-to-one"/&gt;
 *           &lt;element ref="{}component"/&gt;
 *           &lt;element ref="{}dynamic-component"/&gt;
 *           &lt;element ref="{}any"/&gt;
 *           &lt;element ref="{}map"/&gt;
 *           &lt;element ref="{}set"/&gt;
 *           &lt;element ref="{}list"/&gt;
 *           &lt;element ref="{}bag"/&gt;
 *           &lt;element ref="{}array"/&gt;
 *           &lt;element ref="{}primitive-array"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="access" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="unique" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="update" default="true"&gt;
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
 *       &lt;attribute name="lazy" default="false"&gt;
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
 *       &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "meta",
        "tuplizer",
        "parent",
        "propertyOrManyToOneOrOneToOne"
})
@XmlRootElement(name = "component")
public class HbmComponent implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    protected List<HbmMeta> meta;
    protected List<HbmTuplizer> tuplizer;
    protected HbmParent parent;
    @XmlElements({
            @XmlElement(name = "property", type = HbmProperty.class),
            @XmlElement(name = "many-to-one", type = HbmManyToOne.class),
            @XmlElement(name = "one-to-one", type = HbmOneToOne.class),
            @XmlElement(name = "component", type = HbmComponent.class),
            @XmlElement(name = "dynamic-component", type = HbmDynamicComponent.class),
            @XmlElement(name = "any", type = HbmAny.class),
            @XmlElement(name = "map", type = HbmMap.class),
            @XmlElement(name = "set", type = HbmSet.class),
            @XmlElement(name = "list", type = HbmList.class),
            @XmlElement(name = "bag", type = HbmBag.class),
            @XmlElement(name = "array", type = HbmArray.class),
            @XmlElement(name = "primitive-array", type = HbmPrimitiveArray.class)
    })
    protected List<IHbmNode> propertyOrManyToOneOrOneToOne;
    @XmlAttribute(name = "class")
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "access")
    @XmlSchemaType(name = "anySimpleType")
    protected String access;
    @XmlAttribute(name = "unique")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unique;
    @XmlAttribute(name = "update")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String update;
    @XmlAttribute(name = "insert")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String insert;
    @XmlAttribute(name = "lazy")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lazy;
    @XmlAttribute(name = "optimistic-lock")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String optimisticLock;
    @XmlAttribute(name = "node")
    @XmlSchemaType(name = "anySimpleType")
    protected String node;

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
     * Gets the value of the tuplizer property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tuplizer property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTuplizer().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmTuplizer }
     */
    public List<HbmTuplizer> getTuplizer() {
        if (tuplizer == null) {
            tuplizer = new ArrayList<HbmTuplizer>();
        }
        return this.tuplizer;
    }

    /**
     * Obtient la valeur de la propriété parent.
     *
     * @return possible object is
     * {@link HbmParent }
     */
    public HbmParent getParent() {
        return parent;
    }

    /**
     * Définit la valeur de la propriété parent.
     *
     * @param value allowed object is
     *              {@link HbmParent }
     */
    public void setParent(HbmParent value) {
        this.parent = value;
    }

    /**
     * Gets the value of the propertyOrManyToOneOrOneToOne property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the propertyOrManyToOneOrOneToOne property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyOrManyToOneOrOneToOne().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmProperty }
     * {@link HbmManyToOne }
     * {@link HbmOneToOne }
     * {@link HbmComponent }
     * {@link HbmDynamicComponent }
     * {@link HbmAny }
     * {@link HbmMap }
     * {@link HbmSet }
     * {@link HbmList }
     * {@link HbmBag }
     * {@link HbmArray }
     * {@link HbmPrimitiveArray }
     */
    public List<IHbmNode> getPropertyOrManyToOneOrOneToOne() {
        if (propertyOrManyToOneOrOneToOne == null) {
            propertyOrManyToOneOrOneToOne = new ArrayList<IHbmNode>();
        }
        return this.propertyOrManyToOneOrOneToOne;
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
     * Obtient la valeur de la propriété update.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUpdate() {
        if (update == null) {
            return "true";
        } else {
            return update;
        }
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

}
