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
 *       &lt;attribute name="usage" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="read-only"/&gt;
 *             &lt;enumeration value="read-write"/&gt;
 *             &lt;enumeration value="nonstrict-read-write"/&gt;
 *             &lt;enumeration value="transactional"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="region" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="include" default="all"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="all"/&gt;
 *             &lt;enumeration value="non-lazy"/&gt;
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
@XmlRootElement(name = "cache")
public class HbmCache implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    @XmlAttribute(name = "usage", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String usage;
    @XmlAttribute(name = "region")
    @XmlSchemaType(name = "anySimpleType")
    protected String region;
    @XmlAttribute(name = "include")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String include;

    /**
     * Obtient la valeur de la propriété usage.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Définit la valeur de la propriété usage.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUsage(String value) {
        this.usage = value;
    }

    /**
     * Obtient la valeur de la propriété region.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRegion() {
        return region;
    }

    /**
     * Définit la valeur de la propriété region.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Obtient la valeur de la propriété include.
     *
     * @return possible object is
     * {@link String }
     */
    public String getInclude() {
        if (include == null) {
            return "all";
        } else {
            return include;
        }
    }

    /**
     * Définit la valeur de la propriété include.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInclude(String value) {
        this.include = value;
    }

}
