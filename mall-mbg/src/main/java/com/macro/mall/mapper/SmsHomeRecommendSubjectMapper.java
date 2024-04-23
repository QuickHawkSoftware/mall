package com.macro.mall.mapper;

import static com.macro.mall.mapper.SmsHomeRecommendSubjectDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.SmsHomeRecommendSubject;
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
public interface SmsHomeRecommendSubjectMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<SmsHomeRecommendSubject>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, subjectId, subjectName, recommendStatus, sort);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SmsHomeRecommendSubjectResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="subject_id", property="subjectId", jdbcType=JdbcType.BIGINT),
        @Result(column="subject_name", property="subjectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="recommend_status", property="recommendStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER)
    })
    List<SmsHomeRecommendSubject> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SmsHomeRecommendSubjectResult")
    Optional<SmsHomeRecommendSubject> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, smsHomeRecommendSubject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, smsHomeRecommendSubject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SmsHomeRecommendSubject row) {
        return MyBatis3Utils.insert(this::insert, row, smsHomeRecommendSubject, c ->
            c.map(id).toProperty("id")
            .map(subjectId).toProperty("subjectId")
            .map(subjectName).toProperty("subjectName")
            .map(recommendStatus).toProperty("recommendStatus")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<SmsHomeRecommendSubject> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, smsHomeRecommendSubject, c ->
            c.map(id).toProperty("id")
            .map(subjectId).toProperty("subjectId")
            .map(subjectName).toProperty("subjectName")
            .map(recommendStatus).toProperty("recommendStatus")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(SmsHomeRecommendSubject row) {
        return MyBatis3Utils.insert(this::insert, row, smsHomeRecommendSubject, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(subjectId).toPropertyWhenPresent("subjectId", row::getSubjectId)
            .map(subjectName).toPropertyWhenPresent("subjectName", row::getSubjectName)
            .map(recommendStatus).toPropertyWhenPresent("recommendStatus", row::getRecommendStatus)
            .map(sort).toPropertyWhenPresent("sort", row::getSort)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SmsHomeRecommendSubject> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, smsHomeRecommendSubject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SmsHomeRecommendSubject> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, smsHomeRecommendSubject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SmsHomeRecommendSubject> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, smsHomeRecommendSubject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SmsHomeRecommendSubject> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, smsHomeRecommendSubject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(SmsHomeRecommendSubject row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(subjectId).equalTo(row::getSubjectId)
                .set(subjectName).equalTo(row::getSubjectName)
                .set(recommendStatus).equalTo(row::getRecommendStatus)
                .set(sort).equalTo(row::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SmsHomeRecommendSubject row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(subjectId).equalToWhenPresent(row::getSubjectId)
                .set(subjectName).equalToWhenPresent(row::getSubjectName)
                .set(recommendStatus).equalToWhenPresent(row::getRecommendStatus)
                .set(sort).equalToWhenPresent(row::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(SmsHomeRecommendSubject row) {
        return update(c ->
            c.set(subjectId).equalTo(row::getSubjectId)
            .set(subjectName).equalTo(row::getSubjectName)
            .set(recommendStatus).equalTo(row::getRecommendStatus)
            .set(sort).equalTo(row::getSort)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(SmsHomeRecommendSubject row) {
        return update(c ->
            c.set(subjectId).equalToWhenPresent(row::getSubjectId)
            .set(subjectName).equalToWhenPresent(row::getSubjectName)
            .set(recommendStatus).equalToWhenPresent(row::getRecommendStatus)
            .set(sort).equalToWhenPresent(row::getSort)
            .where(id, isEqualTo(row::getId))
        );
    }
}