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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{}property"/&gt;
 *         &lt;element ref="{}many-to-one"/&gt;
 *         &lt;element ref="{}component"/&gt;
 *         &lt;element ref="{}dynamic-component"/&gt;
 *         &lt;element ref="{}any"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="mutable" default="false"&gt;
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
        "propertyOrManyToOneOrComponent"
})
@XmlRootElement(name = "natural-id")
public class HbmNaturalId implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    @XmlElements({
            @XmlElement(name = "property", type = HbmProperty.class),
            @XmlElement(name = "many-to-one", type = HbmManyToOne.class),
            @XmlElement(name = "component", type = HbmComponent.class),
            @XmlElement(name = "dynamic-component", type = HbmDynamicComponent.class),
            @XmlElement(name = "any", type = HbmAny.class)
    })
    protected List<IHbmNode> propertyOrManyToOneOrComponent;
    @XmlAttribute(name = "mutable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mutable;

    /**
     * Gets the value of the propertyOrManyToOneOrComponent property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the propertyOrManyToOneOrComponent property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyOrManyToOneOrComponent().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmProperty }
     * {@link HbmManyToOne }
     * {@link HbmComponent }
     * {@link HbmDynamicComponent }
     * {@link HbmAny }
     */
    public List<IHbmNode> getPropertyOrManyToOneOrComponent() {
        if (propertyOrManyToOneOrComponent == null) {
            propertyOrManyToOneOrComponent = new ArrayList<IHbmNode>();
        }
        return this.propertyOrManyToOneOrComponent;
    }

    /**
     * Obtient la valeur de la propriété mutable.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMutable() {
        if (mutable == null) {
            return "false";
        } else {
            return mutable;
        }
    }

    /**
     * Définit la valeur de la propriété mutable.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMutable(String value) {
        this.mutable = value;
    }

}
