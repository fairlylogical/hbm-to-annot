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
 *       &lt;sequence&gt;
 *         &lt;element ref="{}comment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="precision" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="scale" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="not-null"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="unique"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="unique-key" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="sql-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="check" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="read" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="write" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "comment"
})
@XmlRootElement(name = "column")
public class HbmColumn implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    protected String comment;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "length")
    @XmlSchemaType(name = "anySimpleType")
    protected String length;
    @XmlAttribute(name = "precision")
    @XmlSchemaType(name = "anySimpleType")
    protected String precision;
    @XmlAttribute(name = "scale")
    @XmlSchemaType(name = "anySimpleType")
    protected String scale;
    @XmlAttribute(name = "not-null")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String notNull;
    @XmlAttribute(name = "unique")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unique;
    @XmlAttribute(name = "unique-key")
    @XmlSchemaType(name = "anySimpleType")
    protected String uniqueKey;
    @XmlAttribute(name = "sql-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String sqlType;
    @XmlAttribute(name = "index")
    @XmlSchemaType(name = "anySimpleType")
    protected String index;
    @XmlAttribute(name = "check")
    @XmlSchemaType(name = "anySimpleType")
    protected String check;
    @XmlAttribute(name = "default")
    @XmlSchemaType(name = "anySimpleType")
    protected String _default;
    @XmlAttribute(name = "read")
    @XmlSchemaType(name = "anySimpleType")
    protected String read;
    @XmlAttribute(name = "write")
    @XmlSchemaType(name = "anySimpleType")
    protected String write;

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

    /**
     * Obtient la valeur de la propriété precision.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPrecision() {
        return precision;
    }

    /**
     * Définit la valeur de la propriété precision.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPrecision(String value) {
        this.precision = value;
    }

    /**
     * Obtient la valeur de la propriété scale.
     *
     * @return possible object is
     * {@link String }
     */
    public String getScale() {
        return scale;
    }

    /**
     * Définit la valeur de la propriété scale.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setScale(String value) {
        this.scale = value;
    }

    /**
     * Obtient la valeur de la propriété notNull.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNotNull() {
        return notNull;
    }

    /**
     * Définit la valeur de la propriété notNull.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNotNull(String value) {
        this.notNull = value;
    }

    /**
     * Obtient la valeur de la propriété unique.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnique() {
        return unique;
    }

    /**
     * Définit la valeur de la propriété unique.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnique(String value) {
        this.unique = value;
    }

    /**
     * Obtient la valeur de la propriété uniqueKey.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUniqueKey() {
        return uniqueKey;
    }

    /**
     * Définit la valeur de la propriété uniqueKey.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUniqueKey(String value) {
        this.uniqueKey = value;
    }

    /**
     * Obtient la valeur de la propriété sqlType.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSqlType() {
        return sqlType;
    }

    /**
     * Définit la valeur de la propriété sqlType.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSqlType(String value) {
        this.sqlType = value;
    }

    /**
     * Obtient la valeur de la propriété index.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIndex() {
        return index;
    }

    /**
     * Définit la valeur de la propriété index.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIndex(String value) {
        this.index = value;
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

    /**
     * Obtient la valeur de la propriété default.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDefault() {
        return _default;
    }

    /**
     * Définit la valeur de la propriété default.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDefault(String value) {
        this._default = value;
    }

    /**
     * Obtient la valeur de la propriété read.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRead() {
        return read;
    }

    /**
     * Définit la valeur de la propriété read.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRead(String value) {
        this.read = value;
    }

    /**
     * Obtient la valeur de la propriété write.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWrite() {
        return write;
    }

    /**
     * Définit la valeur de la propriété write.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWrite(String value) {
        this.write = value;
    }

}
