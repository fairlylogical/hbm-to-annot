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
 *         &lt;element ref="{}synchronize" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}comment" minOccurs="0"/&gt;
 *         &lt;element ref="{}tuplizer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}key"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{}property"/&gt;
 *           &lt;element ref="{}many-to-one"/&gt;
 *           &lt;element ref="{}one-to-one"/&gt;
 *           &lt;element ref="{}component"/&gt;
 *           &lt;element ref="{}dynamic-component"/&gt;
 *           &lt;element ref="{}properties"/&gt;
 *           &lt;element ref="{}any"/&gt;
 *           &lt;element ref="{}map"/&gt;
 *           &lt;element ref="{}set"/&gt;
 *           &lt;element ref="{}list"/&gt;
 *           &lt;element ref="{}bag"/&gt;
 *           &lt;element ref="{}idbag"/&gt;
 *           &lt;element ref="{}array"/&gt;
 *           &lt;element ref="{}primitive-array"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}joined-subclass" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}loader" minOccurs="0"/&gt;
 *         &lt;element ref="{}sql-insert" minOccurs="0"/&gt;
 *         &lt;element ref="{}sql-update" minOccurs="0"/&gt;
 *         &lt;element ref="{}sql-delete" minOccurs="0"/&gt;
 *         &lt;element ref="{}fetch-profile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}resultset" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{}query"/&gt;
 *           &lt;element ref="{}sql-query"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="entity-name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="proxy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="table" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="schema" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="catalog" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="subselect" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="dynamic-update" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="dynamic-insert" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="select-before-update" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="extends" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="lazy"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="abstract"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="persister" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="check" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="batch-size" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "meta",
        "subselect",
        "synchronize",
        "comment",
        "tuplizer",
        "key",
        "propertyOrManyToOneOrOneToOne",
        "joinedSubclass",
        "loader",
        "sqlInsert",
        "sqlUpdate",
        "sqlDelete",
        "fetchProfile",
        "resultset",
        "queryOrSqlQuery"
})
@XmlRootElement(name = "joined-subclass")
public class HbmJoinedSubclass implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    protected List<HbmMeta> meta;
    protected String subselect;
    protected List<HbmSynchronize> synchronize;
    protected String comment;
    protected List<HbmTuplizer> tuplizer;
    @XmlElement(required = true)
    protected HbmKey key;
    @XmlElements({
            @XmlElement(name = "property", type = HbmProperty.class),
            @XmlElement(name = "many-to-one", type = HbmManyToOne.class),
            @XmlElement(name = "one-to-one", type = HbmOneToOne.class),
            @XmlElement(name = "component", type = HbmComponent.class),
            @XmlElement(name = "dynamic-component", type = HbmDynamicComponent.class),
            @XmlElement(name = "properties", type = HbmProperties.class),
            @XmlElement(name = "any", type = HbmAny.class),
            @XmlElement(name = "map", type = HbmMap.class),
            @XmlElement(name = "set", type = HbmSet.class),
            @XmlElement(name = "list", type = HbmList.class),
            @XmlElement(name = "bag", type = HbmBag.class),
            @XmlElement(name = "idbag", type = HbmIdbag.class),
            @XmlElement(name = "array", type = HbmArray.class),
            @XmlElement(name = "primitive-array", type = HbmPrimitiveArray.class)
    })
    protected List<IHbmNode> propertyOrManyToOneOrOneToOne;
    @XmlElement(name = "joined-subclass")
    protected List<HbmJoinedSubclass> joinedSubclass;
    protected HbmLoader loader;
    @XmlElement(name = "sql-insert")
    protected HbmSqlInsert sqlInsert;
    @XmlElement(name = "sql-update")
    protected HbmSqlUpdate sqlUpdate;
    @XmlElement(name = "sql-delete")
    protected HbmSqlDelete sqlDelete;
    @XmlElement(name = "fetch-profile")
    protected List<HbmFetchProfile> fetchProfile;
    protected List<HbmResultset> resultset;
    @XmlElements({
            @XmlElement(name = "query", type = HbmQuery.class),
            @XmlElement(name = "sql-query", type = HbmSqlQuery.class)
    })
    protected List<IHbmNode> queryOrSqlQuery;
    @XmlAttribute(name = "entity-name")
    @XmlSchemaType(name = "anySimpleType")
    protected String entityName;
    @XmlAttribute(name = "name")
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "proxy")
    @XmlSchemaType(name = "anySimpleType")
    protected String proxy;
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
    @XmlAttribute(name = "dynamic-update")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dynamicUpdate;
    @XmlAttribute(name = "dynamic-insert")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dynamicInsert;
    @XmlAttribute(name = "select-before-update")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String selectBeforeUpdate;
    @XmlAttribute(name = "extends")
    @XmlSchemaType(name = "anySimpleType")
    protected String _extends;
    @XmlAttribute(name = "lazy")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lazy;
    @XmlAttribute(name = "abstract")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String _abstract;
    @XmlAttribute(name = "persister")
    @XmlSchemaType(name = "anySimpleType")
    protected String persister;
    @XmlAttribute(name = "check")
    @XmlSchemaType(name = "anySimpleType")
    protected String check;
    @XmlAttribute(name = "batch-size")
    @XmlSchemaType(name = "anySimpleType")
    protected String batchSize;
    @XmlAttribute(name = "node")
    @XmlSchemaType(name = "anySimpleType")
    protected String node;

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
     * Gets the value of the tuplizer property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tuplizer property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTuplizer().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmTuplizer }
     */
    public List<HbmTuplizer> getTuplizer() {
        if (tuplizer == null) {
            tuplizer = new ArrayList<HbmTuplizer>();
        }
        return this.tuplizer;
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
     * Gets the value of the propertyOrManyToOneOrOneToOne property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the propertyOrManyToOneOrOneToOne property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyOrManyToOneOrOneToOne().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmProperty }
     * {@link HbmManyToOne }
     * {@link HbmOneToOne }
     * {@link HbmComponent }
     * {@link HbmDynamicComponent }
     * {@link HbmProperties }
     * {@link HbmAny }
     * {@link HbmMap }
     * {@link HbmSet }
     * {@link HbmList }
     * {@link HbmBag }
     * {@link HbmIdbag }
     * {@link HbmArray }
     * {@link HbmPrimitiveArray }
     */
    public List<IHbmNode> getPropertyOrManyToOneOrOneToOne() {
        if (propertyOrManyToOneOrOneToOne == null) {
            propertyOrManyToOneOrOneToOne = new ArrayList<IHbmNode>();
        }
        return this.propertyOrManyToOneOrOneToOne;
    }

    /**
     * Gets the value of the joinedSubclass property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the joinedSubclass property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJoinedSubclass().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmJoinedSubclass }
     */
    public List<HbmJoinedSubclass> getJoinedSubclass() {
        if (joinedSubclass == null) {
            joinedSubclass = new ArrayList<HbmJoinedSubclass>();
        }
        return this.joinedSubclass;
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
     * Gets the value of the fetchProfile property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fetchProfile property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFetchProfile().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmFetchProfile }
     */
    public List<HbmFetchProfile> getFetchProfile() {
        if (fetchProfile == null) {
            fetchProfile = new ArrayList<HbmFetchProfile>();
        }
        return this.fetchProfile;
    }

    /**
     * Gets the value of the resultset property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the resultset property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultset().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmResultset }
     */
    public List<HbmResultset> getResultset() {
        if (resultset == null) {
            resultset = new ArrayList<HbmResultset>();
        }
        return this.resultset;
    }

    /**
     * Gets the value of the queryOrSqlQuery property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the queryOrSqlQuery property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryOrSqlQuery().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmQuery }
     * {@link HbmSqlQuery }
     */
    public List<IHbmNode> getQueryOrSqlQuery() {
        if (queryOrSqlQuery == null) {
            queryOrSqlQuery = new ArrayList<IHbmNode>();
        }
        return this.queryOrSqlQuery;
    }

    /**
     * Obtient la valeur de la propriété entityName.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Définit la valeur de la propriété entityName.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEntityName(String value) {
        this.entityName = value;
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
     * Obtient la valeur de la propriété proxy.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProxy() {
        return proxy;
    }

    /**
     * Définit la valeur de la propriété proxy.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProxy(String value) {
        this.proxy = value;
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
     * Obtient la valeur de la propriété dynamicUpdate.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDynamicUpdate() {
        if (dynamicUpdate == null) {
            return "false";
        } else {
            return dynamicUpdate;
        }
    }

    /**
     * Définit la valeur de la propriété dynamicUpdate.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDynamicUpdate(String value) {
        this.dynamicUpdate = value;
    }

    /**
     * Obtient la valeur de la propriété dynamicInsert.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDynamicInsert() {
        if (dynamicInsert == null) {
            return "false";
        } else {
            return dynamicInsert;
        }
    }

    /**
     * Définit la valeur de la propriété dynamicInsert.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDynamicInsert(String value) {
        this.dynamicInsert = value;
    }

    /**
     * Obtient la valeur de la propriété selectBeforeUpdate.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSelectBeforeUpdate() {
        if (selectBeforeUpdate == null) {
            return "false";
        } else {
            return selectBeforeUpdate;
        }
    }

    /**
     * Définit la valeur de la propriété selectBeforeUpdate.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSelectBeforeUpdate(String value) {
        this.selectBeforeUpdate = value;
    }

    /**
     * Obtient la valeur de la propriété extends.
     *
     * @return possible object is
     * {@link String }
     */
    public String getExtends() {
        return _extends;
    }

    /**
     * Définit la valeur de la propriété extends.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExtends(String value) {
        this._extends = value;
    }

    /**
     * Obtient la valeur de la propriété lazy.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLazy() {
        return lazy;
    }

    /**
     * Définit la valeur de la propriété lazy.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLazy(String value) {
        this.lazy = value;
    }

    /**
     * Obtient la valeur de la propriété abstract.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAbstract() {
        return _abstract;
    }

    /**
     * Définit la valeur de la propriété abstract.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAbstract(String value) {
        this._abstract = value;
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

}
