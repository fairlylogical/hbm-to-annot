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
 *         &lt;element ref="{}column"/&gt;
 *         &lt;element ref="{}column" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id-type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="meta-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "content"
})
@XmlRootElement(name = "index-many-to-any")
public class HbmIndexManyToAny implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    @XmlElementRef(name = "column", type = HbmColumn.class, required = false)
    protected List<HbmColumn> content;
    @XmlAttribute(name = "id-type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String idType;
    @XmlAttribute(name = "meta-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String metaType;

    /**
     * Obtient le reste du modèle de contenu.
     *
     * <p>
     * Vous obtenez la propriété "catch-all" pour la raison suivante :
     * Le nom de champ "Column" est utilisé par deux parties différentes d'un schéma. Reportez-vous à :
     * ligne 2773 sur file:/C:/Users/Shadow/source/repos/hbm-to-annot/src/main/resources/hbm/xsd/real/hibernate-mapping.xsd
     * ligne 2772 sur file:/C:/Users/Shadow/source/repos/hbm-to-annot/src/main/resources/hbm/xsd/real/hibernate-mapping.xsd
     * <p>
     * Pour vous débarrasser de cette propriété, appliquez une personnalisation de propriété à l'une
     * des deux déclarations suivantes afin de modifier leurs noms :
     * Gets the value of the content property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmColumn }
     */
    public List<HbmColumn> getContent() {
        if (content == null) {
            content = new ArrayList<HbmColumn>();
        }
        return this.content;
    }

    /**
     * Obtient la valeur de la propriété idType.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Définit la valeur de la propriété idType.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIdType(String value) {
        this.idType = value;
    }

    /**
     * Obtient la valeur de la propriété metaType.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMetaType() {
        return metaType;
    }

    /**
     * Définit la valeur de la propriété metaType.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMetaType(String value) {
        this.metaType = value;
    }

}
