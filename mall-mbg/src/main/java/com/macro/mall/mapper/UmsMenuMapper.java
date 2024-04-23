package com.macro.mall.mapper;

import static com.macro.mall.mapper.UmsMenuDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.UmsMenu;
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
public interface UmsMenuMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<UmsMenu>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, parentId, createTime, title, level, sort, name, icon, hidden);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsMenuResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="level", property="level", jdbcType=JdbcType.INTEGER),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="hidden", property="hidden", jdbcType=JdbcType.INTEGER)
    })
    List<UmsMenu> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsMenuResult")
    Optional<UmsMenu> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsMenu, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsMenu, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsMenu row) {
        return MyBatis3Utils.insert(this::insert, row, umsMenu, c ->
            c.map(id).toProperty("id")
            .map(parentId).toProperty("parentId")
            .map(createTime).toProperty("createTime")
            .map(title).toProperty("title")
            .map(level).toProperty("level")
            .map(sort).toProperty("sort")
            .map(name).toProperty("name")
            .map(icon).toProperty("icon")
            .map(hidden).toProperty("hidden")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UmsMenu> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsMenu, c ->
            c.map(id).toProperty("id")
            .map(parentId).toProperty("parentId")
            .map(createTime).toProperty("createTime")
            .map(title).toProperty("title")
            .map(level).toProperty("level")
            .map(sort).toProperty("sort")
            .map(name).toProperty("name")
            .map(icon).toProperty("icon")
            .map(hidden).toProperty("hidden")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsMenu row) {
        return MyBatis3Utils.insert(this::insert, row, umsMenu, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(parentId).toPropertyWhenPresent("parentId", row::getParentId)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(title).toPropertyWhenPresent("title", row::getTitle)
            .map(level).toPropertyWhenPresent("level", row::getLevel)
            .map(sort).toPropertyWhenPresent("sort", row::getSort)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(icon).toPropertyWhenPresent("icon", row::getIcon)
            .map(hidden).toPropertyWhenPresent("hidden", row::getHidden)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMenu> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsMenu, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMenu> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsMenu, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMenu> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsMenu, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMenu> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsMenu, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsMenu row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(parentId).equalTo(row::getParentId)
                .set(createTime).equalTo(row::getCreateTime)
                .set(title).equalTo(row::getTitle)
                .set(level).equalTo(row::getLevel)
                .set(sort).equalTo(row::getSort)
                .set(name).equalTo(row::getName)
                .set(icon).equalTo(row::getIcon)
                .set(hidden).equalTo(row::getHidden);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsMenu row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(parentId).equalToWhenPresent(row::getParentId)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(title).equalToWhenPresent(row::getTitle)
                .set(level).equalToWhenPresent(row::getLevel)
                .set(sort).equalToWhenPresent(row::getSort)
                .set(name).equalToWhenPresent(row::getName)
                .set(icon).equalToWhenPresent(row::getIcon)
                .set(hidden).equalToWhenPresent(row::getHidden);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsMenu row) {
        return update(c ->
            c.set(parentId).equalTo(row::getParentId)
            .set(createTime).equalTo(row::getCreateTime)
            .set(title).equalTo(row::getTitle)
            .set(level).equalTo(row::getLevel)
            .set(sort).equalTo(row::getSort)
            .set(name).equalTo(row::getName)
            .set(icon).equalTo(row::getIcon)
            .set(hidden).equalTo(row::getHidden)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsMenu row) {
        return update(c ->
            c.set(parentId).equalToWhenPresent(row::getParentId)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(title).equalToWhenPresent(row::getTitle)
            .set(level).equalToWhenPresent(row::getLevel)
            .set(sort).equalToWhenPresent(row::getSort)
            .set(name).equalToWhenPresent(row::getName)
            .set(icon).equalToWhenPresent(row::getIcon)
            .set(hidden).equalToWhenPresent(row::getHidden)
            .where(id, isEqualTo(row::getId))
        );
    }
}