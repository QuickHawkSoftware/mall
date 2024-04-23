package com.macro.mall.mapper;

import static com.macro.mall.mapper.OmsOrderItemDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.OmsOrderItem;
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
public interface OmsOrderItemMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<OmsOrderItem>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, orderId, orderSn, productId, productPic, productName, productBrand, productSn, productPrice, productQuantity, productSkuId, productSkuCode, productCategoryId, promotionName, promotionAmount, couponAmount, integrationAmount, realAmount, giftIntegration, giftGrowth, productAttr);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OmsOrderItemResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT),
        @Result(column="order_sn", property="orderSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_pic", property="productPic", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_name", property="productName", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_brand", property="productBrand", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_sn", property="productSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_price", property="productPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="product_quantity", property="productQuantity", jdbcType=JdbcType.INTEGER),
        @Result(column="product_sku_id", property="productSkuId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_sku_code", property="productSkuCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_category_id", property="productCategoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="promotion_name", property="promotionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="promotion_amount", property="promotionAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="coupon_amount", property="couponAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="integration_amount", property="integrationAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="real_amount", property="realAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="gift_integration", property="giftIntegration", jdbcType=JdbcType.INTEGER),
        @Result(column="gift_growth", property="giftGrowth", jdbcType=JdbcType.INTEGER),
        @Result(column="product_attr", property="productAttr", jdbcType=JdbcType.VARCHAR)
    })
    List<OmsOrderItem> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OmsOrderItemResult")
    Optional<OmsOrderItem> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, omsOrderItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, omsOrderItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(OmsOrderItem row) {
        return MyBatis3Utils.insert(this::insert, row, omsOrderItem, c ->
            c.map(id).toProperty("id")
            .map(orderId).toProperty("orderId")
            .map(orderSn).toProperty("orderSn")
            .map(productId).toProperty("productId")
            .map(productPic).toProperty("productPic")
            .map(productName).toProperty("productName")
            .map(productBrand).toProperty("productBrand")
            .map(productSn).toProperty("productSn")
            .map(productPrice).toProperty("productPrice")
            .map(productQuantity).toProperty("productQuantity")
            .map(productSkuId).toProperty("productSkuId")
            .map(productSkuCode).toProperty("productSkuCode")
            .map(productCategoryId).toProperty("productCategoryId")
            .map(promotionName).toProperty("promotionName")
            .map(promotionAmount).toProperty("promotionAmount")
            .map(couponAmount).toProperty("couponAmount")
            .map(integrationAmount).toProperty("integrationAmount")
            .map(realAmount).toProperty("realAmount")
            .map(giftIntegration).toProperty("giftIntegration")
            .map(giftGrowth).toProperty("giftGrowth")
            .map(productAttr).toProperty("productAttr")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<OmsOrderItem> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, omsOrderItem, c ->
            c.map(id).toProperty("id")
            .map(orderId).toProperty("orderId")
            .map(orderSn).toProperty("orderSn")
            .map(productId).toProperty("productId")
            .map(productPic).toProperty("productPic")
            .map(productName).toProperty("productName")
            .map(productBrand).toProperty("productBrand")
            .map(productSn).toProperty("productSn")
            .map(productPrice).toProperty("productPrice")
            .map(productQuantity).toProperty("productQuantity")
            .map(productSkuId).toProperty("productSkuId")
            .map(productSkuCode).toProperty("productSkuCode")
            .map(productCategoryId).toProperty("productCategoryId")
            .map(promotionName).toProperty("promotionName")
            .map(promotionAmount).toProperty("promotionAmount")
            .map(couponAmount).toProperty("couponAmount")
            .map(integrationAmount).toProperty("integrationAmount")
            .map(realAmount).toProperty("realAmount")
            .map(giftIntegration).toProperty("giftIntegration")
            .map(giftGrowth).toProperty("giftGrowth")
            .map(productAttr).toProperty("productAttr")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(OmsOrderItem row) {
        return MyBatis3Utils.insert(this::insert, row, omsOrderItem, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(orderId).toPropertyWhenPresent("orderId", row::getOrderId)
            .map(orderSn).toPropertyWhenPresent("orderSn", row::getOrderSn)
            .map(productId).toPropertyWhenPresent("productId", row::getProductId)
            .map(productPic).toPropertyWhenPresent("productPic", row::getProductPic)
            .map(productName).toPropertyWhenPresent("productName", row::getProductName)
            .map(productBrand).toPropertyWhenPresent("productBrand", row::getProductBrand)
            .map(productSn).toPropertyWhenPresent("productSn", row::getProductSn)
            .map(productPrice).toPropertyWhenPresent("productPrice", row::getProductPrice)
            .map(productQuantity).toPropertyWhenPresent("productQuantity", row::getProductQuantity)
            .map(productSkuId).toPropertyWhenPresent("productSkuId", row::getProductSkuId)
            .map(productSkuCode).toPropertyWhenPresent("productSkuCode", row::getProductSkuCode)
            .map(productCategoryId).toPropertyWhenPresent("productCategoryId", row::getProductCategoryId)
            .map(promotionName).toPropertyWhenPresent("promotionName", row::getPromotionName)
            .map(promotionAmount).toPropertyWhenPresent("promotionAmount", row::getPromotionAmount)
            .map(couponAmount).toPropertyWhenPresent("couponAmount", row::getCouponAmount)
            .map(integrationAmount).toPropertyWhenPresent("integrationAmount", row::getIntegrationAmount)
            .map(realAmount).toPropertyWhenPresent("realAmount", row::getRealAmount)
            .map(giftIntegration).toPropertyWhenPresent("giftIntegration", row::getGiftIntegration)
            .map(giftGrowth).toPropertyWhenPresent("giftGrowth", row::getGiftGrowth)
            .map(productAttr).toPropertyWhenPresent("productAttr", row::getProductAttr)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsOrderItem> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, omsOrderItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsOrderItem> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, omsOrderItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsOrderItem> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, omsOrderItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsOrderItem> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, omsOrderItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(OmsOrderItem row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(orderId).equalTo(row::getOrderId)
                .set(orderSn).equalTo(row::getOrderSn)
                .set(productId).equalTo(row::getProductId)
                .set(productPic).equalTo(row::getProductPic)
                .set(productName).equalTo(row::getProductName)
                .set(productBrand).equalTo(row::getProductBrand)
                .set(productSn).equalTo(row::getProductSn)
                .set(productPrice).equalTo(row::getProductPrice)
                .set(productQuantity).equalTo(row::getProductQuantity)
                .set(productSkuId).equalTo(row::getProductSkuId)
                .set(productSkuCode).equalTo(row::getProductSkuCode)
                .set(productCategoryId).equalTo(row::getProductCategoryId)
                .set(promotionName).equalTo(row::getPromotionName)
                .set(promotionAmount).equalTo(row::getPromotionAmount)
                .set(couponAmount).equalTo(row::getCouponAmount)
                .set(integrationAmount).equalTo(row::getIntegrationAmount)
                .set(realAmount).equalTo(row::getRealAmount)
                .set(giftIntegration).equalTo(row::getGiftIntegration)
                .set(giftGrowth).equalTo(row::getGiftGrowth)
                .set(productAttr).equalTo(row::getProductAttr);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OmsOrderItem row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(orderId).equalToWhenPresent(row::getOrderId)
                .set(orderSn).equalToWhenPresent(row::getOrderSn)
                .set(productId).equalToWhenPresent(row::getProductId)
                .set(productPic).equalToWhenPresent(row::getProductPic)
                .set(productName).equalToWhenPresent(row::getProductName)
                .set(productBrand).equalToWhenPresent(row::getProductBrand)
                .set(productSn).equalToWhenPresent(row::getProductSn)
                .set(productPrice).equalToWhenPresent(row::getProductPrice)
                .set(productQuantity).equalToWhenPresent(row::getProductQuantity)
                .set(productSkuId).equalToWhenPresent(row::getProductSkuId)
                .set(productSkuCode).equalToWhenPresent(row::getProductSkuCode)
                .set(productCategoryId).equalToWhenPresent(row::getProductCategoryId)
                .set(promotionName).equalToWhenPresent(row::getPromotionName)
                .set(promotionAmount).equalToWhenPresent(row::getPromotionAmount)
                .set(couponAmount).equalToWhenPresent(row::getCouponAmount)
                .set(integrationAmount).equalToWhenPresent(row::getIntegrationAmount)
                .set(realAmount).equalToWhenPresent(row::getRealAmount)
                .set(giftIntegration).equalToWhenPresent(row::getGiftIntegration)
                .set(giftGrowth).equalToWhenPresent(row::getGiftGrowth)
                .set(productAttr).equalToWhenPresent(row::getProductAttr);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(OmsOrderItem row) {
        return update(c ->
            c.set(orderId).equalTo(row::getOrderId)
            .set(orderSn).equalTo(row::getOrderSn)
            .set(productId).equalTo(row::getProductId)
            .set(productPic).equalTo(row::getProductPic)
            .set(productName).equalTo(row::getProductName)
            .set(productBrand).equalTo(row::getProductBrand)
            .set(productSn).equalTo(row::getProductSn)
            .set(productPrice).equalTo(row::getProductPrice)
            .set(productQuantity).equalTo(row::getProductQuantity)
            .set(productSkuId).equalTo(row::getProductSkuId)
            .set(productSkuCode).equalTo(row::getProductSkuCode)
            .set(productCategoryId).equalTo(row::getProductCategoryId)
            .set(promotionName).equalTo(row::getPromotionName)
            .set(promotionAmount).equalTo(row::getPromotionAmount)
            .set(couponAmount).equalTo(row::getCouponAmount)
            .set(integrationAmount).equalTo(row::getIntegrationAmount)
            .set(realAmount).equalTo(row::getRealAmount)
            .set(giftIntegration).equalTo(row::getGiftIntegration)
            .set(giftGrowth).equalTo(row::getGiftGrowth)
            .set(productAttr).equalTo(row::getProductAttr)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(OmsOrderItem row) {
        return update(c ->
            c.set(orderId).equalToWhenPresent(row::getOrderId)
            .set(orderSn).equalToWhenPresent(row::getOrderSn)
            .set(productId).equalToWhenPresent(row::getProductId)
            .set(productPic).equalToWhenPresent(row::getProductPic)
            .set(productName).equalToWhenPresent(row::getProductName)
            .set(productBrand).equalToWhenPresent(row::getProductBrand)
            .set(productSn).equalToWhenPresent(row::getProductSn)
            .set(productPrice).equalToWhenPresent(row::getProductPrice)
            .set(productQuantity).equalToWhenPresent(row::getProductQuantity)
            .set(productSkuId).equalToWhenPresent(row::getProductSkuId)
            .set(productSkuCode).equalToWhenPresent(row::getProductSkuCode)
            .set(productCategoryId).equalToWhenPresent(row::getProductCategoryId)
            .set(promotionName).equalToWhenPresent(row::getPromotionName)
            .set(promotionAmount).equalToWhenPresent(row::getPromotionAmount)
            .set(couponAmount).equalToWhenPresent(row::getCouponAmount)
            .set(integrationAmount).equalToWhenPresent(row::getIntegrationAmount)
            .set(realAmount).equalToWhenPresent(row::getRealAmount)
            .set(giftIntegration).equalToWhenPresent(row::getGiftIntegration)
            .set(giftGrowth).equalToWhenPresent(row::getGiftGrowth)
            .set(productAttr).equalToWhenPresent(row::getProductAttr)
            .where(id, isEqualTo(row::getId))
        );
    }
}