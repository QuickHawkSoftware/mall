package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SmsHomeRecommendProductDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SmsHomeRecommendProduct smsHomeRecommendProduct = new SmsHomeRecommendProduct();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = smsHomeRecommendProduct.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productId = smsHomeRecommendProduct.productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productName = smsHomeRecommendProduct.productName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> recommendStatus = smsHomeRecommendProduct.recommendStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> sort = smsHomeRecommendProduct.sort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SmsHomeRecommendProduct extends AliasableSqlTable<SmsHomeRecommendProduct> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> productId = column("product_id", JDBCType.BIGINT);

        public final SqlColumn<String> productName = column("product_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> recommendStatus = column("recommend_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public SmsHomeRecommendProduct() {
            super("sms_home_recommend_product", SmsHomeRecommendProduct::new);
        }
    }
}