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
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{}key-property"/&gt;
 *           &lt;element ref="{}key-many-to-one"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}generator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="mapped" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="access" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="unsaved-value" default="undefined"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="undefined"/&gt;
 *             &lt;enumeration value="any"/&gt;
 *             &lt;enumeration value="none"/&gt;
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
        "keyPropertyOrKeyManyToOne",
        "generator"
})
@XmlRootElement(name = "composite-id")
public class HbmCompositeId implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    protected List<HbmMeta> meta;
    @XmlElements({
            @XmlElement(name = "key-property", type = HbmKeyProperty.class),
            @XmlElement(name = "key-many-to-one", type = HbmKeyManyToOne.class)
    })
    protected List<IHbmNode> keyPropertyOrKeyManyToOne;
    protected HbmGenerator generator;
    @XmlAttribute(name = "class")
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute(name = "mapped")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mapped;
    @XmlAttribute(name = "name")
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "node")
    @XmlSchemaType(name = "anySimpleType")
    protected String node;
    @XmlAttribute(name = "access")
    @XmlSchemaType(name = "anySimpleType")
    protected String access;
    @XmlAttribute(name = "unsaved-value")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unsavedValue;

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
     * Gets the value of the keyPropertyOrKeyManyToOne property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the keyPropertyOrKeyManyToOne property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyPropertyOrKeyManyToOne().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmKeyProperty }
     * {@link HbmKeyManyToOne }
     */
    public List<IHbmNode> getKeyPropertyOrKeyManyToOne() {
        if (keyPropertyOrKeyManyToOne == null) {
            keyPropertyOrKeyManyToOne = new ArrayList<IHbmNode>();
        }
        return this.keyPropertyOrKeyManyToOne;
    }

    /**
     * Obtient la valeur de la propriété generator.
     *
     * @return possible object is
     * {@link HbmGenerator }
     */
    public HbmGenerator getGenerator() {
        return generator;
    }

    /**
     * Définit la valeur de la propriété generator.
     *
     * @param value allowed object is
     *              {@link HbmGenerator }
     */
    public void setGenerator(HbmGenerator value) {
        this.generator = value;
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
     * Obtient la valeur de la propriété mapped.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMapped() {
        if (mapped == null) {
            return "false";
        } else {
            return mapped;
        }
    }

    /**
     * Définit la valeur de la propriété mapped.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMapped(String value) {
        this.mapped = value;
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

}
