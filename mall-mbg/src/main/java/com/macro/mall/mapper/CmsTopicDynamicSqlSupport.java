package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class CmsTopicDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final CmsTopic cmsTopic = new CmsTopic();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = cmsTopic.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> categoryId = cmsTopic.categoryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = cmsTopic.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = cmsTopic.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> startTime = cmsTopic.startTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> endTime = cmsTopic.endTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> attendCount = cmsTopic.attendCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> attentionCount = cmsTopic.attentionCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> readCount = cmsTopic.readCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> awardName = cmsTopic.awardName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> attendType = cmsTopic.attendType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> content = cmsTopic.content;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class CmsTopic extends AliasableSqlTable<CmsTopic> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> categoryId = column("category_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> startTime = column("start_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> endTime = column("end_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> attendCount = column("attend_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> attentionCount = column("attention_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> readCount = column("read_count", JDBCType.INTEGER);

        public final SqlColumn<String> awardName = column("award_name", JDBCType.VARCHAR);

        public final SqlColumn<String> attendType = column("attend_type", JDBCType.VARCHAR);

        public final SqlColumn<String> content = column("content", JDBCType.LONGVARCHAR);

        public CmsTopic() {
            super("cms_topic", CmsTopic::new);
        }
    }
}