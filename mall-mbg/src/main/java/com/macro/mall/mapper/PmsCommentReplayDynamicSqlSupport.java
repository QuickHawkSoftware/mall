package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class PmsCommentReplayDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final PmsCommentReplay pmsCommentReplay = new PmsCommentReplay();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = pmsCommentReplay.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> commentId = pmsCommentReplay.commentId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> memberNickName = pmsCommentReplay.memberNickName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> memberIcon = pmsCommentReplay.memberIcon;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> content = pmsCommentReplay.content;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = pmsCommentReplay.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> type = pmsCommentReplay.type;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class PmsCommentReplay extends AliasableSqlTable<PmsCommentReplay> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> commentId = column("comment_id", JDBCType.BIGINT);

        public final SqlColumn<String> memberNickName = column("member_nick_name", JDBCType.VARCHAR);

        public final SqlColumn<String> memberIcon = column("member_icon", JDBCType.VARCHAR);

        public final SqlColumn<String> content = column("content", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public PmsCommentReplay() {
            super("pms_comment_replay", PmsCommentReplay::new);
        }
    }
}