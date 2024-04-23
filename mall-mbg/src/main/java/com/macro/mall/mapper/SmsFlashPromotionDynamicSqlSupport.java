package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SmsFlashPromotionDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SmsFlashPromotion smsFlashPromotion = new SmsFlashPromotion();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = smsFlashPromotion.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> title = smsFlashPromotion.title;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> startDate = smsFlashPromotion.startDate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> endDate = smsFlashPromotion.endDate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> status = smsFlashPromotion.status;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = smsFlashPromotion.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SmsFlashPromotion extends AliasableSqlTable<SmsFlashPromotion> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> title = column("title", JDBCType.VARCHAR);

        public final SqlColumn<Date> startDate = column("start_date", JDBCType.DATE);

        public final SqlColumn<Date> endDate = column("end_date", JDBCType.DATE);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public SmsFlashPromotion() {
            super("sms_flash_promotion", SmsFlashPromotion::new);
        }
    }
}