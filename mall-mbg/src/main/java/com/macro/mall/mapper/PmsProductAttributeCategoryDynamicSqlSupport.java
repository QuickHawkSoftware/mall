package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class PmsProductAttributeCategoryDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final PmsProductAttributeCategory pmsProductAttributeCategory = new PmsProductAttributeCategory();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = pmsProductAttributeCategory.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = pmsProductAttributeCategory.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> attributeCount = pmsProductAttributeCategory.attributeCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> paramCount = pmsProductAttributeCategory.paramCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class PmsProductAttributeCategory extends AliasableSqlTable<PmsProductAttributeCategory> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> attributeCount = column("attribute_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> paramCount = column("param_count", JDBCType.INTEGER);

        public PmsProductAttributeCategory() {
            super("pms_product_attribute_category", PmsProductAttributeCategory::new);
        }
    }
}