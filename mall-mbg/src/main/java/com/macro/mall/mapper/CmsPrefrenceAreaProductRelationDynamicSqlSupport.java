package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class CmsPrefrenceAreaProductRelationDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final CmsPrefrenceAreaProductRelation cmsPrefrenceAreaProductRelation = new CmsPrefrenceAreaProductRelation();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = cmsPrefrenceAreaProductRelation.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> prefrenceAreaId = cmsPrefrenceAreaProductRelation.prefrenceAreaId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productId = cmsPrefrenceAreaProductRelation.productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class CmsPrefrenceAreaProductRelation extends AliasableSqlTable<CmsPrefrenceAreaProductRelation> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> prefrenceAreaId = column("prefrence_area_id", JDBCType.BIGINT);

        public final SqlColumn<Long> productId = column("product_id", JDBCType.BIGINT);

        public CmsPrefrenceAreaProductRelation() {
            super("cms_prefrence_area_product_relation", CmsPrefrenceAreaProductRelation::new);
        }
    }
}