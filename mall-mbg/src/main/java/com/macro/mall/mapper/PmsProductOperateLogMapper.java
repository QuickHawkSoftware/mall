package com.macro.mall.mapper;

import static com.macro.mall.mapper.PmsProductOperateLogDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.PmsProductOperateLog;
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
public interface PmsProductOperateLogMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<PmsProductOperateLog>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, productId, priceOld, priceNew, salePriceOld, salePriceNew, giftPointOld, giftPointNew, usePointLimitOld, usePointLimitNew, operateMan, createTime);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PmsProductOperateLogResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.BIGINT),
        @Result(column="price_old", property="priceOld", jdbcType=JdbcType.DECIMAL),
        @Result(column="price_new", property="priceNew", jdbcType=JdbcType.DECIMAL),
        @Result(column="sale_price_old", property="salePriceOld", jdbcType=JdbcType.DECIMAL),
        @Result(column="sale_price_new", property="salePriceNew", jdbcType=JdbcType.DECIMAL),
        @Result(column="gift_point_old", property="giftPointOld", jdbcType=JdbcType.INTEGER),
        @Result(column="gift_point_new", property="giftPointNew", jdbcType=JdbcType.INTEGER),
        @Result(column="use_point_limit_old", property="usePointLimitOld", jdbcType=JdbcType.INTEGER),
        @Result(column="use_point_limit_new", property="usePointLimitNew", jdbcType=JdbcType.INTEGER),
        @Result(column="operate_man", property="operateMan", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<PmsProductOperateLog> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PmsProductOperateLogResult")
    Optional<PmsProductOperateLog> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, pmsProductOperateLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, pmsProductOperateLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(PmsProductOperateLog row) {
        return MyBatis3Utils.insert(this::insert, row, pmsProductOperateLog, c ->
            c.map(id).toProperty("id")
            .map(productId).toProperty("productId")
            .map(priceOld).toProperty("priceOld")
            .map(priceNew).toProperty("priceNew")
            .map(salePriceOld).toProperty("salePriceOld")
            .map(salePriceNew).toProperty("salePriceNew")
            .map(giftPointOld).toProperty("giftPointOld")
            .map(giftPointNew).toProperty("giftPointNew")
            .map(usePointLimitOld).toProperty("usePointLimitOld")
            .map(usePointLimitNew).toProperty("usePointLimitNew")
            .map(operateMan).toProperty("operateMan")
            .map(createTime).toProperty("createTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<PmsProductOperateLog> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, pmsProductOperateLog, c ->
            c.map(id).toProperty("id")
            .map(productId).toProperty("productId")
            .map(priceOld).toProperty("priceOld")
            .map(priceNew).toProperty("priceNew")
            .map(salePriceOld).toProperty("salePriceOld")
            .map(salePriceNew).toProperty("salePriceNew")
            .map(giftPointOld).toProperty("giftPointOld")
            .map(giftPointNew).toProperty("giftPointNew")
            .map(usePointLimitOld).toProperty("usePointLimitOld")
            .map(usePointLimitNew).toProperty("usePointLimitNew")
            .map(operateMan).toProperty("operateMan")
            .map(createTime).toProperty("createTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(PmsProductOperateLog row) {
        return MyBatis3Utils.insert(this::insert, row, pmsProductOperateLog, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(productId).toPropertyWhenPresent("productId", row::getProductId)
            .map(priceOld).toPropertyWhenPresent("priceOld", row::getPriceOld)
            .map(priceNew).toPropertyWhenPresent("priceNew", row::getPriceNew)
            .map(salePriceOld).toPropertyWhenPresent("salePriceOld", row::getSalePriceOld)
            .map(salePriceNew).toPropertyWhenPresent("salePriceNew", row::getSalePriceNew)
            .map(giftPointOld).toPropertyWhenPresent("giftPointOld", row::getGiftPointOld)
            .map(giftPointNew).toPropertyWhenPresent("giftPointNew", row::getGiftPointNew)
            .map(usePointLimitOld).toPropertyWhenPresent("usePointLimitOld", row::getUsePointLimitOld)
            .map(usePointLimitNew).toPropertyWhenPresent("usePointLimitNew", row::getUsePointLimitNew)
            .map(operateMan).toPropertyWhenPresent("operateMan", row::getOperateMan)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsProductOperateLog> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, pmsProductOperateLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsProductOperateLog> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, pmsProductOperateLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsProductOperateLog> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, pmsProductOperateLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsProductOperateLog> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, pmsProductOperateLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(PmsProductOperateLog row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(productId).equalTo(row::getProductId)
                .set(priceOld).equalTo(row::getPriceOld)
                .set(priceNew).equalTo(row::getPriceNew)
                .set(salePriceOld).equalTo(row::getSalePriceOld)
                .set(salePriceNew).equalTo(row::getSalePriceNew)
                .set(giftPointOld).equalTo(row::getGiftPointOld)
                .set(giftPointNew).equalTo(row::getGiftPointNew)
                .set(usePointLimitOld).equalTo(row::getUsePointLimitOld)
                .set(usePointLimitNew).equalTo(row::getUsePointLimitNew)
                .set(operateMan).equalTo(row::getOperateMan)
                .set(createTime).equalTo(row::getCreateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PmsProductOperateLog row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(productId).equalToWhenPresent(row::getProductId)
                .set(priceOld).equalToWhenPresent(row::getPriceOld)
                .set(priceNew).equalToWhenPresent(row::getPriceNew)
                .set(salePriceOld).equalToWhenPresent(row::getSalePriceOld)
                .set(salePriceNew).equalToWhenPresent(row::getSalePriceNew)
                .set(giftPointOld).equalToWhenPresent(row::getGiftPointOld)
                .set(giftPointNew).equalToWhenPresent(row::getGiftPointNew)
                .set(usePointLimitOld).equalToWhenPresent(row::getUsePointLimitOld)
                .set(usePointLimitNew).equalToWhenPresent(row::getUsePointLimitNew)
                .set(operateMan).equalToWhenPresent(row::getOperateMan)
                .set(createTime).equalToWhenPresent(row::getCreateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(PmsProductOperateLog row) {
        return update(c ->
            c.set(productId).equalTo(row::getProductId)
            .set(priceOld).equalTo(row::getPriceOld)
            .set(priceNew).equalTo(row::getPriceNew)
            .set(salePriceOld).equalTo(row::getSalePriceOld)
            .set(salePriceNew).equalTo(row::getSalePriceNew)
            .set(giftPointOld).equalTo(row::getGiftPointOld)
            .set(giftPointNew).equalTo(row::getGiftPointNew)
            .set(usePointLimitOld).equalTo(row::getUsePointLimitOld)
            .set(usePointLimitNew).equalTo(row::getUsePointLimitNew)
            .set(operateMan).equalTo(row::getOperateMan)
            .set(createTime).equalTo(row::getCreateTime)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(PmsProductOperateLog row) {
        return update(c ->
            c.set(productId).equalToWhenPresent(row::getProductId)
            .set(priceOld).equalToWhenPresent(row::getPriceOld)
            .set(priceNew).equalToWhenPresent(row::getPriceNew)
            .set(salePriceOld).equalToWhenPresent(row::getSalePriceOld)
            .set(salePriceNew).equalToWhenPresent(row::getSalePriceNew)
            .set(giftPointOld).equalToWhenPresent(row::getGiftPointOld)
            .set(giftPointNew).equalToWhenPresent(row::getGiftPointNew)
            .set(usePointLimitOld).equalToWhenPresent(row::getUsePointLimitOld)
            .set(usePointLimitNew).equalToWhenPresent(row::getUsePointLimitNew)
            .set(operateMan).equalToWhenPresent(row::getOperateMan)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .where(id, isEqualTo(row::getId))
        );
    }
}