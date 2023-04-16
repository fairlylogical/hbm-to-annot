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
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{}key-property"/&gt;
 *         &lt;element ref="{}key-many-to-one"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "keyPropertyOrKeyManyToOne"
})
@XmlRootElement(name = "composite-index")
public class HbmCompositeIndex implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    @XmlElements({
            @XmlElement(name = "key-property", type = HbmKeyProperty.class),
            @XmlElement(name = "key-many-to-one", type = HbmKeyManyToOne.class)
    })
    protected List<IHbmNode> keyPropertyOrKeyManyToOne;
    @XmlAttribute(name = "class", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;

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

}
