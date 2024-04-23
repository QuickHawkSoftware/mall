package com.macro.mall.mapper;

import static com.macro.mall.mapper.UmsMemberReceiveAddressDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.UmsMemberReceiveAddress;
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
public interface UmsMemberReceiveAddressMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<UmsMemberReceiveAddress>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, memberId, name, phoneNumber, defaultStatus, postCode, province, city, region, detailAddress);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsMemberReceiveAddressResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="member_id", property="memberId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone_number", property="phoneNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="default_status", property="defaultStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="post_code", property="postCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="region", property="region", jdbcType=JdbcType.VARCHAR),
        @Result(column="detail_address", property="detailAddress", jdbcType=JdbcType.VARCHAR)
    })
    List<UmsMemberReceiveAddress> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsMemberReceiveAddressResult")
    Optional<UmsMemberReceiveAddress> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsMemberReceiveAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsMemberReceiveAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsMemberReceiveAddress row) {
        return MyBatis3Utils.insert(this::insert, row, umsMemberReceiveAddress, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(name).toProperty("name")
            .map(phoneNumber).toProperty("phoneNumber")
            .map(defaultStatus).toProperty("defaultStatus")
            .map(postCode).toProperty("postCode")
            .map(province).toProperty("province")
            .map(city).toProperty("city")
            .map(region).toProperty("region")
            .map(detailAddress).toProperty("detailAddress")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UmsMemberReceiveAddress> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsMemberReceiveAddress, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(name).toProperty("name")
            .map(phoneNumber).toProperty("phoneNumber")
            .map(defaultStatus).toProperty("defaultStatus")
            .map(postCode).toProperty("postCode")
            .map(province).toProperty("province")
            .map(city).toProperty("city")
            .map(region).toProperty("region")
            .map(detailAddress).toProperty("detailAddress")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsMemberReceiveAddress row) {
        return MyBatis3Utils.insert(this::insert, row, umsMemberReceiveAddress, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(memberId).toPropertyWhenPresent("memberId", row::getMemberId)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(phoneNumber).toPropertyWhenPresent("phoneNumber", row::getPhoneNumber)
            .map(defaultStatus).toPropertyWhenPresent("defaultStatus", row::getDefaultStatus)
            .map(postCode).toPropertyWhenPresent("postCode", row::getPostCode)
            .map(province).toPropertyWhenPresent("province", row::getProvince)
            .map(city).toPropertyWhenPresent("city", row::getCity)
            .map(region).toPropertyWhenPresent("region", row::getRegion)
            .map(detailAddress).toPropertyWhenPresent("detailAddress", row::getDetailAddress)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMemberReceiveAddress> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsMemberReceiveAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMemberReceiveAddress> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsMemberReceiveAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMemberReceiveAddress> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsMemberReceiveAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMemberReceiveAddress> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsMemberReceiveAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsMemberReceiveAddress row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(memberId).equalTo(row::getMemberId)
                .set(name).equalTo(row::getName)
                .set(phoneNumber).equalTo(row::getPhoneNumber)
                .set(defaultStatus).equalTo(row::getDefaultStatus)
                .set(postCode).equalTo(row::getPostCode)
                .set(province).equalTo(row::getProvince)
                .set(city).equalTo(row::getCity)
                .set(region).equalTo(row::getRegion)
                .set(detailAddress).equalTo(row::getDetailAddress);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsMemberReceiveAddress row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(memberId).equalToWhenPresent(row::getMemberId)
                .set(name).equalToWhenPresent(row::getName)
                .set(phoneNumber).equalToWhenPresent(row::getPhoneNumber)
                .set(defaultStatus).equalToWhenPresent(row::getDefaultStatus)
                .set(postCode).equalToWhenPresent(row::getPostCode)
                .set(province).equalToWhenPresent(row::getProvince)
                .set(city).equalToWhenPresent(row::getCity)
                .set(region).equalToWhenPresent(row::getRegion)
                .set(detailAddress).equalToWhenPresent(row::getDetailAddress);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsMemberReceiveAddress row) {
        return update(c ->
            c.set(memberId).equalTo(row::getMemberId)
            .set(name).equalTo(row::getName)
            .set(phoneNumber).equalTo(row::getPhoneNumber)
            .set(defaultStatus).equalTo(row::getDefaultStatus)
            .set(postCode).equalTo(row::getPostCode)
            .set(province).equalTo(row::getProvince)
            .set(city).equalTo(row::getCity)
            .set(region).equalTo(row::getRegion)
            .set(detailAddress).equalTo(row::getDetailAddress)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsMemberReceiveAddress row) {
        return update(c ->
            c.set(memberId).equalToWhenPresent(row::getMemberId)
            .set(name).equalToWhenPresent(row::getName)
            .set(phoneNumber).equalToWhenPresent(row::getPhoneNumber)
            .set(defaultStatus).equalToWhenPresent(row::getDefaultStatus)
            .set(postCode).equalToWhenPresent(row::getPostCode)
            .set(province).equalToWhenPresent(row::getProvince)
            .set(city).equalToWhenPresent(row::getCity)
            .set(region).equalToWhenPresent(row::getRegion)
            .set(detailAddress).equalToWhenPresent(row::getDetailAddress)
            .where(id, isEqualTo(row::getId))
        );
    }
}