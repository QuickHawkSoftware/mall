package com.macro.mall.mapper;

import static com.macro.mall.mapper.CmsPrefrenceAreaDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.CmsPrefrenceArea;
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
public interface CmsPrefrenceAreaMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<CmsPrefrenceArea>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, subTitle, sort, showStatus, pic);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CmsPrefrenceAreaResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="sub_title", property="subTitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="show_status", property="showStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="pic", property="pic", jdbcType=JdbcType.VARBINARY)
    })
    List<CmsPrefrenceArea> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CmsPrefrenceAreaResult")
    Optional<CmsPrefrenceArea> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cmsPrefrenceArea, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cmsPrefrenceArea, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(CmsPrefrenceArea row) {
        return MyBatis3Utils.insert(this::insert, row, cmsPrefrenceArea, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(subTitle).toProperty("subTitle")
            .map(sort).toProperty("sort")
            .map(showStatus).toProperty("showStatus")
            .map(pic).toProperty("pic")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<CmsPrefrenceArea> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, cmsPrefrenceArea, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(subTitle).toProperty("subTitle")
            .map(sort).toProperty("sort")
            .map(showStatus).toProperty("showStatus")
            .map(pic).toProperty("pic")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(CmsPrefrenceArea row) {
        return MyBatis3Utils.insert(this::insert, row, cmsPrefrenceArea, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(subTitle).toPropertyWhenPresent("subTitle", row::getSubTitle)
            .map(sort).toPropertyWhenPresent("sort", row::getSort)
            .map(showStatus).toPropertyWhenPresent("showStatus", row::getShowStatus)
            .map(pic).toPropertyWhenPresent("pic", row::getPic)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<CmsPrefrenceArea> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, cmsPrefrenceArea, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<CmsPrefrenceArea> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, cmsPrefrenceArea, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<CmsPrefrenceArea> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, cmsPrefrenceArea, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<CmsPrefrenceArea> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cmsPrefrenceArea, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(CmsPrefrenceArea row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(name).equalTo(row::getName)
                .set(subTitle).equalTo(row::getSubTitle)
                .set(sort).equalTo(row::getSort)
                .set(showStatus).equalTo(row::getShowStatus)
                .set(pic).equalTo(row::getPic);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CmsPrefrenceArea row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(name).equalToWhenPresent(row::getName)
                .set(subTitle).equalToWhenPresent(row::getSubTitle)
                .set(sort).equalToWhenPresent(row::getSort)
                .set(showStatus).equalToWhenPresent(row::getShowStatus)
                .set(pic).equalToWhenPresent(row::getPic);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(CmsPrefrenceArea row) {
        return update(c ->
            c.set(name).equalTo(row::getName)
            .set(subTitle).equalTo(row::getSubTitle)
            .set(sort).equalTo(row::getSort)
            .set(showStatus).equalTo(row::getShowStatus)
            .set(pic).equalTo(row::getPic)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(CmsPrefrenceArea row) {
        return update(c ->
            c.set(name).equalToWhenPresent(row::getName)
            .set(subTitle).equalToWhenPresent(row::getSubTitle)
            .set(sort).equalToWhenPresent(row::getSort)
            .set(showStatus).equalToWhenPresent(row::getShowStatus)
            .set(pic).equalToWhenPresent(row::getPic)
            .where(id, isEqualTo(row::getId))
        );
    }
}