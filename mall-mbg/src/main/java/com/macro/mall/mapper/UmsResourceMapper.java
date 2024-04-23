package com.macro.mall.mapper;

import static com.macro.mall.mapper.UmsResourceDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.UmsResource;
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
public interface UmsResourceMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<UmsResource>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, createTime, name, url, description, categoryId);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsResourceResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="category_id", property="categoryId", jdbcType=JdbcType.BIGINT)
    })
    List<UmsResource> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsResourceResult")
    Optional<UmsResource> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsResource, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsResource, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsResource row) {
        return MyBatis3Utils.insert(this::insert, row, umsResource, c ->
            c.map(id).toProperty("id")
            .map(createTime).toProperty("createTime")
            .map(name).toProperty("name")
            .map(url).toProperty("url")
            .map(description).toProperty("description")
            .map(categoryId).toProperty("categoryId")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UmsResource> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsResource, c ->
            c.map(id).toProperty("id")
            .map(createTime).toProperty("createTime")
            .map(name).toProperty("name")
            .map(url).toProperty("url")
            .map(description).toProperty("description")
            .map(categoryId).toProperty("categoryId")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsResource row) {
        return MyBatis3Utils.insert(this::insert, row, umsResource, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(url).toPropertyWhenPresent("url", row::getUrl)
            .map(description).toPropertyWhenPresent("description", row::getDescription)
            .map(categoryId).toPropertyWhenPresent("categoryId", row::getCategoryId)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsResource> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsResource, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsResource> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsResource, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsResource> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsResource, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsResource> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsResource, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsResource row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(createTime).equalTo(row::getCreateTime)
                .set(name).equalTo(row::getName)
                .set(url).equalTo(row::getUrl)
                .set(description).equalTo(row::getDescription)
                .set(categoryId).equalTo(row::getCategoryId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsResource row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(name).equalToWhenPresent(row::getName)
                .set(url).equalToWhenPresent(row::getUrl)
                .set(description).equalToWhenPresent(row::getDescription)
                .set(categoryId).equalToWhenPresent(row::getCategoryId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsResource row) {
        return update(c ->
            c.set(createTime).equalTo(row::getCreateTime)
            .set(name).equalTo(row::getName)
            .set(url).equalTo(row::getUrl)
            .set(description).equalTo(row::getDescription)
            .set(categoryId).equalTo(row::getCategoryId)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsResource row) {
        return update(c ->
            c.set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(name).equalToWhenPresent(row::getName)
            .set(url).equalToWhenPresent(row::getUrl)
            .set(description).equalToWhenPresent(row::getDescription)
            .set(categoryId).equalToWhenPresent(row::getCategoryId)
            .where(id, isEqualTo(row::getId))
        );
    }
}