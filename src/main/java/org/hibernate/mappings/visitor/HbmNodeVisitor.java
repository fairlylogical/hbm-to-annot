package org.hibernate.mappings.visitor;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.expr.NormalAnnotationExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.visitor.Visitable;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.mappings.*;

public class HbmNodeVisitor {

    protected CompilationUnit cu;

    public HbmNodeVisitor(CompilationUnit cu) {
        this.cu = cu;
    }

    public void visit(HbmAny hbmAny) {
    }

    public void visit(HbmArray hbmArray) {
    }

    public void visit(HbmBag hbmBag) {
    }

    public void visit(HbmCache hbmCache) {
    }

    public void visit(HbmClass hbmClass) {
        cu.accept(new ModifierVisitor<Void>() {
            /**
             * For every if-statement, see if it has a comparison using "!=".
             * Change it to "==" and switch the "then" and "else" statements around.
             */
            @Override
            public Visitable visit(ClassOrInterfaceDeclaration n, Void arg) {
                if (StringUtils.isNotBlank(hbmClass.getTable())) {
                    NormalAnnotationExpr annotation = new NormalAnnotationExpr(StaticJavaParser.parseName("Table"), new NodeList());
                    annotation.addPair("name", new StringLiteralExpr(hbmClass.getTable()));
                    n.addAnnotation(annotation);
                }
                return super.visit(n, arg);
            }
        }, null);
        hbmClass.getPropertyOrManyToOneOrOneToOne().forEach(node -> {
            node.accept(this);
        });
    }

    public void visit(HbmCollectionId hbmCollectionId) {
    }

    public void visit(HbmColumn hbmColumn) {
    }

    public void visit(HbmComponent hbmComponent) {
    }

    public void visit(HbmCompositeElement hbmCompositeElement) {
    }

    public void visit(HbmCompositeId hbmCompositeId) {
    }

    public void visit(HbmCompositeIndex hbmCompositeIndex) {
    }

    public void visit(HbmCompositeMapKey hbmCompositeMapKey) {
    }

    public void visit(HbmDatabaseObject hbmDatabaseObject) {
    }

    public void visit(HbmDefinition hbmDefinition) {
    }

    public void visit(HbmDialectScope hbmDialectScope) {
    }

    public void visit(HbmDiscriminator hbmDiscriminator) {
    }

    public void visit(HbmDynamicComponent hbmDynamicComponent) {
    }

    public void visit(HbmElement hbmElement) {
    }

    public void visit(HbmFetch hbmFetch) {
    }

    public void visit(HbmFetchProfile hbmFetchProfile) {
    }

    public void visit(HbmFilter hbmFilter) {
    }

    public void visit(HbmFilterDef hbmFilterDef) {
    }

    public void visit(HbmFilterParam hbmFilterParam) {
    }

    public void visit(HbmGenerator hbmGenerator) {
    }

    public void visit(HbmHibernateMapping hbmHibernateMapping) {
        hbmHibernateMapping.getClazzOrSubclassOrJoinedSubclass().forEach(clazz -> clazz.accept(this));
    }

    public void visit(HbmId hbmId) {
    }

    public void visit(HbmIdbag hbmIdbag) {
    }

    public void visit(HbmIdentifierGenerator hbmIdentifierGenerator) {
    }

    public void visit(HbmImport hbmImport) {
    }

    public void visit(HbmIndex hbmIndex) {
    }

    public void visit(HbmIndexManyToAny hbmIndexManyToAny) {
    }

    public void visit(HbmIndexManyToMany hbmIndexManyToMany) {
    }

    public void visit(HbmJoin hbmJoin) {
    }

    public void visit(HbmJoinedSubclass hbmJoinedSubclass) {
    }

    public void visit(HbmKey hbmKey) {
    }

    public void visit(HbmKeyManyToOne hbmKeyManyToOne) {
    }

    public void visit(HbmKeyProperty hbmKeyProperty) {
    }

    public void visit(HbmList hbmList) {
    }

    public void visit(HbmListIndex hbmListIndex) {
    }

    public void visit(HbmLoadCollection hbmLoadCollection) {
    }

    public void visit(HbmLoader hbmLoader) {
    }

    public void visit(HbmManyToAny hbmManyToAny) {
    }

    public void visit(HbmManyToMany hbmManyToMany) {
    }

    public void visit(HbmManyToOne hbmManyToOne) {
    }

    public void visit(HbmMap hbmMap) {
    }

    public void visit(HbmMapKey hbmMapKey) {
    }

    public void visit(HbmMapKeyManyToMany hbmMapKeyManyToMany) {
    }

    public void visit(HbmMeta hbmMeta) {
    }

    public void visit(HbmMetaValue hbmMetaValue) {
    }

    public void visit(HbmNaturalId hbmNaturalId) {
    }

    public void visit(HbmNestedCompositeElement hbmNestedCompositeElement) {
    }

    public void visit(HbmOneToMany hbmOneToMany) {
    }

    public void visit(HbmOneToOne hbmOneToOne) {
    }

    public void visit(HbmParam hbmParam) {
    }

    public void visit(HbmParent hbmParent) {
    }

    public void visit(HbmPrimitiveArray hbmPrimitiveArray) {
    }

    public void visit(HbmProperties hbmProperties) {
    }

    public void visit(HbmProperty hbmProperty) {
        cu.accept(new ModifierVisitor<Void>() {
            /**
             * For every if-statement, see if it has a comparison using "!=".
             * Change it to "==" and switch the "then" and "else" statements around.
             */
            @Override
            public Visitable visit(FieldDeclaration n, Void arg) {
                if (n.getVariables().size() == 1 && StringUtils.equals(hbmProperty.getName(), n.getVariable(0).getName().asString())) {
                    NormalAnnotationExpr annotation = new NormalAnnotationExpr(StaticJavaParser.parseName("Column"), new NodeList());
                    annotation.addPair("name", new StringLiteralExpr(hbmProperty.getName()));
                    n.addAnnotation(annotation);
                }
                return super.visit(n, arg);
            }
        }, null);
    }

    public void visit(HbmQuery hbmQuery) {
    }

    public void visit(HbmQueryParam hbmQueryParam) {
    }

    public void visit(HbmResultset hbmResultset) {
    }

    public void visit(HbmReturn hbmReturn) {
    }

    public void visit(HbmReturnColumn hbmReturnColumn) {
    }

    public void visit(HbmReturnDiscriminator hbmReturnDiscriminator) {
    }

    public void visit(HbmReturnJoin hbmReturnJoin) {
    }

    public void visit(HbmReturnProperty hbmReturnProperty) {
    }

    public void visit(HbmReturnScalar hbmReturnScalar) {
    }

    public void visit(HbmSet hbmSet) {
        HbmOneToMany manyToOne = hbmSet.getOneToMany();
        HbmManyToMany manyToMany = hbmSet.getManyToMany();
        if (manyToOne != null) {
            manyToOne.accept(this);
        } else if (manyToMany != null) {
            manyToMany.accept(this);
        }
    }

    public void visit(HbmSqlDelete hbmSqlDelete) {
    }

    public void visit(HbmSqlDeleteAll hbmSqlDeleteAll) {
    }

    public void visit(HbmSqlInsert hbmSqlInsert) {
    }

    public void visit(HbmSqlQuery hbmSqlQuery) {
    }

    public void visit(HbmSqlUpdate hbmSqlUpdate) {
    }

    public void visit(HbmSubclass hbmSubclass) {
    }

    public void visit(HbmSynchronize hbmSynchronize) {
    }

    public void visit(HbmTimestamp hbmTimestamp) {
    }

    public void visit(HbmTuplizer hbmTuplizer) {
    }

    public void visit(HbmType hbmType) {
    }

    public void visit(HbmTypedef hbmTypedef) {
    }

    public void visit(HbmUnionSubclass hbmUnionSubclass) {
    }

    public void visit(HbmVersion hbmVersion) {
    }

}
