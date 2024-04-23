package com.macro.mall.mapper;

import static com.macro.mall.mapper.UmsIntegrationConsumeSettingDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.UmsIntegrationConsumeSetting;
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
public interface UmsIntegrationConsumeSettingMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<UmsIntegrationConsumeSetting>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, deductionPerAmount, maxPercentPerOrder, useUnit, couponStatus);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsIntegrationConsumeSettingResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="deduction_per_amount", property="deductionPerAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="max_percent_per_order", property="maxPercentPerOrder", jdbcType=JdbcType.INTEGER),
        @Result(column="use_unit", property="useUnit", jdbcType=JdbcType.INTEGER),
        @Result(column="coupon_status", property="couponStatus", jdbcType=JdbcType.INTEGER)
    })
    List<UmsIntegrationConsumeSetting> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsIntegrationConsumeSettingResult")
    Optional<UmsIntegrationConsumeSetting> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsIntegrationConsumeSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsIntegrationConsumeSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsIntegrationConsumeSetting row) {
        return MyBatis3Utils.insert(this::insert, row, umsIntegrationConsumeSetting, c ->
            c.map(id).toProperty("id")
            .map(deductionPerAmount).toProperty("deductionPerAmount")
            .map(maxPercentPerOrder).toProperty("maxPercentPerOrder")
            .map(useUnit).toProperty("useUnit")
            .map(couponStatus).toProperty("couponStatus")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UmsIntegrationConsumeSetting> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsIntegrationConsumeSetting, c ->
            c.map(id).toProperty("id")
            .map(deductionPerAmount).toProperty("deductionPerAmount")
            .map(maxPercentPerOrder).toProperty("maxPercentPerOrder")
            .map(useUnit).toProperty("useUnit")
            .map(couponStatus).toProperty("couponStatus")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsIntegrationConsumeSetting row) {
        return MyBatis3Utils.insert(this::insert, row, umsIntegrationConsumeSetting, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(deductionPerAmount).toPropertyWhenPresent("deductionPerAmount", row::getDeductionPerAmount)
            .map(maxPercentPerOrder).toPropertyWhenPresent("maxPercentPerOrder", row::getMaxPercentPerOrder)
            .map(useUnit).toPropertyWhenPresent("useUnit", row::getUseUnit)
            .map(couponStatus).toPropertyWhenPresent("couponStatus", row::getCouponStatus)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsIntegrationConsumeSetting> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsIntegrationConsumeSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsIntegrationConsumeSetting> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsIntegrationConsumeSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsIntegrationConsumeSetting> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsIntegrationConsumeSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsIntegrationConsumeSetting> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsIntegrationConsumeSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsIntegrationConsumeSetting row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(deductionPerAmount).equalTo(row::getDeductionPerAmount)
                .set(maxPercentPerOrder).equalTo(row::getMaxPercentPerOrder)
                .set(useUnit).equalTo(row::getUseUnit)
                .set(couponStatus).equalTo(row::getCouponStatus);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsIntegrationConsumeSetting row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(deductionPerAmount).equalToWhenPresent(row::getDeductionPerAmount)
                .set(maxPercentPerOrder).equalToWhenPresent(row::getMaxPercentPerOrder)
                .set(useUnit).equalToWhenPresent(row::getUseUnit)
                .set(couponStatus).equalToWhenPresent(row::getCouponStatus);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsIntegrationConsumeSetting row) {
        return update(c ->
            c.set(deductionPerAmount).equalTo(row::getDeductionPerAmount)
            .set(maxPercentPerOrder).equalTo(row::getMaxPercentPerOrder)
            .set(useUnit).equalTo(row::getUseUnit)
            .set(couponStatus).equalTo(row::getCouponStatus)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsIntegrationConsumeSetting row) {
        return update(c ->
            c.set(deductionPerAmount).equalToWhenPresent(row::getDeductionPerAmount)
            .set(maxPercentPerOrder).equalToWhenPresent(row::getMaxPercentPerOrder)
            .set(useUnit).equalToWhenPresent(row::getUseUnit)
            .set(couponStatus).equalToWhenPresent(row::getCouponStatus)
            .where(id, isEqualTo(row::getId))
        );
    }
}