package com.macro.mall.mapper;

import static com.macro.mall.mapper.CmsPrefrenceAreaProductRelationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.CmsPrefrenceAreaProductRelation;
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
public interface CmsPrefrenceAreaProductRelationMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<CmsPrefrenceAreaProductRelation>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, prefrenceAreaId, productId);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CmsPrefrenceAreaProductRelationResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="prefrence_area_id", property="prefrenceAreaId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.BIGINT)
    })
    List<CmsPrefrenceAreaProductRelation> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CmsPrefrenceAreaProductRelationResult")
    Optional<CmsPrefrenceAreaProductRelation> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cmsPrefrenceAreaProductRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cmsPrefrenceAreaProductRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(CmsPrefrenceAreaProductRelation row) {
        return MyBatis3Utils.insert(this::insert, row, cmsPrefrenceAreaProductRelation, c ->
            c.map(id).toProperty("id")
            .map(prefrenceAreaId).toProperty("prefrenceAreaId")
            .map(productId).toProperty("productId")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<CmsPrefrenceAreaProductRelation> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, cmsPrefrenceAreaProductRelation, c ->
            c.map(id).toProperty("id")
            .map(prefrenceAreaId).toProperty("prefrenceAreaId")
            .map(productId).toProperty("productId")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(CmsPrefrenceAreaProductRelation row) {
        return MyBatis3Utils.insert(this::insert, row, cmsPrefrenceAreaProductRelation, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(prefrenceAreaId).toPropertyWhenPresent("prefrenceAreaId", row::getPrefrenceAreaId)
            .map(productId).toPropertyWhenPresent("productId", row::getProductId)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<CmsPrefrenceAreaProductRelation> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, cmsPrefrenceAreaProductRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<CmsPrefrenceAreaProductRelation> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, cmsPrefrenceAreaProductRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<CmsPrefrenceAreaProductRelation> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, cmsPrefrenceAreaProductRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<CmsPrefrenceAreaProductRelation> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cmsPrefrenceAreaProductRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(CmsPrefrenceAreaProductRelation row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(prefrenceAreaId).equalTo(row::getPrefrenceAreaId)
                .set(productId).equalTo(row::getProductId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CmsPrefrenceAreaProductRelation row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(prefrenceAreaId).equalToWhenPresent(row::getPrefrenceAreaId)
                .set(productId).equalToWhenPresent(row::getProductId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(CmsPrefrenceAreaProductRelation row) {
        return update(c ->
            c.set(prefrenceAreaId).equalTo(row::getPrefrenceAreaId)
            .set(productId).equalTo(row::getProductId)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(CmsPrefrenceAreaProductRelation row) {
        return update(c ->
            c.set(prefrenceAreaId).equalToWhenPresent(row::getPrefrenceAreaId)
            .set(productId).equalToWhenPresent(row::getProductId)
            .where(id, isEqualTo(row::getId))
        );
    }
}