package com.macro.mall.mapper;

import static com.macro.mall.mapper.SmsCouponProductRelationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.SmsCouponProductRelation;
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
public interface SmsCouponProductRelationMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<SmsCouponProductRelation>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, couponId, productId, productName, productSn);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SmsCouponProductRelationResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="coupon_id", property="couponId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_name", property="productName", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_sn", property="productSn", jdbcType=JdbcType.VARCHAR)
    })
    List<SmsCouponProductRelation> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SmsCouponProductRelationResult")
    Optional<SmsCouponProductRelation> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, smsCouponProductRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, smsCouponProductRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SmsCouponProductRelation row) {
        return MyBatis3Utils.insert(this::insert, row, smsCouponProductRelation, c ->
            c.map(id).toProperty("id")
            .map(couponId).toProperty("couponId")
            .map(productId).toProperty("productId")
            .map(productName).toProperty("productName")
            .map(productSn).toProperty("productSn")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<SmsCouponProductRelation> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, smsCouponProductRelation, c ->
            c.map(id).toProperty("id")
            .map(couponId).toProperty("couponId")
            .map(productId).toProperty("productId")
            .map(productName).toProperty("productName")
            .map(productSn).toProperty("productSn")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(SmsCouponProductRelation row) {
        return MyBatis3Utils.insert(this::insert, row, smsCouponProductRelation, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(couponId).toPropertyWhenPresent("couponId", row::getCouponId)
            .map(productId).toPropertyWhenPresent("productId", row::getProductId)
            .map(productName).toPropertyWhenPresent("productName", row::getProductName)
            .map(productSn).toPropertyWhenPresent("productSn", row::getProductSn)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SmsCouponProductRelation> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, smsCouponProductRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SmsCouponProductRelation> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, smsCouponProductRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SmsCouponProductRelation> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, smsCouponProductRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SmsCouponProductRelation> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, smsCouponProductRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(SmsCouponProductRelation row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(couponId).equalTo(row::getCouponId)
                .set(productId).equalTo(row::getProductId)
                .set(productName).equalTo(row::getProductName)
                .set(productSn).equalTo(row::getProductSn);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SmsCouponProductRelation row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(couponId).equalToWhenPresent(row::getCouponId)
                .set(productId).equalToWhenPresent(row::getProductId)
                .set(productName).equalToWhenPresent(row::getProductName)
                .set(productSn).equalToWhenPresent(row::getProductSn);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(SmsCouponProductRelation row) {
        return update(c ->
            c.set(couponId).equalTo(row::getCouponId)
            .set(productId).equalTo(row::getProductId)
            .set(productName).equalTo(row::getProductName)
            .set(productSn).equalTo(row::getProductSn)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(SmsCouponProductRelation row) {
        return update(c ->
            c.set(couponId).equalToWhenPresent(row::getCouponId)
            .set(productId).equalToWhenPresent(row::getProductId)
            .set(productName).equalToWhenPresent(row::getProductName)
            .set(productSn).equalToWhenPresent(row::getProductSn)
            .where(id, isEqualTo(row::getId))
        );
    }
}