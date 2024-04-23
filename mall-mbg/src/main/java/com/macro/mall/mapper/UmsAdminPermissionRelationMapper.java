package com.macro.mall.mapper;

import static com.macro.mall.mapper.UmsAdminPermissionRelationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.UmsAdminPermissionRelation;
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
public interface UmsAdminPermissionRelationMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<UmsAdminPermissionRelation>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, adminId, permissionId, type);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsAdminPermissionRelationResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="admin_id", property="adminId", jdbcType=JdbcType.BIGINT),
        @Result(column="permission_id", property="permissionId", jdbcType=JdbcType.BIGINT),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER)
    })
    List<UmsAdminPermissionRelation> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsAdminPermissionRelationResult")
    Optional<UmsAdminPermissionRelation> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsAdminPermissionRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsAdminPermissionRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsAdminPermissionRelation row) {
        return MyBatis3Utils.insert(this::insert, row, umsAdminPermissionRelation, c ->
            c.map(id).toProperty("id")
            .map(adminId).toProperty("adminId")
            .map(permissionId).toProperty("permissionId")
            .map(type).toProperty("type")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UmsAdminPermissionRelation> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsAdminPermissionRelation, c ->
            c.map(id).toProperty("id")
            .map(adminId).toProperty("adminId")
            .map(permissionId).toProperty("permissionId")
            .map(type).toProperty("type")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsAdminPermissionRelation row) {
        return MyBatis3Utils.insert(this::insert, row, umsAdminPermissionRelation, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(adminId).toPropertyWhenPresent("adminId", row::getAdminId)
            .map(permissionId).toPropertyWhenPresent("permissionId", row::getPermissionId)
            .map(type).toPropertyWhenPresent("type", row::getType)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsAdminPermissionRelation> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsAdminPermissionRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsAdminPermissionRelation> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsAdminPermissionRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsAdminPermissionRelation> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsAdminPermissionRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsAdminPermissionRelation> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsAdminPermissionRelation, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsAdminPermissionRelation row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(adminId).equalTo(row::getAdminId)
                .set(permissionId).equalTo(row::getPermissionId)
                .set(type).equalTo(row::getType);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsAdminPermissionRelation row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(adminId).equalToWhenPresent(row::getAdminId)
                .set(permissionId).equalToWhenPresent(row::getPermissionId)
                .set(type).equalToWhenPresent(row::getType);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsAdminPermissionRelation row) {
        return update(c ->
            c.set(adminId).equalTo(row::getAdminId)
            .set(permissionId).equalTo(row::getPermissionId)
            .set(type).equalTo(row::getType)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsAdminPermissionRelation row) {
        return update(c ->
            c.set(adminId).equalToWhenPresent(row::getAdminId)
            .set(permissionId).equalToWhenPresent(row::getPermissionId)
            .set(type).equalToWhenPresent(row::getType)
            .where(id, isEqualTo(row::getId))
        );
    }
}