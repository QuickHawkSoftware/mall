package com.macro.mall.mapper;

import static com.macro.mall.mapper.CmsSubjectCommentDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.CmsSubjectComment;
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
public interface CmsSubjectCommentMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<CmsSubjectComment>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, subjectId, memberNickName, memberIcon, content, createTime, showStatus);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CmsSubjectCommentResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="subject_id", property="subjectId", jdbcType=JdbcType.BIGINT),
        @Result(column="member_nick_name", property="memberNickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="member_icon", property="memberIcon", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="show_status", property="showStatus", jdbcType=JdbcType.INTEGER)
    })
    List<CmsSubjectComment> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CmsSubjectCommentResult")
    Optional<CmsSubjectComment> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cmsSubjectComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cmsSubjectComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(CmsSubjectComment row) {
        return MyBatis3Utils.insert(this::insert, row, cmsSubjectComment, c ->
            c.map(id).toProperty("id")
            .map(subjectId).toProperty("subjectId")
            .map(memberNickName).toProperty("memberNickName")
            .map(memberIcon).toProperty("memberIcon")
            .map(content).toProperty("content")
            .map(createTime).toProperty("createTime")
            .map(showStatus).toProperty("showStatus")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<CmsSubjectComment> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, cmsSubjectComment, c ->
            c.map(id).toProperty("id")
            .map(subjectId).toProperty("subjectId")
            .map(memberNickName).toProperty("memberNickName")
            .map(memberIcon).toProperty("memberIcon")
            .map(content).toProperty("content")
            .map(createTime).toProperty("createTime")
            .map(showStatus).toProperty("showStatus")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(CmsSubjectComment row) {
        return MyBatis3Utils.insert(this::insert, row, cmsSubjectComment, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(subjectId).toPropertyWhenPresent("subjectId", row::getSubjectId)
            .map(memberNickName).toPropertyWhenPresent("memberNickName", row::getMemberNickName)
            .map(memberIcon).toPropertyWhenPresent("memberIcon", row::getMemberIcon)
            .map(content).toPropertyWhenPresent("content", row::getContent)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(showStatus).toPropertyWhenPresent("showStatus", row::getShowStatus)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<CmsSubjectComment> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, cmsSubjectComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<CmsSubjectComment> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, cmsSubjectComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<CmsSubjectComment> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, cmsSubjectComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<CmsSubjectComment> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cmsSubjectComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(CmsSubjectComment row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(subjectId).equalTo(row::getSubjectId)
                .set(memberNickName).equalTo(row::getMemberNickName)
                .set(memberIcon).equalTo(row::getMemberIcon)
                .set(content).equalTo(row::getContent)
                .set(createTime).equalTo(row::getCreateTime)
                .set(showStatus).equalTo(row::getShowStatus);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CmsSubjectComment row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(subjectId).equalToWhenPresent(row::getSubjectId)
                .set(memberNickName).equalToWhenPresent(row::getMemberNickName)
                .set(memberIcon).equalToWhenPresent(row::getMemberIcon)
                .set(content).equalToWhenPresent(row::getContent)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(showStatus).equalToWhenPresent(row::getShowStatus);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(CmsSubjectComment row) {
        return update(c ->
            c.set(subjectId).equalTo(row::getSubjectId)
            .set(memberNickName).equalTo(row::getMemberNickName)
            .set(memberIcon).equalTo(row::getMemberIcon)
            .set(content).equalTo(row::getContent)
            .set(createTime).equalTo(row::getCreateTime)
            .set(showStatus).equalTo(row::getShowStatus)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(CmsSubjectComment row) {
        return update(c ->
            c.set(subjectId).equalToWhenPresent(row::getSubjectId)
            .set(memberNickName).equalToWhenPresent(row::getMemberNickName)
            .set(memberIcon).equalToWhenPresent(row::getMemberIcon)
            .set(content).equalToWhenPresent(row::getContent)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(showStatus).equalToWhenPresent(row::getShowStatus)
            .where(id, isEqualTo(row::getId))
        );
    }
}