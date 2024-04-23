package com.macro.mall.mapper;

import static com.macro.mall.mapper.PmsProductCategoryAttributeRelationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.PmsProductCategoryAttributeRelation;
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
public interface PmsProductCategoryAttributeRelationMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<PmsProductCategoryAttributeRelation>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, productCategoryId, productAttributeId);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PmsProductCategoryAttributeRelationResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="product_category_id", property="productCategoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_attribute_id", property="productAttributeId", jdbcType=JdbcType.BIGINT)
    })
    List<PmsProductCategoryAttributeRelation> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PmsProductCategoryAttributeRelationResult")
    Optional<PmsProductCategoryAttributeRelation> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, pmsProductCategoryAttributeRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, pmsProductCategoryAttributeRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(PmsProductCategoryAttributeRelation row) {
        return MyBatis3Utils.insert(this::insert, row, pmsProductCategoryAttributeRelation, c ->
            c.map(id).toProperty("id")
            .map(productCategoryId).toProperty("productCategoryId")
            .map(productAttributeId).toProperty("productAttributeId")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<PmsProductCategoryAttributeRelation> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, pmsProductCategoryAttributeRelation, c ->
            c.map(id).toProperty("id")
            .map(productCategoryId).toProperty("productCategoryId")
            .map(productAttributeId).toProperty("productAttributeId")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(PmsProductCategoryAttributeRelation row) {
        return MyBatis3Utils.insert(this::insert, row, pmsProductCategoryAttributeRelation, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(productCategoryId).toPropertyWhenPresent("productCategoryId", row::getProductCategoryId)
            .map(productAttributeId).toPropertyWhenPresent("productAttributeId", row::getProductAttributeId)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsProductCategoryAttributeRelation> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, pmsProductCategoryAttributeRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsProductCategoryAttributeRelation> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, pmsProductCategoryAttributeRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsProductCategoryAttributeRelation> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, pmsProductCategoryAttributeRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsProductCategoryAttributeRelation> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, pmsProductCategoryAttributeRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(PmsProductCategoryAttributeRelation row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(productCategoryId).equalTo(row::getProductCategoryId)
                .set(productAttributeId).equalTo(row::getProductAttributeId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PmsProductCategoryAttributeRelation row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(productCategoryId).equalToWhenPresent(row::getProductCategoryId)
                .set(productAttributeId).equalToWhenPresent(row::getProductAttributeId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(PmsProductCategoryAttributeRelation row) {
        return update(c ->
            c.set(productCategoryId).equalTo(row::getProductCategoryId)
            .set(productAttributeId).equalTo(row::getProductAttributeId)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(PmsProductCategoryAttributeRelation row) {
        return update(c ->
            c.set(productCategoryId).equalToWhenPresent(row::getProductCategoryId)
            .set(productAttributeId).equalToWhenPresent(row::getProductAttributeId)
            .where(id, isEqualTo(row::getId))
        );
    }
}