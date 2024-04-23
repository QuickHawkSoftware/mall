package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UmsMemberDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsMember umsMember = new UmsMember();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = umsMember.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> memberLevelId = umsMember.memberLevelId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> username = umsMember.username;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> password = umsMember.password;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> nickname = umsMember.nickname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> phone = umsMember.phone;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> status = umsMember.status;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = umsMember.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> icon = umsMember.icon;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> gender = umsMember.gender;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> birthday = umsMember.birthday;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> city = umsMember.city;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> job = umsMember.job;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> personalizedSignature = umsMember.personalizedSignature;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> sourceType = umsMember.sourceType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> integration = umsMember.integration;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> growth = umsMember.growth;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> luckeyCount = umsMember.luckeyCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> historyIntegration = umsMember.historyIntegration;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsMember extends AliasableSqlTable<UmsMember> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> memberLevelId = column("member_level_id", JDBCType.BIGINT);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> nickname = column("nickname", JDBCType.VARCHAR);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> icon = column("icon", JDBCType.VARCHAR);

        public final SqlColumn<Integer> gender = column("gender", JDBCType.INTEGER);

        public final SqlColumn<Date> birthday = column("birthday", JDBCType.DATE);

        public final SqlColumn<String> city = column("city", JDBCType.VARCHAR);

        public final SqlColumn<String> job = column("job", JDBCType.VARCHAR);

        public final SqlColumn<String> personalizedSignature = column("personalized_signature", JDBCType.VARCHAR);

        public final SqlColumn<Integer> sourceType = column("source_type", JDBCType.INTEGER);

        public final SqlColumn<Integer> integration = column("integration", JDBCType.INTEGER);

        public final SqlColumn<Integer> growth = column("growth", JDBCType.INTEGER);

        public final SqlColumn<Integer> luckeyCount = column("luckey_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> historyIntegration = column("history_integration", JDBCType.INTEGER);

        public UmsMember() {
            super("ums_member", UmsMember::new);
        }
    }
}