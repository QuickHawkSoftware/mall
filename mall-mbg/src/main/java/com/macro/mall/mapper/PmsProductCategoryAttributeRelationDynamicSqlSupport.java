package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class PmsProductCategoryAttributeRelationDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final PmsProductCategoryAttributeRelation pmsProductCategoryAttributeRelation = new PmsProductCategoryAttributeRelation();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = pmsProductCategoryAttributeRelation.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productCategoryId = pmsProductCategoryAttributeRelation.productCategoryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productAttributeId = pmsProductCategoryAttributeRelation.productAttributeId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class PmsProductCategoryAttributeRelation extends AliasableSqlTable<PmsProductCategoryAttributeRelation> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> productCategoryId = column("product_category_id", JDBCType.BIGINT);

        public final SqlColumn<Long> productAttributeId = column("product_attribute_id", JDBCType.BIGINT);

        public PmsProductCategoryAttributeRelation() {
            super("pms_product_category_attribute_relation", PmsProductCategoryAttributeRelation::new);
        }
    }
}