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
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{}return-discriminator" minOccurs="0"/&gt;
 *         &lt;element ref="{}return-property"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="alias" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="entity-name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="lock-mode" default="read"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="none"/&gt;
 *             &lt;enumeration value="read"/&gt;
 *             &lt;enumeration value="upgrade"/&gt;
 *             &lt;enumeration value="upgrade-nowait"/&gt;
 *             &lt;enumeration value="upgrade-skiplocked"/&gt;
 *             &lt;enumeration value="write"/&gt;
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
        "returnDiscriminatorAndReturnProperty"
})
@XmlRootElement(name = "return")
public class HbmReturn implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    @XmlElements({
            @XmlElement(name = "return-discriminator", type = HbmReturnDiscriminator.class),
            @XmlElement(name = "return-property", type = HbmReturnProperty.class)
    })
    protected List<IHbmNode> returnDiscriminatorAndReturnProperty;
    @XmlAttribute(name = "alias")
    @XmlSchemaType(name = "anySimpleType")
    protected String alias;
    @XmlAttribute(name = "entity-name")
    @XmlSchemaType(name = "anySimpleType")
    protected String entityName;
    @XmlAttribute(name = "class")
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute(name = "lock-mode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lockMode;

    /**
     * Gets the value of the returnDiscriminatorAndReturnProperty property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the returnDiscriminatorAndReturnProperty property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnDiscriminatorAndReturnProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmReturnDiscriminator }
     * {@link HbmReturnProperty }
     */
    public List<IHbmNode> getReturnDiscriminatorAndReturnProperty() {
        if (returnDiscriminatorAndReturnProperty == null) {
            returnDiscriminatorAndReturnProperty = new ArrayList<IHbmNode>();
        }
        return this.returnDiscriminatorAndReturnProperty;
    }

    /**
     * Obtient la valeur de la propriété alias.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Définit la valeur de la propriété alias.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAlias(String value) {
        this.alias = value;
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
     * Obtient la valeur de la propriété lockMode.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLockMode() {
        if (lockMode == null) {
            return "read";
        } else {
            return lockMode;
        }
    }

    /**
     * Définit la valeur de la propriété lockMode.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLockMode(String value) {
        this.lockMode = value;
    }

}
