package com.macro.mall.mapper;

import static com.macro.mall.mapper.PmsBrandDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.PmsBrand;
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
public interface PmsBrandMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<PmsBrand>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, firstLetter, sort, factoryStatus, showStatus, productCount, productCommentCount, logo, bigPic, brandStory);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PmsBrandResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="first_letter", property="firstLetter", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="factory_status", property="factoryStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="show_status", property="showStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="product_count", property="productCount", jdbcType=JdbcType.INTEGER),
        @Result(column="product_comment_count", property="productCommentCount", jdbcType=JdbcType.INTEGER),
        @Result(column="logo", property="logo", jdbcType=JdbcType.VARCHAR),
        @Result(column="big_pic", property="bigPic", jdbcType=JdbcType.VARCHAR),
        @Result(column="brand_story", property="brandStory", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<PmsBrand> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PmsBrandResult")
    Optional<PmsBrand> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, pmsBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, pmsBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(PmsBrand row) {
        return MyBatis3Utils.insert(this::insert, row, pmsBrand, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(firstLetter).toProperty("firstLetter")
            .map(sort).toProperty("sort")
            .map(factoryStatus).toProperty("factoryStatus")
            .map(showStatus).toProperty("showStatus")
            .map(productCount).toProperty("productCount")
            .map(productCommentCount).toProperty("productCommentCount")
            .map(logo).toProperty("logo")
            .map(bigPic).toProperty("bigPic")
            .map(brandStory).toProperty("brandStory")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<PmsBrand> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, pmsBrand, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(firstLetter).toProperty("firstLetter")
            .map(sort).toProperty("sort")
            .map(factoryStatus).toProperty("factoryStatus")
            .map(showStatus).toProperty("showStatus")
            .map(productCount).toProperty("productCount")
            .map(productCommentCount).toProperty("productCommentCount")
            .map(logo).toProperty("logo")
            .map(bigPic).toProperty("bigPic")
            .map(brandStory).toProperty("brandStory")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(PmsBrand row) {
        return MyBatis3Utils.insert(this::insert, row, pmsBrand, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(firstLetter).toPropertyWhenPresent("firstLetter", row::getFirstLetter)
            .map(sort).toPropertyWhenPresent("sort", row::getSort)
            .map(factoryStatus).toPropertyWhenPresent("factoryStatus", row::getFactoryStatus)
            .map(showStatus).toPropertyWhenPresent("showStatus", row::getShowStatus)
            .map(productCount).toPropertyWhenPresent("productCount", row::getProductCount)
            .map(productCommentCount).toPropertyWhenPresent("productCommentCount", row::getProductCommentCount)
            .map(logo).toPropertyWhenPresent("logo", row::getLogo)
            .map(bigPic).toPropertyWhenPresent("bigPic", row::getBigPic)
            .map(brandStory).toPropertyWhenPresent("brandStory", row::getBrandStory)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsBrand> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, pmsBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsBrand> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, pmsBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsBrand> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, pmsBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsBrand> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, pmsBrand, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(PmsBrand row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(name).equalTo(row::getName)
                .set(firstLetter).equalTo(row::getFirstLetter)
                .set(sort).equalTo(row::getSort)
                .set(factoryStatus).equalTo(row::getFactoryStatus)
                .set(showStatus).equalTo(row::getShowStatus)
                .set(productCount).equalTo(row::getProductCount)
                .set(productCommentCount).equalTo(row::getProductCommentCount)
                .set(logo).equalTo(row::getLogo)
                .set(bigPic).equalTo(row::getBigPic)
                .set(brandStory).equalTo(row::getBrandStory);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PmsBrand row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(name).equalToWhenPresent(row::getName)
                .set(firstLetter).equalToWhenPresent(row::getFirstLetter)
                .set(sort).equalToWhenPresent(row::getSort)
                .set(factoryStatus).equalToWhenPresent(row::getFactoryStatus)
                .set(showStatus).equalToWhenPresent(row::getShowStatus)
                .set(productCount).equalToWhenPresent(row::getProductCount)
                .set(productCommentCount).equalToWhenPresent(row::getProductCommentCount)
                .set(logo).equalToWhenPresent(row::getLogo)
                .set(bigPic).equalToWhenPresent(row::getBigPic)
                .set(brandStory).equalToWhenPresent(row::getBrandStory);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(PmsBrand row) {
        return update(c ->
            c.set(name).equalTo(row::getName)
            .set(firstLetter).equalTo(row::getFirstLetter)
            .set(sort).equalTo(row::getSort)
            .set(factoryStatus).equalTo(row::getFactoryStatus)
            .set(showStatus).equalTo(row::getShowStatus)
            .set(productCount).equalTo(row::getProductCount)
            .set(productCommentCount).equalTo(row::getProductCommentCount)
            .set(logo).equalTo(row::getLogo)
            .set(bigPic).equalTo(row::getBigPic)
            .set(brandStory).equalTo(row::getBrandStory)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(PmsBrand row) {
        return update(c ->
            c.set(name).equalToWhenPresent(row::getName)
            .set(firstLetter).equalToWhenPresent(row::getFirstLetter)
            .set(sort).equalToWhenPresent(row::getSort)
            .set(factoryStatus).equalToWhenPresent(row::getFactoryStatus)
            .set(showStatus).equalToWhenPresent(row::getShowStatus)
            .set(productCount).equalToWhenPresent(row::getProductCount)
            .set(productCommentCount).equalToWhenPresent(row::getProductCommentCount)
            .set(logo).equalToWhenPresent(row::getLogo)
            .set(bigPic).equalToWhenPresent(row::getBigPic)
            .set(brandStory).equalToWhenPresent(row::getBrandStory)
            .where(id, isEqualTo(row::getId))
        );
    }
}