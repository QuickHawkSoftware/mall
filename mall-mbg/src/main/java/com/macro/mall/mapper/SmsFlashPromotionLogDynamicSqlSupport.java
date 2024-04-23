package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SmsFlashPromotionLogDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SmsFlashPromotionLog smsFlashPromotionLog = new SmsFlashPromotionLog();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = smsFlashPromotionLog.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> memberId = smsFlashPromotionLog.memberId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productId = smsFlashPromotionLog.productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> memberPhone = smsFlashPromotionLog.memberPhone;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productName = smsFlashPromotionLog.productName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> subscribeTime = smsFlashPromotionLog.subscribeTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> sendTime = smsFlashPromotionLog.sendTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SmsFlashPromotionLog extends AliasableSqlTable<SmsFlashPromotionLog> {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> memberId = column("member_id", JDBCType.INTEGER);

        public final SqlColumn<Long> productId = column("product_id", JDBCType.BIGINT);

        public final SqlColumn<String> memberPhone = column("member_phone", JDBCType.VARCHAR);

        public final SqlColumn<String> productName = column("product_name", JDBCType.VARCHAR);

        public final SqlColumn<Date> subscribeTime = column("subscribe_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> sendTime = column("send_time", JDBCType.TIMESTAMP);

        public SmsFlashPromotionLog() {
            super("sms_flash_promotion_log", SmsFlashPromotionLog::new);
        }
    }
}