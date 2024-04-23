package com.macro.mall.mapper;

import static com.macro.mall.mapper.SmsCouponDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.SmsCoupon;
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
public interface SmsCouponMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<SmsCoupon>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, type, name, platform, count, amount, perLimit, minPoint, startTime, endTime, useType, note, publishCount, useCount, receiveCount, enableTime, code, memberLevel);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SmsCouponResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform", property="platform", jdbcType=JdbcType.INTEGER),
        @Result(column="count", property="count", jdbcType=JdbcType.INTEGER),
        @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="per_limit", property="perLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="min_point", property="minPoint", jdbcType=JdbcType.DECIMAL),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="use_type", property="useType", jdbcType=JdbcType.INTEGER),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="publish_count", property="publishCount", jdbcType=JdbcType.INTEGER),
        @Result(column="use_count", property="useCount", jdbcType=JdbcType.INTEGER),
        @Result(column="receive_count", property="receiveCount", jdbcType=JdbcType.INTEGER),
        @Result(column="enable_time", property="enableTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="member_level", property="memberLevel", jdbcType=JdbcType.INTEGER)
    })
    List<SmsCoupon> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SmsCouponResult")
    Optional<SmsCoupon> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, smsCoupon, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, smsCoupon, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SmsCoupon row) {
        return MyBatis3Utils.insert(this::insert, row, smsCoupon, c ->
            c.map(id).toProperty("id")
            .map(type).toProperty("type")
            .map(name).toProperty("name")
            .map(platform).toProperty("platform")
            .map(count).toProperty("count")
            .map(amount).toProperty("amount")
            .map(perLimit).toProperty("perLimit")
            .map(minPoint).toProperty("minPoint")
            .map(startTime).toProperty("startTime")
            .map(endTime).toProperty("endTime")
            .map(useType).toProperty("useType")
            .map(note).toProperty("note")
            .map(publishCount).toProperty("publishCount")
            .map(useCount).toProperty("useCount")
            .map(receiveCount).toProperty("receiveCount")
            .map(enableTime).toProperty("enableTime")
            .map(code).toProperty("code")
            .map(memberLevel).toProperty("memberLevel")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<SmsCoupon> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, smsCoupon, c ->
            c.map(id).toProperty("id")
            .map(type).toProperty("type")
            .map(name).toProperty("name")
            .map(platform).toProperty("platform")
            .map(count).toProperty("count")
            .map(amount).toProperty("amount")
            .map(perLimit).toProperty("perLimit")
            .map(minPoint).toProperty("minPoint")
            .map(startTime).toProperty("startTime")
            .map(endTime).toProperty("endTime")
            .map(useType).toProperty("useType")
            .map(note).toProperty("note")
            .map(publishCount).toProperty("publishCount")
            .map(useCount).toProperty("useCount")
            .map(receiveCount).toProperty("receiveCount")
            .map(enableTime).toProperty("enableTime")
            .map(code).toProperty("code")
            .map(memberLevel).toProperty("memberLevel")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(SmsCoupon row) {
        return MyBatis3Utils.insert(this::insert, row, smsCoupon, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(type).toPropertyWhenPresent("type", row::getType)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(platform).toPropertyWhenPresent("platform", row::getPlatform)
            .map(count).toPropertyWhenPresent("count", row::getCount)
            .map(amount).toPropertyWhenPresent("amount", row::getAmount)
            .map(perLimit).toPropertyWhenPresent("perLimit", row::getPerLimit)
            .map(minPoint).toPropertyWhenPresent("minPoint", row::getMinPoint)
            .map(startTime).toPropertyWhenPresent("startTime", row::getStartTime)
            .map(endTime).toPropertyWhenPresent("endTime", row::getEndTime)
            .map(useType).toPropertyWhenPresent("useType", row::getUseType)
            .map(note).toPropertyWhenPresent("note", row::getNote)
            .map(publishCount).toPropertyWhenPresent("publishCount", row::getPublishCount)
            .map(useCount).toPropertyWhenPresent("useCount", row::getUseCount)
            .map(receiveCount).toPropertyWhenPresent("receiveCount", row::getReceiveCount)
            .map(enableTime).toPropertyWhenPresent("enableTime", row::getEnableTime)
            .map(code).toPropertyWhenPresent("code", row::getCode)
            .map(memberLevel).toPropertyWhenPresent("memberLevel", row::getMemberLevel)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SmsCoupon> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, smsCoupon, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SmsCoupon> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, smsCoupon, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SmsCoupon> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, smsCoupon, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SmsCoupon> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, smsCoupon, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(SmsCoupon row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(type).equalTo(row::getType)
                .set(name).equalTo(row::getName)
                .set(platform).equalTo(row::getPlatform)
                .set(count).equalTo(row::getCount)
                .set(amount).equalTo(row::getAmount)
                .set(perLimit).equalTo(row::getPerLimit)
                .set(minPoint).equalTo(row::getMinPoint)
                .set(startTime).equalTo(row::getStartTime)
                .set(endTime).equalTo(row::getEndTime)
                .set(useType).equalTo(row::getUseType)
                .set(note).equalTo(row::getNote)
                .set(publishCount).equalTo(row::getPublishCount)
                .set(useCount).equalTo(row::getUseCount)
                .set(receiveCount).equalTo(row::getReceiveCount)
                .set(enableTime).equalTo(row::getEnableTime)
                .set(code).equalTo(row::getCode)
                .set(memberLevel).equalTo(row::getMemberLevel);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SmsCoupon row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(type).equalToWhenPresent(row::getType)
                .set(name).equalToWhenPresent(row::getName)
                .set(platform).equalToWhenPresent(row::getPlatform)
                .set(count).equalToWhenPresent(row::getCount)
                .set(amount).equalToWhenPresent(row::getAmount)
                .set(perLimit).equalToWhenPresent(row::getPerLimit)
                .set(minPoint).equalToWhenPresent(row::getMinPoint)
                .set(startTime).equalToWhenPresent(row::getStartTime)
                .set(endTime).equalToWhenPresent(row::getEndTime)
                .set(useType).equalToWhenPresent(row::getUseType)
                .set(note).equalToWhenPresent(row::getNote)
                .set(publishCount).equalToWhenPresent(row::getPublishCount)
                .set(useCount).equalToWhenPresent(row::getUseCount)
                .set(receiveCount).equalToWhenPresent(row::getReceiveCount)
                .set(enableTime).equalToWhenPresent(row::getEnableTime)
                .set(code).equalToWhenPresent(row::getCode)
                .set(memberLevel).equalToWhenPresent(row::getMemberLevel);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(SmsCoupon row) {
        return update(c ->
            c.set(type).equalTo(row::getType)
            .set(name).equalTo(row::getName)
            .set(platform).equalTo(row::getPlatform)
            .set(count).equalTo(row::getCount)
            .set(amount).equalTo(row::getAmount)
            .set(perLimit).equalTo(row::getPerLimit)
            .set(minPoint).equalTo(row::getMinPoint)
            .set(startTime).equalTo(row::getStartTime)
            .set(endTime).equalTo(row::getEndTime)
            .set(useType).equalTo(row::getUseType)
            .set(note).equalTo(row::getNote)
            .set(publishCount).equalTo(row::getPublishCount)
            .set(useCount).equalTo(row::getUseCount)
            .set(receiveCount).equalTo(row::getReceiveCount)
            .set(enableTime).equalTo(row::getEnableTime)
            .set(code).equalTo(row::getCode)
            .set(memberLevel).equalTo(row::getMemberLevel)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(SmsCoupon row) {
        return update(c ->
            c.set(type).equalToWhenPresent(row::getType)
            .set(name).equalToWhenPresent(row::getName)
            .set(platform).equalToWhenPresent(row::getPlatform)
            .set(count).equalToWhenPresent(row::getCount)
            .set(amount).equalToWhenPresent(row::getAmount)
            .set(perLimit).equalToWhenPresent(row::getPerLimit)
            .set(minPoint).equalToWhenPresent(row::getMinPoint)
            .set(startTime).equalToWhenPresent(row::getStartTime)
            .set(endTime).equalToWhenPresent(row::getEndTime)
            .set(useType).equalToWhenPresent(row::getUseType)
            .set(note).equalToWhenPresent(row::getNote)
            .set(publishCount).equalToWhenPresent(row::getPublishCount)
            .set(useCount).equalToWhenPresent(row::getUseCount)
            .set(receiveCount).equalToWhenPresent(row::getReceiveCount)
            .set(enableTime).equalToWhenPresent(row::getEnableTime)
            .set(code).equalToWhenPresent(row::getCode)
            .set(memberLevel).equalToWhenPresent(row::getMemberLevel)
            .where(id, isEqualTo(row::getId))
        );
    }
}