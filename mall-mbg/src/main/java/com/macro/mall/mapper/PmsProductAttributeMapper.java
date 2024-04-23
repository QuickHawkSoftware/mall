package com.macro.mall.mapper;

import static com.macro.mall.mapper.PmsProductAttributeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.PmsProductAttribute;
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
public interface PmsProductAttributeMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<PmsProductAttribute>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, productAttributeCategoryId, name, selectType, inputType, inputList, sort, filterType, searchType, relatedStatus, handAddStatus, type);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PmsProductAttributeResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="product_attribute_category_id", property="productAttributeCategoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="select_type", property="selectType", jdbcType=JdbcType.INTEGER),
        @Result(column="input_type", property="inputType", jdbcType=JdbcType.INTEGER),
        @Result(column="input_list", property="inputList", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="filter_type", property="filterType", jdbcType=JdbcType.INTEGER),
        @Result(column="search_type", property="searchType", jdbcType=JdbcType.INTEGER),
        @Result(column="related_status", property="relatedStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="hand_add_status", property="handAddStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER)
    })
    List<PmsProductAttribute> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PmsProductAttributeResult")
    Optional<PmsProductAttribute> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, pmsProductAttribute, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, pmsProductAttribute, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(PmsProductAttribute row) {
        return MyBatis3Utils.insert(this::insert, row, pmsProductAttribute, c ->
            c.map(id).toProperty("id")
            .map(productAttributeCategoryId).toProperty("productAttributeCategoryId")
            .map(name).toProperty("name")
            .map(selectType).toProperty("selectType")
            .map(inputType).toProperty("inputType")
            .map(inputList).toProperty("inputList")
            .map(sort).toProperty("sort")
            .map(filterType).toProperty("filterType")
            .map(searchType).toProperty("searchType")
            .map(relatedStatus).toProperty("relatedStatus")
            .map(handAddStatus).toProperty("handAddStatus")
            .map(type).toProperty("type")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<PmsProductAttribute> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, pmsProductAttribute, c ->
            c.map(id).toProperty("id")
            .map(productAttributeCategoryId).toProperty("productAttributeCategoryId")
            .map(name).toProperty("name")
            .map(selectType).toProperty("selectType")
            .map(inputType).toProperty("inputType")
            .map(inputList).toProperty("inputList")
            .map(sort).toProperty("sort")
            .map(filterType).toProperty("filterType")
            .map(searchType).toProperty("searchType")
            .map(relatedStatus).toProperty("relatedStatus")
            .map(handAddStatus).toProperty("handAddStatus")
            .map(type).toProperty("type")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(PmsProductAttribute row) {
        return MyBatis3Utils.insert(this::insert, row, pmsProductAttribute, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(productAttributeCategoryId).toPropertyWhenPresent("productAttributeCategoryId", row::getProductAttributeCategoryId)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(selectType).toPropertyWhenPresent("selectType", row::getSelectType)
            .map(inputType).toPropertyWhenPresent("inputType", row::getInputType)
            .map(inputList).toPropertyWhenPresent("inputList", row::getInputList)
            .map(sort).toPropertyWhenPresent("sort", row::getSort)
            .map(filterType).toPropertyWhenPresent("filterType", row::getFilterType)
            .map(searchType).toPropertyWhenPresent("searchType", row::getSearchType)
            .map(relatedStatus).toPropertyWhenPresent("relatedStatus", row::getRelatedStatus)
            .map(handAddStatus).toPropertyWhenPresent("handAddStatus", row::getHandAddStatus)
            .map(type).toPropertyWhenPresent("type", row::getType)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsProductAttribute> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, pmsProductAttribute, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsProductAttribute> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, pmsProductAttribute, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsProductAttribute> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, pmsProductAttribute, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsProductAttribute> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, pmsProductAttribute, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(PmsProductAttribute row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(productAttributeCategoryId).equalTo(row::getProductAttributeCategoryId)
                .set(name).equalTo(row::getName)
                .set(selectType).equalTo(row::getSelectType)
                .set(inputType).equalTo(row::getInputType)
                .set(inputList).equalTo(row::getInputList)
                .set(sort).equalTo(row::getSort)
                .set(filterType).equalTo(row::getFilterType)
                .set(searchType).equalTo(row::getSearchType)
                .set(relatedStatus).equalTo(row::getRelatedStatus)
                .set(handAddStatus).equalTo(row::getHandAddStatus)
                .set(type).equalTo(row::getType);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PmsProductAttribute row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(productAttributeCategoryId).equalToWhenPresent(row::getProductAttributeCategoryId)
                .set(name).equalToWhenPresent(row::getName)
                .set(selectType).equalToWhenPresent(row::getSelectType)
                .set(inputType).equalToWhenPresent(row::getInputType)
                .set(inputList).equalToWhenPresent(row::getInputList)
                .set(sort).equalToWhenPresent(row::getSort)
                .set(filterType).equalToWhenPresent(row::getFilterType)
                .set(searchType).equalToWhenPresent(row::getSearchType)
                .set(relatedStatus).equalToWhenPresent(row::getRelatedStatus)
                .set(handAddStatus).equalToWhenPresent(row::getHandAddStatus)
                .set(type).equalToWhenPresent(row::getType);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(PmsProductAttribute row) {
        return update(c ->
            c.set(productAttributeCategoryId).equalTo(row::getProductAttributeCategoryId)
            .set(name).equalTo(row::getName)
            .set(selectType).equalTo(row::getSelectType)
            .set(inputType).equalTo(row::getInputType)
            .set(inputList).equalTo(row::getInputList)
            .set(sort).equalTo(row::getSort)
            .set(filterType).equalTo(row::getFilterType)
            .set(searchType).equalTo(row::getSearchType)
            .set(relatedStatus).equalTo(row::getRelatedStatus)
            .set(handAddStatus).equalTo(row::getHandAddStatus)
            .set(type).equalTo(row::getType)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(PmsProductAttribute row) {
        return update(c ->
            c.set(productAttributeCategoryId).equalToWhenPresent(row::getProductAttributeCategoryId)
            .set(name).equalToWhenPresent(row::getName)
            .set(selectType).equalToWhenPresent(row::getSelectType)
            .set(inputType).equalToWhenPresent(row::getInputType)
            .set(inputList).equalToWhenPresent(row::getInputList)
            .set(sort).equalToWhenPresent(row::getSort)
            .set(filterType).equalToWhenPresent(row::getFilterType)
            .set(searchType).equalToWhenPresent(row::getSearchType)
            .set(relatedStatus).equalToWhenPresent(row::getRelatedStatus)
            .set(handAddStatus).equalToWhenPresent(row::getHandAddStatus)
            .set(type).equalToWhenPresent(row::getType)
            .where(id, isEqualTo(row::getId))
        );
    }
}