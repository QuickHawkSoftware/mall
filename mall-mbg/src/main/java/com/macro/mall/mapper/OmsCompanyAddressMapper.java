package com.macro.mall.mapper;

import static com.macro.mall.mapper.OmsCompanyAddressDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.OmsCompanyAddress;
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
public interface OmsCompanyAddressMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<OmsCompanyAddress>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, addressName, sendStatus, receiveStatus, name, phone, province, city, region, detailAddress);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OmsCompanyAddressResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="address_name", property="addressName", jdbcType=JdbcType.VARCHAR),
        @Result(column="send_status", property="sendStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="receive_status", property="receiveStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="region", property="region", jdbcType=JdbcType.VARCHAR),
        @Result(column="detail_address", property="detailAddress", jdbcType=JdbcType.VARCHAR)
    })
    List<OmsCompanyAddress> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OmsCompanyAddressResult")
    Optional<OmsCompanyAddress> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, omsCompanyAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, omsCompanyAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(OmsCompanyAddress row) {
        return MyBatis3Utils.insert(this::insert, row, omsCompanyAddress, c ->
            c.map(id).toProperty("id")
            .map(addressName).toProperty("addressName")
            .map(sendStatus).toProperty("sendStatus")
            .map(receiveStatus).toProperty("receiveStatus")
            .map(name).toProperty("name")
            .map(phone).toProperty("phone")
            .map(province).toProperty("province")
            .map(city).toProperty("city")
            .map(region).toProperty("region")
            .map(detailAddress).toProperty("detailAddress")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<OmsCompanyAddress> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, omsCompanyAddress, c ->
            c.map(id).toProperty("id")
            .map(addressName).toProperty("addressName")
            .map(sendStatus).toProperty("sendStatus")
            .map(receiveStatus).toProperty("receiveStatus")
            .map(name).toProperty("name")
            .map(phone).toProperty("phone")
            .map(province).toProperty("province")
            .map(city).toProperty("city")
            .map(region).toProperty("region")
            .map(detailAddress).toProperty("detailAddress")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(OmsCompanyAddress row) {
        return MyBatis3Utils.insert(this::insert, row, omsCompanyAddress, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(addressName).toPropertyWhenPresent("addressName", row::getAddressName)
            .map(sendStatus).toPropertyWhenPresent("sendStatus", row::getSendStatus)
            .map(receiveStatus).toPropertyWhenPresent("receiveStatus", row::getReceiveStatus)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(phone).toPropertyWhenPresent("phone", row::getPhone)
            .map(province).toPropertyWhenPresent("province", row::getProvince)
            .map(city).toPropertyWhenPresent("city", row::getCity)
            .map(region).toPropertyWhenPresent("region", row::getRegion)
            .map(detailAddress).toPropertyWhenPresent("detailAddress", row::getDetailAddress)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsCompanyAddress> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, omsCompanyAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsCompanyAddress> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, omsCompanyAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<OmsCompanyAddress> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, omsCompanyAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<OmsCompanyAddress> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, omsCompanyAddress, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(OmsCompanyAddress row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(addressName).equalTo(row::getAddressName)
                .set(sendStatus).equalTo(row::getSendStatus)
                .set(receiveStatus).equalTo(row::getReceiveStatus)
                .set(name).equalTo(row::getName)
                .set(phone).equalTo(row::getPhone)
                .set(province).equalTo(row::getProvince)
                .set(city).equalTo(row::getCity)
                .set(region).equalTo(row::getRegion)
                .set(detailAddress).equalTo(row::getDetailAddress);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OmsCompanyAddress row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(addressName).equalToWhenPresent(row::getAddressName)
                .set(sendStatus).equalToWhenPresent(row::getSendStatus)
                .set(receiveStatus).equalToWhenPresent(row::getReceiveStatus)
                .set(name).equalToWhenPresent(row::getName)
                .set(phone).equalToWhenPresent(row::getPhone)
                .set(province).equalToWhenPresent(row::getProvince)
                .set(city).equalToWhenPresent(row::getCity)
                .set(region).equalToWhenPresent(row::getRegion)
                .set(detailAddress).equalToWhenPresent(row::getDetailAddress);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(OmsCompanyAddress row) {
        return update(c ->
            c.set(addressName).equalTo(row::getAddressName)
            .set(sendStatus).equalTo(row::getSendStatus)
            .set(receiveStatus).equalTo(row::getReceiveStatus)
            .set(name).equalTo(row::getName)
            .set(phone).equalTo(row::getPhone)
            .set(province).equalTo(row::getProvince)
            .set(city).equalTo(row::getCity)
            .set(region).equalTo(row::getRegion)
            .set(detailAddress).equalTo(row::getDetailAddress)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(OmsCompanyAddress row) {
        return update(c ->
            c.set(addressName).equalToWhenPresent(row::getAddressName)
            .set(sendStatus).equalToWhenPresent(row::getSendStatus)
            .set(receiveStatus).equalToWhenPresent(row::getReceiveStatus)
            .set(name).equalToWhenPresent(row::getName)
            .set(phone).equalToWhenPresent(row::getPhone)
            .set(province).equalToWhenPresent(row::getProvince)
            .set(city).equalToWhenPresent(row::getCity)
            .set(region).equalToWhenPresent(row::getRegion)
            .set(detailAddress).equalToWhenPresent(row::getDetailAddress)
            .where(id, isEqualTo(row::getId))
        );
    }
}