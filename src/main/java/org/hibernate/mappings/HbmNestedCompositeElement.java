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
 *       &lt;sequence&gt;
 *         &lt;element ref="{}parent" minOccurs="0"/&gt;
 *         &lt;element ref="{}tuplizer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{}property"/&gt;
 *           &lt;element ref="{}many-to-one"/&gt;
 *           &lt;element ref="{}any"/&gt;
 *           &lt;element ref="{}nested-composite-element"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="access" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "parent",
        "tuplizer",
        "propertyOrManyToOneOrAny"
})
@XmlRootElement(name = "nested-composite-element")
public class HbmNestedCompositeElement implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    protected HbmParent parent;
    protected List<HbmTuplizer> tuplizer;
    @XmlElements({
            @XmlElement(name = "property", type = HbmProperty.class),
            @XmlElement(name = "many-to-one", type = HbmManyToOne.class),
            @XmlElement(name = "any", type = HbmAny.class),
            @XmlElement(name = "nested-composite-element", type = HbmNestedCompositeElement.class)
    })
    protected List<IHbmNode> propertyOrManyToOneOrAny;
    @XmlAttribute(name = "class", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "access")
    @XmlSchemaType(name = "anySimpleType")
    protected String access;
    @XmlAttribute(name = "node")
    @XmlSchemaType(name = "anySimpleType")
    protected String node;

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
     * Gets the value of the propertyOrManyToOneOrAny property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the propertyOrManyToOneOrAny property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyOrManyToOneOrAny().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmProperty }
     * {@link HbmManyToOne }
     * {@link HbmAny }
     * {@link HbmNestedCompositeElement }
     */
    public List<IHbmNode> getPropertyOrManyToOneOrAny() {
        if (propertyOrManyToOneOrAny == null) {
            propertyOrManyToOneOrAny = new ArrayList<IHbmNode>();
        }
        return this.propertyOrManyToOneOrAny;
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
