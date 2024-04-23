package com.macro.mall.mapper;

import static com.macro.mall.mapper.UmsResourceCategoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.UmsResourceCategory;
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
public interface UmsResourceCategoryMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<UmsResourceCategory>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, createTime, name, sort);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsResourceCategoryResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER)
    })
    List<UmsResourceCategory> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsResourceCategoryResult")
    Optional<UmsResourceCategory> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsResourceCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsResourceCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsResourceCategory row) {
        return MyBatis3Utils.insert(this::insert, row, umsResourceCategory, c ->
            c.map(id).toProperty("id")
            .map(createTime).toProperty("createTime")
            .map(name).toProperty("name")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UmsResourceCategory> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsResourceCategory, c ->
            c.map(id).toProperty("id")
            .map(createTime).toProperty("createTime")
            .map(name).toProperty("name")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsResourceCategory row) {
        return MyBatis3Utils.insert(this::insert, row, umsResourceCategory, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(sort).toPropertyWhenPresent("sort", row::getSort)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsResourceCategory> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsResourceCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsResourceCategory> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsResourceCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsResourceCategory> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsResourceCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsResourceCategory> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsResourceCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsResourceCategory row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(createTime).equalTo(row::getCreateTime)
                .set(name).equalTo(row::getName)
                .set(sort).equalTo(row::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsResourceCategory row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(name).equalToWhenPresent(row::getName)
                .set(sort).equalToWhenPresent(row::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsResourceCategory row) {
        return update(c ->
            c.set(createTime).equalTo(row::getCreateTime)
            .set(name).equalTo(row::getName)
            .set(sort).equalTo(row::getSort)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsResourceCategory row) {
        return update(c ->
            c.set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(name).equalToWhenPresent(row::getName)
            .set(sort).equalToWhenPresent(row::getSort)
            .where(id, isEqualTo(row::getId))
        );
    }
}