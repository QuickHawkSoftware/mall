package com.macro.mall.mapper;

import static com.macro.mall.mapper.UmsMemberRuleSettingDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.UmsMemberRuleSetting;
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
public interface UmsMemberRuleSettingMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<UmsMemberRuleSetting>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, continueSignDay, continueSignPoint, consumePerPoint, lowOrderAmount, maxPointPerOrder, type);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsMemberRuleSettingResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="continue_sign_day", property="continueSignDay", jdbcType=JdbcType.INTEGER),
        @Result(column="continue_sign_point", property="continueSignPoint", jdbcType=JdbcType.INTEGER),
        @Result(column="consume_per_point", property="consumePerPoint", jdbcType=JdbcType.DECIMAL),
        @Result(column="low_order_amount", property="lowOrderAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="max_point_per_order", property="maxPointPerOrder", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER)
    })
    List<UmsMemberRuleSetting> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsMemberRuleSettingResult")
    Optional<UmsMemberRuleSetting> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsMemberRuleSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsMemberRuleSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsMemberRuleSetting row) {
        return MyBatis3Utils.insert(this::insert, row, umsMemberRuleSetting, c ->
            c.map(id).toProperty("id")
            .map(continueSignDay).toProperty("continueSignDay")
            .map(continueSignPoint).toProperty("continueSignPoint")
            .map(consumePerPoint).toProperty("consumePerPoint")
            .map(lowOrderAmount).toProperty("lowOrderAmount")
            .map(maxPointPerOrder).toProperty("maxPointPerOrder")
            .map(type).toProperty("type")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UmsMemberRuleSetting> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsMemberRuleSetting, c ->
            c.map(id).toProperty("id")
            .map(continueSignDay).toProperty("continueSignDay")
            .map(continueSignPoint).toProperty("continueSignPoint")
            .map(consumePerPoint).toProperty("consumePerPoint")
            .map(lowOrderAmount).toProperty("lowOrderAmount")
            .map(maxPointPerOrder).toProperty("maxPointPerOrder")
            .map(type).toProperty("type")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsMemberRuleSetting row) {
        return MyBatis3Utils.insert(this::insert, row, umsMemberRuleSetting, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(continueSignDay).toPropertyWhenPresent("continueSignDay", row::getContinueSignDay)
            .map(continueSignPoint).toPropertyWhenPresent("continueSignPoint", row::getContinueSignPoint)
            .map(consumePerPoint).toPropertyWhenPresent("consumePerPoint", row::getConsumePerPoint)
            .map(lowOrderAmount).toPropertyWhenPresent("lowOrderAmount", row::getLowOrderAmount)
            .map(maxPointPerOrder).toPropertyWhenPresent("maxPointPerOrder", row::getMaxPointPerOrder)
            .map(type).toPropertyWhenPresent("type", row::getType)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMemberRuleSetting> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsMemberRuleSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMemberRuleSetting> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsMemberRuleSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMemberRuleSetting> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsMemberRuleSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMemberRuleSetting> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsMemberRuleSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsMemberRuleSetting row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(continueSignDay).equalTo(row::getContinueSignDay)
                .set(continueSignPoint).equalTo(row::getContinueSignPoint)
                .set(consumePerPoint).equalTo(row::getConsumePerPoint)
                .set(lowOrderAmount).equalTo(row::getLowOrderAmount)
                .set(maxPointPerOrder).equalTo(row::getMaxPointPerOrder)
                .set(type).equalTo(row::getType);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsMemberRuleSetting row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(continueSignDay).equalToWhenPresent(row::getContinueSignDay)
                .set(continueSignPoint).equalToWhenPresent(row::getContinueSignPoint)
                .set(consumePerPoint).equalToWhenPresent(row::getConsumePerPoint)
                .set(lowOrderAmount).equalToWhenPresent(row::getLowOrderAmount)
                .set(maxPointPerOrder).equalToWhenPresent(row::getMaxPointPerOrder)
                .set(type).equalToWhenPresent(row::getType);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsMemberRuleSetting row) {
        return update(c ->
            c.set(continueSignDay).equalTo(row::getContinueSignDay)
            .set(continueSignPoint).equalTo(row::getContinueSignPoint)
            .set(consumePerPoint).equalTo(row::getConsumePerPoint)
            .set(lowOrderAmount).equalTo(row::getLowOrderAmount)
            .set(maxPointPerOrder).equalTo(row::getMaxPointPerOrder)
            .set(type).equalTo(row::getType)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsMemberRuleSetting row) {
        return update(c ->
            c.set(continueSignDay).equalToWhenPresent(row::getContinueSignDay)
            .set(continueSignPoint).equalToWhenPresent(row::getContinueSignPoint)
            .set(consumePerPoint).equalToWhenPresent(row::getConsumePerPoint)
            .set(lowOrderAmount).equalToWhenPresent(row::getLowOrderAmount)
            .set(maxPointPerOrder).equalToWhenPresent(row::getMaxPointPerOrder)
            .set(type).equalToWhenPresent(row::getType)
            .where(id, isEqualTo(row::getId))
        );
    }
}