package com.macro.mall.mapper;

import static com.macro.mall.mapper.PmsCommentReplayDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.PmsCommentReplay;
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
public interface PmsCommentReplayMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<PmsCommentReplay>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, commentId, memberNickName, memberIcon, content, createTime, type);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PmsCommentReplayResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="comment_id", property="commentId", jdbcType=JdbcType.BIGINT),
        @Result(column="member_nick_name", property="memberNickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="member_icon", property="memberIcon", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER)
    })
    List<PmsCommentReplay> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PmsCommentReplayResult")
    Optional<PmsCommentReplay> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, pmsCommentReplay, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, pmsCommentReplay, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(PmsCommentReplay row) {
        return MyBatis3Utils.insert(this::insert, row, pmsCommentReplay, c ->
            c.map(id).toProperty("id")
            .map(commentId).toProperty("commentId")
            .map(memberNickName).toProperty("memberNickName")
            .map(memberIcon).toProperty("memberIcon")
            .map(content).toProperty("content")
            .map(createTime).toProperty("createTime")
            .map(type).toProperty("type")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<PmsCommentReplay> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, pmsCommentReplay, c ->
            c.map(id).toProperty("id")
            .map(commentId).toProperty("commentId")
            .map(memberNickName).toProperty("memberNickName")
            .map(memberIcon).toProperty("memberIcon")
            .map(content).toProperty("content")
            .map(createTime).toProperty("createTime")
            .map(type).toProperty("type")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(PmsCommentReplay row) {
        return MyBatis3Utils.insert(this::insert, row, pmsCommentReplay, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(commentId).toPropertyWhenPresent("commentId", row::getCommentId)
            .map(memberNickName).toPropertyWhenPresent("memberNickName", row::getMemberNickName)
            .map(memberIcon).toPropertyWhenPresent("memberIcon", row::getMemberIcon)
            .map(content).toPropertyWhenPresent("content", row::getContent)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(type).toPropertyWhenPresent("type", row::getType)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsCommentReplay> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, pmsCommentReplay, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsCommentReplay> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, pmsCommentReplay, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsCommentReplay> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, pmsCommentReplay, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsCommentReplay> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, pmsCommentReplay, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(PmsCommentReplay row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(commentId).equalTo(row::getCommentId)
                .set(memberNickName).equalTo(row::getMemberNickName)
                .set(memberIcon).equalTo(row::getMemberIcon)
                .set(content).equalTo(row::getContent)
                .set(createTime).equalTo(row::getCreateTime)
                .set(type).equalTo(row::getType);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PmsCommentReplay row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(commentId).equalToWhenPresent(row::getCommentId)
                .set(memberNickName).equalToWhenPresent(row::getMemberNickName)
                .set(memberIcon).equalToWhenPresent(row::getMemberIcon)
                .set(content).equalToWhenPresent(row::getContent)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(type).equalToWhenPresent(row::getType);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(PmsCommentReplay row) {
        return update(c ->
            c.set(commentId).equalTo(row::getCommentId)
            .set(memberNickName).equalTo(row::getMemberNickName)
            .set(memberIcon).equalTo(row::getMemberIcon)
            .set(content).equalTo(row::getContent)
            .set(createTime).equalTo(row::getCreateTime)
            .set(type).equalTo(row::getType)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(PmsCommentReplay row) {
        return update(c ->
            c.set(commentId).equalToWhenPresent(row::getCommentId)
            .set(memberNickName).equalToWhenPresent(row::getMemberNickName)
            .set(memberIcon).equalToWhenPresent(row::getMemberIcon)
            .set(content).equalToWhenPresent(row::getContent)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(type).equalToWhenPresent(row::getType)
            .where(id, isEqualTo(row::getId))
        );
    }
}