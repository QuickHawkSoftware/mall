package com.macro.mall.mapper;

import static com.macro.mall.mapper.CmsTopicCommentDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.CmsTopicComment;
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
public interface CmsTopicCommentMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<CmsTopicComment>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, memberNickName, topicId, memberIcon, content, createTime, showStatus);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CmsTopicCommentResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="member_nick_name", property="memberNickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="topic_id", property="topicId", jdbcType=JdbcType.BIGINT),
        @Result(column="member_icon", property="memberIcon", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="show_status", property="showStatus", jdbcType=JdbcType.INTEGER)
    })
    List<CmsTopicComment> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CmsTopicCommentResult")
    Optional<CmsTopicComment> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cmsTopicComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cmsTopicComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(CmsTopicComment row) {
        return MyBatis3Utils.insert(this::insert, row, cmsTopicComment, c ->
            c.map(id).toProperty("id")
            .map(memberNickName).toProperty("memberNickName")
            .map(topicId).toProperty("topicId")
            .map(memberIcon).toProperty("memberIcon")
            .map(content).toProperty("content")
            .map(createTime).toProperty("createTime")
            .map(showStatus).toProperty("showStatus")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<CmsTopicComment> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, cmsTopicComment, c ->
            c.map(id).toProperty("id")
            .map(memberNickName).toProperty("memberNickName")
            .map(topicId).toProperty("topicId")
            .map(memberIcon).toProperty("memberIcon")
            .map(content).toProperty("content")
            .map(createTime).toProperty("createTime")
            .map(showStatus).toProperty("showStatus")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(CmsTopicComment row) {
        return MyBatis3Utils.insert(this::insert, row, cmsTopicComment, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(memberNickName).toPropertyWhenPresent("memberNickName", row::getMemberNickName)
            .map(topicId).toPropertyWhenPresent("topicId", row::getTopicId)
            .map(memberIcon).toPropertyWhenPresent("memberIcon", row::getMemberIcon)
            .map(content).toPropertyWhenPresent("content", row::getContent)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(showStatus).toPropertyWhenPresent("showStatus", row::getShowStatus)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<CmsTopicComment> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, cmsTopicComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<CmsTopicComment> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, cmsTopicComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<CmsTopicComment> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, cmsTopicComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<CmsTopicComment> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cmsTopicComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(CmsTopicComment row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(memberNickName).equalTo(row::getMemberNickName)
                .set(topicId).equalTo(row::getTopicId)
                .set(memberIcon).equalTo(row::getMemberIcon)
                .set(content).equalTo(row::getContent)
                .set(createTime).equalTo(row::getCreateTime)
                .set(showStatus).equalTo(row::getShowStatus);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CmsTopicComment row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(memberNickName).equalToWhenPresent(row::getMemberNickName)
                .set(topicId).equalToWhenPresent(row::getTopicId)
                .set(memberIcon).equalToWhenPresent(row::getMemberIcon)
                .set(content).equalToWhenPresent(row::getContent)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(showStatus).equalToWhenPresent(row::getShowStatus);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(CmsTopicComment row) {
        return update(c ->
            c.set(memberNickName).equalTo(row::getMemberNickName)
            .set(topicId).equalTo(row::getTopicId)
            .set(memberIcon).equalTo(row::getMemberIcon)
            .set(content).equalTo(row::getContent)
            .set(createTime).equalTo(row::getCreateTime)
            .set(showStatus).equalTo(row::getShowStatus)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(CmsTopicComment row) {
        return update(c ->
            c.set(memberNickName).equalToWhenPresent(row::getMemberNickName)
            .set(topicId).equalToWhenPresent(row::getTopicId)
            .set(memberIcon).equalToWhenPresent(row::getMemberIcon)
            .set(content).equalToWhenPresent(row::getContent)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(showStatus).equalToWhenPresent(row::getShowStatus)
            .where(id, isEqualTo(row::getId))
        );
    }
}