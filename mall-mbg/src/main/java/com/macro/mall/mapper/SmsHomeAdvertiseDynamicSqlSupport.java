package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SmsHomeAdvertiseDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SmsHomeAdvertise smsHomeAdvertise = new SmsHomeAdvertise();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = smsHomeAdvertise.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = smsHomeAdvertise.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> type = smsHomeAdvertise.type;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> pic = smsHomeAdvertise.pic;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> startTime = smsHomeAdvertise.startTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> endTime = smsHomeAdvertise.endTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> status = smsHomeAdvertise.status;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> clickCount = smsHomeAdvertise.clickCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> orderCount = smsHomeAdvertise.orderCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> url = smsHomeAdvertise.url;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> note = smsHomeAdvertise.note;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> sort = smsHomeAdvertise.sort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SmsHomeAdvertise extends AliasableSqlTable<SmsHomeAdvertise> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public final SqlColumn<String> pic = column("pic", JDBCType.VARCHAR);

        public final SqlColumn<Date> startTime = column("start_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> endTime = column("end_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Integer> clickCount = column("click_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> orderCount = column("order_count", JDBCType.INTEGER);

        public final SqlColumn<String> url = column("url", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public SmsHomeAdvertise() {
            super("sms_home_advertise", SmsHomeAdvertise::new);
        }
    }
}