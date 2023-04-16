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
 *       &lt;attribute name="callable" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="check"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="none"/&gt;
 *             &lt;enumeration value="rowcount"/&gt;
 *             &lt;enumeration value="param"/&gt;
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
        "content"
})
@XmlRootElement(name = "sql-insert")
public class HbmSqlInsert implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    @XmlValue
    protected String content;
    @XmlAttribute(name = "callable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String callable;
    @XmlAttribute(name = "check")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String check;

    /**
     * Obtient la valeur de la propriété content.
     *
     * @return possible object is
     * {@link String }
     */
    public String getContent() {
        return content;
    }

    /**
     * Définit la valeur de la propriété content.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Obtient la valeur de la propriété callable.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCallable() {
        if (callable == null) {
            return "false";
        } else {
            return callable;
        }
    }

    /**
     * Définit la valeur de la propriété callable.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCallable(String value) {
        this.callable = value;
    }

    /**
     * Obtient la valeur de la propriété check.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCheck() {
        return check;
    }

    /**
     * Définit la valeur de la propriété check.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCheck(String value) {
        this.check = value;
    }

}
