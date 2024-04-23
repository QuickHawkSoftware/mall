package com.macro.mall.mapper;

import static com.macro.mall.mapper.SmsHomeAdvertiseDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.SmsHomeAdvertise;
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
public interface SmsHomeAdvertiseMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<SmsHomeAdvertise>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, type, pic, startTime, endTime, status, clickCount, orderCount, url, note, sort);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SmsHomeAdvertiseResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="pic", property="pic", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="click_count", property="clickCount", jdbcType=JdbcType.INTEGER),
        @Result(column="order_count", property="orderCount", jdbcType=JdbcType.INTEGER),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER)
    })
    List<SmsHomeAdvertise> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SmsHomeAdvertiseResult")
    Optional<SmsHomeAdvertise> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, smsHomeAdvertise, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, smsHomeAdvertise, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SmsHomeAdvertise row) {
        return MyBatis3Utils.insert(this::insert, row, smsHomeAdvertise, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(type).toProperty("type")
            .map(pic).toProperty("pic")
            .map(startTime).toProperty("startTime")
            .map(endTime).toProperty("endTime")
            .map(status).toProperty("status")
            .map(clickCount).toProperty("clickCount")
            .map(orderCount).toProperty("orderCount")
            .map(url).toProperty("url")
            .map(note).toProperty("note")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<SmsHomeAdvertise> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, smsHomeAdvertise, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(type).toProperty("type")
            .map(pic).toProperty("pic")
            .map(startTime).toProperty("startTime")
            .map(endTime).toProperty("endTime")
            .map(status).toProperty("status")
            .map(clickCount).toProperty("clickCount")
            .map(orderCount).toProperty("orderCount")
            .map(url).toProperty("url")
            .map(note).toProperty("note")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(SmsHomeAdvertise row) {
        return MyBatis3Utils.insert(this::insert, row, smsHomeAdvertise, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(type).toPropertyWhenPresent("type", row::getType)
            .map(pic).toPropertyWhenPresent("pic", row::getPic)
            .map(startTime).toPropertyWhenPresent("startTime", row::getStartTime)
            .map(endTime).toPropertyWhenPresent("endTime", row::getEndTime)
            .map(status).toPropertyWhenPresent("status", row::getStatus)
            .map(clickCount).toPropertyWhenPresent("clickCount", row::getClickCount)
            .map(orderCount).toPropertyWhenPresent("orderCount", row::getOrderCount)
            .map(url).toPropertyWhenPresent("url", row::getUrl)
            .map(note).toPropertyWhenPresent("note", row::getNote)
            .map(sort).toPropertyWhenPresent("sort", row::getSort)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SmsHomeAdvertise> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, smsHomeAdvertise, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SmsHomeAdvertise> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, smsHomeAdvertise, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SmsHomeAdvertise> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, smsHomeAdvertise, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SmsHomeAdvertise> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, smsHomeAdvertise, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(SmsHomeAdvertise row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(name).equalTo(row::getName)
                .set(type).equalTo(row::getType)
                .set(pic).equalTo(row::getPic)
                .set(startTime).equalTo(row::getStartTime)
                .set(endTime).equalTo(row::getEndTime)
                .set(status).equalTo(row::getStatus)
                .set(clickCount).equalTo(row::getClickCount)
                .set(orderCount).equalTo(row::getOrderCount)
                .set(url).equalTo(row::getUrl)
                .set(note).equalTo(row::getNote)
                .set(sort).equalTo(row::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SmsHomeAdvertise row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(name).equalToWhenPresent(row::getName)
                .set(type).equalToWhenPresent(row::getType)
                .set(pic).equalToWhenPresent(row::getPic)
                .set(startTime).equalToWhenPresent(row::getStartTime)
                .set(endTime).equalToWhenPresent(row::getEndTime)
                .set(status).equalToWhenPresent(row::getStatus)
                .set(clickCount).equalToWhenPresent(row::getClickCount)
                .set(orderCount).equalToWhenPresent(row::getOrderCount)
                .set(url).equalToWhenPresent(row::getUrl)
                .set(note).equalToWhenPresent(row::getNote)
                .set(sort).equalToWhenPresent(row::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(SmsHomeAdvertise row) {
        return update(c ->
            c.set(name).equalTo(row::getName)
            .set(type).equalTo(row::getType)
            .set(pic).equalTo(row::getPic)
            .set(startTime).equalTo(row::getStartTime)
            .set(endTime).equalTo(row::getEndTime)
            .set(status).equalTo(row::getStatus)
            .set(clickCount).equalTo(row::getClickCount)
            .set(orderCount).equalTo(row::getOrderCount)
            .set(url).equalTo(row::getUrl)
            .set(note).equalTo(row::getNote)
            .set(sort).equalTo(row::getSort)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(SmsHomeAdvertise row) {
        return update(c ->
            c.set(name).equalToWhenPresent(row::getName)
            .set(type).equalToWhenPresent(row::getType)
            .set(pic).equalToWhenPresent(row::getPic)
            .set(startTime).equalToWhenPresent(row::getStartTime)
            .set(endTime).equalToWhenPresent(row::getEndTime)
            .set(status).equalToWhenPresent(row::getStatus)
            .set(clickCount).equalToWhenPresent(row::getClickCount)
            .set(orderCount).equalToWhenPresent(row::getOrderCount)
            .set(url).equalToWhenPresent(row::getUrl)
            .set(note).equalToWhenPresent(row::getNote)
            .set(sort).equalToWhenPresent(row::getSort)
            .where(id, isEqualTo(row::getId))
        );
    }
}