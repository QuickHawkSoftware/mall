package com.macro.mall.mapper;

import static com.macro.mall.mapper.OmsOrderReturnApplyDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.OmsOrderReturnApply;
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
public interface OmsOrderReturnApplyMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<OmsOrderReturnApply>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, orderId, companyAddressId, productId, orderSn, createTime, memberUsername, returnAmount, returnName, returnPhone, status, handleTime, productPic, productName, productBrand, productAttr, productCount, productPrice, productRealPrice, reason, description, proofPics, handleNote, handleMan, receiveMan, receiveTime, receiveNote);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OmsOrderReturnApplyResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT),
        @Result(column="company_address_id", property="companyAddressId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.BIGINT),
        @Result(column="order_sn", property="orderSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="member_username", property="memberUsername", jdbcType=JdbcType.VARCHAR),
        @Result(column="return_amount", property="returnAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="return_name", property="returnName", jdbcType=JdbcType.VARCHAR),
        @Result(column="return_phone", property="returnPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="handle_time", property="handleTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="product_pic", property="productPic", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_name", property="productName", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_brand", property="productBrand", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_attr", property="productAttr", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_count", property="productCount", jdbcType=JdbcType.INTEGER),
        @Result(column="product_price", property="productPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="product_real_price", property="productRealPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="reason", property="reason", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="proof_pics", property="proofPics", jdbcType=JdbcType.VARCHAR),
        @Result(column="handle_note", property="handleNote", jdbcType=JdbcType.VARCHAR),
        @Result(column="handle_man", property="handleMan", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_man", property="receiveMan", jdbcType=JdbcType.VARCHAR),
        @Result(column="receive_time", property="receiveTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="receive_note", property="receiveNote", jdbcType=JdbcType.VARCHAR)
    })
    List<OmsOrderReturnApply> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OmsOrderReturnApplyResult")
    Optional<OmsOrderReturnApply> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, omsOrderReturnApply, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, omsOrderReturnApply, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(OmsOrderReturnApply row) {
        return MyBatis3Utils.insert(this::insert, row, omsOrderReturnApply, c ->
            c.map(id).toProperty("id")
            .map(orderId).toProperty("orderId")
            .map(companyAddressId).toProperty("companyAddressId")
            .map(productId).toProperty("productId")
            .map(orderSn).toProperty("orderSn")
            .map(createTime).toProperty("createTime")
            .map(memberUsername).toProperty("memberUsername")
            .map(returnAmount).toProperty("returnAmount")
            .map(returnName).toProperty("returnName")
            .map(returnPhone).toProperty("returnPhone")
            .map(status).toProperty("status")
            .map(handleTime).toProperty("handleTime")
            .map(productPic).toProperty("productPic")
            .map(productName).toProperty("productName")
            .map(productBrand).toProperty("productBrand")
            .map(productAttr).toProperty("productAttr")
            .map(productCount).toProperty("productCount")
            .map(productPrice).toProperty("productPrice")
            .map(productRealPrice).toProperty("productRealPrice")
            .map(reason).toProperty("reason")
            .map(description).toProperty("description")
            .map(proofPics).toProperty("proofPics")
            .map(handleNote).toProperty("handleNote")
            .map(handleMan).toProperty("handleMan")
            .map(receiveMan).toProperty("receiveMan")
            .map(receiveTime).toProperty("receiveTime")
            .map(receiveNote).toProperty("receiveNote")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<OmsOrderReturnApply> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, omsOrderReturnApply, c ->
            c.map(id).toProperty("id")
            .map(orderId).toProperty("orderId")
            .map(companyAddressId).toProperty("companyAddressId")
            .map(productId).toProperty("productId")
            .map(orderSn).toProperty("orderSn")
            .map(createTime).toProperty("createTime")
            .map(memberUsername).toProperty("memberUsername")
            .map(returnAmount).toProperty("returnAmount")
            .map(returnName).toProperty("returnName")
            .map(returnPhone).toProperty("returnPhone")
            .map(status).toProperty("status")
            .map(handleTime).toProperty("handleTime")
            .map(productPic).toProperty("productPic")
            .map(productName).toProperty("productName")
            .map(productBrand).toProperty("productBrand")
            .map(productAttr).toProperty("productAttr")
            .map(productCount).toProperty("productCount")
            .map(productPrice).toProperty("productPrice")
            .map(productRealPrice).toProperty("productRealPrice")
            .map(reason).toProperty("reason")
            .map(description).toProperty("description")
            .map(proofPics).toProperty("proofPics")
            .map(handleNote).toProperty("handleNote")
            .map(handleMan).toProperty("handleMan")
            .map(receiveMan).toProperty("receiveMan")
            .map(receiveTime).toProperty("receiveTime")
            .map(receiveNote).toProperty("receiveNote")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(OmsOrderReturnApply row) {
        return MyBatis3Utils.insert(this::insert, row, omsOrderReturnApply, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(orderId).toPropertyWhenPresent("orderId", row::getOrderId)
            .map(companyAddressId).toPropertyWhenPresent("companyAddressId", row::getCompanyAddressId)
            .map(productId).toPropertyWhenPresent("productId", row::getProductId)
            .map(orderSn).toPropertyWhenPresent("orderSn", row::getOrderSn)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(memberUsername).toPropertyWhenPresent("memberUsername", row::getMemberUsername)
            .map(returnAmount).toPropertyWhenPresent("returnAmount", row::getReturnAmount)
            .map(returnName).toPropertyWhenPresent("returnName", row::getReturnName)
            .map(returnPhone).toPropertyWhenPresent("returnPhone", row::getReturnPhone)
            .map(status).toPropertyWhenPresent("status", row::getStatus)
            .map(handleTime).toPropertyWhenPresent("handleTime", row::getHandleTime)
            .map(productPic).toPropertyWhenPresent("productPic", row::getProductPic)
            .map(productName).toPropertyWhenPresent("productName", row::getProductName)
            .map(productBrand).toPropertyWhenPresent("productBrand", row::getProductBrand)
            .map(productAttr).toPropertyWhenPresent("productAttr", row::getProductAttr)
            .map(productCount).toPropertyWhenPresent("productCount", row::getProductCount)
            .map(productPrice).toPropertyWhenPresent("productPrice", row::getProductPrice)
            .map(productRealPrice).toPropertyWhenPresent("productRealPrice", row::getProductRealPrice)
            .map(reason).toPropertyWhenPresent("reason", row::getReason)
            .map(description).toPropertyWhenPresent("description", row::getDescription)
            .map(proofPics).toPropertyWhenPresent("proofPics", row::getProofPics)
            .map(handleNote).toPropertyWhenPresent("handleNote", row::getHandleNote)
            .map(handleMan).toPropertyWhenPresent("handleMan", row::getHandleMan)
            .map(receiveMan).toPropertyWhenPresent("receiveMan", row::getReceiveMan)
            .map(receiveTime).toPropertyWhenPresent("receiveTime", row::getReceiveTime)
            .map(receiveNote).toPropertyWhenPresent("receiveNote", row::getReceiveNote)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsOrderReturnApply> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, omsOrderReturnApply, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsOrderReturnApply> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, omsOrderReturnApply, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsOrderReturnApply> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, omsOrderReturnApply, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsOrderReturnApply> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, omsOrderReturnApply, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(OmsOrderReturnApply row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(orderId).equalTo(row::getOrderId)
                .set(companyAddressId).equalTo(row::getCompanyAddressId)
                .set(productId).equalTo(row::getProductId)
                .set(orderSn).equalTo(row::getOrderSn)
                .set(createTime).equalTo(row::getCreateTime)
                .set(memberUsername).equalTo(row::getMemberUsername)
                .set(returnAmount).equalTo(row::getReturnAmount)
                .set(returnName).equalTo(row::getReturnName)
                .set(returnPhone).equalTo(row::getReturnPhone)
                .set(status).equalTo(row::getStatus)
                .set(handleTime).equalTo(row::getHandleTime)
                .set(productPic).equalTo(row::getProductPic)
                .set(productName).equalTo(row::getProductName)
                .set(productBrand).equalTo(row::getProductBrand)
                .set(productAttr).equalTo(row::getProductAttr)
                .set(productCount).equalTo(row::getProductCount)
                .set(productPrice).equalTo(row::getProductPrice)
                .set(productRealPrice).equalTo(row::getProductRealPrice)
                .set(reason).equalTo(row::getReason)
                .set(description).equalTo(row::getDescription)
                .set(proofPics).equalTo(row::getProofPics)
                .set(handleNote).equalTo(row::getHandleNote)
                .set(handleMan).equalTo(row::getHandleMan)
                .set(receiveMan).equalTo(row::getReceiveMan)
                .set(receiveTime).equalTo(row::getReceiveTime)
                .set(receiveNote).equalTo(row::getReceiveNote);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OmsOrderReturnApply row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(orderId).equalToWhenPresent(row::getOrderId)
                .set(companyAddressId).equalToWhenPresent(row::getCompanyAddressId)
                .set(productId).equalToWhenPresent(row::getProductId)
                .set(orderSn).equalToWhenPresent(row::getOrderSn)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(memberUsername).equalToWhenPresent(row::getMemberUsername)
                .set(returnAmount).equalToWhenPresent(row::getReturnAmount)
                .set(returnName).equalToWhenPresent(row::getReturnName)
                .set(returnPhone).equalToWhenPresent(row::getReturnPhone)
                .set(status).equalToWhenPresent(row::getStatus)
                .set(handleTime).equalToWhenPresent(row::getHandleTime)
                .set(productPic).equalToWhenPresent(row::getProductPic)
                .set(productName).equalToWhenPresent(row::getProductName)
                .set(productBrand).equalToWhenPresent(row::getProductBrand)
                .set(productAttr).equalToWhenPresent(row::getProductAttr)
                .set(productCount).equalToWhenPresent(row::getProductCount)
                .set(productPrice).equalToWhenPresent(row::getProductPrice)
                .set(productRealPrice).equalToWhenPresent(row::getProductRealPrice)
                .set(reason).equalToWhenPresent(row::getReason)
                .set(description).equalToWhenPresent(row::getDescription)
                .set(proofPics).equalToWhenPresent(row::getProofPics)
                .set(handleNote).equalToWhenPresent(row::getHandleNote)
                .set(handleMan).equalToWhenPresent(row::getHandleMan)
                .set(receiveMan).equalToWhenPresent(row::getReceiveMan)
                .set(receiveTime).equalToWhenPresent(row::getReceiveTime)
                .set(receiveNote).equalToWhenPresent(row::getReceiveNote);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(OmsOrderReturnApply row) {
        return update(c ->
            c.set(orderId).equalTo(row::getOrderId)
            .set(companyAddressId).equalTo(row::getCompanyAddressId)
            .set(productId).equalTo(row::getProductId)
            .set(orderSn).equalTo(row::getOrderSn)
            .set(createTime).equalTo(row::getCreateTime)
            .set(memberUsername).equalTo(row::getMemberUsername)
            .set(returnAmount).equalTo(row::getReturnAmount)
            .set(returnName).equalTo(row::getReturnName)
            .set(returnPhone).equalTo(row::getReturnPhone)
            .set(status).equalTo(row::getStatus)
            .set(handleTime).equalTo(row::getHandleTime)
            .set(productPic).equalTo(row::getProductPic)
            .set(productName).equalTo(row::getProductName)
            .set(productBrand).equalTo(row::getProductBrand)
            .set(productAttr).equalTo(row::getProductAttr)
            .set(productCount).equalTo(row::getProductCount)
            .set(productPrice).equalTo(row::getProductPrice)
            .set(productRealPrice).equalTo(row::getProductRealPrice)
            .set(reason).equalTo(row::getReason)
            .set(description).equalTo(row::getDescription)
            .set(proofPics).equalTo(row::getProofPics)
            .set(handleNote).equalTo(row::getHandleNote)
            .set(handleMan).equalTo(row::getHandleMan)
            .set(receiveMan).equalTo(row::getReceiveMan)
            .set(receiveTime).equalTo(row::getReceiveTime)
            .set(receiveNote).equalTo(row::getReceiveNote)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(OmsOrderReturnApply row) {
        return update(c ->
            c.set(orderId).equalToWhenPresent(row::getOrderId)
            .set(companyAddressId).equalToWhenPresent(row::getCompanyAddressId)
            .set(productId).equalToWhenPresent(row::getProductId)
            .set(orderSn).equalToWhenPresent(row::getOrderSn)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(memberUsername).equalToWhenPresent(row::getMemberUsername)
            .set(returnAmount).equalToWhenPresent(row::getReturnAmount)
            .set(returnName).equalToWhenPresent(row::getReturnName)
            .set(returnPhone).equalToWhenPresent(row::getReturnPhone)
            .set(status).equalToWhenPresent(row::getStatus)
            .set(handleTime).equalToWhenPresent(row::getHandleTime)
            .set(productPic).equalToWhenPresent(row::getProductPic)
            .set(productName).equalToWhenPresent(row::getProductName)
            .set(productBrand).equalToWhenPresent(row::getProductBrand)
            .set(productAttr).equalToWhenPresent(row::getProductAttr)
            .set(productCount).equalToWhenPresent(row::getProductCount)
            .set(productPrice).equalToWhenPresent(row::getProductPrice)
            .set(productRealPrice).equalToWhenPresent(row::getProductRealPrice)
            .set(reason).equalToWhenPresent(row::getReason)
            .set(description).equalToWhenPresent(row::getDescription)
            .set(proofPics).equalToWhenPresent(row::getProofPics)
            .set(handleNote).equalToWhenPresent(row::getHandleNote)
            .set(handleMan).equalToWhenPresent(row::getHandleMan)
            .set(receiveMan).equalToWhenPresent(row::getReceiveMan)
            .set(receiveTime).equalToWhenPresent(row::getReceiveTime)
            .set(receiveNote).equalToWhenPresent(row::getReceiveNote)
            .where(id, isEqualTo(row::getId))
        );
    }
}