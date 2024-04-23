package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SmsHomeRecommendSubjectDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SmsHomeRecommendSubject smsHomeRecommendSubject = new SmsHomeRecommendSubject();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = smsHomeRecommendSubject.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> subjectId = smsHomeRecommendSubject.subjectId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> subjectName = smsHomeRecommendSubject.subjectName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> recommendStatus = smsHomeRecommendSubject.recommendStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> sort = smsHomeRecommendSubject.sort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SmsHomeRecommendSubject extends AliasableSqlTable<SmsHomeRecommendSubject> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> subjectId = column("subject_id", JDBCType.BIGINT);

        public final SqlColumn<String> subjectName = column("subject_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> recommendStatus = column("recommend_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public SmsHomeRecommendSubject() {
            super("sms_home_recommend_subject", SmsHomeRecommendSubject::new);
        }
    }
}