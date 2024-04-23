package com.macro.mall.mapper;

import static com.macro.mall.mapper.OmsOrderDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.OmsOrder;
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
public interface OmsOrderMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<OmsOrder>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, memberId, couponId, orderSn, createTime, memberUsername, totalAmount, payAmount, freightAmount, promotionAmount, integrationAmount, couponAmount, discountAmount, payType, sourceType, status, orderType, deliveryCompany, deliverySn, autoConfirmDay, integration, growth, promotionInfo, billType, billHeader, billContent, billReceiverPhone, billReceiverEmail, receiverName, receiverPhone, receiverPostCode, receiverProvince, receiverCity, receiverRegion, receiverDetailAddress, note, confirmStatus, deleteStatus, useIntegration, paymentTime, deliveryTime, receiveTime, commentTime, modifyTime);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OmsOrderResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.BIGINT),
        @Result(column="coupon_id", property="couponId", jdbcType=JdbcType.BIGINT),
        @Result(column="order_sn", property="orderSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="member_username", property="memberUsername", jdbcType=JdbcType.VARCHAR),
        @Result(column="total_amount", property="totalAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="pay_amount", property="payAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="freight_amount", property="freightAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="promotion_amount", property="promotionAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="integration_amount", property="integrationAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="coupon_amount", property="couponAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="discount_amount", property="discountAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="pay_type", property="payType", jdbcType=JdbcType.INTEGER),
        @Result(column="source_type", property="sourceType", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="order_type", property="orderType", jdbcType=JdbcType.INTEGER),
        @Result(column="delivery_company", property="deliveryCompany", jdbcType=JdbcType.VARCHAR),
        @Result(column="delivery_sn", property="deliverySn", jdbcType=JdbcType.VARCHAR),
        @Result(column="auto_confirm_day", property="autoConfirmDay", jdbcType=JdbcType.INTEGER),
        @Result(column="integration", property="integration", jdbcType=JdbcType.INTEGER),
        @Result(column="growth", property="growth", jdbcType=JdbcType.INTEGER),
        @Result(column="promotion_info", property="promotionInfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="bill_type", property="billType", jdbcType=JdbcType.INTEGER),
        @Result(column="bill_header", property="billHeader", jdbcType=JdbcType.VARCHAR),
        @Result(column="bill_content", property="billContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="bill_receiver_phone", property="billReceiverPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="bill_receiver_email", property="billReceiverEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiver_name", property="receiverName", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiver_phone", property="receiverPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiver_post_code", property="receiverPostCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiver_province", property="receiverProvince", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiver_city", property="receiverCity", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiver_region", property="receiverRegion", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiver_detail_address", property="receiverDetailAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="confirm_status", property="confirmStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="delete_status", property="deleteStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="use_integration", property="useIntegration", jdbcType=JdbcType.INTEGER),
        @Result(column="payment_time", property="paymentTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delivery_time", property="deliveryTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="receive_time", property="receiveTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="comment_time", property="commentTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<OmsOrder> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OmsOrderResult")
    Optional<OmsOrder> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, omsOrder, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, omsOrder, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(OmsOrder row) {
        return MyBatis3Utils.insert(this::insert, row, omsOrder, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(couponId).toProperty("couponId")
            .map(orderSn).toProperty("orderSn")
            .map(createTime).toProperty("createTime")
            .map(memberUsername).toProperty("memberUsername")
            .map(totalAmount).toProperty("totalAmount")
            .map(payAmount).toProperty("payAmount")
            .map(freightAmount).toProperty("freightAmount")
            .map(promotionAmount).toProperty("promotionAmount")
            .map(integrationAmount).toProperty("integrationAmount")
            .map(couponAmount).toProperty("couponAmount")
            .map(discountAmount).toProperty("discountAmount")
            .map(payType).toProperty("payType")
            .map(sourceType).toProperty("sourceType")
            .map(status).toProperty("status")
            .map(orderType).toProperty("orderType")
            .map(deliveryCompany).toProperty("deliveryCompany")
            .map(deliverySn).toProperty("deliverySn")
            .map(autoConfirmDay).toProperty("autoConfirmDay")
            .map(integration).toProperty("integration")
            .map(growth).toProperty("growth")
            .map(promotionInfo).toProperty("promotionInfo")
            .map(billType).toProperty("billType")
            .map(billHeader).toProperty("billHeader")
            .map(billContent).toProperty("billContent")
            .map(billReceiverPhone).toProperty("billReceiverPhone")
            .map(billReceiverEmail).toProperty("billReceiverEmail")
            .map(receiverName).toProperty("receiverName")
            .map(receiverPhone).toProperty("receiverPhone")
            .map(receiverPostCode).toProperty("receiverPostCode")
            .map(receiverProvince).toProperty("receiverProvince")
            .map(receiverCity).toProperty("receiverCity")
            .map(receiverRegion).toProperty("receiverRegion")
            .map(receiverDetailAddress).toProperty("receiverDetailAddress")
            .map(note).toProperty("note")
            .map(confirmStatus).toProperty("confirmStatus")
            .map(deleteStatus).toProperty("deleteStatus")
            .map(useIntegration).toProperty("useIntegration")
            .map(paymentTime).toProperty("paymentTime")
            .map(deliveryTime).toProperty("deliveryTime")
            .map(receiveTime).toProperty("receiveTime")
            .map(commentTime).toProperty("commentTime")
            .map(modifyTime).toProperty("modifyTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<OmsOrder> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, omsOrder, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(couponId).toProperty("couponId")
            .map(orderSn).toProperty("orderSn")
            .map(createTime).toProperty("createTime")
            .map(memberUsername).toProperty("memberUsername")
            .map(totalAmount).toProperty("totalAmount")
            .map(payAmount).toProperty("payAmount")
            .map(freightAmount).toProperty("freightAmount")
            .map(promotionAmount).toProperty("promotionAmount")
            .map(integrationAmount).toProperty("integrationAmount")
            .map(couponAmount).toProperty("couponAmount")
            .map(discountAmount).toProperty("discountAmount")
            .map(payType).toProperty("payType")
            .map(sourceType).toProperty("sourceType")
            .map(status).toProperty("status")
            .map(orderType).toProperty("orderType")
            .map(deliveryCompany).toProperty("deliveryCompany")
            .map(deliverySn).toProperty("deliverySn")
            .map(autoConfirmDay).toProperty("autoConfirmDay")
            .map(integration).toProperty("integration")
            .map(growth).toProperty("growth")
            .map(promotionInfo).toProperty("promotionInfo")
            .map(billType).toProperty("billType")
            .map(billHeader).toProperty("billHeader")
            .map(billContent).toProperty("billContent")
            .map(billReceiverPhone).toProperty("billReceiverPhone")
            .map(billReceiverEmail).toProperty("billReceiverEmail")
            .map(receiverName).toProperty("receiverName")
            .map(receiverPhone).toProperty("receiverPhone")
            .map(receiverPostCode).toProperty("receiverPostCode")
            .map(receiverProvince).toProperty("receiverProvince")
            .map(receiverCity).toProperty("receiverCity")
            .map(receiverRegion).toProperty("receiverRegion")
            .map(receiverDetailAddress).toProperty("receiverDetailAddress")
            .map(note).toProperty("note")
            .map(confirmStatus).toProperty("confirmStatus")
            .map(deleteStatus).toProperty("deleteStatus")
            .map(useIntegration).toProperty("useIntegration")
            .map(paymentTime).toProperty("paymentTime")
            .map(deliveryTime).toProperty("deliveryTime")
            .map(receiveTime).toProperty("receiveTime")
            .map(commentTime).toProperty("commentTime")
            .map(modifyTime).toProperty("modifyTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(OmsOrder row) {
        return MyBatis3Utils.insert(this::insert, row, omsOrder, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(memberId).toPropertyWhenPresent("memberId", row::getMemberId)
            .map(couponId).toPropertyWhenPresent("couponId", row::getCouponId)
            .map(orderSn).toPropertyWhenPresent("orderSn", row::getOrderSn)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(memberUsername).toPropertyWhenPresent("memberUsername", row::getMemberUsername)
            .map(totalAmount).toPropertyWhenPresent("totalAmount", row::getTotalAmount)
            .map(payAmount).toPropertyWhenPresent("payAmount", row::getPayAmount)
            .map(freightAmount).toPropertyWhenPresent("freightAmount", row::getFreightAmount)
            .map(promotionAmount).toPropertyWhenPresent("promotionAmount", row::getPromotionAmount)
            .map(integrationAmount).toPropertyWhenPresent("integrationAmount", row::getIntegrationAmount)
            .map(couponAmount).toPropertyWhenPresent("couponAmount", row::getCouponAmount)
            .map(discountAmount).toPropertyWhenPresent("discountAmount", row::getDiscountAmount)
            .map(payType).toPropertyWhenPresent("payType", row::getPayType)
            .map(sourceType).toPropertyWhenPresent("sourceType", row::getSourceType)
            .map(status).toPropertyWhenPresent("status", row::getStatus)
            .map(orderType).toPropertyWhenPresent("orderType", row::getOrderType)
            .map(deliveryCompany).toPropertyWhenPresent("deliveryCompany", row::getDeliveryCompany)
            .map(deliverySn).toPropertyWhenPresent("deliverySn", row::getDeliverySn)
            .map(autoConfirmDay).toPropertyWhenPresent("autoConfirmDay", row::getAutoConfirmDay)
            .map(integration).toPropertyWhenPresent("integration", row::getIntegration)
            .map(growth).toPropertyWhenPresent("growth", row::getGrowth)
            .map(promotionInfo).toPropertyWhenPresent("promotionInfo", row::getPromotionInfo)
            .map(billType).toPropertyWhenPresent("billType", row::getBillType)
            .map(billHeader).toPropertyWhenPresent("billHeader", row::getBillHeader)
            .map(billContent).toPropertyWhenPresent("billContent", row::getBillContent)
            .map(billReceiverPhone).toPropertyWhenPresent("billReceiverPhone", row::getBillReceiverPhone)
            .map(billReceiverEmail).toPropertyWhenPresent("billReceiverEmail", row::getBillReceiverEmail)
            .map(receiverName).toPropertyWhenPresent("receiverName", row::getReceiverName)
            .map(receiverPhone).toPropertyWhenPresent("receiverPhone", row::getReceiverPhone)
            .map(receiverPostCode).toPropertyWhenPresent("receiverPostCode", row::getReceiverPostCode)
            .map(receiverProvince).toPropertyWhenPresent("receiverProvince", row::getReceiverProvince)
            .map(receiverCity).toPropertyWhenPresent("receiverCity", row::getReceiverCity)
            .map(receiverRegion).toPropertyWhenPresent("receiverRegion", row::getReceiverRegion)
            .map(receiverDetailAddress).toPropertyWhenPresent("receiverDetailAddress", row::getReceiverDetailAddress)
            .map(note).toPropertyWhenPresent("note", row::getNote)
            .map(confirmStatus).toPropertyWhenPresent("confirmStatus", row::getConfirmStatus)
            .map(deleteStatus).toPropertyWhenPresent("deleteStatus", row::getDeleteStatus)
            .map(useIntegration).toPropertyWhenPresent("useIntegration", row::getUseIntegration)
            .map(paymentTime).toPropertyWhenPresent("paymentTime", row::getPaymentTime)
            .map(deliveryTime).toPropertyWhenPresent("deliveryTime", row::getDeliveryTime)
            .map(receiveTime).toPropertyWhenPresent("receiveTime", row::getReceiveTime)
            .map(commentTime).toPropertyWhenPresent("commentTime", row::getCommentTime)
            .map(modifyTime).toPropertyWhenPresent("modifyTime", row::getModifyTime)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsOrder> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, omsOrder, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsOrder> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, omsOrder, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsOrder> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, omsOrder, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsOrder> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, omsOrder, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(OmsOrder row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(memberId).equalTo(row::getMemberId)
                .set(couponId).equalTo(row::getCouponId)
                .set(orderSn).equalTo(row::getOrderSn)
                .set(createTime).equalTo(row::getCreateTime)
                .set(memberUsername).equalTo(row::getMemberUsername)
                .set(totalAmount).equalTo(row::getTotalAmount)
                .set(payAmount).equalTo(row::getPayAmount)
                .set(freightAmount).equalTo(row::getFreightAmount)
                .set(promotionAmount).equalTo(row::getPromotionAmount)
                .set(integrationAmount).equalTo(row::getIntegrationAmount)
                .set(couponAmount).equalTo(row::getCouponAmount)
                .set(discountAmount).equalTo(row::getDiscountAmount)
                .set(payType).equalTo(row::getPayType)
                .set(sourceType).equalTo(row::getSourceType)
                .set(status).equalTo(row::getStatus)
                .set(orderType).equalTo(row::getOrderType)
                .set(deliveryCompany).equalTo(row::getDeliveryCompany)
                .set(deliverySn).equalTo(row::getDeliverySn)
                .set(autoConfirmDay).equalTo(row::getAutoConfirmDay)
                .set(integration).equalTo(row::getIntegration)
                .set(growth).equalTo(row::getGrowth)
                .set(promotionInfo).equalTo(row::getPromotionInfo)
                .set(billType).equalTo(row::getBillType)
                .set(billHeader).equalTo(row::getBillHeader)
                .set(billContent).equalTo(row::getBillContent)
                .set(billReceiverPhone).equalTo(row::getBillReceiverPhone)
                .set(billReceiverEmail).equalTo(row::getBillReceiverEmail)
                .set(receiverName).equalTo(row::getReceiverName)
                .set(receiverPhone).equalTo(row::getReceiverPhone)
                .set(receiverPostCode).equalTo(row::getReceiverPostCode)
                .set(receiverProvince).equalTo(row::getReceiverProvince)
                .set(receiverCity).equalTo(row::getReceiverCity)
                .set(receiverRegion).equalTo(row::getReceiverRegion)
                .set(receiverDetailAddress).equalTo(row::getReceiverDetailAddress)
                .set(note).equalTo(row::getNote)
                .set(confirmStatus).equalTo(row::getConfirmStatus)
                .set(deleteStatus).equalTo(row::getDeleteStatus)
                .set(useIntegration).equalTo(row::getUseIntegration)
                .set(paymentTime).equalTo(row::getPaymentTime)
                .set(deliveryTime).equalTo(row::getDeliveryTime)
                .set(receiveTime).equalTo(row::getReceiveTime)
                .set(commentTime).equalTo(row::getCommentTime)
                .set(modifyTime).equalTo(row::getModifyTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OmsOrder row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(memberId).equalToWhenPresent(row::getMemberId)
                .set(couponId).equalToWhenPresent(row::getCouponId)
                .set(orderSn).equalToWhenPresent(row::getOrderSn)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(memberUsername).equalToWhenPresent(row::getMemberUsername)
                .set(totalAmount).equalToWhenPresent(row::getTotalAmount)
                .set(payAmount).equalToWhenPresent(row::getPayAmount)
                .set(freightAmount).equalToWhenPresent(row::getFreightAmount)
                .set(promotionAmount).equalToWhenPresent(row::getPromotionAmount)
                .set(integrationAmount).equalToWhenPresent(row::getIntegrationAmount)
                .set(couponAmount).equalToWhenPresent(row::getCouponAmount)
                .set(discountAmount).equalToWhenPresent(row::getDiscountAmount)
                .set(payType).equalToWhenPresent(row::getPayType)
                .set(sourceType).equalToWhenPresent(row::getSourceType)
                .set(status).equalToWhenPresent(row::getStatus)
                .set(orderType).equalToWhenPresent(row::getOrderType)
                .set(deliveryCompany).equalToWhenPresent(row::getDeliveryCompany)
                .set(deliverySn).equalToWhenPresent(row::getDeliverySn)
                .set(autoConfirmDay).equalToWhenPresent(row::getAutoConfirmDay)
                .set(integration).equalToWhenPresent(row::getIntegration)
                .set(growth).equalToWhenPresent(row::getGrowth)
                .set(promotionInfo).equalToWhenPresent(row::getPromotionInfo)
                .set(billType).equalToWhenPresent(row::getBillType)
                .set(billHeader).equalToWhenPresent(row::getBillHeader)
                .set(billContent).equalToWhenPresent(row::getBillContent)
                .set(billReceiverPhone).equalToWhenPresent(row::getBillReceiverPhone)
                .set(billReceiverEmail).equalToWhenPresent(row::getBillReceiverEmail)
                .set(receiverName).equalToWhenPresent(row::getReceiverName)
                .set(receiverPhone).equalToWhenPresent(row::getReceiverPhone)
                .set(receiverPostCode).equalToWhenPresent(row::getReceiverPostCode)
                .set(receiverProvince).equalToWhenPresent(row::getReceiverProvince)
                .set(receiverCity).equalToWhenPresent(row::getReceiverCity)
                .set(receiverRegion).equalToWhenPresent(row::getReceiverRegion)
                .set(receiverDetailAddress).equalToWhenPresent(row::getReceiverDetailAddress)
                .set(note).equalToWhenPresent(row::getNote)
                .set(confirmStatus).equalToWhenPresent(row::getConfirmStatus)
                .set(deleteStatus).equalToWhenPresent(row::getDeleteStatus)
                .set(useIntegration).equalToWhenPresent(row::getUseIntegration)
                .set(paymentTime).equalToWhenPresent(row::getPaymentTime)
                .set(deliveryTime).equalToWhenPresent(row::getDeliveryTime)
                .set(receiveTime).equalToWhenPresent(row::getReceiveTime)
                .set(commentTime).equalToWhenPresent(row::getCommentTime)
                .set(modifyTime).equalToWhenPresent(row::getModifyTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(OmsOrder row) {
        return update(c ->
            c.set(memberId).equalTo(row::getMemberId)
            .set(couponId).equalTo(row::getCouponId)
            .set(orderSn).equalTo(row::getOrderSn)
            .set(createTime).equalTo(row::getCreateTime)
            .set(memberUsername).equalTo(row::getMemberUsername)
            .set(totalAmount).equalTo(row::getTotalAmount)
            .set(payAmount).equalTo(row::getPayAmount)
            .set(freightAmount).equalTo(row::getFreightAmount)
            .set(promotionAmount).equalTo(row::getPromotionAmount)
            .set(integrationAmount).equalTo(row::getIntegrationAmount)
            .set(couponAmount).equalTo(row::getCouponAmount)
            .set(discountAmount).equalTo(row::getDiscountAmount)
            .set(payType).equalTo(row::getPayType)
            .set(sourceType).equalTo(row::getSourceType)
            .set(status).equalTo(row::getStatus)
            .set(orderType).equalTo(row::getOrderType)
            .set(deliveryCompany).equalTo(row::getDeliveryCompany)
            .set(deliverySn).equalTo(row::getDeliverySn)
            .set(autoConfirmDay).equalTo(row::getAutoConfirmDay)
            .set(integration).equalTo(row::getIntegration)
            .set(growth).equalTo(row::getGrowth)
            .set(promotionInfo).equalTo(row::getPromotionInfo)
            .set(billType).equalTo(row::getBillType)
            .set(billHeader).equalTo(row::getBillHeader)
            .set(billContent).equalTo(row::getBillContent)
            .set(billReceiverPhone).equalTo(row::getBillReceiverPhone)
            .set(billReceiverEmail).equalTo(row::getBillReceiverEmail)
            .set(receiverName).equalTo(row::getReceiverName)
            .set(receiverPhone).equalTo(row::getReceiverPhone)
            .set(receiverPostCode).equalTo(row::getReceiverPostCode)
            .set(receiverProvince).equalTo(row::getReceiverProvince)
            .set(receiverCity).equalTo(row::getReceiverCity)
            .set(receiverRegion).equalTo(row::getReceiverRegion)
            .set(receiverDetailAddress).equalTo(row::getReceiverDetailAddress)
            .set(note).equalTo(row::getNote)
            .set(confirmStatus).equalTo(row::getConfirmStatus)
            .set(deleteStatus).equalTo(row::getDeleteStatus)
            .set(useIntegration).equalTo(row::getUseIntegration)
            .set(paymentTime).equalTo(row::getPaymentTime)
            .set(deliveryTime).equalTo(row::getDeliveryTime)
            .set(receiveTime).equalTo(row::getReceiveTime)
            .set(commentTime).equalTo(row::getCommentTime)
            .set(modifyTime).equalTo(row::getModifyTime)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(OmsOrder row) {
        return update(c ->
            c.set(memberId).equalToWhenPresent(row::getMemberId)
            .set(couponId).equalToWhenPresent(row::getCouponId)
            .set(orderSn).equalToWhenPresent(row::getOrderSn)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(memberUsername).equalToWhenPresent(row::getMemberUsername)
            .set(totalAmount).equalToWhenPresent(row::getTotalAmount)
            .set(payAmount).equalToWhenPresent(row::getPayAmount)
            .set(freightAmount).equalToWhenPresent(row::getFreightAmount)
            .set(promotionAmount).equalToWhenPresent(row::getPromotionAmount)
            .set(integrationAmount).equalToWhenPresent(row::getIntegrationAmount)
            .set(couponAmount).equalToWhenPresent(row::getCouponAmount)
            .set(discountAmount).equalToWhenPresent(row::getDiscountAmount)
            .set(payType).equalToWhenPresent(row::getPayType)
            .set(sourceType).equalToWhenPresent(row::getSourceType)
            .set(status).equalToWhenPresent(row::getStatus)
            .set(orderType).equalToWhenPresent(row::getOrderType)
            .set(deliveryCompany).equalToWhenPresent(row::getDeliveryCompany)
            .set(deliverySn).equalToWhenPresent(row::getDeliverySn)
            .set(autoConfirmDay).equalToWhenPresent(row::getAutoConfirmDay)
            .set(integration).equalToWhenPresent(row::getIntegration)
            .set(growth).equalToWhenPresent(row::getGrowth)
            .set(promotionInfo).equalToWhenPresent(row::getPromotionInfo)
            .set(billType).equalToWhenPresent(row::getBillType)
            .set(billHeader).equalToWhenPresent(row::getBillHeader)
            .set(billContent).equalToWhenPresent(row::getBillContent)
            .set(billReceiverPhone).equalToWhenPresent(row::getBillReceiverPhone)
            .set(billReceiverEmail).equalToWhenPresent(row::getBillReceiverEmail)
            .set(receiverName).equalToWhenPresent(row::getReceiverName)
            .set(receiverPhone).equalToWhenPresent(row::getReceiverPhone)
            .set(receiverPostCode).equalToWhenPresent(row::getReceiverPostCode)
            .set(receiverProvince).equalToWhenPresent(row::getReceiverProvince)
            .set(receiverCity).equalToWhenPresent(row::getReceiverCity)
            .set(receiverRegion).equalToWhenPresent(row::getReceiverRegion)
            .set(receiverDetailAddress).equalToWhenPresent(row::getReceiverDetailAddress)
            .set(note).equalToWhenPresent(row::getNote)
            .set(confirmStatus).equalToWhenPresent(row::getConfirmStatus)
            .set(deleteStatus).equalToWhenPresent(row::getDeleteStatus)
            .set(useIntegration).equalToWhenPresent(row::getUseIntegration)
            .set(paymentTime).equalToWhenPresent(row::getPaymentTime)
            .set(deliveryTime).equalToWhenPresent(row::getDeliveryTime)
            .set(receiveTime).equalToWhenPresent(row::getReceiveTime)
            .set(commentTime).equalToWhenPresent(row::getCommentTime)
            .set(modifyTime).equalToWhenPresent(row::getModifyTime)
            .where(id, isEqualTo(row::getId))
        );
    }
}