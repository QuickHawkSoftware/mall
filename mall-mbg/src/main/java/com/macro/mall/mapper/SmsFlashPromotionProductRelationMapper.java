package com.macro.mall.mapper;

import static com.macro.mall.mapper.SmsFlashPromotionProductRelationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.SmsFlashPromotionProductRelation;
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
public interface SmsFlashPromotionProductRelationMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<SmsFlashPromotionProductRelation>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, flashPromotionId, flashPromotionSessionId, productId, flashPromotionPrice, flashPromotionCount, flashPromotionLimit, sort);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SmsFlashPromotionProductRelationResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="flash_promotion_id", property="flashPromotionId", jdbcType=JdbcType.BIGINT),
        @Result(column="flash_promotion_session_id", property="flashPromotionSessionId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.BIGINT),
        @Result(column="flash_promotion_price", property="flashPromotionPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="flash_promotion_count", property="flashPromotionCount", jdbcType=JdbcType.INTEGER),
        @Result(column="flash_promotion_limit", property="flashPromotionLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER)
    })
    List<SmsFlashPromotionProductRelation> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SmsFlashPromotionProductRelationResult")
    Optional<SmsFlashPromotionProductRelation> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, smsFlashPromotionProductRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, smsFlashPromotionProductRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SmsFlashPromotionProductRelation row) {
        return MyBatis3Utils.insert(this::insert, row, smsFlashPromotionProductRelation, c ->
            c.map(id).toProperty("id")
            .map(flashPromotionId).toProperty("flashPromotionId")
            .map(flashPromotionSessionId).toProperty("flashPromotionSessionId")
            .map(productId).toProperty("productId")
            .map(flashPromotionPrice).toProperty("flashPromotionPrice")
            .map(flashPromotionCount).toProperty("flashPromotionCount")
            .map(flashPromotionLimit).toProperty("flashPromotionLimit")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<SmsFlashPromotionProductRelation> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, smsFlashPromotionProductRelation, c ->
            c.map(id).toProperty("id")
            .map(flashPromotionId).toProperty("flashPromotionId")
            .map(flashPromotionSessionId).toProperty("flashPromotionSessionId")
            .map(productId).toProperty("productId")
            .map(flashPromotionPrice).toProperty("flashPromotionPrice")
            .map(flashPromotionCount).toProperty("flashPromotionCount")
            .map(flashPromotionLimit).toProperty("flashPromotionLimit")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(SmsFlashPromotionProductRelation row) {
        return MyBatis3Utils.insert(this::insert, row, smsFlashPromotionProductRelation, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(flashPromotionId).toPropertyWhenPresent("flashPromotionId", row::getFlashPromotionId)
            .map(flashPromotionSessionId).toPropertyWhenPresent("flashPromotionSessionId", row::getFlashPromotionSessionId)
            .map(productId).toPropertyWhenPresent("productId", row::getProductId)
            .map(flashPromotionPrice).toPropertyWhenPresent("flashPromotionPrice", row::getFlashPromotionPrice)
            .map(flashPromotionCount).toPropertyWhenPresent("flashPromotionCount", row::getFlashPromotionCount)
            .map(flashPromotionLimit).toPropertyWhenPresent("flashPromotionLimit", row::getFlashPromotionLimit)
            .map(sort).toPropertyWhenPresent("sort", row::getSort)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SmsFlashPromotionProductRelation> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, smsFlashPromotionProductRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SmsFlashPromotionProductRelation> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, smsFlashPromotionProductRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SmsFlashPromotionProductRelation> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, smsFlashPromotionProductRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SmsFlashPromotionProductRelation> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, smsFlashPromotionProductRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(SmsFlashPromotionProductRelation row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(flashPromotionId).equalTo(row::getFlashPromotionId)
                .set(flashPromotionSessionId).equalTo(row::getFlashPromotionSessionId)
                .set(productId).equalTo(row::getProductId)
                .set(flashPromotionPrice).equalTo(row::getFlashPromotionPrice)
                .set(flashPromotionCount).equalTo(row::getFlashPromotionCount)
                .set(flashPromotionLimit).equalTo(row::getFlashPromotionLimit)
                .set(sort).equalTo(row::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SmsFlashPromotionProductRelation row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(flashPromotionId).equalToWhenPresent(row::getFlashPromotionId)
                .set(flashPromotionSessionId).equalToWhenPresent(row::getFlashPromotionSessionId)
                .set(productId).equalToWhenPresent(row::getProductId)
                .set(flashPromotionPrice).equalToWhenPresent(row::getFlashPromotionPrice)
                .set(flashPromotionCount).equalToWhenPresent(row::getFlashPromotionCount)
                .set(flashPromotionLimit).equalToWhenPresent(row::getFlashPromotionLimit)
                .set(sort).equalToWhenPresent(row::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(SmsFlashPromotionProductRelation row) {
        return update(c ->
            c.set(flashPromotionId).equalTo(row::getFlashPromotionId)
            .set(flashPromotionSessionId).equalTo(row::getFlashPromotionSessionId)
            .set(productId).equalTo(row::getProductId)
            .set(flashPromotionPrice).equalTo(row::getFlashPromotionPrice)
            .set(flashPromotionCount).equalTo(row::getFlashPromotionCount)
            .set(flashPromotionLimit).equalTo(row::getFlashPromotionLimit)
            .set(sort).equalTo(row::getSort)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(SmsFlashPromotionProductRelation row) {
        return update(c ->
            c.set(flashPromotionId).equalToWhenPresent(row::getFlashPromotionId)
            .set(flashPromotionSessionId).equalToWhenPresent(row::getFlashPromotionSessionId)
            .set(productId).equalToWhenPresent(row::getProductId)
            .set(flashPromotionPrice).equalToWhenPresent(row::getFlashPromotionPrice)
            .set(flashPromotionCount).equalToWhenPresent(row::getFlashPromotionCount)
            .set(flashPromotionLimit).equalToWhenPresent(row::getFlashPromotionLimit)
            .set(sort).equalToWhenPresent(row::getSort)
            .where(id, isEqualTo(row::getId))
        );
    }
}