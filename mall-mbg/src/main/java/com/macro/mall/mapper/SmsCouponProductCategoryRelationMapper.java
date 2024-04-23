package com.macro.mall.mapper;

import static com.macro.mall.mapper.SmsCouponProductCategoryRelationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.SmsCouponProductCategoryRelation;
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
public interface SmsCouponProductCategoryRelationMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<SmsCouponProductCategoryRelation>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, couponId, productCategoryId, productCategoryName, parentCategoryName);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SmsCouponProductCategoryRelationResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="coupon_id", property="couponId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_category_id", property="productCategoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_category_name", property="productCategoryName", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_category_name", property="parentCategoryName", jdbcType=JdbcType.VARCHAR)
    })
    List<SmsCouponProductCategoryRelation> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SmsCouponProductCategoryRelationResult")
    Optional<SmsCouponProductCategoryRelation> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, smsCouponProductCategoryRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, smsCouponProductCategoryRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SmsCouponProductCategoryRelation row) {
        return MyBatis3Utils.insert(this::insert, row, smsCouponProductCategoryRelation, c ->
            c.map(id).toProperty("id")
            .map(couponId).toProperty("couponId")
            .map(productCategoryId).toProperty("productCategoryId")
            .map(productCategoryName).toProperty("productCategoryName")
            .map(parentCategoryName).toProperty("parentCategoryName")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<SmsCouponProductCategoryRelation> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, smsCouponProductCategoryRelation, c ->
            c.map(id).toProperty("id")
            .map(couponId).toProperty("couponId")
            .map(productCategoryId).toProperty("productCategoryId")
            .map(productCategoryName).toProperty("productCategoryName")
            .map(parentCategoryName).toProperty("parentCategoryName")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(SmsCouponProductCategoryRelation row) {
        return MyBatis3Utils.insert(this::insert, row, smsCouponProductCategoryRelation, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(couponId).toPropertyWhenPresent("couponId", row::getCouponId)
            .map(productCategoryId).toPropertyWhenPresent("productCategoryId", row::getProductCategoryId)
            .map(productCategoryName).toPropertyWhenPresent("productCategoryName", row::getProductCategoryName)
            .map(parentCategoryName).toPropertyWhenPresent("parentCategoryName", row::getParentCategoryName)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SmsCouponProductCategoryRelation> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, smsCouponProductCategoryRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SmsCouponProductCategoryRelation> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, smsCouponProductCategoryRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SmsCouponProductCategoryRelation> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, smsCouponProductCategoryRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SmsCouponProductCategoryRelation> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, smsCouponProductCategoryRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(SmsCouponProductCategoryRelation row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(couponId).equalTo(row::getCouponId)
                .set(productCategoryId).equalTo(row::getProductCategoryId)
                .set(productCategoryName).equalTo(row::getProductCategoryName)
                .set(parentCategoryName).equalTo(row::getParentCategoryName);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SmsCouponProductCategoryRelation row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(couponId).equalToWhenPresent(row::getCouponId)
                .set(productCategoryId).equalToWhenPresent(row::getProductCategoryId)
                .set(productCategoryName).equalToWhenPresent(row::getProductCategoryName)
                .set(parentCategoryName).equalToWhenPresent(row::getParentCategoryName);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(SmsCouponProductCategoryRelation row) {
        return update(c ->
            c.set(couponId).equalTo(row::getCouponId)
            .set(productCategoryId).equalTo(row::getProductCategoryId)
            .set(productCategoryName).equalTo(row::getProductCategoryName)
            .set(parentCategoryName).equalTo(row::getParentCategoryName)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(SmsCouponProductCategoryRelation row) {
        return update(c ->
            c.set(couponId).equalToWhenPresent(row::getCouponId)
            .set(productCategoryId).equalToWhenPresent(row::getProductCategoryId)
            .set(productCategoryName).equalToWhenPresent(row::getProductCategoryName)
            .set(parentCategoryName).equalToWhenPresent(row::getParentCategoryName)
            .where(id, isEqualTo(row::getId))
        );
    }
}