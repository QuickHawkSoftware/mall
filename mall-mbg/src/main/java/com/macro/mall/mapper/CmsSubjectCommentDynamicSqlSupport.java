package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class CmsSubjectCommentDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final CmsSubjectComment cmsSubjectComment = new CmsSubjectComment();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = cmsSubjectComment.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> subjectId = cmsSubjectComment.subjectId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> memberNickName = cmsSubjectComment.memberNickName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> memberIcon = cmsSubjectComment.memberIcon;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> content = cmsSubjectComment.content;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = cmsSubjectComment.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> showStatus = cmsSubjectComment.showStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class CmsSubjectComment extends AliasableSqlTable<CmsSubjectComment> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> subjectId = column("subject_id", JDBCType.BIGINT);

        public final SqlColumn<String> memberNickName = column("member_nick_name", JDBCType.VARCHAR);

        public final SqlColumn<String> memberIcon = column("member_icon", JDBCType.VARCHAR);

        public final SqlColumn<String> content = column("content", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> showStatus = column("show_status", JDBCType.INTEGER);

        public CmsSubjectComment() {
            super("cms_subject_comment", CmsSubjectComment::new);
        }
    }
}