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
 *       &lt;attribute name="entity" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="association" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="style" default="join"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="join"/&gt;
 *             &lt;enumeration value="select"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "fetch")
public class HbmFetch implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    @XmlAttribute(name = "entity")
    @XmlSchemaType(name = "anySimpleType")
    protected String entity;
    @XmlAttribute(name = "association", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String association;
    @XmlAttribute(name = "style")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String style;

    /**
     * Obtient la valeur de la propriété entity.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEntity() {
        return entity;
    }

    /**
     * Définit la valeur de la propriété entity.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEntity(String value) {
        this.entity = value;
    }

    /**
     * Obtient la valeur de la propriété association.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAssociation() {
        return association;
    }

    /**
     * Définit la valeur de la propriété association.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAssociation(String value) {
        this.association = value;
    }

    /**
     * Obtient la valeur de la propriété style.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStyle() {
        if (style == null) {
            return "join";
        } else {
            return style;
        }
    }

    /**
     * Définit la valeur de la propriété style.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStyle(String value) {
        this.style = value;
    }

}
