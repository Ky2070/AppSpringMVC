package com.nqk.pojo;

import com.nqk.pojo.ProdTag;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-07-13T14:54:02")
@StaticMetamodel(Tag.class)
public class Tag_ { 

    public static volatile SetAttribute<Tag, ProdTag> prodTagSet;
    public static volatile SingularAttribute<Tag, String> name;
    public static volatile SingularAttribute<Tag, Integer> id;
    public static volatile SingularAttribute<Tag, String> tagcol;

}