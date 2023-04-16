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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{}return-scalar"/&gt;
 *         &lt;element ref="{}return"/&gt;
 *         &lt;element ref="{}return-join"/&gt;
 *         &lt;element ref="{}load-collection"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "returnScalarOrReturnOrReturnJoin"
})
@XmlRootElement(name = "resultset")
public class HbmResultset implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    @XmlElements({
            @XmlElement(name = "return-scalar", type = HbmReturnScalar.class),
            @XmlElement(name = "return", type = HbmReturn.class),
            @XmlElement(name = "return-join", type = HbmReturnJoin.class),
            @XmlElement(name = "load-collection", type = HbmLoadCollection.class)
    })
    protected List<IHbmNode> returnScalarOrReturnOrReturnJoin;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;

    /**
     * Gets the value of the returnScalarOrReturnOrReturnJoin property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the returnScalarOrReturnOrReturnJoin property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnScalarOrReturnOrReturnJoin().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmReturnScalar }
     * {@link HbmReturn }
     * {@link HbmReturnJoin }
     * {@link HbmLoadCollection }
     */
    public List<IHbmNode> getReturnScalarOrReturnOrReturnJoin() {
        if (returnScalarOrReturnOrReturnJoin == null) {
            returnScalarOrReturnOrReturnJoin = new ArrayList<IHbmNode>();
        }
        return this.returnScalarOrReturnOrReturnJoin;
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

}
