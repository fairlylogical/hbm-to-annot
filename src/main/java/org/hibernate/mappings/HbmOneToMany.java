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
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="not-found" default="exception"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="exception"/&gt;
 *             &lt;enumeration value="ignore"/&gt;
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
 *       &lt;attribute name="entity-name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "one-to-many")
public class HbmOneToMany implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    @XmlAttribute(name = "class")
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute(name = "not-found")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String notFound;
    @XmlAttribute(name = "node")
    @XmlSchemaType(name = "anySimpleType")
    protected String node;
    @XmlAttribute(name = "embed-xml")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String embedXml;
    @XmlAttribute(name = "entity-name")
    @XmlSchemaType(name = "anySimpleType")
    protected String entityName;

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
     * Obtient la valeur de la propriété notFound.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNotFound() {
        if (notFound == null) {
            return "exception";
        } else {
            return notFound;
        }
    }

    /**
     * Définit la valeur de la propriété notFound.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNotFound(String value) {
        this.notFound = value;
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

}
