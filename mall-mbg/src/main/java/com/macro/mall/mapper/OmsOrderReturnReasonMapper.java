package com.macro.mall.mapper;

import static com.macro.mall.mapper.OmsOrderReturnReasonDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.OmsOrderReturnReason;
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
public interface OmsOrderReturnReasonMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<OmsOrderReturnReason>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, sort, status, createTime);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OmsOrderReturnReasonResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<OmsOrderReturnReason> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OmsOrderReturnReasonResult")
    Optional<OmsOrderReturnReason> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, omsOrderReturnReason, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, omsOrderReturnReason, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(OmsOrderReturnReason row) {
        return MyBatis3Utils.insert(this::insert, row, omsOrderReturnReason, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(sort).toProperty("sort")
            .map(status).toProperty("status")
            .map(createTime).toProperty("createTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<OmsOrderReturnReason> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, omsOrderReturnReason, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(sort).toProperty("sort")
            .map(status).toProperty("status")
            .map(createTime).toProperty("createTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(OmsOrderReturnReason row) {
        return MyBatis3Utils.insert(this::insert, row, omsOrderReturnReason, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(sort).toPropertyWhenPresent("sort", row::getSort)
            .map(status).toPropertyWhenPresent("status", row::getStatus)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsOrderReturnReason> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, omsOrderReturnReason, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsOrderReturnReason> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, omsOrderReturnReason, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsOrderReturnReason> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, omsOrderReturnReason, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsOrderReturnReason> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, omsOrderReturnReason, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(OmsOrderReturnReason row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(name).equalTo(row::getName)
                .set(sort).equalTo(row::getSort)
                .set(status).equalTo(row::getStatus)
                .set(createTime).equalTo(row::getCreateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OmsOrderReturnReason row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(name).equalToWhenPresent(row::getName)
                .set(sort).equalToWhenPresent(row::getSort)
                .set(status).equalToWhenPresent(row::getStatus)
                .set(createTime).equalToWhenPresent(row::getCreateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(OmsOrderReturnReason row) {
        return update(c ->
            c.set(name).equalTo(row::getName)
            .set(sort).equalTo(row::getSort)
            .set(status).equalTo(row::getStatus)
            .set(createTime).equalTo(row::getCreateTime)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(OmsOrderReturnReason row) {
        return update(c ->
            c.set(name).equalToWhenPresent(row::getName)
            .set(sort).equalToWhenPresent(row::getSort)
            .set(status).equalToWhenPresent(row::getStatus)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .where(id, isEqualTo(row::getId))
        );
    }
}