package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class OmsOrderReturnApplyDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final OmsOrderReturnApply omsOrderReturnApply = new OmsOrderReturnApply();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = omsOrderReturnApply.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> orderId = omsOrderReturnApply.orderId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> companyAddressId = omsOrderReturnApply.companyAddressId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productId = omsOrderReturnApply.productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> orderSn = omsOrderReturnApply.orderSn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = omsOrderReturnApply.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> memberUsername = omsOrderReturnApply.memberUsername;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> returnAmount = omsOrderReturnApply.returnAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> returnName = omsOrderReturnApply.returnName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> returnPhone = omsOrderReturnApply.returnPhone;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> status = omsOrderReturnApply.status;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> handleTime = omsOrderReturnApply.handleTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productPic = omsOrderReturnApply.productPic;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productName = omsOrderReturnApply.productName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productBrand = omsOrderReturnApply.productBrand;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productAttr = omsOrderReturnApply.productAttr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> productCount = omsOrderReturnApply.productCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> productPrice = omsOrderReturnApply.productPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> productRealPrice = omsOrderReturnApply.productRealPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> reason = omsOrderReturnApply.reason;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> description = omsOrderReturnApply.description;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> proofPics = omsOrderReturnApply.proofPics;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> handleNote = omsOrderReturnApply.handleNote;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> handleMan = omsOrderReturnApply.handleMan;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> receiveMan = omsOrderReturnApply.receiveMan;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> receiveTime = omsOrderReturnApply.receiveTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> receiveNote = omsOrderReturnApply.receiveNote;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class OmsOrderReturnApply extends AliasableSqlTable<OmsOrderReturnApply> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> orderId = column("order_id", JDBCType.BIGINT);

        public final SqlColumn<Long> companyAddressId = column("company_address_id", JDBCType.BIGINT);

        public final SqlColumn<Long> productId = column("product_id", JDBCType.BIGINT);

        public final SqlColumn<String> orderSn = column("order_sn", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> memberUsername = column("member_username", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> returnAmount = column("return_amount", JDBCType.DECIMAL);

        public final SqlColumn<String> returnName = column("return_name", JDBCType.VARCHAR);

        public final SqlColumn<String> returnPhone = column("return_phone", JDBCType.VARCHAR);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Date> handleTime = column("handle_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> productPic = column("product_pic", JDBCType.VARCHAR);

        public final SqlColumn<String> productName = column("product_name", JDBCType.VARCHAR);

        public final SqlColumn<String> productBrand = column("product_brand", JDBCType.VARCHAR);

        public final SqlColumn<String> productAttr = column("product_attr", JDBCType.VARCHAR);

        public final SqlColumn<Integer> productCount = column("product_count", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> productPrice = column("product_price", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> productRealPrice = column("product_real_price", JDBCType.DECIMAL);

        public final SqlColumn<String> reason = column("reason", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<String> proofPics = column("proof_pics", JDBCType.VARCHAR);

        public final SqlColumn<String> handleNote = column("handle_note", JDBCType.VARCHAR);

        public final SqlColumn<String> handleMan = column("handle_man", JDBCType.VARCHAR);

        public final SqlColumn<String> receiveMan = column("receive_man", JDBCType.VARCHAR);

        public final SqlColumn<Date> receiveTime = column("receive_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> receiveNote = column("receive_note", JDBCType.VARCHAR);

        public OmsOrderReturnApply() {
            super("oms_order_return_apply", OmsOrderReturnApply::new);
        }
    }
}