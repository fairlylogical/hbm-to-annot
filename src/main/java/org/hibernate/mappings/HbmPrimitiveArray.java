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
 *       &lt;sequence&gt;
 *         &lt;element ref="{}meta" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}subselect" minOccurs="0"/&gt;
 *         &lt;element ref="{}cache" minOccurs="0"/&gt;
 *         &lt;element ref="{}synchronize" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}comment" minOccurs="0"/&gt;
 *         &lt;element ref="{}key"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}index"/&gt;
 *           &lt;element ref="{}list-index"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}element"/&gt;
 *         &lt;element ref="{}loader" minOccurs="0"/&gt;
 *         &lt;element ref="{}sql-insert" minOccurs="0"/&gt;
 *         &lt;element ref="{}sql-update" minOccurs="0"/&gt;
 *         &lt;element ref="{}sql-delete" minOccurs="0"/&gt;
 *         &lt;element ref="{}sql-delete-all" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="access" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="table" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="schema" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="catalog" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="subselect" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="mutable" default="true"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="where" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="batch-size" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="outer-join"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *             &lt;enumeration value="auto"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="fetch"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="join"/&gt;
 *             &lt;enumeration value="select"/&gt;
 *             &lt;enumeration value="subselect"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="persister" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="collection-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="check" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="optimistic-lock" default="true"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="embed-xml"&gt;
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
        "meta",
        "subselect",
        "cache",
        "synchronize",
        "comment",
        "key",
        "index",
        "listIndex",
        "element",
        "loader",
        "sqlInsert",
        "sqlUpdate",
        "sqlDelete",
        "sqlDeleteAll"
})
@XmlRootElement(name = "primitive-array")
public class HbmPrimitiveArray implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    protected List<HbmMeta> meta;
    protected String subselect;
    protected HbmCache cache;
    protected List<HbmSynchronize> synchronize;
    protected String comment;
    @XmlElement(required = true)
    protected HbmKey key;
    protected HbmIndex index;
    @XmlElement(name = "list-index")
    protected HbmListIndex listIndex;
    @XmlElement(required = true)
    protected HbmElement element;
    protected HbmLoader loader;
    @XmlElement(name = "sql-insert")
    protected HbmSqlInsert sqlInsert;
    @XmlElement(name = "sql-update")
    protected HbmSqlUpdate sqlUpdate;
    @XmlElement(name = "sql-delete")
    protected HbmSqlDelete sqlDelete;
    @XmlElement(name = "sql-delete-all")
    protected HbmSqlDeleteAll sqlDeleteAll;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "access")
    @XmlSchemaType(name = "anySimpleType")
    protected String access;
    @XmlAttribute(name = "table")
    @XmlSchemaType(name = "anySimpleType")
    protected String table;
    @XmlAttribute(name = "schema")
    @XmlSchemaType(name = "anySimpleType")
    protected String schema;
    @XmlAttribute(name = "catalog")
    @XmlSchemaType(name = "anySimpleType")
    protected String catalog;
    @XmlAttribute(name = "subselect")
    @XmlSchemaType(name = "anySimpleType")
    protected String subselectAttr;
    @XmlAttribute(name = "mutable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mutable;
    @XmlAttribute(name = "where")
    @XmlSchemaType(name = "anySimpleType")
    protected String where;
    @XmlAttribute(name = "batch-size")
    @XmlSchemaType(name = "anySimpleType")
    protected String batchSize;
    @XmlAttribute(name = "outer-join")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outerJoin;
    @XmlAttribute(name = "fetch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fetch;
    @XmlAttribute(name = "persister")
    @XmlSchemaType(name = "anySimpleType")
    protected String persister;
    @XmlAttribute(name = "collection-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String collectionType;
    @XmlAttribute(name = "check")
    @XmlSchemaType(name = "anySimpleType")
    protected String check;
    @XmlAttribute(name = "optimistic-lock")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String optimisticLock;
    @XmlAttribute(name = "node")
    @XmlSchemaType(name = "anySimpleType")
    protected String node;
    @XmlAttribute(name = "embed-xml")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String embedXml;

    /**
     * Gets the value of the meta property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the meta property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeta().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmMeta }
     */
    public List<HbmMeta> getMeta() {
        if (meta == null) {
            meta = new ArrayList<HbmMeta>();
        }
        return this.meta;
    }

    /**
     * Obtient la valeur de la propriété subselect.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSubselect() {
        return subselect;
    }

    /**
     * Définit la valeur de la propriété subselect.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSubselect(String value) {
        this.subselect = value;
    }

    /**
     * Obtient la valeur de la propriété cache.
     *
     * @return possible object is
     * {@link HbmCache }
     */
    public HbmCache getCache() {
        return cache;
    }

    /**
     * Définit la valeur de la propriété cache.
     *
     * @param value allowed object is
     *              {@link HbmCache }
     */
    public void setCache(HbmCache value) {
        this.cache = value;
    }

    /**
     * Gets the value of the synchronize property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the synchronize property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSynchronize().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmSynchronize }
     */
    public List<HbmSynchronize> getSynchronize() {
        if (synchronize == null) {
            synchronize = new ArrayList<HbmSynchronize>();
        }
        return this.synchronize;
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
     * Obtient la valeur de la propriété key.
     *
     * @return possible object is
     * {@link HbmKey }
     */
    public HbmKey getKey() {
        return key;
    }

    /**
     * Définit la valeur de la propriété key.
     *
     * @param value allowed object is
     *              {@link HbmKey }
     */
    public void setKey(HbmKey value) {
        this.key = value;
    }

    /**
     * Obtient la valeur de la propriété index.
     *
     * @return possible object is
     * {@link HbmIndex }
     */
    public HbmIndex getIndex() {
        return index;
    }

    /**
     * Définit la valeur de la propriété index.
     *
     * @param value allowed object is
     *              {@link HbmIndex }
     */
    public void setIndex(HbmIndex value) {
        this.index = value;
    }

    /**
     * Obtient la valeur de la propriété listIndex.
     *
     * @return possible object is
     * {@link HbmListIndex }
     */
    public HbmListIndex getListIndex() {
        return listIndex;
    }

    /**
     * Définit la valeur de la propriété listIndex.
     *
     * @param value allowed object is
     *              {@link HbmListIndex }
     */
    public void setListIndex(HbmListIndex value) {
        this.listIndex = value;
    }

    /**
     * Obtient la valeur de la propriété element.
     *
     * @return possible object is
     * {@link HbmElement }
     */
    public HbmElement getElement() {
        return element;
    }

    /**
     * Définit la valeur de la propriété element.
     *
     * @param value allowed object is
     *              {@link HbmElement }
     */
    public void setElement(HbmElement value) {
        this.element = value;
    }

    /**
     * Obtient la valeur de la propriété loader.
     *
     * @return possible object is
     * {@link HbmLoader }
     */
    public HbmLoader getLoader() {
        return loader;
    }

    /**
     * Définit la valeur de la propriété loader.
     *
     * @param value allowed object is
     *              {@link HbmLoader }
     */
    public void setLoader(HbmLoader value) {
        this.loader = value;
    }

    /**
     * Obtient la valeur de la propriété sqlInsert.
     *
     * @return possible object is
     * {@link HbmSqlInsert }
     */
    public HbmSqlInsert getSqlInsert() {
        return sqlInsert;
    }

    /**
     * Définit la valeur de la propriété sqlInsert.
     *
     * @param value allowed object is
     *              {@link HbmSqlInsert }
     */
    public void setSqlInsert(HbmSqlInsert value) {
        this.sqlInsert = value;
    }

    /**
     * Obtient la valeur de la propriété sqlUpdate.
     *
     * @return possible object is
     * {@link HbmSqlUpdate }
     */
    public HbmSqlUpdate getSqlUpdate() {
        return sqlUpdate;
    }

    /**
     * Définit la valeur de la propriété sqlUpdate.
     *
     * @param value allowed object is
     *              {@link HbmSqlUpdate }
     */
    public void setSqlUpdate(HbmSqlUpdate value) {
        this.sqlUpdate = value;
    }

    /**
     * Obtient la valeur de la propriété sqlDelete.
     *
     * @return possible object is
     * {@link HbmSqlDelete }
     */
    public HbmSqlDelete getSqlDelete() {
        return sqlDelete;
    }

    /**
     * Définit la valeur de la propriété sqlDelete.
     *
     * @param value allowed object is
     *              {@link HbmSqlDelete }
     */
    public void setSqlDelete(HbmSqlDelete value) {
        this.sqlDelete = value;
    }

    /**
     * Obtient la valeur de la propriété sqlDeleteAll.
     *
     * @return possible object is
     * {@link HbmSqlDeleteAll }
     */
    public HbmSqlDeleteAll getSqlDeleteAll() {
        return sqlDeleteAll;
    }

    /**
     * Définit la valeur de la propriété sqlDeleteAll.
     *
     * @param value allowed object is
     *              {@link HbmSqlDeleteAll }
     */
    public void setSqlDeleteAll(HbmSqlDeleteAll value) {
        this.sqlDeleteAll = value;
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
     * Obtient la valeur de la propriété access.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAccess() {
        return access;
    }

    /**
     * Définit la valeur de la propriété access.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAccess(String value) {
        this.access = value;
    }

    /**
     * Obtient la valeur de la propriété table.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTable() {
        return table;
    }

    /**
     * Définit la valeur de la propriété table.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTable(String value) {
        this.table = value;
    }

    /**
     * Obtient la valeur de la propriété schema.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Définit la valeur de la propriété schema.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSchema(String value) {
        this.schema = value;
    }

    /**
     * Obtient la valeur de la propriété catalog.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCatalog() {
        return catalog;
    }

    /**
     * Définit la valeur de la propriété catalog.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCatalog(String value) {
        this.catalog = value;
    }

    /**
     * Obtient la valeur de la propriété subselectAttr.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSubselectAttr() {
        return subselectAttr;
    }

    /**
     * Définit la valeur de la propriété subselectAttr.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSubselectAttr(String value) {
        this.subselectAttr = value;
    }

    /**
     * Obtient la valeur de la propriété mutable.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMutable() {
        if (mutable == null) {
            return "true";
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

    /**
     * Obtient la valeur de la propriété where.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWhere() {
        return where;
    }

    /**
     * Définit la valeur de la propriété where.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWhere(String value) {
        this.where = value;
    }

    /**
     * Obtient la valeur de la propriété batchSize.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBatchSize() {
        return batchSize;
    }

    /**
     * Définit la valeur de la propriété batchSize.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBatchSize(String value) {
        this.batchSize = value;
    }

    /**
     * Obtient la valeur de la propriété outerJoin.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOuterJoin() {
        return outerJoin;
    }

    /**
     * Définit la valeur de la propriété outerJoin.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOuterJoin(String value) {
        this.outerJoin = value;
    }

    /**
     * Obtient la valeur de la propriété fetch.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFetch() {
        return fetch;
    }

    /**
     * Définit la valeur de la propriété fetch.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFetch(String value) {
        this.fetch = value;
    }

    /**
     * Obtient la valeur de la propriété persister.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPersister() {
        return persister;
    }

    /**
     * Définit la valeur de la propriété persister.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPersister(String value) {
        this.persister = value;
    }

    /**
     * Obtient la valeur de la propriété collectionType.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCollectionType() {
        return collectionType;
    }

    /**
     * Définit la valeur de la propriété collectionType.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCollectionType(String value) {
        this.collectionType = value;
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
     * Obtient la valeur de la propriété optimisticLock.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOptimisticLock() {
        if (optimisticLock == null) {
            return "true";
        } else {
            return optimisticLock;
        }
    }

    /**
     * Définit la valeur de la propriété optimisticLock.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOptimisticLock(String value) {
        this.optimisticLock = value;
    }

    /**
     * Obtient la valeur de la propriété node.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNode() {
        return node;
    }

    /**
     * Définit la valeur de la propriété node.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNode(String value) {
        this.node = value;
    }

    /**
     * Obtient la valeur de la propriété embedXml.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEmbedXml() {
        return embedXml;
    }

    /**
     * Définit la valeur de la propriété embedXml.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmbedXml(String value) {
        this.embedXml = value;
    }

}
