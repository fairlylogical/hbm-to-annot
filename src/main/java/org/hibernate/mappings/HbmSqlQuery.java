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
 *         &lt;element ref="{}return-scalar"/&gt;
 *         &lt;element ref="{}return"/&gt;
 *         &lt;element ref="{}return-join"/&gt;
 *         &lt;element ref="{}load-collection"/&gt;
 *         &lt;element ref="{}synchronize"/&gt;
 *         &lt;element ref="{}query-param"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="resultset-ref" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="flush-mode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="auto"/&gt;
 *             &lt;enumeration value="never"/&gt;
 *             &lt;enumeration value="always"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="cacheable" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="cache-region" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="fetch-size" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="timeout" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="cache-mode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="get"/&gt;
 *             &lt;enumeration value="ignore"/&gt;
 *             &lt;enumeration value="normal"/&gt;
 *             &lt;enumeration value="put"/&gt;
 *             &lt;enumeration value="refresh"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="read-only"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="comment" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="callable" default="false"&gt;
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
        "content"
})
@XmlRootElement(name = "sql-query")
public class HbmSqlQuery implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    @XmlElementRefs({
            @XmlElementRef(name = "return-scalar", type = HbmReturnScalar.class, required = false),
            @XmlElementRef(name = "return", type = HbmReturn.class, required = false),
            @XmlElementRef(name = "return-join", type = HbmReturnJoin.class, required = false),
            @XmlElementRef(name = "load-collection", type = HbmLoadCollection.class, required = false),
            @XmlElementRef(name = "synchronize", type = HbmSynchronize.class, required = false),
            @XmlElementRef(name = "query-param", type = HbmQueryParam.class, required = false)
    })
    @XmlMixed
    protected List<IHbmNode> content;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "resultset-ref")
    @XmlSchemaType(name = "anySimpleType")
    protected String resultsetRef;
    @XmlAttribute(name = "flush-mode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flushMode;
    @XmlAttribute(name = "cacheable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cacheable;
    @XmlAttribute(name = "cache-region")
    @XmlSchemaType(name = "anySimpleType")
    protected String cacheRegion;
    @XmlAttribute(name = "fetch-size")
    @XmlSchemaType(name = "anySimpleType")
    protected String fetchSize;
    @XmlAttribute(name = "timeout")
    @XmlSchemaType(name = "anySimpleType")
    protected String timeout;
    @XmlAttribute(name = "cache-mode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cacheMode;
    @XmlAttribute(name = "read-only")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String readOnly;
    @XmlAttribute(name = "comment")
    @XmlSchemaType(name = "anySimpleType")
    protected String comment;
    @XmlAttribute(name = "callable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String callable;

    /**
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
     * {@link HbmReturnScalar }
     * {@link HbmReturn }
     * {@link HbmReturnJoin }
     * {@link HbmLoadCollection }
     * {@link HbmSynchronize }
     * {@link HbmQueryParam }
     * {@link String }
     */
    public List<IHbmNode> getContent() {
        if (content == null) {
            content = new ArrayList<IHbmNode>();
        }
        return this.content;
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

    /**
     * Obtient la valeur de la propriété resultsetRef.
     *
     * @return possible object is
     * {@link String }
     */
    public String getResultsetRef() {
        return resultsetRef;
    }

    /**
     * Définit la valeur de la propriété resultsetRef.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setResultsetRef(String value) {
        this.resultsetRef = value;
    }

    /**
     * Obtient la valeur de la propriété flushMode.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFlushMode() {
        return flushMode;
    }

    /**
     * Définit la valeur de la propriété flushMode.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFlushMode(String value) {
        this.flushMode = value;
    }

    /**
     * Obtient la valeur de la propriété cacheable.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCacheable() {
        if (cacheable == null) {
            return "false";
        } else {
            return cacheable;
        }
    }

    /**
     * Définit la valeur de la propriété cacheable.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCacheable(String value) {
        this.cacheable = value;
    }

    /**
     * Obtient la valeur de la propriété cacheRegion.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCacheRegion() {
        return cacheRegion;
    }

    /**
     * Définit la valeur de la propriété cacheRegion.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCacheRegion(String value) {
        this.cacheRegion = value;
    }

    /**
     * Obtient la valeur de la propriété fetchSize.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFetchSize() {
        return fetchSize;
    }

    /**
     * Définit la valeur de la propriété fetchSize.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFetchSize(String value) {
        this.fetchSize = value;
    }

    /**
     * Obtient la valeur de la propriété timeout.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTimeout() {
        return timeout;
    }

    /**
     * Définit la valeur de la propriété timeout.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTimeout(String value) {
        this.timeout = value;
    }

    /**
     * Obtient la valeur de la propriété cacheMode.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCacheMode() {
        return cacheMode;
    }

    /**
     * Définit la valeur de la propriété cacheMode.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCacheMode(String value) {
        this.cacheMode = value;
    }

    /**
     * Obtient la valeur de la propriété readOnly.
     *
     * @return possible object is
     * {@link String }
     */
    public String getReadOnly() {
        return readOnly;
    }

    /**
     * Définit la valeur de la propriété readOnly.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReadOnly(String value) {
        this.readOnly = value;
    }

    /**
     * Obtient la valeur de la propriété comment.
     *
     * @return possible object is
     * {@link String }
     */
    public String getComment() {
        return comment;
    }

    /**
     * Définit la valeur de la propriété comment.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setComment(String value) {
        this.comment = value;
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

}
