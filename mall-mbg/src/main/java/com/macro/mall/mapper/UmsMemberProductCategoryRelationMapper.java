package com.macro.mall.mapper;

import static com.macro.mall.mapper.UmsMemberProductCategoryRelationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.UmsMemberProductCategoryRelation;
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
public interface UmsMemberProductCategoryRelationMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<UmsMemberProductCategoryRelation>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, memberId, productCategoryId);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsMemberProductCategoryRelationResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_category_id", property="productCategoryId", jdbcType=JdbcType.BIGINT)
    })
    List<UmsMemberProductCategoryRelation> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsMemberProductCategoryRelationResult")
    Optional<UmsMemberProductCategoryRelation> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsMemberProductCategoryRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsMemberProductCategoryRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsMemberProductCategoryRelation row) {
        return MyBatis3Utils.insert(this::insert, row, umsMemberProductCategoryRelation, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(productCategoryId).toProperty("productCategoryId")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UmsMemberProductCategoryRelation> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsMemberProductCategoryRelation, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(productCategoryId).toProperty("productCategoryId")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsMemberProductCategoryRelation row) {
        return MyBatis3Utils.insert(this::insert, row, umsMemberProductCategoryRelation, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(memberId).toPropertyWhenPresent("memberId", row::getMemberId)
            .map(productCategoryId).toPropertyWhenPresent("productCategoryId", row::getProductCategoryId)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMemberProductCategoryRelation> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsMemberProductCategoryRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMemberProductCategoryRelation> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsMemberProductCategoryRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMemberProductCategoryRelation> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsMemberProductCategoryRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMemberProductCategoryRelation> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsMemberProductCategoryRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsMemberProductCategoryRelation row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(memberId).equalTo(row::getMemberId)
                .set(productCategoryId).equalTo(row::getProductCategoryId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsMemberProductCategoryRelation row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(memberId).equalToWhenPresent(row::getMemberId)
                .set(productCategoryId).equalToWhenPresent(row::getProductCategoryId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsMemberProductCategoryRelation row) {
        return update(c ->
            c.set(memberId).equalTo(row::getMemberId)
            .set(productCategoryId).equalTo(row::getProductCategoryId)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsMemberProductCategoryRelation row) {
        return update(c ->
            c.set(memberId).equalToWhenPresent(row::getMemberId)
            .set(productCategoryId).equalToWhenPresent(row::getProductCategoryId)
            .where(id, isEqualTo(row::getId))
        );
    }
}