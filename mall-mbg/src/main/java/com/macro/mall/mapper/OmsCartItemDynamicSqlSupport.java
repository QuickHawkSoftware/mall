package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class OmsCartItemDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final OmsCartItem omsCartItem = new OmsCartItem();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = omsCartItem.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productId = omsCartItem.productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productSkuId = omsCartItem.productSkuId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> memberId = omsCartItem.memberId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> quantity = omsCartItem.quantity;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> price = omsCartItem.price;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productPic = omsCartItem.productPic;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productName = omsCartItem.productName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productSubTitle = omsCartItem.productSubTitle;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productSkuCode = omsCartItem.productSkuCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> memberNickname = omsCartItem.memberNickname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createDate = omsCartItem.createDate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> modifyDate = omsCartItem.modifyDate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> deleteStatus = omsCartItem.deleteStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productCategoryId = omsCartItem.productCategoryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productBrand = omsCartItem.productBrand;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productSn = omsCartItem.productSn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productAttr = omsCartItem.productAttr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class OmsCartItem extends AliasableSqlTable<OmsCartItem> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> productId = column("product_id", JDBCType.BIGINT);

        public final SqlColumn<Long> productSkuId = column("product_sku_id", JDBCType.BIGINT);

        public final SqlColumn<Long> memberId = column("member_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> quantity = column("quantity", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> price = column("price", JDBCType.DECIMAL);

        public final SqlColumn<String> productPic = column("product_pic", JDBCType.VARCHAR);

        public final SqlColumn<String> productName = column("product_name", JDBCType.VARCHAR);

        public final SqlColumn<String> productSubTitle = column("product_sub_title", JDBCType.VARCHAR);

        public final SqlColumn<String> productSkuCode = column("product_sku_code", JDBCType.VARCHAR);

        public final SqlColumn<String> memberNickname = column("member_nickname", JDBCType.VARCHAR);

        public final SqlColumn<Date> createDate = column("create_date", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyDate = column("modify_date", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> deleteStatus = column("delete_status", JDBCType.INTEGER);

        public final SqlColumn<Long> productCategoryId = column("product_category_id", JDBCType.BIGINT);

        public final SqlColumn<String> productBrand = column("product_brand", JDBCType.VARCHAR);

        public final SqlColumn<String> productSn = column("product_sn", JDBCType.VARCHAR);

        public final SqlColumn<String> productAttr = column("product_attr", JDBCType.VARCHAR);

        public OmsCartItem() {
            super("oms_cart_item", OmsCartItem::new);
        }
    }
}