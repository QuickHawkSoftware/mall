package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UmsMemberStatisticsInfoDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsMemberStatisticsInfo umsMemberStatisticsInfo = new UmsMemberStatisticsInfo();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = umsMemberStatisticsInfo.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> memberId = umsMemberStatisticsInfo.memberId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> consumeAmount = umsMemberStatisticsInfo.consumeAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> orderCount = umsMemberStatisticsInfo.orderCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> couponCount = umsMemberStatisticsInfo.couponCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> commentCount = umsMemberStatisticsInfo.commentCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> returnOrderCount = umsMemberStatisticsInfo.returnOrderCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> loginCount = umsMemberStatisticsInfo.loginCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> attendCount = umsMemberStatisticsInfo.attendCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> fansCount = umsMemberStatisticsInfo.fansCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> collectProductCount = umsMemberStatisticsInfo.collectProductCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> collectSubjectCount = umsMemberStatisticsInfo.collectSubjectCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> collectTopicCount = umsMemberStatisticsInfo.collectTopicCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> collectCommentCount = umsMemberStatisticsInfo.collectCommentCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> inviteFriendCount = umsMemberStatisticsInfo.inviteFriendCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> recentOrderTime = umsMemberStatisticsInfo.recentOrderTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsMemberStatisticsInfo extends AliasableSqlTable<UmsMemberStatisticsInfo> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> memberId = column("member_id", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> consumeAmount = column("consume_amount", JDBCType.DECIMAL);

        public final SqlColumn<Integer> orderCount = column("order_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> couponCount = column("coupon_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> commentCount = column("comment_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> returnOrderCount = column("return_order_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> loginCount = column("login_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> attendCount = column("attend_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> fansCount = column("fans_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> collectProductCount = column("collect_product_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> collectSubjectCount = column("collect_subject_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> collectTopicCount = column("collect_topic_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> collectCommentCount = column("collect_comment_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> inviteFriendCount = column("invite_friend_count", JDBCType.INTEGER);

        public final SqlColumn<Date> recentOrderTime = column("recent_order_time", JDBCType.TIMESTAMP);

        public UmsMemberStatisticsInfo() {
            super("ums_member_statistics_info", UmsMemberStatisticsInfo::new);
        }
    }
}