package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.math.BigDecimal;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class OmsOrderItemDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final OmsOrderItem omsOrderItem = new OmsOrderItem();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = omsOrderItem.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> orderId = omsOrderItem.orderId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> orderSn = omsOrderItem.orderSn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productId = omsOrderItem.productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productPic = omsOrderItem.productPic;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productName = omsOrderItem.productName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productBrand = omsOrderItem.productBrand;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productSn = omsOrderItem.productSn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> productPrice = omsOrderItem.productPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> productQuantity = omsOrderItem.productQuantity;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productSkuId = omsOrderItem.productSkuId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productSkuCode = omsOrderItem.productSkuCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productCategoryId = omsOrderItem.productCategoryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> promotionName = omsOrderItem.promotionName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> promotionAmount = omsOrderItem.promotionAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> couponAmount = omsOrderItem.couponAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> integrationAmount = omsOrderItem.integrationAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> realAmount = omsOrderItem.realAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> giftIntegration = omsOrderItem.giftIntegration;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> giftGrowth = omsOrderItem.giftGrowth;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productAttr = omsOrderItem.productAttr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class OmsOrderItem extends AliasableSqlTable<OmsOrderItem> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> orderId = column("order_id", JDBCType.BIGINT);

        public final SqlColumn<String> orderSn = column("order_sn", JDBCType.VARCHAR);

        public final SqlColumn<Long> productId = column("product_id", JDBCType.BIGINT);

        public final SqlColumn<String> productPic = column("product_pic", JDBCType.VARCHAR);

        public final SqlColumn<String> productName = column("product_name", JDBCType.VARCHAR);

        public final SqlColumn<String> productBrand = column("product_brand", JDBCType.VARCHAR);

        public final SqlColumn<String> productSn = column("product_sn", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> productPrice = column("product_price", JDBCType.DECIMAL);

        public final SqlColumn<Integer> productQuantity = column("product_quantity", JDBCType.INTEGER);

        public final SqlColumn<Long> productSkuId = column("product_sku_id", JDBCType.BIGINT);

        public final SqlColumn<String> productSkuCode = column("product_sku_code", JDBCType.VARCHAR);

        public final SqlColumn<Long> productCategoryId = column("product_category_id", JDBCType.BIGINT);

        public final SqlColumn<String> promotionName = column("promotion_name", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> promotionAmount = column("promotion_amount", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> couponAmount = column("coupon_amount", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> integrationAmount = column("integration_amount", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> realAmount = column("real_amount", JDBCType.DECIMAL);

        public final SqlColumn<Integer> giftIntegration = column("gift_integration", JDBCType.INTEGER);

        public final SqlColumn<Integer> giftGrowth = column("gift_growth", JDBCType.INTEGER);

        public final SqlColumn<String> productAttr = column("product_attr", JDBCType.VARCHAR);

        public OmsOrderItem() {
            super("oms_order_item", OmsOrderItem::new);
        }
    }
}