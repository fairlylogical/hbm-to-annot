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
 *         &lt;element ref="{}column" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="column" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "column"
})
@XmlRootElement(name = "index")
public class HbmIndex implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    protected List<HbmColumn> column;
    @XmlAttribute(name = "column")
    protected String columnAttr;
    @XmlAttribute(name = "type")
    @XmlSchemaType(name = "anySimpleType")
    protected String typeAttr;
    @XmlAttribute(name = "length")
    @XmlSchemaType(name = "anySimpleType")
    protected String length;

    /**
     * Gets the value of the column property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the column property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumn().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmColumn }
     */
    public List<HbmColumn> getColumn() {
        if (column == null) {
            column = new ArrayList<HbmColumn>();
        }
        return this.column;
    }

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

    /**
     * Obtient la valeur de la propriété length.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLength() {
        return length;
    }

    /**
     * Définit la valeur de la propriété length.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLength(String value) {
        this.length = value;
    }

}
