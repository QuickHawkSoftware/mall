package com.macro.mall.mapper;

import static com.macro.mall.mapper.SmsCouponHistoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.SmsCouponHistory;
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
public interface SmsCouponHistoryMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<SmsCouponHistory>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, couponId, memberId, couponCode, memberNickname, getType, createTime, useStatus, useTime, orderId, orderSn);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SmsCouponHistoryResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="coupon_id", property="couponId", jdbcType=JdbcType.BIGINT),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.BIGINT),
        @Result(column="coupon_code", property="couponCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="member_nickname", property="memberNickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="get_type", property="getType", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="use_status", property="useStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="use_time", property="useTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT),
        @Result(column="order_sn", property="orderSn", jdbcType=JdbcType.VARCHAR)
    })
    List<SmsCouponHistory> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SmsCouponHistoryResult")
    Optional<SmsCouponHistory> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, smsCouponHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, smsCouponHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SmsCouponHistory row) {
        return MyBatis3Utils.insert(this::insert, row, smsCouponHistory, c ->
            c.map(id).toProperty("id")
            .map(couponId).toProperty("couponId")
            .map(memberId).toProperty("memberId")
            .map(couponCode).toProperty("couponCode")
            .map(memberNickname).toProperty("memberNickname")
            .map(getType).toProperty("getType")
            .map(createTime).toProperty("createTime")
            .map(useStatus).toProperty("useStatus")
            .map(useTime).toProperty("useTime")
            .map(orderId).toProperty("orderId")
            .map(orderSn).toProperty("orderSn")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<SmsCouponHistory> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, smsCouponHistory, c ->
            c.map(id).toProperty("id")
            .map(couponId).toProperty("couponId")
            .map(memberId).toProperty("memberId")
            .map(couponCode).toProperty("couponCode")
            .map(memberNickname).toProperty("memberNickname")
            .map(getType).toProperty("getType")
            .map(createTime).toProperty("createTime")
            .map(useStatus).toProperty("useStatus")
            .map(useTime).toProperty("useTime")
            .map(orderId).toProperty("orderId")
            .map(orderSn).toProperty("orderSn")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(SmsCouponHistory row) {
        return MyBatis3Utils.insert(this::insert, row, smsCouponHistory, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(couponId).toPropertyWhenPresent("couponId", row::getCouponId)
            .map(memberId).toPropertyWhenPresent("memberId", row::getMemberId)
            .map(couponCode).toPropertyWhenPresent("couponCode", row::getCouponCode)
            .map(memberNickname).toPropertyWhenPresent("memberNickname", row::getMemberNickname)
            .map(getType).toPropertyWhenPresent("getType", row::getGetType)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(useStatus).toPropertyWhenPresent("useStatus", row::getUseStatus)
            .map(useTime).toPropertyWhenPresent("useTime", row::getUseTime)
            .map(orderId).toPropertyWhenPresent("orderId", row::getOrderId)
            .map(orderSn).toPropertyWhenPresent("orderSn", row::getOrderSn)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SmsCouponHistory> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, smsCouponHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SmsCouponHistory> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, smsCouponHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SmsCouponHistory> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, smsCouponHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SmsCouponHistory> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, smsCouponHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(SmsCouponHistory row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(couponId).equalTo(row::getCouponId)
                .set(memberId).equalTo(row::getMemberId)
                .set(couponCode).equalTo(row::getCouponCode)
                .set(memberNickname).equalTo(row::getMemberNickname)
                .set(getType).equalTo(row::getGetType)
                .set(createTime).equalTo(row::getCreateTime)
                .set(useStatus).equalTo(row::getUseStatus)
                .set(useTime).equalTo(row::getUseTime)
                .set(orderId).equalTo(row::getOrderId)
                .set(orderSn).equalTo(row::getOrderSn);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SmsCouponHistory row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(couponId).equalToWhenPresent(row::getCouponId)
                .set(memberId).equalToWhenPresent(row::getMemberId)
                .set(couponCode).equalToWhenPresent(row::getCouponCode)
                .set(memberNickname).equalToWhenPresent(row::getMemberNickname)
                .set(getType).equalToWhenPresent(row::getGetType)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(useStatus).equalToWhenPresent(row::getUseStatus)
                .set(useTime).equalToWhenPresent(row::getUseTime)
                .set(orderId).equalToWhenPresent(row::getOrderId)
                .set(orderSn).equalToWhenPresent(row::getOrderSn);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(SmsCouponHistory row) {
        return update(c ->
            c.set(couponId).equalTo(row::getCouponId)
            .set(memberId).equalTo(row::getMemberId)
            .set(couponCode).equalTo(row::getCouponCode)
            .set(memberNickname).equalTo(row::getMemberNickname)
            .set(getType).equalTo(row::getGetType)
            .set(createTime).equalTo(row::getCreateTime)
            .set(useStatus).equalTo(row::getUseStatus)
            .set(useTime).equalTo(row::getUseTime)
            .set(orderId).equalTo(row::getOrderId)
            .set(orderSn).equalTo(row::getOrderSn)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(SmsCouponHistory row) {
        return update(c ->
            c.set(couponId).equalToWhenPresent(row::getCouponId)
            .set(memberId).equalToWhenPresent(row::getMemberId)
            .set(couponCode).equalToWhenPresent(row::getCouponCode)
            .set(memberNickname).equalToWhenPresent(row::getMemberNickname)
            .set(getType).equalToWhenPresent(row::getGetType)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(useStatus).equalToWhenPresent(row::getUseStatus)
            .set(useTime).equalToWhenPresent(row::getUseTime)
            .set(orderId).equalToWhenPresent(row::getOrderId)
            .set(orderSn).equalToWhenPresent(row::getOrderSn)
            .where(id, isEqualTo(row::getId))
        );
    }
}