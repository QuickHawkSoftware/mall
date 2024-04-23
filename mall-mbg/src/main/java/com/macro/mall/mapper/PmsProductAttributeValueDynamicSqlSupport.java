package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class PmsProductAttributeValueDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final PmsProductAttributeValue pmsProductAttributeValue = new PmsProductAttributeValue();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = pmsProductAttributeValue.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productId = pmsProductAttributeValue.productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productAttributeId = pmsProductAttributeValue.productAttributeId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> value = pmsProductAttributeValue.value;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class PmsProductAttributeValue extends AliasableSqlTable<PmsProductAttributeValue> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> productId = column("product_id", JDBCType.BIGINT);

        public final SqlColumn<Long> productAttributeId = column("product_attribute_id", JDBCType.BIGINT);

        public final SqlColumn<String> value = column("value", JDBCType.VARCHAR);

        public PmsProductAttributeValue() {
            super("pms_product_attribute_value", PmsProductAttributeValue::new);
        }
    }
}