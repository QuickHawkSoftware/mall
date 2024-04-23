package com.macro.mall.mapper;

import static com.macro.mall.mapper.UmsPermissionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.UmsPermission;
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
public interface UmsPermissionMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<UmsPermission>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, pid, name, value, icon, type, uri, status, createTime, sort);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsPermissionResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="pid", property="pid", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="uri", property="uri", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER)
    })
    List<UmsPermission> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsPermissionResult")
    Optional<UmsPermission> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsPermission, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsPermission, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsPermission row) {
        return MyBatis3Utils.insert(this::insert, row, umsPermission, c ->
            c.map(id).toProperty("id")
            .map(pid).toProperty("pid")
            .map(name).toProperty("name")
            .map(value).toProperty("value")
            .map(icon).toProperty("icon")
            .map(type).toProperty("type")
            .map(uri).toProperty("uri")
            .map(status).toProperty("status")
            .map(createTime).toProperty("createTime")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UmsPermission> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsPermission, c ->
            c.map(id).toProperty("id")
            .map(pid).toProperty("pid")
            .map(name).toProperty("name")
            .map(value).toProperty("value")
            .map(icon).toProperty("icon")
            .map(type).toProperty("type")
            .map(uri).toProperty("uri")
            .map(status).toProperty("status")
            .map(createTime).toProperty("createTime")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsPermission row) {
        return MyBatis3Utils.insert(this::insert, row, umsPermission, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(pid).toPropertyWhenPresent("pid", row::getPid)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(value).toPropertyWhenPresent("value", row::getValue)
            .map(icon).toPropertyWhenPresent("icon", row::getIcon)
            .map(type).toPropertyWhenPresent("type", row::getType)
            .map(uri).toPropertyWhenPresent("uri", row::getUri)
            .map(status).toPropertyWhenPresent("status", row::getStatus)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(sort).toPropertyWhenPresent("sort", row::getSort)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsPermission> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsPermission, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsPermission> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsPermission, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsPermission> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsPermission, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsPermission> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsPermission, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsPermission row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(pid).equalTo(row::getPid)
                .set(name).equalTo(row::getName)
                .set(value).equalTo(row::getValue)
                .set(icon).equalTo(row::getIcon)
                .set(type).equalTo(row::getType)
                .set(uri).equalTo(row::getUri)
                .set(status).equalTo(row::getStatus)
                .set(createTime).equalTo(row::getCreateTime)
                .set(sort).equalTo(row::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsPermission row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(pid).equalToWhenPresent(row::getPid)
                .set(name).equalToWhenPresent(row::getName)
                .set(value).equalToWhenPresent(row::getValue)
                .set(icon).equalToWhenPresent(row::getIcon)
                .set(type).equalToWhenPresent(row::getType)
                .set(uri).equalToWhenPresent(row::getUri)
                .set(status).equalToWhenPresent(row::getStatus)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(sort).equalToWhenPresent(row::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsPermission row) {
        return update(c ->
            c.set(pid).equalTo(row::getPid)
            .set(name).equalTo(row::getName)
            .set(value).equalTo(row::getValue)
            .set(icon).equalTo(row::getIcon)
            .set(type).equalTo(row::getType)
            .set(uri).equalTo(row::getUri)
            .set(status).equalTo(row::getStatus)
            .set(createTime).equalTo(row::getCreateTime)
            .set(sort).equalTo(row::getSort)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsPermission row) {
        return update(c ->
            c.set(pid).equalToWhenPresent(row::getPid)
            .set(name).equalToWhenPresent(row::getName)
            .set(value).equalToWhenPresent(row::getValue)
            .set(icon).equalToWhenPresent(row::getIcon)
            .set(type).equalToWhenPresent(row::getType)
            .set(uri).equalToWhenPresent(row::getUri)
            .set(status).equalToWhenPresent(row::getStatus)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(sort).equalToWhenPresent(row::getSort)
            .where(id, isEqualTo(row::getId))
        );
    }
}