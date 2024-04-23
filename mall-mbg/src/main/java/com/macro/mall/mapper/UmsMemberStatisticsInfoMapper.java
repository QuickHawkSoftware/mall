package com.macro.mall.mapper;

import static com.macro.mall.mapper.UmsMemberStatisticsInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.UmsMemberStatisticsInfo;
import jakarta.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface UmsMemberStatisticsInfoMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<UmsMemberStatisticsInfo>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, memberId, consumeAmount, orderCount, couponCount, commentCount, returnOrderCount, loginCount, attendCount, fansCount, collectProductCount, collectSubjectCount, collectTopicCount, collectCommentCount, inviteFriendCount, recentOrderTime);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsMemberStatisticsInfoResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.BIGINT),
        @Result(column="consume_amount", property="consumeAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="order_count", property="orderCount", jdbcType=JdbcType.INTEGER),
        @Result(column="coupon_count", property="couponCount", jdbcType=JdbcType.INTEGER),
        @Result(column="comment_count", property="commentCount", jdbcType=JdbcType.INTEGER),
        @Result(column="return_order_count", property="returnOrderCount", jdbcType=JdbcType.INTEGER),
        @Result(column="login_count", property="loginCount", jdbcType=JdbcType.INTEGER),
        @Result(column="attend_count", property="attendCount", jdbcType=JdbcType.INTEGER),
        @Result(column="fans_count", property="fansCount", jdbcType=JdbcType.INTEGER),
        @Result(column="collect_product_count", property="collectProductCount", jdbcType=JdbcType.INTEGER),
        @Result(column="collect_subject_count", property="collectSubjectCount", jdbcType=JdbcType.INTEGER),
        @Result(column="collect_topic_count", property="collectTopicCount", jdbcType=JdbcType.INTEGER),
        @Result(column="collect_comment_count", property="collectCommentCount", jdbcType=JdbcType.INTEGER),
        @Result(column="invite_friend_count", property="inviteFriendCount", jdbcType=JdbcType.INTEGER),
        @Result(column="recent_order_time", property="recentOrderTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UmsMemberStatisticsInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsMemberStatisticsInfoResult")
    Optional<UmsMemberStatisticsInfo> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsMemberStatisticsInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsMemberStatisticsInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsMemberStatisticsInfo row) {
        return MyBatis3Utils.insert(this::insert, row, umsMemberStatisticsInfo, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(consumeAmount).toProperty("consumeAmount")
            .map(orderCount).toProperty("orderCount")
            .map(couponCount).toProperty("couponCount")
            .map(commentCount).toProperty("commentCount")
            .map(returnOrderCount).toProperty("returnOrderCount")
            .map(loginCount).toProperty("loginCount")
            .map(attendCount).toProperty("attendCount")
            .map(fansCount).toProperty("fansCount")
            .map(collectProductCount).toProperty("collectProductCount")
            .map(collectSubjectCount).toProperty("collectSubjectCount")
            .map(collectTopicCount).toProperty("collectTopicCount")
            .map(collectCommentCount).toProperty("collectCommentCount")
            .map(inviteFriendCount).toProperty("inviteFriendCount")
            .map(recentOrderTime).toProperty("recentOrderTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UmsMemberStatisticsInfo> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsMemberStatisticsInfo, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(consumeAmount).toProperty("consumeAmount")
            .map(orderCount).toProperty("orderCount")
            .map(couponCount).toProperty("couponCount")
            .map(commentCount).toProperty("commentCount")
            .map(returnOrderCount).toProperty("returnOrderCount")
            .map(loginCount).toProperty("loginCount")
            .map(attendCount).toProperty("attendCount")
            .map(fansCount).toProperty("fansCount")
            .map(collectProductCount).toProperty("collectProductCount")
            .map(collectSubjectCount).toProperty("collectSubjectCount")
            .map(collectTopicCount).toProperty("collectTopicCount")
            .map(collectCommentCount).toProperty("collectCommentCount")
            .map(inviteFriendCount).toProperty("inviteFriendCount")
            .map(recentOrderTime).toProperty("recentOrderTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsMemberStatisticsInfo row) {
        return MyBatis3Utils.insert(this::insert, row, umsMemberStatisticsInfo, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(memberId).toPropertyWhenPresent("memberId", row::getMemberId)
            .map(consumeAmount).toPropertyWhenPresent("consumeAmount", row::getConsumeAmount)
            .map(orderCount).toPropertyWhenPresent("orderCount", row::getOrderCount)
            .map(couponCount).toPropertyWhenPresent("couponCount", row::getCouponCount)
            .map(commentCount).toPropertyWhenPresent("commentCount", row::getCommentCount)
            .map(returnOrderCount).toPropertyWhenPresent("returnOrderCount", row::getReturnOrderCount)
            .map(loginCount).toPropertyWhenPresent("loginCount", row::getLoginCount)
            .map(attendCount).toPropertyWhenPresent("attendCount", row::getAttendCount)
            .map(fansCount).toPropertyWhenPresent("fansCount", row::getFansCount)
            .map(collectProductCount).toPropertyWhenPresent("collectProductCount", row::getCollectProductCount)
            .map(collectSubjectCount).toPropertyWhenPresent("collectSubjectCount", row::getCollectSubjectCount)
            .map(collectTopicCount).toPropertyWhenPresent("collectTopicCount", row::getCollectTopicCount)
            .map(collectCommentCount).toPropertyWhenPresent("collectCommentCount", row::getCollectCommentCount)
            .map(inviteFriendCount).toPropertyWhenPresent("inviteFriendCount", row::getInviteFriendCount)
            .map(recentOrderTime).toPropertyWhenPresent("recentOrderTime", row::getRecentOrderTime)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMemberStatisticsInfo> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsMemberStatisticsInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMemberStatisticsInfo> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsMemberStatisticsInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMemberStatisticsInfo> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsMemberStatisticsInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMemberStatisticsInfo> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsMemberStatisticsInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsMemberStatisticsInfo row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(memberId).equalTo(row::getMemberId)
                .set(consumeAmount).equalTo(row::getConsumeAmount)
                .set(orderCount).equalTo(row::getOrderCount)
                .set(couponCount).equalTo(row::getCouponCount)
                .set(commentCount).equalTo(row::getCommentCount)
                .set(returnOrderCount).equalTo(row::getReturnOrderCount)
                .set(loginCount).equalTo(row::getLoginCount)
                .set(attendCount).equalTo(row::getAttendCount)
                .set(fansCount).equalTo(row::getFansCount)
                .set(collectProductCount).equalTo(row::getCollectProductCount)
                .set(collectSubjectCount).equalTo(row::getCollectSubjectCount)
                .set(collectTopicCount).equalTo(row::getCollectTopicCount)
                .set(collectCommentCount).equalTo(row::getCollectCommentCount)
                .set(inviteFriendCount).equalTo(row::getInviteFriendCount)
                .set(recentOrderTime).equalTo(row::getRecentOrderTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsMemberStatisticsInfo row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(memberId).equalToWhenPresent(row::getMemberId)
                .set(consumeAmount).equalToWhenPresent(row::getConsumeAmount)
                .set(orderCount).equalToWhenPresent(row::getOrderCount)
                .set(couponCount).equalToWhenPresent(row::getCouponCount)
                .set(commentCount).equalToWhenPresent(row::getCommentCount)
                .set(returnOrderCount).equalToWhenPresent(row::getReturnOrderCount)
                .set(loginCount).equalToWhenPresent(row::getLoginCount)
                .set(attendCount).equalToWhenPresent(row::getAttendCount)
                .set(fansCount).equalToWhenPresent(row::getFansCount)
                .set(collectProductCount).equalToWhenPresent(row::getCollectProductCount)
                .set(collectSubjectCount).equalToWhenPresent(row::getCollectSubjectCount)
                .set(collectTopicCount).equalToWhenPresent(row::getCollectTopicCount)
                .set(collectCommentCount).equalToWhenPresent(row::getCollectCommentCount)
                .set(inviteFriendCount).equalToWhenPresent(row::getInviteFriendCount)
                .set(recentOrderTime).equalToWhenPresent(row::getRecentOrderTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsMemberStatisticsInfo row) {
        return update(c ->
            c.set(memberId).equalTo(row::getMemberId)
            .set(consumeAmount).equalTo(row::getConsumeAmount)
            .set(orderCount).equalTo(row::getOrderCount)
            .set(couponCount).equalTo(row::getCouponCount)
            .set(commentCount).equalTo(row::getCommentCount)
            .set(returnOrderCount).equalTo(row::getReturnOrderCount)
            .set(loginCount).equalTo(row::getLoginCount)
            .set(attendCount).equalTo(row::getAttendCount)
            .set(fansCount).equalTo(row::getFansCount)
            .set(collectProductCount).equalTo(row::getCollectProductCount)
            .set(collectSubjectCount).equalTo(row::getCollectSubjectCount)
            .set(collectTopicCount).equalTo(row::getCollectTopicCount)
            .set(collectCommentCount).equalTo(row::getCollectCommentCount)
            .set(inviteFriendCount).equalTo(row::getInviteFriendCount)
            .set(recentOrderTime).equalTo(row::getRecentOrderTime)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsMemberStatisticsInfo row) {
        return update(c ->
            c.set(memberId).equalToWhenPresent(row::getMemberId)
            .set(consumeAmount).equalToWhenPresent(row::getConsumeAmount)
            .set(orderCount).equalToWhenPresent(row::getOrderCount)
            .set(couponCount).equalToWhenPresent(row::getCouponCount)
            .set(commentCount).equalToWhenPresent(row::getCommentCount)
            .set(returnOrderCount).equalToWhenPresent(row::getReturnOrderCount)
            .set(loginCount).equalToWhenPresent(row::getLoginCount)
            .set(attendCount).equalToWhenPresent(row::getAttendCount)
            .set(fansCount).equalToWhenPresent(row::getFansCount)
            .set(collectProductCount).equalToWhenPresent(row::getCollectProductCount)
            .set(collectSubjectCount).equalToWhenPresent(row::getCollectSubjectCount)
            .set(collectTopicCount).equalToWhenPresent(row::getCollectTopicCount)
            .set(collectCommentCount).equalToWhenPresent(row::getCollectCommentCount)
            .set(inviteFriendCount).equalToWhenPresent(row::getInviteFriendCount)
            .set(recentOrderTime).equalToWhenPresent(row::getRecentOrderTime)
            .where(id, isEqualTo(row::getId))
        );
    }
}