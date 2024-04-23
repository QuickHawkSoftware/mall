package com.macro.mall.mapper;

import static com.macro.mall.mapper.SmsFlashPromotionLogDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.SmsFlashPromotionLog;
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
public interface SmsFlashPromotionLogMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<SmsFlashPromotionLog>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, memberId, productId, memberPhone, productName, subscribeTime, sendTime);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SmsFlashPromotionLogResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.INTEGER),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.BIGINT),
        @Result(column="member_phone", property="memberPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_name", property="productName", jdbcType=JdbcType.VARCHAR),
        @Result(column="subscribe_time", property="subscribeTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="send_time", property="sendTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SmsFlashPromotionLog> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SmsFlashPromotionLogResult")
    Optional<SmsFlashPromotionLog> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, smsFlashPromotionLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, smsFlashPromotionLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SmsFlashPromotionLog row) {
        return MyBatis3Utils.insert(this::insert, row, smsFlashPromotionLog, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(productId).toProperty("productId")
            .map(memberPhone).toProperty("memberPhone")
            .map(productName).toProperty("productName")
            .map(subscribeTime).toProperty("subscribeTime")
            .map(sendTime).toProperty("sendTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<SmsFlashPromotionLog> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, smsFlashPromotionLog, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(productId).toProperty("productId")
            .map(memberPhone).toProperty("memberPhone")
            .map(productName).toProperty("productName")
            .map(subscribeTime).toProperty("subscribeTime")
            .map(sendTime).toProperty("sendTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(SmsFlashPromotionLog row) {
        return MyBatis3Utils.insert(this::insert, row, smsFlashPromotionLog, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(memberId).toPropertyWhenPresent("memberId", row::getMemberId)
            .map(productId).toPropertyWhenPresent("productId", row::getProductId)
            .map(memberPhone).toPropertyWhenPresent("memberPhone", row::getMemberPhone)
            .map(productName).toPropertyWhenPresent("productName", row::getProductName)
            .map(subscribeTime).toPropertyWhenPresent("subscribeTime", row::getSubscribeTime)
            .map(sendTime).toPropertyWhenPresent("sendTime", row::getSendTime)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SmsFlashPromotionLog> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, smsFlashPromotionLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SmsFlashPromotionLog> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, smsFlashPromotionLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SmsFlashPromotionLog> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, smsFlashPromotionLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SmsFlashPromotionLog> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, smsFlashPromotionLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(SmsFlashPromotionLog row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(memberId).equalTo(row::getMemberId)
                .set(productId).equalTo(row::getProductId)
                .set(memberPhone).equalTo(row::getMemberPhone)
                .set(productName).equalTo(row::getProductName)
                .set(subscribeTime).equalTo(row::getSubscribeTime)
                .set(sendTime).equalTo(row::getSendTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SmsFlashPromotionLog row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(memberId).equalToWhenPresent(row::getMemberId)
                .set(productId).equalToWhenPresent(row::getProductId)
                .set(memberPhone).equalToWhenPresent(row::getMemberPhone)
                .set(productName).equalToWhenPresent(row::getProductName)
                .set(subscribeTime).equalToWhenPresent(row::getSubscribeTime)
                .set(sendTime).equalToWhenPresent(row::getSendTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(SmsFlashPromotionLog row) {
        return update(c ->
            c.set(memberId).equalTo(row::getMemberId)
            .set(productId).equalTo(row::getProductId)
            .set(memberPhone).equalTo(row::getMemberPhone)
            .set(productName).equalTo(row::getProductName)
            .set(subscribeTime).equalTo(row::getSubscribeTime)
            .set(sendTime).equalTo(row::getSendTime)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(SmsFlashPromotionLog row) {
        return update(c ->
            c.set(memberId).equalToWhenPresent(row::getMemberId)
            .set(productId).equalToWhenPresent(row::getProductId)
            .set(memberPhone).equalToWhenPresent(row::getMemberPhone)
            .set(productName).equalToWhenPresent(row::getProductName)
            .set(subscribeTime).equalToWhenPresent(row::getSubscribeTime)
            .set(sendTime).equalToWhenPresent(row::getSendTime)
            .where(id, isEqualTo(row::getId))
        );
    }
}