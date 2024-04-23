package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class CmsSubjectProductRelationDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final CmsSubjectProductRelation cmsSubjectProductRelation = new CmsSubjectProductRelation();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = cmsSubjectProductRelation.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> subjectId = cmsSubjectProductRelation.subjectId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productId = cmsSubjectProductRelation.productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class CmsSubjectProductRelation extends AliasableSqlTable<CmsSubjectProductRelation> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> subjectId = column("subject_id", JDBCType.BIGINT);

        public final SqlColumn<Long> productId = column("product_id", JDBCType.BIGINT);

        public CmsSubjectProductRelation() {
            super("cms_subject_product_relation", CmsSubjectProductRelation::new);
        }
    }
}