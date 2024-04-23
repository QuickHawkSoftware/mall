package com.macro.mall.mapper;

import static com.macro.mall.mapper.PmsSkuStockDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.PmsSkuStock;
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
public interface PmsSkuStockMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<PmsSkuStock>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, productId, skuCode, price, stock, lowStock, pic, sale, promotionPrice, lockStock, spData);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PmsSkuStockResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.BIGINT),
        @Result(column="sku_code", property="skuCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="stock", property="stock", jdbcType=JdbcType.INTEGER),
        @Result(column="low_stock", property="lowStock", jdbcType=JdbcType.INTEGER),
        @Result(column="pic", property="pic", jdbcType=JdbcType.VARCHAR),
        @Result(column="sale", property="sale", jdbcType=JdbcType.INTEGER),
        @Result(column="promotion_price", property="promotionPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="lock_stock", property="lockStock", jdbcType=JdbcType.INTEGER),
        @Result(column="sp_data", property="spData", jdbcType=JdbcType.VARCHAR)
    })
    List<PmsSkuStock> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PmsSkuStockResult")
    Optional<PmsSkuStock> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, pmsSkuStock, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, pmsSkuStock, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(PmsSkuStock row) {
        return MyBatis3Utils.insert(this::insert, row, pmsSkuStock, c ->
            c.map(id).toProperty("id")
            .map(productId).toProperty("productId")
            .map(skuCode).toProperty("skuCode")
            .map(price).toProperty("price")
            .map(stock).toProperty("stock")
            .map(lowStock).toProperty("lowStock")
            .map(pic).toProperty("pic")
            .map(sale).toProperty("sale")
            .map(promotionPrice).toProperty("promotionPrice")
            .map(lockStock).toProperty("lockStock")
            .map(spData).toProperty("spData")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<PmsSkuStock> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, pmsSkuStock, c ->
            c.map(id).toProperty("id")
            .map(productId).toProperty("productId")
            .map(skuCode).toProperty("skuCode")
            .map(price).toProperty("price")
            .map(stock).toProperty("stock")
            .map(lowStock).toProperty("lowStock")
            .map(pic).toProperty("pic")
            .map(sale).toProperty("sale")
            .map(promotionPrice).toProperty("promotionPrice")
            .map(lockStock).toProperty("lockStock")
            .map(spData).toProperty("spData")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(PmsSkuStock row) {
        return MyBatis3Utils.insert(this::insert, row, pmsSkuStock, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(productId).toPropertyWhenPresent("productId", row::getProductId)
            .map(skuCode).toPropertyWhenPresent("skuCode", row::getSkuCode)
            .map(price).toPropertyWhenPresent("price", row::getPrice)
            .map(stock).toPropertyWhenPresent("stock", row::getStock)
            .map(lowStock).toPropertyWhenPresent("lowStock", row::getLowStock)
            .map(pic).toPropertyWhenPresent("pic", row::getPic)
            .map(sale).toPropertyWhenPresent("sale", row::getSale)
            .map(promotionPrice).toPropertyWhenPresent("promotionPrice", row::getPromotionPrice)
            .map(lockStock).toPropertyWhenPresent("lockStock", row::getLockStock)
            .map(spData).toPropertyWhenPresent("spData", row::getSpData)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsSkuStock> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, pmsSkuStock, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsSkuStock> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, pmsSkuStock, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsSkuStock> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, pmsSkuStock, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsSkuStock> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, pmsSkuStock, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(PmsSkuStock row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(productId).equalTo(row::getProductId)
                .set(skuCode).equalTo(row::getSkuCode)
                .set(price).equalTo(row::getPrice)
                .set(stock).equalTo(row::getStock)
                .set(lowStock).equalTo(row::getLowStock)
                .set(pic).equalTo(row::getPic)
                .set(sale).equalTo(row::getSale)
                .set(promotionPrice).equalTo(row::getPromotionPrice)
                .set(lockStock).equalTo(row::getLockStock)
                .set(spData).equalTo(row::getSpData);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PmsSkuStock row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(productId).equalToWhenPresent(row::getProductId)
                .set(skuCode).equalToWhenPresent(row::getSkuCode)
                .set(price).equalToWhenPresent(row::getPrice)
                .set(stock).equalToWhenPresent(row::getStock)
                .set(lowStock).equalToWhenPresent(row::getLowStock)
                .set(pic).equalToWhenPresent(row::getPic)
                .set(sale).equalToWhenPresent(row::getSale)
                .set(promotionPrice).equalToWhenPresent(row::getPromotionPrice)
                .set(lockStock).equalToWhenPresent(row::getLockStock)
                .set(spData).equalToWhenPresent(row::getSpData);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(PmsSkuStock row) {
        return update(c ->
            c.set(productId).equalTo(row::getProductId)
            .set(skuCode).equalTo(row::getSkuCode)
            .set(price).equalTo(row::getPrice)
            .set(stock).equalTo(row::getStock)
            .set(lowStock).equalTo(row::getLowStock)
            .set(pic).equalTo(row::getPic)
            .set(sale).equalTo(row::getSale)
            .set(promotionPrice).equalTo(row::getPromotionPrice)
            .set(lockStock).equalTo(row::getLockStock)
            .set(spData).equalTo(row::getSpData)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(PmsSkuStock row) {
        return update(c ->
            c.set(productId).equalToWhenPresent(row::getProductId)
            .set(skuCode).equalToWhenPresent(row::getSkuCode)
            .set(price).equalToWhenPresent(row::getPrice)
            .set(stock).equalToWhenPresent(row::getStock)
            .set(lowStock).equalToWhenPresent(row::getLowStock)
            .set(pic).equalToWhenPresent(row::getPic)
            .set(sale).equalToWhenPresent(row::getSale)
            .set(promotionPrice).equalToWhenPresent(row::getPromotionPrice)
            .set(lockStock).equalToWhenPresent(row::getLockStock)
            .set(spData).equalToWhenPresent(row::getSpData)
            .where(id, isEqualTo(row::getId))
        );
    }
}