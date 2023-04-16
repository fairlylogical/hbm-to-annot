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
 *         &lt;choice&gt;
 *           &lt;element ref="{}definition"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{}create"/&gt;
 *             &lt;element ref="{}drop"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}dialect-scope" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "definition",
        "create",
        "drop",
        "dialectScope"
})
@XmlRootElement(name = "database-object")
public class HbmDatabaseObject implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    protected HbmDefinition definition;
    protected String create;
    protected String drop;
    @XmlElement(name = "dialect-scope")
    protected List<HbmDialectScope> dialectScope;

    /**
     * Obtient la valeur de la propriété definition.
     *
     * @return possible object is
     * {@link HbmDefinition }
     */
    public HbmDefinition getDefinition() {
        return definition;
    }

    /**
     * Définit la valeur de la propriété definition.
     *
     * @param value allowed object is
     *              {@link HbmDefinition }
     */
    public void setDefinition(HbmDefinition value) {
        this.definition = value;
    }

    /**
     * Obtient la valeur de la propriété create.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCreate() {
        return create;
    }

    /**
     * Définit la valeur de la propriété create.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCreate(String value) {
        this.create = value;
    }

    /**
     * Obtient la valeur de la propriété drop.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDrop() {
        return drop;
    }

    /**
     * Définit la valeur de la propriété drop.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDrop(String value) {
        this.drop = value;
    }

    /**
     * Gets the value of the dialectScope property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dialectScope property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDialectScope().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmDialectScope }
     */
    public List<HbmDialectScope> getDialectScope() {
        if (dialectScope == null) {
            dialectScope = new ArrayList<HbmDialectScope>();
        }
        return this.dialectScope;
    }

}
