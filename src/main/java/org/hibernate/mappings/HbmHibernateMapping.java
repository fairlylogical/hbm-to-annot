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
 *         &lt;element ref="{}identifier-generator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}typedef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}filter-def" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}import" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{}class"/&gt;
 *           &lt;element ref="{}subclass"/&gt;
 *           &lt;element ref="{}joined-subclass"/&gt;
 *           &lt;element ref="{}union-subclass"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}resultset" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{}query"/&gt;
 *           &lt;element ref="{}sql-query"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}fetch-profile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}database-object" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="schema" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="catalog" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="default-cascade" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="none" /&gt;
 *       &lt;attribute name="default-access" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="property" /&gt;
 *       &lt;attribute name="default-lazy" default="true"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="auto-import" default="true"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="package" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "meta",
        "identifierGenerator",
        "typedef",
        "filterDef",
        "_import",
        "clazzOrSubclassOrJoinedSubclass",
        "resultset",
        "queryOrSqlQuery",
        "fetchProfile",
        "databaseObject"
})
@XmlRootElement(name = "hibernate-mapping")
public class HbmHibernateMapping implements IHbmNode {
    @Override
    public void accept(HbmNodeVisitor visitor) {
        visitor.visit(this);
    }

    protected List<HbmMeta> meta;
    @XmlElement(name = "identifier-generator")
    protected List<HbmIdentifierGenerator> identifierGenerator;
    protected List<HbmTypedef> typedef;
    @XmlElement(name = "filter-def")
    protected List<HbmFilterDef> filterDef;
    @XmlElement(name = "import")
    protected List<HbmImport> _import;
    @XmlElements({
            @XmlElement(name = "class", type = HbmClass.class),
            @XmlElement(name = "subclass", type = HbmSubclass.class),
            @XmlElement(name = "joined-subclass", type = HbmJoinedSubclass.class),
            @XmlElement(name = "union-subclass", type = HbmUnionSubclass.class)
    })
    protected List<IHbmNode> clazzOrSubclassOrJoinedSubclass;
    protected List<HbmResultset> resultset;
    @XmlElements({
            @XmlElement(name = "query", type = HbmQuery.class),
            @XmlElement(name = "sql-query", type = HbmSqlQuery.class)
    })
    protected List<IHbmNode> queryOrSqlQuery;
    @XmlElement(name = "fetch-profile")
    protected List<HbmFetchProfile> fetchProfile;
    @XmlElement(name = "database-object")
    protected List<HbmDatabaseObject> databaseObject;
    @XmlAttribute(name = "schema")
    @XmlSchemaType(name = "anySimpleType")
    protected String schema;
    @XmlAttribute(name = "catalog")
    @XmlSchemaType(name = "anySimpleType")
    protected String catalog;
    @XmlAttribute(name = "default-cascade")
    @XmlSchemaType(name = "anySimpleType")
    protected String defaultCascade;
    @XmlAttribute(name = "default-access")
    @XmlSchemaType(name = "anySimpleType")
    protected String defaultAccess;
    @XmlAttribute(name = "default-lazy")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String defaultLazy;
    @XmlAttribute(name = "auto-import")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String autoImport;
    @XmlAttribute(name = "package")
    @XmlSchemaType(name = "anySimpleType")
    protected String _package;

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
     * Gets the value of the identifierGenerator property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the identifierGenerator property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifierGenerator().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmIdentifierGenerator }
     */
    public List<HbmIdentifierGenerator> getIdentifierGenerator() {
        if (identifierGenerator == null) {
            identifierGenerator = new ArrayList<HbmIdentifierGenerator>();
        }
        return this.identifierGenerator;
    }

    /**
     * Gets the value of the typedef property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the typedef property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypedef().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmTypedef }
     */
    public List<HbmTypedef> getTypedef() {
        if (typedef == null) {
            typedef = new ArrayList<HbmTypedef>();
        }
        return this.typedef;
    }

    /**
     * Gets the value of the filterDef property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the filterDef property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterDef().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmFilterDef }
     */
    public List<HbmFilterDef> getFilterDef() {
        if (filterDef == null) {
            filterDef = new ArrayList<HbmFilterDef>();
        }
        return this.filterDef;
    }

    /**
     * Gets the value of the import property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the import property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImport().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmImport }
     */
    public List<HbmImport> getImport() {
        if (_import == null) {
            _import = new ArrayList<HbmImport>();
        }
        return this._import;
    }

    /**
     * Gets the value of the clazzOrSubclassOrJoinedSubclass property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the clazzOrSubclassOrJoinedSubclass property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazzOrSubclassOrJoinedSubclass().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmClass }
     * {@link HbmSubclass }
     * {@link HbmJoinedSubclass }
     * {@link HbmUnionSubclass }
     */
    public List<IHbmNode> getClazzOrSubclassOrJoinedSubclass() {
        if (clazzOrSubclassOrJoinedSubclass == null) {
            clazzOrSubclassOrJoinedSubclass = new ArrayList<IHbmNode>();
        }
        return this.clazzOrSubclassOrJoinedSubclass;
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
     * Gets the value of the databaseObject property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the databaseObject property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatabaseObject().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HbmDatabaseObject }
     */
    public List<HbmDatabaseObject> getDatabaseObject() {
        if (databaseObject == null) {
            databaseObject = new ArrayList<HbmDatabaseObject>();
        }
        return this.databaseObject;
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
     * Obtient la valeur de la propriété defaultCascade.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDefaultCascade() {
        if (defaultCascade == null) {
            return "none";
        } else {
            return defaultCascade;
        }
    }

    /**
     * Définit la valeur de la propriété defaultCascade.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDefaultCascade(String value) {
        this.defaultCascade = value;
    }

    /**
     * Obtient la valeur de la propriété defaultAccess.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDefaultAccess() {
        if (defaultAccess == null) {
            return "property";
        } else {
            return defaultAccess;
        }
    }

    /**
     * Définit la valeur de la propriété defaultAccess.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDefaultAccess(String value) {
        this.defaultAccess = value;
    }

    /**
     * Obtient la valeur de la propriété defaultLazy.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDefaultLazy() {
        if (defaultLazy == null) {
            return "true";
        } else {
            return defaultLazy;
        }
    }

    /**
     * Définit la valeur de la propriété defaultLazy.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDefaultLazy(String value) {
        this.defaultLazy = value;
    }

    /**
     * Obtient la valeur de la propriété autoImport.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAutoImport() {
        if (autoImport == null) {
            return "true";
        } else {
            return autoImport;
        }
    }

    /**
     * Définit la valeur de la propriété autoImport.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAutoImport(String value) {
        this.autoImport = value;
    }

    /**
     * Obtient la valeur de la propriété package.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPackage() {
        return _package;
    }

    /**
     * Définit la valeur de la propriété package.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPackage(String value) {
        this._package = value;
    }

}
