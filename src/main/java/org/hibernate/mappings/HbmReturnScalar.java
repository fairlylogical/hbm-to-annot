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
 *       &lt;attribute name="column" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "return-scalar")
public class HbmReturnScalar implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    @XmlAttribute(name = "column", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String columnAttr;
    @XmlAttribute(name = "type")
    @XmlSchemaType(name = "anySimpleType")
    protected String typeAttr;

    /**
     * Obtient la valeur de la propriété columnAttr.
     *
     * @return possible object is
     * {@link String }
     */
    public String getColumnAttr() {
        return columnAttr;
    }

    /**
     * Définit la valeur de la propriété columnAttr.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setColumnAttr(String value) {
        this.columnAttr = value;
    }

    /**
     * Obtient la valeur de la propriété typeAttr.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTypeAttr() {
        return typeAttr;
    }

    /**
     * Définit la valeur de la propriété typeAttr.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTypeAttr(String value) {
        this.typeAttr = value;
    }

}
