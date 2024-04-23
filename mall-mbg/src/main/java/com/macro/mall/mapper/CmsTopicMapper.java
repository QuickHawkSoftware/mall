package com.macro.mall.mapper;

import static com.macro.mall.mapper.CmsTopicDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.CmsTopic;
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
public interface CmsTopicMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<CmsTopic>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, categoryId, name, createTime, startTime, endTime, attendCount, attentionCount, readCount, awardName, attendType, content);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CmsTopicResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="category_id", property="categoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="attend_count", property="attendCount", jdbcType=JdbcType.INTEGER),
        @Result(column="attention_count", property="attentionCount", jdbcType=JdbcType.INTEGER),
        @Result(column="read_count", property="readCount", jdbcType=JdbcType.INTEGER),
        @Result(column="award_name", property="awardName", jdbcType=JdbcType.VARCHAR),
        @Result(column="attend_type", property="attendType", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<CmsTopic> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CmsTopicResult")
    Optional<CmsTopic> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cmsTopic, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cmsTopic, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(CmsTopic row) {
        return MyBatis3Utils.insert(this::insert, row, cmsTopic, c ->
            c.map(id).toProperty("id")
            .map(categoryId).toProperty("categoryId")
            .map(name).toProperty("name")
            .map(createTime).toProperty("createTime")
            .map(startTime).toProperty("startTime")
            .map(endTime).toProperty("endTime")
            .map(attendCount).toProperty("attendCount")
            .map(attentionCount).toProperty("attentionCount")
            .map(readCount).toProperty("readCount")
            .map(awardName).toProperty("awardName")
            .map(attendType).toProperty("attendType")
            .map(content).toProperty("content")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<CmsTopic> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, cmsTopic, c ->
            c.map(id).toProperty("id")
            .map(categoryId).toProperty("categoryId")
            .map(name).toProperty("name")
            .map(createTime).toProperty("createTime")
            .map(startTime).toProperty("startTime")
            .map(endTime).toProperty("endTime")
            .map(attendCount).toProperty("attendCount")
            .map(attentionCount).toProperty("attentionCount")
            .map(readCount).toProperty("readCount")
            .map(awardName).toProperty("awardName")
            .map(attendType).toProperty("attendType")
            .map(content).toProperty("content")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(CmsTopic row) {
        return MyBatis3Utils.insert(this::insert, row, cmsTopic, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(categoryId).toPropertyWhenPresent("categoryId", row::getCategoryId)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(startTime).toPropertyWhenPresent("startTime", row::getStartTime)
            .map(endTime).toPropertyWhenPresent("endTime", row::getEndTime)
            .map(attendCount).toPropertyWhenPresent("attendCount", row::getAttendCount)
            .map(attentionCount).toPropertyWhenPresent("attentionCount", row::getAttentionCount)
            .map(readCount).toPropertyWhenPresent("readCount", row::getReadCount)
            .map(awardName).toPropertyWhenPresent("awardName", row::getAwardName)
            .map(attendType).toPropertyWhenPresent("attendType", row::getAttendType)
            .map(content).toPropertyWhenPresent("content", row::getContent)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<CmsTopic> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, cmsTopic, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<CmsTopic> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, cmsTopic, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<CmsTopic> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, cmsTopic, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<CmsTopic> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cmsTopic, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(CmsTopic row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(categoryId).equalTo(row::getCategoryId)
                .set(name).equalTo(row::getName)
                .set(createTime).equalTo(row::getCreateTime)
                .set(startTime).equalTo(row::getStartTime)
                .set(endTime).equalTo(row::getEndTime)
                .set(attendCount).equalTo(row::getAttendCount)
                .set(attentionCount).equalTo(row::getAttentionCount)
                .set(readCount).equalTo(row::getReadCount)
                .set(awardName).equalTo(row::getAwardName)
                .set(attendType).equalTo(row::getAttendType)
                .set(content).equalTo(row::getContent);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CmsTopic row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(categoryId).equalToWhenPresent(row::getCategoryId)
                .set(name).equalToWhenPresent(row::getName)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(startTime).equalToWhenPresent(row::getStartTime)
                .set(endTime).equalToWhenPresent(row::getEndTime)
                .set(attendCount).equalToWhenPresent(row::getAttendCount)
                .set(attentionCount).equalToWhenPresent(row::getAttentionCount)
                .set(readCount).equalToWhenPresent(row::getReadCount)
                .set(awardName).equalToWhenPresent(row::getAwardName)
                .set(attendType).equalToWhenPresent(row::getAttendType)
                .set(content).equalToWhenPresent(row::getContent);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(CmsTopic row) {
        return update(c ->
            c.set(categoryId).equalTo(row::getCategoryId)
            .set(name).equalTo(row::getName)
            .set(createTime).equalTo(row::getCreateTime)
            .set(startTime).equalTo(row::getStartTime)
            .set(endTime).equalTo(row::getEndTime)
            .set(attendCount).equalTo(row::getAttendCount)
            .set(attentionCount).equalTo(row::getAttentionCount)
            .set(readCount).equalTo(row::getReadCount)
            .set(awardName).equalTo(row::getAwardName)
            .set(attendType).equalTo(row::getAttendType)
            .set(content).equalTo(row::getContent)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(CmsTopic row) {
        return update(c ->
            c.set(categoryId).equalToWhenPresent(row::getCategoryId)
            .set(name).equalToWhenPresent(row::getName)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(startTime).equalToWhenPresent(row::getStartTime)
            .set(endTime).equalToWhenPresent(row::getEndTime)
            .set(attendCount).equalToWhenPresent(row::getAttendCount)
            .set(attentionCount).equalToWhenPresent(row::getAttentionCount)
            .set(readCount).equalToWhenPresent(row::getReadCount)
            .set(awardName).equalToWhenPresent(row::getAwardName)
            .set(attendType).equalToWhenPresent(row::getAttendType)
            .set(content).equalToWhenPresent(row::getContent)
            .where(id, isEqualTo(row::getId))
        );
    }
}