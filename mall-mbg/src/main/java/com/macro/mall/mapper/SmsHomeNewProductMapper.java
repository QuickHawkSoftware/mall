package com.macro.mall.mapper;

import static com.macro.mall.mapper.SmsHomeNewProductDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.SmsHomeNewProduct;
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
public interface SmsHomeNewProductMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<SmsHomeNewProduct>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, productId, productName, recommendStatus, sort);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SmsHomeNewProductResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_name", property="productName", jdbcType=JdbcType.VARCHAR),
        @Result(column="recommend_status", property="recommendStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER)
    })
    List<SmsHomeNewProduct> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SmsHomeNewProductResult")
    Optional<SmsHomeNewProduct> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, smsHomeNewProduct, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, smsHomeNewProduct, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SmsHomeNewProduct row) {
        return MyBatis3Utils.insert(this::insert, row, smsHomeNewProduct, c ->
            c.map(id).toProperty("id")
            .map(productId).toProperty("productId")
            .map(productName).toProperty("productName")
            .map(recommendStatus).toProperty("recommendStatus")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<SmsHomeNewProduct> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, smsHomeNewProduct, c ->
            c.map(id).toProperty("id")
            .map(productId).toProperty("productId")
            .map(productName).toProperty("productName")
            .map(recommendStatus).toProperty("recommendStatus")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(SmsHomeNewProduct row) {
        return MyBatis3Utils.insert(this::insert, row, smsHomeNewProduct, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(productId).toPropertyWhenPresent("productId", row::getProductId)
            .map(productName).toPropertyWhenPresent("productName", row::getProductName)
            .map(recommendStatus).toPropertyWhenPresent("recommendStatus", row::getRecommendStatus)
            .map(sort).toPropertyWhenPresent("sort", row::getSort)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SmsHomeNewProduct> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, smsHomeNewProduct, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SmsHomeNewProduct> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, smsHomeNewProduct, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SmsHomeNewProduct> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, smsHomeNewProduct, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SmsHomeNewProduct> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, smsHomeNewProduct, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(SmsHomeNewProduct row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(productId).equalTo(row::getProductId)
                .set(productName).equalTo(row::getProductName)
                .set(recommendStatus).equalTo(row::getRecommendStatus)
                .set(sort).equalTo(row::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SmsHomeNewProduct row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(productId).equalToWhenPresent(row::getProductId)
                .set(productName).equalToWhenPresent(row::getProductName)
                .set(recommendStatus).equalToWhenPresent(row::getRecommendStatus)
                .set(sort).equalToWhenPresent(row::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(SmsHomeNewProduct row) {
        return update(c ->
            c.set(productId).equalTo(row::getProductId)
            .set(productName).equalTo(row::getProductName)
            .set(recommendStatus).equalTo(row::getRecommendStatus)
            .set(sort).equalTo(row::getSort)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(SmsHomeNewProduct row) {
        return update(c ->
            c.set(productId).equalToWhenPresent(row::getProductId)
            .set(productName).equalToWhenPresent(row::getProductName)
            .set(recommendStatus).equalToWhenPresent(row::getRecommendStatus)
            .set(sort).equalToWhenPresent(row::getSort)
            .where(id, isEqualTo(row::getId))
        );
    }
}