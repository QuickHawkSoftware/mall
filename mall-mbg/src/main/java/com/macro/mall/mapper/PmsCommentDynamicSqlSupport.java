package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class PmsCommentDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final PmsComment pmsComment = new PmsComment();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = pmsComment.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productId = pmsComment.productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> memberNickName = pmsComment.memberNickName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productName = pmsComment.productName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> star = pmsComment.star;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> memberIp = pmsComment.memberIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = pmsComment.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> showStatus = pmsComment.showStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productAttribute = pmsComment.productAttribute;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> collectCouont = pmsComment.collectCouont;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> readCount = pmsComment.readCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> pics = pmsComment.pics;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> memberIcon = pmsComment.memberIcon;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> replayCount = pmsComment.replayCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> content = pmsComment.content;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class PmsComment extends AliasableSqlTable<PmsComment> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> productId = column("product_id", JDBCType.BIGINT);

        public final SqlColumn<String> memberNickName = column("member_nick_name", JDBCType.VARCHAR);

        public final SqlColumn<String> productName = column("product_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> star = column("star", JDBCType.INTEGER);

        public final SqlColumn<String> memberIp = column("member_ip", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> showStatus = column("show_status", JDBCType.INTEGER);

        public final SqlColumn<String> productAttribute = column("product_attribute", JDBCType.VARCHAR);

        public final SqlColumn<Integer> collectCouont = column("collect_couont", JDBCType.INTEGER);

        public final SqlColumn<Integer> readCount = column("read_count", JDBCType.INTEGER);

        public final SqlColumn<String> pics = column("pics", JDBCType.VARCHAR);

        public final SqlColumn<String> memberIcon = column("member_icon", JDBCType.VARCHAR);

        public final SqlColumn<Integer> replayCount = column("replay_count", JDBCType.INTEGER);

        public final SqlColumn<String> content = column("content", JDBCType.LONGVARCHAR);

        public PmsComment() {
            super("pms_comment", PmsComment::new);
        }
    }
}