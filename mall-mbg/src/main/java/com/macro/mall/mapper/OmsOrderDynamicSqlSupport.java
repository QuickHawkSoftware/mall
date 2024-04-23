package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class OmsOrderDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final OmsOrder omsOrder = new OmsOrder();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = omsOrder.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> memberId = omsOrder.memberId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> couponId = omsOrder.couponId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> orderSn = omsOrder.orderSn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = omsOrder.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> memberUsername = omsOrder.memberUsername;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> totalAmount = omsOrder.totalAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> payAmount = omsOrder.payAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> freightAmount = omsOrder.freightAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> promotionAmount = omsOrder.promotionAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> integrationAmount = omsOrder.integrationAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> couponAmount = omsOrder.couponAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> discountAmount = omsOrder.discountAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> payType = omsOrder.payType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> sourceType = omsOrder.sourceType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> status = omsOrder.status;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> orderType = omsOrder.orderType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deliveryCompany = omsOrder.deliveryCompany;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deliverySn = omsOrder.deliverySn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> autoConfirmDay = omsOrder.autoConfirmDay;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> integration = omsOrder.integration;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> growth = omsOrder.growth;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> promotionInfo = omsOrder.promotionInfo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> billType = omsOrder.billType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> billHeader = omsOrder.billHeader;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> billContent = omsOrder.billContent;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> billReceiverPhone = omsOrder.billReceiverPhone;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> billReceiverEmail = omsOrder.billReceiverEmail;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> receiverName = omsOrder.receiverName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> receiverPhone = omsOrder.receiverPhone;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> receiverPostCode = omsOrder.receiverPostCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> receiverProvince = omsOrder.receiverProvince;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> receiverCity = omsOrder.receiverCity;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> receiverRegion = omsOrder.receiverRegion;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> receiverDetailAddress = omsOrder.receiverDetailAddress;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> note = omsOrder.note;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> confirmStatus = omsOrder.confirmStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> deleteStatus = omsOrder.deleteStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> useIntegration = omsOrder.useIntegration;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> paymentTime = omsOrder.paymentTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> deliveryTime = omsOrder.deliveryTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> receiveTime = omsOrder.receiveTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> commentTime = omsOrder.commentTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> modifyTime = omsOrder.modifyTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class OmsOrder extends AliasableSqlTable<OmsOrder> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> memberId = column("member_id", JDBCType.BIGINT);

        public final SqlColumn<Long> couponId = column("coupon_id", JDBCType.BIGINT);

        public final SqlColumn<String> orderSn = column("order_sn", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> memberUsername = column("member_username", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> totalAmount = column("total_amount", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> payAmount = column("pay_amount", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> freightAmount = column("freight_amount", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> promotionAmount = column("promotion_amount", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> integrationAmount = column("integration_amount", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> couponAmount = column("coupon_amount", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> discountAmount = column("discount_amount", JDBCType.DECIMAL);

        public final SqlColumn<Integer> payType = column("pay_type", JDBCType.INTEGER);

        public final SqlColumn<Integer> sourceType = column("source_type", JDBCType.INTEGER);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Integer> orderType = column("order_type", JDBCType.INTEGER);

        public final SqlColumn<String> deliveryCompany = column("delivery_company", JDBCType.VARCHAR);

        public final SqlColumn<String> deliverySn = column("delivery_sn", JDBCType.VARCHAR);

        public final SqlColumn<Integer> autoConfirmDay = column("auto_confirm_day", JDBCType.INTEGER);

        public final SqlColumn<Integer> integration = column("integration", JDBCType.INTEGER);

        public final SqlColumn<Integer> growth = column("growth", JDBCType.INTEGER);

        public final SqlColumn<String> promotionInfo = column("promotion_info", JDBCType.VARCHAR);

        public final SqlColumn<Integer> billType = column("bill_type", JDBCType.INTEGER);

        public final SqlColumn<String> billHeader = column("bill_header", JDBCType.VARCHAR);

        public final SqlColumn<String> billContent = column("bill_content", JDBCType.VARCHAR);

        public final SqlColumn<String> billReceiverPhone = column("bill_receiver_phone", JDBCType.VARCHAR);

        public final SqlColumn<String> billReceiverEmail = column("bill_receiver_email", JDBCType.VARCHAR);

        public final SqlColumn<String> receiverName = column("receiver_name", JDBCType.VARCHAR);

        public final SqlColumn<String> receiverPhone = column("receiver_phone", JDBCType.VARCHAR);

        public final SqlColumn<String> receiverPostCode = column("receiver_post_code", JDBCType.VARCHAR);

        public final SqlColumn<String> receiverProvince = column("receiver_province", JDBCType.VARCHAR);

        public final SqlColumn<String> receiverCity = column("receiver_city", JDBCType.VARCHAR);

        public final SqlColumn<String> receiverRegion = column("receiver_region", JDBCType.VARCHAR);

        public final SqlColumn<String> receiverDetailAddress = column("receiver_detail_address", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<Integer> confirmStatus = column("confirm_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> deleteStatus = column("delete_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> useIntegration = column("use_integration", JDBCType.INTEGER);

        public final SqlColumn<Date> paymentTime = column("payment_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> deliveryTime = column("delivery_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> receiveTime = column("receive_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> commentTime = column("comment_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> modifyTime = column("modify_time", JDBCType.TIMESTAMP);

        public OmsOrder() {
            super("oms_order", OmsOrder::new);
        }
    }
}