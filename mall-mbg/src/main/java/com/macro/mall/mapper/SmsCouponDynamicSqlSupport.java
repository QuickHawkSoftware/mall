package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SmsCouponDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SmsCoupon smsCoupon = new SmsCoupon();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = smsCoupon.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> type = smsCoupon.type;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = smsCoupon.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> platform = smsCoupon.platform;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> count = smsCoupon.count;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> amount = smsCoupon.amount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> perLimit = smsCoupon.perLimit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> minPoint = smsCoupon.minPoint;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> startTime = smsCoupon.startTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> endTime = smsCoupon.endTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> useType = smsCoupon.useType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> note = smsCoupon.note;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> publishCount = smsCoupon.publishCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> useCount = smsCoupon.useCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> receiveCount = smsCoupon.receiveCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> enableTime = smsCoupon.enableTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> code = smsCoupon.code;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> memberLevel = smsCoupon.memberLevel;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SmsCoupon extends AliasableSqlTable<SmsCoupon> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> platform = column("platform", JDBCType.INTEGER);

        public final SqlColumn<Integer> count = column("count", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> amount = column("amount", JDBCType.DECIMAL);

        public final SqlColumn<Integer> perLimit = column("per_limit", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> minPoint = column("min_point", JDBCType.DECIMAL);

        public final SqlColumn<Date> startTime = column("start_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> endTime = column("end_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> useType = column("use_type", JDBCType.INTEGER);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<Integer> publishCount = column("publish_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> useCount = column("use_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> receiveCount = column("receive_count", JDBCType.INTEGER);

        public final SqlColumn<Date> enableTime = column("enable_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> code = column("code", JDBCType.VARCHAR);

        public final SqlColumn<Integer> memberLevel = column("member_level", JDBCType.INTEGER);

        public SmsCoupon() {
            super("sms_coupon", SmsCoupon::new);
        }
    }
}