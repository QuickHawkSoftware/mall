package com.macro.mall.mapper;

import static com.macro.mall.mapper.OmsOrderOperateHistoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.OmsOrderOperateHistory;
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
public interface OmsOrderOperateHistoryMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<OmsOrderOperateHistory>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, orderId, operateMan, createTime, orderStatus, note);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OmsOrderOperateHistoryResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT),
        @Result(column="operate_man", property="operateMan", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="order_status", property="orderStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR)
    })
    List<OmsOrderOperateHistory> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OmsOrderOperateHistoryResult")
    Optional<OmsOrderOperateHistory> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, omsOrderOperateHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, omsOrderOperateHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(OmsOrderOperateHistory row) {
        return MyBatis3Utils.insert(this::insert, row, omsOrderOperateHistory, c ->
            c.map(id).toProperty("id")
            .map(orderId).toProperty("orderId")
            .map(operateMan).toProperty("operateMan")
            .map(createTime).toProperty("createTime")
            .map(orderStatus).toProperty("orderStatus")
            .map(note).toProperty("note")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<OmsOrderOperateHistory> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, omsOrderOperateHistory, c ->
            c.map(id).toProperty("id")
            .map(orderId).toProperty("orderId")
            .map(operateMan).toProperty("operateMan")
            .map(createTime).toProperty("createTime")
            .map(orderStatus).toProperty("orderStatus")
            .map(note).toProperty("note")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(OmsOrderOperateHistory row) {
        return MyBatis3Utils.insert(this::insert, row, omsOrderOperateHistory, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(orderId).toPropertyWhenPresent("orderId", row::getOrderId)
            .map(operateMan).toPropertyWhenPresent("operateMan", row::getOperateMan)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(orderStatus).toPropertyWhenPresent("orderStatus", row::getOrderStatus)
            .map(note).toPropertyWhenPresent("note", row::getNote)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsOrderOperateHistory> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, omsOrderOperateHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsOrderOperateHistory> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, omsOrderOperateHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsOrderOperateHistory> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, omsOrderOperateHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsOrderOperateHistory> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, omsOrderOperateHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(OmsOrderOperateHistory row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(orderId).equalTo(row::getOrderId)
                .set(operateMan).equalTo(row::getOperateMan)
                .set(createTime).equalTo(row::getCreateTime)
                .set(orderStatus).equalTo(row::getOrderStatus)
                .set(note).equalTo(row::getNote);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OmsOrderOperateHistory row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(orderId).equalToWhenPresent(row::getOrderId)
                .set(operateMan).equalToWhenPresent(row::getOperateMan)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(orderStatus).equalToWhenPresent(row::getOrderStatus)
                .set(note).equalToWhenPresent(row::getNote);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(OmsOrderOperateHistory row) {
        return update(c ->
            c.set(orderId).equalTo(row::getOrderId)
            .set(operateMan).equalTo(row::getOperateMan)
            .set(createTime).equalTo(row::getCreateTime)
            .set(orderStatus).equalTo(row::getOrderStatus)
            .set(note).equalTo(row::getNote)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(OmsOrderOperateHistory row) {
        return update(c ->
            c.set(orderId).equalToWhenPresent(row::getOrderId)
            .set(operateMan).equalToWhenPresent(row::getOperateMan)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(orderStatus).equalToWhenPresent(row::getOrderStatus)
            .set(note).equalToWhenPresent(row::getNote)
            .where(id, isEqualTo(row::getId))
        );
    }
}