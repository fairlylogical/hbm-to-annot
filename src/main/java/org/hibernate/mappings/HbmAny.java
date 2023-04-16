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
 *         &lt;element ref="{}meta-value" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}column"/&gt;
 *         &lt;element ref="{}column" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id-type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="meta-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="access" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="insert" default="true"&gt;
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
 *       &lt;attribute name="cascade" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="optimistic-lock" default="true"&gt;
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
 *       &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "content"
})
@XmlRootElement(name = "any")
public class HbmAny implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    @XmlElementRefs({
            @XmlElementRef(name = "meta", type = HbmMeta.class, required = false),
            @XmlElementRef(name = "meta-value", type = HbmMetaValue.class, required = false),
            @XmlElementRef(name = "column", type = HbmColumn.class, required = false)
    })
    protected List<IHbmNode> content;
    @XmlAttribute(name = "id-type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String idType;
    @XmlAttribute(name = "meta-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String metaType;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "access")
    @XmlSchemaType(name = "anySimpleType")
    protected String access;
    @XmlAttribute(name = "insert")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String insert;
    @XmlAttribute(name = "update")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String update;
    @XmlAttribute(name = "cascade")
    @XmlSchemaType(name = "anySimpleType")
    protected String cascade;
    @XmlAttribute(name = "index")
    @XmlSchemaType(name = "anySimpleType")
    protected String index;
    @XmlAttribute(name = "optimistic-lock")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String optimisticLock;
    @XmlAttribute(name = "lazy")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lazy;
    @XmlAttribute(name = "node")
    @XmlSchemaType(name = "anySimpleType")
    protected String node;

    /**
     * Obtient le reste du modèle de contenu.
     *
     * <p>
     * Vous obtenez la propriété "catch-all" pour la raison suivante :
     * Le nom de champ "Column" est utilisé par deux parties différentes d'un schéma. Reportez-vous à :
     * ligne 1352 sur file:/C:/Users/Shadow/source/repos/hbm-to-annot/src/main/resources/hbm/xsd/real/hibernate-mapping.xsd
     * ligne 1351 sur file:/C:/Users/Shadow/source/repos/hbm-to-annot/src/main/resources/hbm/xsd/real/hibernate-mapping.xsd
     * <p>
     * Pour vous débarrasser de cette propriété, appliquez une personnalisation de propriété à l'une
     * des deux déclarations suivantes afin de modifier leurs noms :
     * Gets the value of the content property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmMeta }
     * {@link HbmMetaValue }
     * {@link HbmColumn }
     */
    public List<IHbmNode> getContent() {
        if (content == null) {
            content = new ArrayList<IHbmNode>();
        }
        return this.content;
    }

    /**
     * Obtient la valeur de la propriété idType.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Définit la valeur de la propriété idType.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIdType(String value) {
        this.idType = value;
    }

    /**
     * Obtient la valeur de la propriété metaType.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMetaType() {
        return metaType;
    }

    /**
     * Définit la valeur de la propriété metaType.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMetaType(String value) {
        this.metaType = value;
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
     * Obtient la valeur de la propriété cascade.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCascade() {
        return cascade;
    }

    /**
     * Définit la valeur de la propriété cascade.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCascade(String value) {
        this.cascade = value;
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
