package com.macro.mall.mapper;

import static com.macro.mall.mapper.UmsMemberLoginLogDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.UmsMemberLoginLog;
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
public interface UmsMemberLoginLogMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<UmsMemberLoginLog>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, memberId, createTime, ip, city, loginType, province);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsMemberLoginLogResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_type", property="loginType", jdbcType=JdbcType.INTEGER),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR)
    })
    List<UmsMemberLoginLog> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsMemberLoginLogResult")
    Optional<UmsMemberLoginLog> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsMemberLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsMemberLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsMemberLoginLog row) {
        return MyBatis3Utils.insert(this::insert, row, umsMemberLoginLog, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(createTime).toProperty("createTime")
            .map(ip).toProperty("ip")
            .map(city).toProperty("city")
            .map(loginType).toProperty("loginType")
            .map(province).toProperty("province")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UmsMemberLoginLog> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsMemberLoginLog, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(createTime).toProperty("createTime")
            .map(ip).toProperty("ip")
            .map(city).toProperty("city")
            .map(loginType).toProperty("loginType")
            .map(province).toProperty("province")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsMemberLoginLog row) {
        return MyBatis3Utils.insert(this::insert, row, umsMemberLoginLog, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(memberId).toPropertyWhenPresent("memberId", row::getMemberId)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(ip).toPropertyWhenPresent("ip", row::getIp)
            .map(city).toPropertyWhenPresent("city", row::getCity)
            .map(loginType).toPropertyWhenPresent("loginType", row::getLoginType)
            .map(province).toPropertyWhenPresent("province", row::getProvince)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMemberLoginLog> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsMemberLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMemberLoginLog> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsMemberLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMemberLoginLog> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsMemberLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMemberLoginLog> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsMemberLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsMemberLoginLog row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(memberId).equalTo(row::getMemberId)
                .set(createTime).equalTo(row::getCreateTime)
                .set(ip).equalTo(row::getIp)
                .set(city).equalTo(row::getCity)
                .set(loginType).equalTo(row::getLoginType)
                .set(province).equalTo(row::getProvince);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsMemberLoginLog row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(memberId).equalToWhenPresent(row::getMemberId)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(ip).equalToWhenPresent(row::getIp)
                .set(city).equalToWhenPresent(row::getCity)
                .set(loginType).equalToWhenPresent(row::getLoginType)
                .set(province).equalToWhenPresent(row::getProvince);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsMemberLoginLog row) {
        return update(c ->
            c.set(memberId).equalTo(row::getMemberId)
            .set(createTime).equalTo(row::getCreateTime)
            .set(ip).equalTo(row::getIp)
            .set(city).equalTo(row::getCity)
            .set(loginType).equalTo(row::getLoginType)
            .set(province).equalTo(row::getProvince)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsMemberLoginLog row) {
        return update(c ->
            c.set(memberId).equalToWhenPresent(row::getMemberId)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(ip).equalToWhenPresent(row::getIp)
            .set(city).equalToWhenPresent(row::getCity)
            .set(loginType).equalToWhenPresent(row::getLoginType)
            .set(province).equalToWhenPresent(row::getProvince)
            .where(id, isEqualTo(row::getId))
        );
    }
}