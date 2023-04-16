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
 *         &lt;element ref="{}formula" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="formula" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="access" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="entity-name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="cascade" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="outer-join"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *             &lt;enumeration value="auto"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="fetch"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="join"/&gt;
 *             &lt;enumeration value="select"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="constrained" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="foreign-key" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="property-ref" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="lazy"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="false"/&gt;
 *             &lt;enumeration value="proxy"/&gt;
 *             &lt;enumeration value="no-proxy"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="embed-xml"&gt;
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
        "formula"
})
@XmlRootElement(name = "one-to-one")
public class HbmOneToOne implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    protected List<HbmMeta> meta;
    protected List<String> formula;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "formula")
    @XmlSchemaType(name = "anySimpleType")
    protected String formulaAttr;
    @XmlAttribute(name = "access")
    @XmlSchemaType(name = "anySimpleType")
    protected String access;
    @XmlAttribute(name = "class")
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute(name = "entity-name")
    @XmlSchemaType(name = "anySimpleType")
    protected String entityName;
    @XmlAttribute(name = "cascade")
    @XmlSchemaType(name = "anySimpleType")
    protected String cascade;
    @XmlAttribute(name = "outer-join")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outerJoin;
    @XmlAttribute(name = "fetch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fetch;
    @XmlAttribute(name = "constrained")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String constrained;
    @XmlAttribute(name = "foreign-key")
    @XmlSchemaType(name = "anySimpleType")
    protected String foreignKey;
    @XmlAttribute(name = "property-ref")
    @XmlSchemaType(name = "anySimpleType")
    protected String propertyRef;
    @XmlAttribute(name = "lazy")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lazy;
    @XmlAttribute(name = "node")
    @XmlSchemaType(name = "anySimpleType")
    protected String node;
    @XmlAttribute(name = "embed-xml")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String embedXml;

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
     * Gets the value of the formula property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the formula property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormula().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getFormula() {
        if (formula == null) {
            formula = new ArrayList<String>();
        }
        return this.formula;
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
     * Obtient la valeur de la propriété outerJoin.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOuterJoin() {
        return outerJoin;
    }

    /**
     * Définit la valeur de la propriété outerJoin.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOuterJoin(String value) {
        this.outerJoin = value;
    }

    /**
     * Obtient la valeur de la propriété fetch.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFetch() {
        return fetch;
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
     * Obtient la valeur de la propriété constrained.
     *
     * @return possible object is
     * {@link String }
     */
    public String getConstrained() {
        if (constrained == null) {
            return "false";
        } else {
            return constrained;
        }
    }

    /**
     * Définit la valeur de la propriété constrained.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setConstrained(String value) {
        this.constrained = value;
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

    /**
     * Obtient la valeur de la propriété propertyRef.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPropertyRef() {
        return propertyRef;
    }

    /**
     * Définit la valeur de la propriété propertyRef.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPropertyRef(String value) {
        this.propertyRef = value;
    }

    /**
     * Obtient la valeur de la propriété lazy.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLazy() {
        return lazy;
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

    /**
     * Obtient la valeur de la propriété embedXml.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEmbedXml() {
        return embedXml;
    }

    /**
     * Définit la valeur de la propriété embedXml.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmbedXml(String value) {
        this.embedXml = value;
    }

}
