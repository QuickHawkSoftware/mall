package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SmsCouponHistoryDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SmsCouponHistory smsCouponHistory = new SmsCouponHistory();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = smsCouponHistory.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> couponId = smsCouponHistory.couponId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> memberId = smsCouponHistory.memberId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> couponCode = smsCouponHistory.couponCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> memberNickname = smsCouponHistory.memberNickname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> getType = smsCouponHistory.getType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = smsCouponHistory.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> useStatus = smsCouponHistory.useStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> useTime = smsCouponHistory.useTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> orderId = smsCouponHistory.orderId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> orderSn = smsCouponHistory.orderSn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SmsCouponHistory extends AliasableSqlTable<SmsCouponHistory> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> couponId = column("coupon_id", JDBCType.BIGINT);

        public final SqlColumn<Long> memberId = column("member_id", JDBCType.BIGINT);

        public final SqlColumn<String> couponCode = column("coupon_code", JDBCType.VARCHAR);

        public final SqlColumn<String> memberNickname = column("member_nickname", JDBCType.VARCHAR);

        public final SqlColumn<Integer> getType = column("get_type", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> useStatus = column("use_status", JDBCType.INTEGER);

        public final SqlColumn<Date> useTime = column("use_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Long> orderId = column("order_id", JDBCType.BIGINT);

        public final SqlColumn<String> orderSn = column("order_sn", JDBCType.VARCHAR);

        public SmsCouponHistory() {
            super("sms_coupon_history", SmsCouponHistory::new);
        }
    }
}