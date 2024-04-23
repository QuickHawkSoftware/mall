package com.macro.mall.mapper;

import static com.macro.mall.mapper.SmsFlashPromotionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.SmsFlashPromotion;
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
public interface SmsFlashPromotionMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<SmsFlashPromotion>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, title, startDate, endDate, status, createTime);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SmsFlashPromotionResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_date", property="startDate", jdbcType=JdbcType.DATE),
        @Result(column="end_date", property="endDate", jdbcType=JdbcType.DATE),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SmsFlashPromotion> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SmsFlashPromotionResult")
    Optional<SmsFlashPromotion> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, smsFlashPromotion, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, smsFlashPromotion, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SmsFlashPromotion row) {
        return MyBatis3Utils.insert(this::insert, row, smsFlashPromotion, c ->
            c.map(id).toProperty("id")
            .map(title).toProperty("title")
            .map(startDate).toProperty("startDate")
            .map(endDate).toProperty("endDate")
            .map(status).toProperty("status")
            .map(createTime).toProperty("createTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<SmsFlashPromotion> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, smsFlashPromotion, c ->
            c.map(id).toProperty("id")
            .map(title).toProperty("title")
            .map(startDate).toProperty("startDate")
            .map(endDate).toProperty("endDate")
            .map(status).toProperty("status")
            .map(createTime).toProperty("createTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(SmsFlashPromotion row) {
        return MyBatis3Utils.insert(this::insert, row, smsFlashPromotion, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(title).toPropertyWhenPresent("title", row::getTitle)
            .map(startDate).toPropertyWhenPresent("startDate", row::getStartDate)
            .map(endDate).toPropertyWhenPresent("endDate", row::getEndDate)
            .map(status).toPropertyWhenPresent("status", row::getStatus)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SmsFlashPromotion> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, smsFlashPromotion, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SmsFlashPromotion> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, smsFlashPromotion, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SmsFlashPromotion> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, smsFlashPromotion, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SmsFlashPromotion> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, smsFlashPromotion, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(SmsFlashPromotion row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(title).equalTo(row::getTitle)
                .set(startDate).equalTo(row::getStartDate)
                .set(endDate).equalTo(row::getEndDate)
                .set(status).equalTo(row::getStatus)
                .set(createTime).equalTo(row::getCreateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SmsFlashPromotion row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(title).equalToWhenPresent(row::getTitle)
                .set(startDate).equalToWhenPresent(row::getStartDate)
                .set(endDate).equalToWhenPresent(row::getEndDate)
                .set(status).equalToWhenPresent(row::getStatus)
                .set(createTime).equalToWhenPresent(row::getCreateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(SmsFlashPromotion row) {
        return update(c ->
            c.set(title).equalTo(row::getTitle)
            .set(startDate).equalTo(row::getStartDate)
            .set(endDate).equalTo(row::getEndDate)
            .set(status).equalTo(row::getStatus)
            .set(createTime).equalTo(row::getCreateTime)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(SmsFlashPromotion row) {
        return update(c ->
            c.set(title).equalToWhenPresent(row::getTitle)
            .set(startDate).equalToWhenPresent(row::getStartDate)
            .set(endDate).equalToWhenPresent(row::getEndDate)
            .set(status).equalToWhenPresent(row::getStatus)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .where(id, isEqualTo(row::getId))
        );
    }
}