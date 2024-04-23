package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SmsCouponProductRelationDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SmsCouponProductRelation smsCouponProductRelation = new SmsCouponProductRelation();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = smsCouponProductRelation.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> couponId = smsCouponProductRelation.couponId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productId = smsCouponProductRelation.productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productName = smsCouponProductRelation.productName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productSn = smsCouponProductRelation.productSn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SmsCouponProductRelation extends AliasableSqlTable<SmsCouponProductRelation> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> couponId = column("coupon_id", JDBCType.BIGINT);

        public final SqlColumn<Long> productId = column("product_id", JDBCType.BIGINT);

        public final SqlColumn<String> productName = column("product_name", JDBCType.VARCHAR);

        public final SqlColumn<String> productSn = column("product_sn", JDBCType.VARCHAR);

        public SmsCouponProductRelation() {
            super("sms_coupon_product_relation", SmsCouponProductRelation::new);
        }
    }
}