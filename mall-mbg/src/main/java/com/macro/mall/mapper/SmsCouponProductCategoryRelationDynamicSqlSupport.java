package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SmsCouponProductCategoryRelationDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SmsCouponProductCategoryRelation smsCouponProductCategoryRelation = new SmsCouponProductCategoryRelation();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = smsCouponProductCategoryRelation.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> couponId = smsCouponProductCategoryRelation.couponId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productCategoryId = smsCouponProductCategoryRelation.productCategoryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productCategoryName = smsCouponProductCategoryRelation.productCategoryName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> parentCategoryName = smsCouponProductCategoryRelation.parentCategoryName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SmsCouponProductCategoryRelation extends AliasableSqlTable<SmsCouponProductCategoryRelation> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> couponId = column("coupon_id", JDBCType.BIGINT);

        public final SqlColumn<Long> productCategoryId = column("product_category_id", JDBCType.BIGINT);

        public final SqlColumn<String> productCategoryName = column("product_category_name", JDBCType.VARCHAR);

        public final SqlColumn<String> parentCategoryName = column("parent_category_name", JDBCType.VARCHAR);

        public SmsCouponProductCategoryRelation() {
            super("sms_coupon_product_category_relation", SmsCouponProductCategoryRelation::new);
        }
    }
}