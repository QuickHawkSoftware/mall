package com.macro.mall.mapper;

import static com.macro.mall.mapper.PmsProductAttributeValueDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.PmsProductAttributeValue;
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
public interface PmsProductAttributeValueMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<PmsProductAttributeValue>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, productId, productAttributeId, value);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PmsProductAttributeValueResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_attribute_id", property="productAttributeId", jdbcType=JdbcType.BIGINT),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR)
    })
    List<PmsProductAttributeValue> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PmsProductAttributeValueResult")
    Optional<PmsProductAttributeValue> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, pmsProductAttributeValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, pmsProductAttributeValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(PmsProductAttributeValue row) {
        return MyBatis3Utils.insert(this::insert, row, pmsProductAttributeValue, c ->
            c.map(id).toProperty("id")
            .map(productId).toProperty("productId")
            .map(productAttributeId).toProperty("productAttributeId")
            .map(value).toProperty("value")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<PmsProductAttributeValue> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, pmsProductAttributeValue, c ->
            c.map(id).toProperty("id")
            .map(productId).toProperty("productId")
            .map(productAttributeId).toProperty("productAttributeId")
            .map(value).toProperty("value")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(PmsProductAttributeValue row) {
        return MyBatis3Utils.insert(this::insert, row, pmsProductAttributeValue, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(productId).toPropertyWhenPresent("productId", row::getProductId)
            .map(productAttributeId).toPropertyWhenPresent("productAttributeId", row::getProductAttributeId)
            .map(value).toPropertyWhenPresent("value", row::getValue)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsProductAttributeValue> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, pmsProductAttributeValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsProductAttributeValue> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, pmsProductAttributeValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsProductAttributeValue> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, pmsProductAttributeValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsProductAttributeValue> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, pmsProductAttributeValue, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(PmsProductAttributeValue row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(productId).equalTo(row::getProductId)
                .set(productAttributeId).equalTo(row::getProductAttributeId)
                .set(value).equalTo(row::getValue);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PmsProductAttributeValue row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(productId).equalToWhenPresent(row::getProductId)
                .set(productAttributeId).equalToWhenPresent(row::getProductAttributeId)
                .set(value).equalToWhenPresent(row::getValue);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(PmsProductAttributeValue row) {
        return update(c ->
            c.set(productId).equalTo(row::getProductId)
            .set(productAttributeId).equalTo(row::getProductAttributeId)
            .set(value).equalTo(row::getValue)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(PmsProductAttributeValue row) {
        return update(c ->
            c.set(productId).equalToWhenPresent(row::getProductId)
            .set(productAttributeId).equalToWhenPresent(row::getProductAttributeId)
            .set(value).equalToWhenPresent(row::getValue)
            .where(id, isEqualTo(row::getId))
        );
    }
}