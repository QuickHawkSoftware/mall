package com.macro.mall.mapper;

import static com.macro.mall.mapper.CmsHelpDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.CmsHelp;
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
public interface CmsHelpMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<CmsHelp>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, categoryId, icon, title, showStatus, createTime, readCount, content);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CmsHelpResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="category_id", property="categoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="show_status", property="showStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="read_count", property="readCount", jdbcType=JdbcType.INTEGER),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<CmsHelp> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CmsHelpResult")
    Optional<CmsHelp> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cmsHelp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cmsHelp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(CmsHelp row) {
        return MyBatis3Utils.insert(this::insert, row, cmsHelp, c ->
            c.map(id).toProperty("id")
            .map(categoryId).toProperty("categoryId")
            .map(icon).toProperty("icon")
            .map(title).toProperty("title")
            .map(showStatus).toProperty("showStatus")
            .map(createTime).toProperty("createTime")
            .map(readCount).toProperty("readCount")
            .map(content).toProperty("content")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<CmsHelp> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, cmsHelp, c ->
            c.map(id).toProperty("id")
            .map(categoryId).toProperty("categoryId")
            .map(icon).toProperty("icon")
            .map(title).toProperty("title")
            .map(showStatus).toProperty("showStatus")
            .map(createTime).toProperty("createTime")
            .map(readCount).toProperty("readCount")
            .map(content).toProperty("content")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(CmsHelp row) {
        return MyBatis3Utils.insert(this::insert, row, cmsHelp, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(categoryId).toPropertyWhenPresent("categoryId", row::getCategoryId)
            .map(icon).toPropertyWhenPresent("icon", row::getIcon)
            .map(title).toPropertyWhenPresent("title", row::getTitle)
            .map(showStatus).toPropertyWhenPresent("showStatus", row::getShowStatus)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(readCount).toPropertyWhenPresent("readCount", row::getReadCount)
            .map(content).toPropertyWhenPresent("content", row::getContent)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<CmsHelp> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, cmsHelp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<CmsHelp> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, cmsHelp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<CmsHelp> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, cmsHelp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<CmsHelp> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cmsHelp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(CmsHelp row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(categoryId).equalTo(row::getCategoryId)
                .set(icon).equalTo(row::getIcon)
                .set(title).equalTo(row::getTitle)
                .set(showStatus).equalTo(row::getShowStatus)
                .set(createTime).equalTo(row::getCreateTime)
                .set(readCount).equalTo(row::getReadCount)
                .set(content).equalTo(row::getContent);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CmsHelp row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(categoryId).equalToWhenPresent(row::getCategoryId)
                .set(icon).equalToWhenPresent(row::getIcon)
                .set(title).equalToWhenPresent(row::getTitle)
                .set(showStatus).equalToWhenPresent(row::getShowStatus)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(readCount).equalToWhenPresent(row::getReadCount)
                .set(content).equalToWhenPresent(row::getContent);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(CmsHelp row) {
        return update(c ->
            c.set(categoryId).equalTo(row::getCategoryId)
            .set(icon).equalTo(row::getIcon)
            .set(title).equalTo(row::getTitle)
            .set(showStatus).equalTo(row::getShowStatus)
            .set(createTime).equalTo(row::getCreateTime)
            .set(readCount).equalTo(row::getReadCount)
            .set(content).equalTo(row::getContent)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(CmsHelp row) {
        return update(c ->
            c.set(categoryId).equalToWhenPresent(row::getCategoryId)
            .set(icon).equalToWhenPresent(row::getIcon)
            .set(title).equalToWhenPresent(row::getTitle)
            .set(showStatus).equalToWhenPresent(row::getShowStatus)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(readCount).equalToWhenPresent(row::getReadCount)
            .set(content).equalToWhenPresent(row::getContent)
            .where(id, isEqualTo(row::getId))
        );
    }
}