package com.macro.mall.mapper;

import static com.macro.mall.mapper.CmsSubjectCategoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.CmsSubjectCategory;
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
public interface CmsSubjectCategoryMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<CmsSubjectCategory>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, icon, subjectCount, showStatus, sort);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CmsSubjectCategoryResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="subject_count", property="subjectCount", jdbcType=JdbcType.INTEGER),
        @Result(column="show_status", property="showStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER)
    })
    List<CmsSubjectCategory> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CmsSubjectCategoryResult")
    Optional<CmsSubjectCategory> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cmsSubjectCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cmsSubjectCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(CmsSubjectCategory row) {
        return MyBatis3Utils.insert(this::insert, row, cmsSubjectCategory, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(icon).toProperty("icon")
            .map(subjectCount).toProperty("subjectCount")
            .map(showStatus).toProperty("showStatus")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<CmsSubjectCategory> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, cmsSubjectCategory, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(icon).toProperty("icon")
            .map(subjectCount).toProperty("subjectCount")
            .map(showStatus).toProperty("showStatus")
            .map(sort).toProperty("sort")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(CmsSubjectCategory row) {
        return MyBatis3Utils.insert(this::insert, row, cmsSubjectCategory, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(icon).toPropertyWhenPresent("icon", row::getIcon)
            .map(subjectCount).toPropertyWhenPresent("subjectCount", row::getSubjectCount)
            .map(showStatus).toPropertyWhenPresent("showStatus", row::getShowStatus)
            .map(sort).toPropertyWhenPresent("sort", row::getSort)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<CmsSubjectCategory> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, cmsSubjectCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<CmsSubjectCategory> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, cmsSubjectCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<CmsSubjectCategory> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, cmsSubjectCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<CmsSubjectCategory> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cmsSubjectCategory, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(CmsSubjectCategory row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(name).equalTo(row::getName)
                .set(icon).equalTo(row::getIcon)
                .set(subjectCount).equalTo(row::getSubjectCount)
                .set(showStatus).equalTo(row::getShowStatus)
                .set(sort).equalTo(row::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CmsSubjectCategory row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(name).equalToWhenPresent(row::getName)
                .set(icon).equalToWhenPresent(row::getIcon)
                .set(subjectCount).equalToWhenPresent(row::getSubjectCount)
                .set(showStatus).equalToWhenPresent(row::getShowStatus)
                .set(sort).equalToWhenPresent(row::getSort);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(CmsSubjectCategory row) {
        return update(c ->
            c.set(name).equalTo(row::getName)
            .set(icon).equalTo(row::getIcon)
            .set(subjectCount).equalTo(row::getSubjectCount)
            .set(showStatus).equalTo(row::getShowStatus)
            .set(sort).equalTo(row::getSort)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(CmsSubjectCategory row) {
        return update(c ->
            c.set(name).equalToWhenPresent(row::getName)
            .set(icon).equalToWhenPresent(row::getIcon)
            .set(subjectCount).equalToWhenPresent(row::getSubjectCount)
            .set(showStatus).equalToWhenPresent(row::getShowStatus)
            .set(sort).equalToWhenPresent(row::getSort)
            .where(id, isEqualTo(row::getId))
        );
    }
}