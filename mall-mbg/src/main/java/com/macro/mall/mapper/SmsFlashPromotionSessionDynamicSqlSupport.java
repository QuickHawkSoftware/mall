package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SmsFlashPromotionSessionDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SmsFlashPromotionSession smsFlashPromotionSession = new SmsFlashPromotionSession();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = smsFlashPromotionSession.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = smsFlashPromotionSession.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> startTime = smsFlashPromotionSession.startTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> endTime = smsFlashPromotionSession.endTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> status = smsFlashPromotionSession.status;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = smsFlashPromotionSession.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SmsFlashPromotionSession extends AliasableSqlTable<SmsFlashPromotionSession> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Date> startTime = column("start_time", JDBCType.TIME);

        public final SqlColumn<Date> endTime = column("end_time", JDBCType.TIME);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public SmsFlashPromotionSession() {
            super("sms_flash_promotion_session", SmsFlashPromotionSession::new);
        }
    }
}