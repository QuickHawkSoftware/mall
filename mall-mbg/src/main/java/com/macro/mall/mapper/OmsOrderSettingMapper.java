package com.macro.mall.mapper;

import static com.macro.mall.mapper.OmsOrderSettingDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.OmsOrderSetting;
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
public interface OmsOrderSettingMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<OmsOrderSetting>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, flashOrderOvertime, normalOrderOvertime, confirmOvertime, finishOvertime, commentOvertime);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OmsOrderSettingResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="flash_order_overtime", property="flashOrderOvertime", jdbcType=JdbcType.INTEGER),
        @Result(column="normal_order_overtime", property="normalOrderOvertime", jdbcType=JdbcType.INTEGER),
        @Result(column="confirm_overtime", property="confirmOvertime", jdbcType=JdbcType.INTEGER),
        @Result(column="finish_overtime", property="finishOvertime", jdbcType=JdbcType.INTEGER),
        @Result(column="comment_overtime", property="commentOvertime", jdbcType=JdbcType.INTEGER)
    })
    List<OmsOrderSetting> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OmsOrderSettingResult")
    Optional<OmsOrderSetting> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, omsOrderSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, omsOrderSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(OmsOrderSetting row) {
        return MyBatis3Utils.insert(this::insert, row, omsOrderSetting, c ->
            c.map(id).toProperty("id")
            .map(flashOrderOvertime).toProperty("flashOrderOvertime")
            .map(normalOrderOvertime).toProperty("normalOrderOvertime")
            .map(confirmOvertime).toProperty("confirmOvertime")
            .map(finishOvertime).toProperty("finishOvertime")
            .map(commentOvertime).toProperty("commentOvertime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<OmsOrderSetting> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, omsOrderSetting, c ->
            c.map(id).toProperty("id")
            .map(flashOrderOvertime).toProperty("flashOrderOvertime")
            .map(normalOrderOvertime).toProperty("normalOrderOvertime")
            .map(confirmOvertime).toProperty("confirmOvertime")
            .map(finishOvertime).toProperty("finishOvertime")
            .map(commentOvertime).toProperty("commentOvertime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(OmsOrderSetting row) {
        return MyBatis3Utils.insert(this::insert, row, omsOrderSetting, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(flashOrderOvertime).toPropertyWhenPresent("flashOrderOvertime", row::getFlashOrderOvertime)
            .map(normalOrderOvertime).toPropertyWhenPresent("normalOrderOvertime", row::getNormalOrderOvertime)
            .map(confirmOvertime).toPropertyWhenPresent("confirmOvertime", row::getConfirmOvertime)
            .map(finishOvertime).toPropertyWhenPresent("finishOvertime", row::getFinishOvertime)
            .map(commentOvertime).toPropertyWhenPresent("commentOvertime", row::getCommentOvertime)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsOrderSetting> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, omsOrderSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsOrderSetting> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, omsOrderSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsOrderSetting> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, omsOrderSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsOrderSetting> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, omsOrderSetting, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(OmsOrderSetting row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(flashOrderOvertime).equalTo(row::getFlashOrderOvertime)
                .set(normalOrderOvertime).equalTo(row::getNormalOrderOvertime)
                .set(confirmOvertime).equalTo(row::getConfirmOvertime)
                .set(finishOvertime).equalTo(row::getFinishOvertime)
                .set(commentOvertime).equalTo(row::getCommentOvertime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OmsOrderSetting row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(flashOrderOvertime).equalToWhenPresent(row::getFlashOrderOvertime)
                .set(normalOrderOvertime).equalToWhenPresent(row::getNormalOrderOvertime)
                .set(confirmOvertime).equalToWhenPresent(row::getConfirmOvertime)
                .set(finishOvertime).equalToWhenPresent(row::getFinishOvertime)
                .set(commentOvertime).equalToWhenPresent(row::getCommentOvertime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(OmsOrderSetting row) {
        return update(c ->
            c.set(flashOrderOvertime).equalTo(row::getFlashOrderOvertime)
            .set(normalOrderOvertime).equalTo(row::getNormalOrderOvertime)
            .set(confirmOvertime).equalTo(row::getConfirmOvertime)
            .set(finishOvertime).equalTo(row::getFinishOvertime)
            .set(commentOvertime).equalTo(row::getCommentOvertime)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(OmsOrderSetting row) {
        return update(c ->
            c.set(flashOrderOvertime).equalToWhenPresent(row::getFlashOrderOvertime)
            .set(normalOrderOvertime).equalToWhenPresent(row::getNormalOrderOvertime)
            .set(confirmOvertime).equalToWhenPresent(row::getConfirmOvertime)
            .set(finishOvertime).equalToWhenPresent(row::getFinishOvertime)
            .set(commentOvertime).equalToWhenPresent(row::getCommentOvertime)
            .where(id, isEqualTo(row::getId))
        );
    }
}