package com.macro.mall.mapper;

import static com.macro.mall.mapper.UmsAdminLoginLogDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.UmsAdminLoginLog;
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
public interface UmsAdminLoginLogMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<UmsAdminLoginLog>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, adminId, createTime, ip, address, userAgent);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsAdminLoginLogResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="admin_id", property="adminId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_agent", property="userAgent", jdbcType=JdbcType.VARCHAR)
    })
    List<UmsAdminLoginLog> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsAdminLoginLogResult")
    Optional<UmsAdminLoginLog> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsAdminLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsAdminLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsAdminLoginLog row) {
        return MyBatis3Utils.insert(this::insert, row, umsAdminLoginLog, c ->
            c.map(id).toProperty("id")
            .map(adminId).toProperty("adminId")
            .map(createTime).toProperty("createTime")
            .map(ip).toProperty("ip")
            .map(address).toProperty("address")
            .map(userAgent).toProperty("userAgent")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UmsAdminLoginLog> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsAdminLoginLog, c ->
            c.map(id).toProperty("id")
            .map(adminId).toProperty("adminId")
            .map(createTime).toProperty("createTime")
            .map(ip).toProperty("ip")
            .map(address).toProperty("address")
            .map(userAgent).toProperty("userAgent")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsAdminLoginLog row) {
        return MyBatis3Utils.insert(this::insert, row, umsAdminLoginLog, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(adminId).toPropertyWhenPresent("adminId", row::getAdminId)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(ip).toPropertyWhenPresent("ip", row::getIp)
            .map(address).toPropertyWhenPresent("address", row::getAddress)
            .map(userAgent).toPropertyWhenPresent("userAgent", row::getUserAgent)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsAdminLoginLog> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsAdminLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsAdminLoginLog> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsAdminLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsAdminLoginLog> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsAdminLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsAdminLoginLog> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsAdminLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsAdminLoginLog row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(adminId).equalTo(row::getAdminId)
                .set(createTime).equalTo(row::getCreateTime)
                .set(ip).equalTo(row::getIp)
                .set(address).equalTo(row::getAddress)
                .set(userAgent).equalTo(row::getUserAgent);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsAdminLoginLog row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(adminId).equalToWhenPresent(row::getAdminId)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(ip).equalToWhenPresent(row::getIp)
                .set(address).equalToWhenPresent(row::getAddress)
                .set(userAgent).equalToWhenPresent(row::getUserAgent);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsAdminLoginLog row) {
        return update(c ->
            c.set(adminId).equalTo(row::getAdminId)
            .set(createTime).equalTo(row::getCreateTime)
            .set(ip).equalTo(row::getIp)
            .set(address).equalTo(row::getAddress)
            .set(userAgent).equalTo(row::getUserAgent)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsAdminLoginLog row) {
        return update(c ->
            c.set(adminId).equalToWhenPresent(row::getAdminId)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(ip).equalToWhenPresent(row::getIp)
            .set(address).equalToWhenPresent(row::getAddress)
            .set(userAgent).equalToWhenPresent(row::getUserAgent)
            .where(id, isEqualTo(row::getId))
        );
    }
}