package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UmsMemberProductCategoryRelationDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsMemberProductCategoryRelation umsMemberProductCategoryRelation = new UmsMemberProductCategoryRelation();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = umsMemberProductCategoryRelation.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> memberId = umsMemberProductCategoryRelation.memberId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productCategoryId = umsMemberProductCategoryRelation.productCategoryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsMemberProductCategoryRelation extends AliasableSqlTable<UmsMemberProductCategoryRelation> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> memberId = column("member_id", JDBCType.BIGINT);

        public final SqlColumn<Long> productCategoryId = column("product_category_id", JDBCType.BIGINT);

        public UmsMemberProductCategoryRelation() {
            super("ums_member_product_category_relation", UmsMemberProductCategoryRelation::new);
        }
    }
}