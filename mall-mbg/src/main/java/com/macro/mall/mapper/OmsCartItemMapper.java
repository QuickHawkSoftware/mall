package com.macro.mall.mapper;

import static com.macro.mall.mapper.OmsCartItemDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.OmsCartItem;
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
public interface OmsCartItemMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<OmsCartItem>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, productId, productSkuId, memberId, quantity, price, productPic, productName, productSubTitle, productSkuCode, memberNickname, createDate, modifyDate, deleteStatus, productCategoryId, productBrand, productSn, productAttr);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OmsCartItemResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_sku_id", property="productSkuId", jdbcType=JdbcType.BIGINT),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.BIGINT),
        @Result(column="quantity", property="quantity", jdbcType=JdbcType.INTEGER),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="product_pic", property="productPic", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_name", property="productName", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_sub_title", property="productSubTitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_sku_code", property="productSkuCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="member_nickname", property="memberNickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_date", property="modifyDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_status", property="deleteStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="product_category_id", property="productCategoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_brand", property="productBrand", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_sn", property="productSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_attr", property="productAttr", jdbcType=JdbcType.VARCHAR)
    })
    List<OmsCartItem> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OmsCartItemResult")
    Optional<OmsCartItem> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, omsCartItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, omsCartItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(OmsCartItem row) {
        return MyBatis3Utils.insert(this::insert, row, omsCartItem, c ->
            c.map(id).toProperty("id")
            .map(productId).toProperty("productId")
            .map(productSkuId).toProperty("productSkuId")
            .map(memberId).toProperty("memberId")
            .map(quantity).toProperty("quantity")
            .map(price).toProperty("price")
            .map(productPic).toProperty("productPic")
            .map(productName).toProperty("productName")
            .map(productSubTitle).toProperty("productSubTitle")
            .map(productSkuCode).toProperty("productSkuCode")
            .map(memberNickname).toProperty("memberNickname")
            .map(createDate).toProperty("createDate")
            .map(modifyDate).toProperty("modifyDate")
            .map(deleteStatus).toProperty("deleteStatus")
            .map(productCategoryId).toProperty("productCategoryId")
            .map(productBrand).toProperty("productBrand")
            .map(productSn).toProperty("productSn")
            .map(productAttr).toProperty("productAttr")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<OmsCartItem> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, omsCartItem, c ->
            c.map(id).toProperty("id")
            .map(productId).toProperty("productId")
            .map(productSkuId).toProperty("productSkuId")
            .map(memberId).toProperty("memberId")
            .map(quantity).toProperty("quantity")
            .map(price).toProperty("price")
            .map(productPic).toProperty("productPic")
            .map(productName).toProperty("productName")
            .map(productSubTitle).toProperty("productSubTitle")
            .map(productSkuCode).toProperty("productSkuCode")
            .map(memberNickname).toProperty("memberNickname")
            .map(createDate).toProperty("createDate")
            .map(modifyDate).toProperty("modifyDate")
            .map(deleteStatus).toProperty("deleteStatus")
            .map(productCategoryId).toProperty("productCategoryId")
            .map(productBrand).toProperty("productBrand")
            .map(productSn).toProperty("productSn")
            .map(productAttr).toProperty("productAttr")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(OmsCartItem row) {
        return MyBatis3Utils.insert(this::insert, row, omsCartItem, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(productId).toPropertyWhenPresent("productId", row::getProductId)
            .map(productSkuId).toPropertyWhenPresent("productSkuId", row::getProductSkuId)
            .map(memberId).toPropertyWhenPresent("memberId", row::getMemberId)
            .map(quantity).toPropertyWhenPresent("quantity", row::getQuantity)
            .map(price).toPropertyWhenPresent("price", row::getPrice)
            .map(productPic).toPropertyWhenPresent("productPic", row::getProductPic)
            .map(productName).toPropertyWhenPresent("productName", row::getProductName)
            .map(productSubTitle).toPropertyWhenPresent("productSubTitle", row::getProductSubTitle)
            .map(productSkuCode).toPropertyWhenPresent("productSkuCode", row::getProductSkuCode)
            .map(memberNickname).toPropertyWhenPresent("memberNickname", row::getMemberNickname)
            .map(createDate).toPropertyWhenPresent("createDate", row::getCreateDate)
            .map(modifyDate).toPropertyWhenPresent("modifyDate", row::getModifyDate)
            .map(deleteStatus).toPropertyWhenPresent("deleteStatus", row::getDeleteStatus)
            .map(productCategoryId).toPropertyWhenPresent("productCategoryId", row::getProductCategoryId)
            .map(productBrand).toPropertyWhenPresent("productBrand", row::getProductBrand)
            .map(productSn).toPropertyWhenPresent("productSn", row::getProductSn)
            .map(productAttr).toPropertyWhenPresent("productAttr", row::getProductAttr)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsCartItem> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, omsCartItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsCartItem> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, omsCartItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsCartItem> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, omsCartItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsCartItem> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, omsCartItem, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(OmsCartItem row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(productId).equalTo(row::getProductId)
                .set(productSkuId).equalTo(row::getProductSkuId)
                .set(memberId).equalTo(row::getMemberId)
                .set(quantity).equalTo(row::getQuantity)
                .set(price).equalTo(row::getPrice)
                .set(productPic).equalTo(row::getProductPic)
                .set(productName).equalTo(row::getProductName)
                .set(productSubTitle).equalTo(row::getProductSubTitle)
                .set(productSkuCode).equalTo(row::getProductSkuCode)
                .set(memberNickname).equalTo(row::getMemberNickname)
                .set(createDate).equalTo(row::getCreateDate)
                .set(modifyDate).equalTo(row::getModifyDate)
                .set(deleteStatus).equalTo(row::getDeleteStatus)
                .set(productCategoryId).equalTo(row::getProductCategoryId)
                .set(productBrand).equalTo(row::getProductBrand)
                .set(productSn).equalTo(row::getProductSn)
                .set(productAttr).equalTo(row::getProductAttr);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OmsCartItem row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(productId).equalToWhenPresent(row::getProductId)
                .set(productSkuId).equalToWhenPresent(row::getProductSkuId)
                .set(memberId).equalToWhenPresent(row::getMemberId)
                .set(quantity).equalToWhenPresent(row::getQuantity)
                .set(price).equalToWhenPresent(row::getPrice)
                .set(productPic).equalToWhenPresent(row::getProductPic)
                .set(productName).equalToWhenPresent(row::getProductName)
                .set(productSubTitle).equalToWhenPresent(row::getProductSubTitle)
                .set(productSkuCode).equalToWhenPresent(row::getProductSkuCode)
                .set(memberNickname).equalToWhenPresent(row::getMemberNickname)
                .set(createDate).equalToWhenPresent(row::getCreateDate)
                .set(modifyDate).equalToWhenPresent(row::getModifyDate)
                .set(deleteStatus).equalToWhenPresent(row::getDeleteStatus)
                .set(productCategoryId).equalToWhenPresent(row::getProductCategoryId)
                .set(productBrand).equalToWhenPresent(row::getProductBrand)
                .set(productSn).equalToWhenPresent(row::getProductSn)
                .set(productAttr).equalToWhenPresent(row::getProductAttr);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(OmsCartItem row) {
        return update(c ->
            c.set(productId).equalTo(row::getProductId)
            .set(productSkuId).equalTo(row::getProductSkuId)
            .set(memberId).equalTo(row::getMemberId)
            .set(quantity).equalTo(row::getQuantity)
            .set(price).equalTo(row::getPrice)
            .set(productPic).equalTo(row::getProductPic)
            .set(productName).equalTo(row::getProductName)
            .set(productSubTitle).equalTo(row::getProductSubTitle)
            .set(productSkuCode).equalTo(row::getProductSkuCode)
            .set(memberNickname).equalTo(row::getMemberNickname)
            .set(createDate).equalTo(row::getCreateDate)
            .set(modifyDate).equalTo(row::getModifyDate)
            .set(deleteStatus).equalTo(row::getDeleteStatus)
            .set(productCategoryId).equalTo(row::getProductCategoryId)
            .set(productBrand).equalTo(row::getProductBrand)
            .set(productSn).equalTo(row::getProductSn)
            .set(productAttr).equalTo(row::getProductAttr)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(OmsCartItem row) {
        return update(c ->
            c.set(productId).equalToWhenPresent(row::getProductId)
            .set(productSkuId).equalToWhenPresent(row::getProductSkuId)
            .set(memberId).equalToWhenPresent(row::getMemberId)
            .set(quantity).equalToWhenPresent(row::getQuantity)
            .set(price).equalToWhenPresent(row::getPrice)
            .set(productPic).equalToWhenPresent(row::getProductPic)
            .set(productName).equalToWhenPresent(row::getProductName)
            .set(productSubTitle).equalToWhenPresent(row::getProductSubTitle)
            .set(productSkuCode).equalToWhenPresent(row::getProductSkuCode)
            .set(memberNickname).equalToWhenPresent(row::getMemberNickname)
            .set(createDate).equalToWhenPresent(row::getCreateDate)
            .set(modifyDate).equalToWhenPresent(row::getModifyDate)
            .set(deleteStatus).equalToWhenPresent(row::getDeleteStatus)
            .set(productCategoryId).equalToWhenPresent(row::getProductCategoryId)
            .set(productBrand).equalToWhenPresent(row::getProductBrand)
            .set(productSn).equalToWhenPresent(row::getProductSn)
            .set(productAttr).equalToWhenPresent(row::getProductAttr)
            .where(id, isEqualTo(row::getId))
        );
    }
}