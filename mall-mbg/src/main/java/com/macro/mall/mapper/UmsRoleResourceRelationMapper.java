package com.macro.mall.mapper;

import static com.macro.mall.mapper.UmsRoleResourceRelationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.UmsRoleResourceRelation;
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
public interface UmsRoleResourceRelationMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<UmsRoleResourceRelation>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, roleId, resourceId);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsRoleResourceRelationResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.BIGINT),
        @Result(column="resource_id", property="resourceId", jdbcType=JdbcType.BIGINT)
    })
    List<UmsRoleResourceRelation> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsRoleResourceRelationResult")
    Optional<UmsRoleResourceRelation> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsRoleResourceRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsRoleResourceRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsRoleResourceRelation row) {
        return MyBatis3Utils.insert(this::insert, row, umsRoleResourceRelation, c ->
            c.map(id).toProperty("id")
            .map(roleId).toProperty("roleId")
            .map(resourceId).toProperty("resourceId")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UmsRoleResourceRelation> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsRoleResourceRelation, c ->
            c.map(id).toProperty("id")
            .map(roleId).toProperty("roleId")
            .map(resourceId).toProperty("resourceId")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsRoleResourceRelation row) {
        return MyBatis3Utils.insert(this::insert, row, umsRoleResourceRelation, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(roleId).toPropertyWhenPresent("roleId", row::getRoleId)
            .map(resourceId).toPropertyWhenPresent("resourceId", row::getResourceId)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsRoleResourceRelation> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsRoleResourceRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsRoleResourceRelation> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsRoleResourceRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsRoleResourceRelation> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsRoleResourceRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsRoleResourceRelation> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsRoleResourceRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsRoleResourceRelation row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(roleId).equalTo(row::getRoleId)
                .set(resourceId).equalTo(row::getResourceId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsRoleResourceRelation row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(roleId).equalToWhenPresent(row::getRoleId)
                .set(resourceId).equalToWhenPresent(row::getResourceId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsRoleResourceRelation row) {
        return update(c ->
            c.set(roleId).equalTo(row::getRoleId)
            .set(resourceId).equalTo(row::getResourceId)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsRoleResourceRelation row) {
        return update(c ->
            c.set(roleId).equalToWhenPresent(row::getRoleId)
            .set(resourceId).equalToWhenPresent(row::getResourceId)
            .where(id, isEqualTo(row::getId))
        );
    }
}