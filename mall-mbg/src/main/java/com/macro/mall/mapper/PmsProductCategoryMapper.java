package com.macro.mall.mapper;

import static com.macro.mall.mapper.PmsProductCategoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.PmsProductCategory;
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
public interface PmsProductCategoryMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<PmsProductCategory>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, parentId, name, level, productCount, productUnit, navStatus, showStatus, sort, icon, keywords, description);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PmsProductCategoryResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="level", property="level", jdbcType=JdbcType.INTEGER),
        @Result(column="product_count", property="productCount", jdbcType=JdbcType.INTEGER),
        @Result(column="product_unit", property="productUnit", jdbcType=JdbcType.VARCHAR),
        @Result(column="nav_status", property="navStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="show_status", property="showStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="keywords", property="keywords", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<PmsProductCategory> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PmsProductCategoryResult")
    Optional<PmsProductCategory> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, pmsProductCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, pmsProductCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(PmsProductCategory row) {
        return MyBatis3Utils.insert(this::insert, row, pmsProductCategory, c ->
            c.map(id).toProperty("id")
            .map(parentId).toProperty("parentId")
            .map(name).toProperty("name")
            .map(level).toProperty("level")
            .map(productCount).toProperty("productCount")
            .map(productUnit).toProperty("productUnit")
            .map(navStatus).toProperty("navStatus")
            .map(showStatus).toProperty("showStatus")
            .map(sort).toProperty("sort")
            .map(icon).toProperty("icon")
            .map(keywords).toProperty("keywords")
            .map(description).toProperty("description")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<PmsProductCategory> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, pmsProductCategory, c ->
            c.map(id).toProperty("id")
            .map(parentId).toProperty("parentId")
            .map(name).toProperty("name")
            .map(level).toProperty("level")
            .map(productCount).toProperty("productCount")
            .map(productUnit).toProperty("productUnit")
            .map(navStatus).toProperty("navStatus")
            .map(showStatus).toProperty("showStatus")
            .map(sort).toProperty("sort")
            .map(icon).toProperty("icon")
            .map(keywords).toProperty("keywords")
            .map(description).toProperty("description")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(PmsProductCategory row) {
        return MyBatis3Utils.insert(this::insert, row, pmsProductCategory, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(parentId).toPropertyWhenPresent("parentId", row::getParentId)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(level).toPropertyWhenPresent("level", row::getLevel)
            .map(productCount).toPropertyWhenPresent("productCount", row::getProductCount)
            .map(productUnit).toPropertyWhenPresent("productUnit", row::getProductUnit)
            .map(navStatus).toPropertyWhenPresent("navStatus", row::getNavStatus)
            .map(showStatus).toPropertyWhenPresent("showStatus", row::getShowStatus)
            .map(sort).toPropertyWhenPresent("sort", row::getSort)
            .map(icon).toPropertyWhenPresent("icon", row::getIcon)
            .map(keywords).toPropertyWhenPresent("keywords", row::getKeywords)
            .map(description).toPropertyWhenPresent("description", row::getDescription)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsProductCategory> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, pmsProductCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsProductCategory> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, pmsProductCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsProductCategory> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, pmsProductCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsProductCategory> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, pmsProductCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(PmsProductCategory row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(parentId).equalTo(row::getParentId)
                .set(name).equalTo(row::getName)
                .set(level).equalTo(row::getLevel)
                .set(productCount).equalTo(row::getProductCount)
                .set(productUnit).equalTo(row::getProductUnit)
                .set(navStatus).equalTo(row::getNavStatus)
                .set(showStatus).equalTo(row::getShowStatus)
                .set(sort).equalTo(row::getSort)
                .set(icon).equalTo(row::getIcon)
                .set(keywords).equalTo(row::getKeywords)
                .set(description).equalTo(row::getDescription);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PmsProductCategory row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(parentId).equalToWhenPresent(row::getParentId)
                .set(name).equalToWhenPresent(row::getName)
                .set(level).equalToWhenPresent(row::getLevel)
                .set(productCount).equalToWhenPresent(row::getProductCount)
                .set(productUnit).equalToWhenPresent(row::getProductUnit)
                .set(navStatus).equalToWhenPresent(row::getNavStatus)
                .set(showStatus).equalToWhenPresent(row::getShowStatus)
                .set(sort).equalToWhenPresent(row::getSort)
                .set(icon).equalToWhenPresent(row::getIcon)
                .set(keywords).equalToWhenPresent(row::getKeywords)
                .set(description).equalToWhenPresent(row::getDescription);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(PmsProductCategory row) {
        return update(c ->
            c.set(parentId).equalTo(row::getParentId)
            .set(name).equalTo(row::getName)
            .set(level).equalTo(row::getLevel)
            .set(productCount).equalTo(row::getProductCount)
            .set(productUnit).equalTo(row::getProductUnit)
            .set(navStatus).equalTo(row::getNavStatus)
            .set(showStatus).equalTo(row::getShowStatus)
            .set(sort).equalTo(row::getSort)
            .set(icon).equalTo(row::getIcon)
            .set(keywords).equalTo(row::getKeywords)
            .set(description).equalTo(row::getDescription)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(PmsProductCategory row) {
        return update(c ->
            c.set(parentId).equalToWhenPresent(row::getParentId)
            .set(name).equalToWhenPresent(row::getName)
            .set(level).equalToWhenPresent(row::getLevel)
            .set(productCount).equalToWhenPresent(row::getProductCount)
            .set(productUnit).equalToWhenPresent(row::getProductUnit)
            .set(navStatus).equalToWhenPresent(row::getNavStatus)
            .set(showStatus).equalToWhenPresent(row::getShowStatus)
            .set(sort).equalToWhenPresent(row::getSort)
            .set(icon).equalToWhenPresent(row::getIcon)
            .set(keywords).equalToWhenPresent(row::getKeywords)
            .set(description).equalToWhenPresent(row::getDescription)
            .where(id, isEqualTo(row::getId))
        );
    }
}