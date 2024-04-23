package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class CmsTopicCommentDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final CmsTopicComment cmsTopicComment = new CmsTopicComment();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = cmsTopicComment.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> memberNickName = cmsTopicComment.memberNickName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> topicId = cmsTopicComment.topicId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> memberIcon = cmsTopicComment.memberIcon;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> content = cmsTopicComment.content;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = cmsTopicComment.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> showStatus = cmsTopicComment.showStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class CmsTopicComment extends AliasableSqlTable<CmsTopicComment> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> memberNickName = column("member_nick_name", JDBCType.VARCHAR);

        public final SqlColumn<Long> topicId = column("topic_id", JDBCType.BIGINT);

        public final SqlColumn<String> memberIcon = column("member_icon", JDBCType.VARCHAR);

        public final SqlColumn<String> content = column("content", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> showStatus = column("show_status", JDBCType.INTEGER);

        public CmsTopicComment() {
            super("cms_topic_comment", CmsTopicComment::new);
        }
    }
}