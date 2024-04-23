package com.macro.mall.mapper;

import static com.macro.mall.mapper.PmsFeightTemplateDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.PmsFeightTemplate;
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
public interface PmsFeightTemplateMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<PmsFeightTemplate>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, chargeType, firstWeight, firstFee, continueWeight, continmeFee, dest);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PmsFeightTemplateResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="charge_type", property="chargeType", jdbcType=JdbcType.INTEGER),
        @Result(column="first_weight", property="firstWeight", jdbcType=JdbcType.DECIMAL),
        @Result(column="first_fee", property="firstFee", jdbcType=JdbcType.DECIMAL),
        @Result(column="continue_weight", property="continueWeight", jdbcType=JdbcType.DECIMAL),
        @Result(column="continme_fee", property="continmeFee", jdbcType=JdbcType.DECIMAL),
        @Result(column="dest", property="dest", jdbcType=JdbcType.VARCHAR)
    })
    List<PmsFeightTemplate> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PmsFeightTemplateResult")
    Optional<PmsFeightTemplate> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, pmsFeightTemplate, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, pmsFeightTemplate, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(PmsFeightTemplate row) {
        return MyBatis3Utils.insert(this::insert, row, pmsFeightTemplate, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(chargeType).toProperty("chargeType")
            .map(firstWeight).toProperty("firstWeight")
            .map(firstFee).toProperty("firstFee")
            .map(continueWeight).toProperty("continueWeight")
            .map(continmeFee).toProperty("continmeFee")
            .map(dest).toProperty("dest")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<PmsFeightTemplate> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, pmsFeightTemplate, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(chargeType).toProperty("chargeType")
            .map(firstWeight).toProperty("firstWeight")
            .map(firstFee).toProperty("firstFee")
            .map(continueWeight).toProperty("continueWeight")
            .map(continmeFee).toProperty("continmeFee")
            .map(dest).toProperty("dest")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(PmsFeightTemplate row) {
        return MyBatis3Utils.insert(this::insert, row, pmsFeightTemplate, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(chargeType).toPropertyWhenPresent("chargeType", row::getChargeType)
            .map(firstWeight).toPropertyWhenPresent("firstWeight", row::getFirstWeight)
            .map(firstFee).toPropertyWhenPresent("firstFee", row::getFirstFee)
            .map(continueWeight).toPropertyWhenPresent("continueWeight", row::getContinueWeight)
            .map(continmeFee).toPropertyWhenPresent("continmeFee", row::getContinmeFee)
            .map(dest).toPropertyWhenPresent("dest", row::getDest)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsFeightTemplate> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, pmsFeightTemplate, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsFeightTemplate> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, pmsFeightTemplate, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsFeightTemplate> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, pmsFeightTemplate, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsFeightTemplate> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, pmsFeightTemplate, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(PmsFeightTemplate row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(name).equalTo(row::getName)
                .set(chargeType).equalTo(row::getChargeType)
                .set(firstWeight).equalTo(row::getFirstWeight)
                .set(firstFee).equalTo(row::getFirstFee)
                .set(continueWeight).equalTo(row::getContinueWeight)
                .set(continmeFee).equalTo(row::getContinmeFee)
                .set(dest).equalTo(row::getDest);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PmsFeightTemplate row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(name).equalToWhenPresent(row::getName)
                .set(chargeType).equalToWhenPresent(row::getChargeType)
                .set(firstWeight).equalToWhenPresent(row::getFirstWeight)
                .set(firstFee).equalToWhenPresent(row::getFirstFee)
                .set(continueWeight).equalToWhenPresent(row::getContinueWeight)
                .set(continmeFee).equalToWhenPresent(row::getContinmeFee)
                .set(dest).equalToWhenPresent(row::getDest);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(PmsFeightTemplate row) {
        return update(c ->
            c.set(name).equalTo(row::getName)
            .set(chargeType).equalTo(row::getChargeType)
            .set(firstWeight).equalTo(row::getFirstWeight)
            .set(firstFee).equalTo(row::getFirstFee)
            .set(continueWeight).equalTo(row::getContinueWeight)
            .set(continmeFee).equalTo(row::getContinmeFee)
            .set(dest).equalTo(row::getDest)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(PmsFeightTemplate row) {
        return update(c ->
            c.set(name).equalToWhenPresent(row::getName)
            .set(chargeType).equalToWhenPresent(row::getChargeType)
            .set(firstWeight).equalToWhenPresent(row::getFirstWeight)
            .set(firstFee).equalToWhenPresent(row::getFirstFee)
            .set(continueWeight).equalToWhenPresent(row::getContinueWeight)
            .set(continmeFee).equalToWhenPresent(row::getContinmeFee)
            .set(dest).equalToWhenPresent(row::getDest)
            .where(id, isEqualTo(row::getId))
        );
    }
}