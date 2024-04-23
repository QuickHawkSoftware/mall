package com.macro.mall.mapper;

import static com.macro.mall.mapper.UmsGrowthChangeHistoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.UmsGrowthChangeHistory;
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
public interface UmsGrowthChangeHistoryMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<UmsGrowthChangeHistory>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, memberId, createTime, changeType, changeCount, operateMan, operateNote, sourceType);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsGrowthChangeHistoryResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="change_type", property="changeType", jdbcType=JdbcType.INTEGER),
        @Result(column="change_count", property="changeCount", jdbcType=JdbcType.INTEGER),
        @Result(column="operate_man", property="operateMan", jdbcType=JdbcType.VARCHAR),
        @Result(column="operate_note", property="operateNote", jdbcType=JdbcType.VARCHAR),
        @Result(column="source_type", property="sourceType", jdbcType=JdbcType.INTEGER)
    })
    List<UmsGrowthChangeHistory> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsGrowthChangeHistoryResult")
    Optional<UmsGrowthChangeHistory> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsGrowthChangeHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsGrowthChangeHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsGrowthChangeHistory row) {
        return MyBatis3Utils.insert(this::insert, row, umsGrowthChangeHistory, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(createTime).toProperty("createTime")
            .map(changeType).toProperty("changeType")
            .map(changeCount).toProperty("changeCount")
            .map(operateMan).toProperty("operateMan")
            .map(operateNote).toProperty("operateNote")
            .map(sourceType).toProperty("sourceType")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UmsGrowthChangeHistory> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsGrowthChangeHistory, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(createTime).toProperty("createTime")
            .map(changeType).toProperty("changeType")
            .map(changeCount).toProperty("changeCount")
            .map(operateMan).toProperty("operateMan")
            .map(operateNote).toProperty("operateNote")
            .map(sourceType).toProperty("sourceType")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsGrowthChangeHistory row) {
        return MyBatis3Utils.insert(this::insert, row, umsGrowthChangeHistory, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(memberId).toPropertyWhenPresent("memberId", row::getMemberId)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(changeType).toPropertyWhenPresent("changeType", row::getChangeType)
            .map(changeCount).toPropertyWhenPresent("changeCount", row::getChangeCount)
            .map(operateMan).toPropertyWhenPresent("operateMan", row::getOperateMan)
            .map(operateNote).toPropertyWhenPresent("operateNote", row::getOperateNote)
            .map(sourceType).toPropertyWhenPresent("sourceType", row::getSourceType)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsGrowthChangeHistory> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsGrowthChangeHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsGrowthChangeHistory> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsGrowthChangeHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsGrowthChangeHistory> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsGrowthChangeHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsGrowthChangeHistory> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsGrowthChangeHistory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsGrowthChangeHistory row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(memberId).equalTo(row::getMemberId)
                .set(createTime).equalTo(row::getCreateTime)
                .set(changeType).equalTo(row::getChangeType)
                .set(changeCount).equalTo(row::getChangeCount)
                .set(operateMan).equalTo(row::getOperateMan)
                .set(operateNote).equalTo(row::getOperateNote)
                .set(sourceType).equalTo(row::getSourceType);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsGrowthChangeHistory row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(memberId).equalToWhenPresent(row::getMemberId)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(changeType).equalToWhenPresent(row::getChangeType)
                .set(changeCount).equalToWhenPresent(row::getChangeCount)
                .set(operateMan).equalToWhenPresent(row::getOperateMan)
                .set(operateNote).equalToWhenPresent(row::getOperateNote)
                .set(sourceType).equalToWhenPresent(row::getSourceType);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsGrowthChangeHistory row) {
        return update(c ->
            c.set(memberId).equalTo(row::getMemberId)
            .set(createTime).equalTo(row::getCreateTime)
            .set(changeType).equalTo(row::getChangeType)
            .set(changeCount).equalTo(row::getChangeCount)
            .set(operateMan).equalTo(row::getOperateMan)
            .set(operateNote).equalTo(row::getOperateNote)
            .set(sourceType).equalTo(row::getSourceType)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsGrowthChangeHistory row) {
        return update(c ->
            c.set(memberId).equalToWhenPresent(row::getMemberId)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(changeType).equalToWhenPresent(row::getChangeType)
            .set(changeCount).equalToWhenPresent(row::getChangeCount)
            .set(operateMan).equalToWhenPresent(row::getOperateMan)
            .set(operateNote).equalToWhenPresent(row::getOperateNote)
            .set(sourceType).equalToWhenPresent(row::getSourceType)
            .where(id, isEqualTo(row::getId))
        );
    }
}