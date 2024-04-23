package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SmsHomeNewProductDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SmsHomeNewProduct smsHomeNewProduct = new SmsHomeNewProduct();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = smsHomeNewProduct.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productId = smsHomeNewProduct.productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productName = smsHomeNewProduct.productName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> recommendStatus = smsHomeNewProduct.recommendStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> sort = smsHomeNewProduct.sort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SmsHomeNewProduct extends AliasableSqlTable<SmsHomeNewProduct> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> productId = column("product_id", JDBCType.BIGINT);

        public final SqlColumn<String> productName = column("product_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> recommendStatus = column("recommend_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public SmsHomeNewProduct() {
            super("sms_home_new_product", SmsHomeNewProduct::new);
        }
    }
}