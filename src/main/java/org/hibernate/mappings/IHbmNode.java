package org.hibernate.mappings;

import org.hibernate.mappings.visitor.HbmNodeVisitor;

public interface IHbmNode {

    void accept(HbmNodeVisitor visitor);
}
