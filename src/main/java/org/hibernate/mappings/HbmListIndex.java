//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.04.16 à 06:57:33 PM CEST 
//


package org.hibernate.mappings;

import jakarta.xml.bind.annotation.*;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{}column" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="column" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="base" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "column"
})
@XmlRootElement(name = "list-index")
public class HbmListIndex implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    protected HbmColumn column;
    @XmlAttribute(name = "column")
    protected String columnAttr222;
    @XmlAttribute(name = "base")
    @XmlSchemaType(name = "anySimpleType")
    protected String base;

    /**
     * Obtient la valeur de la propriété column.
     *
     * @return possible object is
     * {@link HbmColumn }
     */
    public HbmColumn getColumn() {
        return column;
    }

    /**
     * Définit la valeur de la propriété column.
     *
     * @param value allowed object is
     *              {@link HbmColumn }
     */
    public void setColumn(HbmColumn value) {
        this.column = value;
    }

    /**
     * Obtient la valeur de la propriété columnAttr222.
     *
     * @return possible object is
     * {@link String }
     */
    public String getColumnAttr222() {
        return columnAttr222;
    }

    /**
     * Définit la valeur de la propriété columnAttr222.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setColumnAttr222(String value) {
        this.columnAttr222 = value;
    }

    /**
     * Obtient la valeur de la propriété base.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBase() {
        if (base == null) {
            return "0";
        } else {
            return base;
        }
    }

    /**
     * Définit la valeur de la propriété base.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBase(String value) {
        this.base = value;
    }

}
