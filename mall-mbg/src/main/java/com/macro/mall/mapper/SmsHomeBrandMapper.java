package com.macro.mall.mapper;

import static com.macro.mall.mapper.SmsHomeBrandDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.SmsHomeBrand;
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
public interface SmsHomeBrandMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<SmsHomeBrand>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, brandId, brandName, recommendStatus, sort);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SmsHomeBrandResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="brand_id", property="brandId", jdbcType=JdbcType.BIGINT),
        @Result(column="brand_name", property="brandName", jdbcType=JdbcType.VARCHAR),
        @Result(column="recommend_status", property="recommendStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER)
    })
    List<SmsHomeBrand> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SmsHomeBrandResult")
    Optional<SmsHomeBrand> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, smsHomeBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, smsHomeBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SmsHomeBrand row) {
        return MyBatis3Utils.insert(this::insert, row, smsHomeBrand, c ->
            c.map(id).toProperty("id")
            .map(brandId).toProperty("brandId")
            .map(brandName).toProperty("brandName")
            .map(recommendStatus).toProperty("recommendStatus")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<SmsHomeBrand> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, smsHomeBrand, c ->
            c.map(id).toProperty("id")
            .map(brandId).toProperty("brandId")
            .map(brandName).toProperty("brandName")
            .map(recommendStatus).toProperty("recommendStatus")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(SmsHomeBrand row) {
        return MyBatis3Utils.insert(this::insert, row, smsHomeBrand, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(brandId).toPropertyWhenPresent("brandId", row::getBrandId)
            .map(brandName).toPropertyWhenPresent("brandName", row::getBrandName)
            .map(recommendStatus).toPropertyWhenPresent("recommendStatus", row::getRecommendStatus)
            .map(sort).toPropertyWhenPresent("sort", row::getSort)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SmsHomeBrand> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, smsHomeBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SmsHomeBrand> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, smsHomeBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SmsHomeBrand> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, smsHomeBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SmsHomeBrand> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, smsHomeBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(SmsHomeBrand row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(brandId).equalTo(row::getBrandId)
                .set(brandName).equalTo(row::getBrandName)
                .set(recommendStatus).equalTo(row::getRecommendStatus)
                .set(sort).equalTo(row::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SmsHomeBrand row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(brandId).equalToWhenPresent(row::getBrandId)
                .set(brandName).equalToWhenPresent(row::getBrandName)
                .set(recommendStatus).equalToWhenPresent(row::getRecommendStatus)
                .set(sort).equalToWhenPresent(row::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(SmsHomeBrand row) {
        return update(c ->
            c.set(brandId).equalTo(row::getBrandId)
            .set(brandName).equalTo(row::getBrandName)
            .set(recommendStatus).equalTo(row::getRecommendStatus)
            .set(sort).equalTo(row::getSort)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(SmsHomeBrand row) {
        return update(c ->
            c.set(brandId).equalToWhenPresent(row::getBrandId)
            .set(brandName).equalToWhenPresent(row::getBrandName)
            .set(recommendStatus).equalToWhenPresent(row::getRecommendStatus)
            .set(sort).equalToWhenPresent(row::getSort)
            .where(id, isEqualTo(row::getId))
        );
    }
}