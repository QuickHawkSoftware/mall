package com.macro.mall.mapper;

import static com.macro.mall.mapper.UmsMemberDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.UmsMember;
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
public interface UmsMemberMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<UmsMember>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, memberLevelId, username, password, nickname, phone, status, createTime, icon, gender, birthday, city, job, personalizedSignature, sourceType, integration, growth, luckeyCount, historyIntegration);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsMemberResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="member_level_id", property="memberLevelId", jdbcType=JdbcType.BIGINT),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.INTEGER),
        @Result(column="birthday", property="birthday", jdbcType=JdbcType.DATE),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="job", property="job", jdbcType=JdbcType.VARCHAR),
        @Result(column="personalized_signature", property="personalizedSignature", jdbcType=JdbcType.VARCHAR),
        @Result(column="source_type", property="sourceType", jdbcType=JdbcType.INTEGER),
        @Result(column="integration", property="integration", jdbcType=JdbcType.INTEGER),
        @Result(column="growth", property="growth", jdbcType=JdbcType.INTEGER),
        @Result(column="luckey_count", property="luckeyCount", jdbcType=JdbcType.INTEGER),
        @Result(column="history_integration", property="historyIntegration", jdbcType=JdbcType.INTEGER)
    })
    List<UmsMember> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsMemberResult")
    Optional<UmsMember> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsMember, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsMember, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsMember row) {
        return MyBatis3Utils.insert(this::insert, row, umsMember, c ->
            c.map(id).toProperty("id")
            .map(memberLevelId).toProperty("memberLevelId")
            .map(username).toProperty("username")
            .map(password).toProperty("password")
            .map(nickname).toProperty("nickname")
            .map(phone).toProperty("phone")
            .map(status).toProperty("status")
            .map(createTime).toProperty("createTime")
            .map(icon).toProperty("icon")
            .map(gender).toProperty("gender")
            .map(birthday).toProperty("birthday")
            .map(city).toProperty("city")
            .map(job).toProperty("job")
            .map(personalizedSignature).toProperty("personalizedSignature")
            .map(sourceType).toProperty("sourceType")
            .map(integration).toProperty("integration")
            .map(growth).toProperty("growth")
            .map(luckeyCount).toProperty("luckeyCount")
            .map(historyIntegration).toProperty("historyIntegration")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UmsMember> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsMember, c ->
            c.map(id).toProperty("id")
            .map(memberLevelId).toProperty("memberLevelId")
            .map(username).toProperty("username")
            .map(password).toProperty("password")
            .map(nickname).toProperty("nickname")
            .map(phone).toProperty("phone")
            .map(status).toProperty("status")
            .map(createTime).toProperty("createTime")
            .map(icon).toProperty("icon")
            .map(gender).toProperty("gender")
            .map(birthday).toProperty("birthday")
            .map(city).toProperty("city")
            .map(job).toProperty("job")
            .map(personalizedSignature).toProperty("personalizedSignature")
            .map(sourceType).toProperty("sourceType")
            .map(integration).toProperty("integration")
            .map(growth).toProperty("growth")
            .map(luckeyCount).toProperty("luckeyCount")
            .map(historyIntegration).toProperty("historyIntegration")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsMember row) {
        return MyBatis3Utils.insert(this::insert, row, umsMember, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(memberLevelId).toPropertyWhenPresent("memberLevelId", row::getMemberLevelId)
            .map(username).toPropertyWhenPresent("username", row::getUsername)
            .map(password).toPropertyWhenPresent("password", row::getPassword)
            .map(nickname).toPropertyWhenPresent("nickname", row::getNickname)
            .map(phone).toPropertyWhenPresent("phone", row::getPhone)
            .map(status).toPropertyWhenPresent("status", row::getStatus)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(icon).toPropertyWhenPresent("icon", row::getIcon)
            .map(gender).toPropertyWhenPresent("gender", row::getGender)
            .map(birthday).toPropertyWhenPresent("birthday", row::getBirthday)
            .map(city).toPropertyWhenPresent("city", row::getCity)
            .map(job).toPropertyWhenPresent("job", row::getJob)
            .map(personalizedSignature).toPropertyWhenPresent("personalizedSignature", row::getPersonalizedSignature)
            .map(sourceType).toPropertyWhenPresent("sourceType", row::getSourceType)
            .map(integration).toPropertyWhenPresent("integration", row::getIntegration)
            .map(growth).toPropertyWhenPresent("growth", row::getGrowth)
            .map(luckeyCount).toPropertyWhenPresent("luckeyCount", row::getLuckeyCount)
            .map(historyIntegration).toPropertyWhenPresent("historyIntegration", row::getHistoryIntegration)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMember> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsMember, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMember> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsMember, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMember> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsMember, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMember> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsMember, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsMember row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(memberLevelId).equalTo(row::getMemberLevelId)
                .set(username).equalTo(row::getUsername)
                .set(password).equalTo(row::getPassword)
                .set(nickname).equalTo(row::getNickname)
                .set(phone).equalTo(row::getPhone)
                .set(status).equalTo(row::getStatus)
                .set(createTime).equalTo(row::getCreateTime)
                .set(icon).equalTo(row::getIcon)
                .set(gender).equalTo(row::getGender)
                .set(birthday).equalTo(row::getBirthday)
                .set(city).equalTo(row::getCity)
                .set(job).equalTo(row::getJob)
                .set(personalizedSignature).equalTo(row::getPersonalizedSignature)
                .set(sourceType).equalTo(row::getSourceType)
                .set(integration).equalTo(row::getIntegration)
                .set(growth).equalTo(row::getGrowth)
                .set(luckeyCount).equalTo(row::getLuckeyCount)
                .set(historyIntegration).equalTo(row::getHistoryIntegration);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsMember row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(memberLevelId).equalToWhenPresent(row::getMemberLevelId)
                .set(username).equalToWhenPresent(row::getUsername)
                .set(password).equalToWhenPresent(row::getPassword)
                .set(nickname).equalToWhenPresent(row::getNickname)
                .set(phone).equalToWhenPresent(row::getPhone)
                .set(status).equalToWhenPresent(row::getStatus)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(icon).equalToWhenPresent(row::getIcon)
                .set(gender).equalToWhenPresent(row::getGender)
                .set(birthday).equalToWhenPresent(row::getBirthday)
                .set(city).equalToWhenPresent(row::getCity)
                .set(job).equalToWhenPresent(row::getJob)
                .set(personalizedSignature).equalToWhenPresent(row::getPersonalizedSignature)
                .set(sourceType).equalToWhenPresent(row::getSourceType)
                .set(integration).equalToWhenPresent(row::getIntegration)
                .set(growth).equalToWhenPresent(row::getGrowth)
                .set(luckeyCount).equalToWhenPresent(row::getLuckeyCount)
                .set(historyIntegration).equalToWhenPresent(row::getHistoryIntegration);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsMember row) {
        return update(c ->
            c.set(memberLevelId).equalTo(row::getMemberLevelId)
            .set(username).equalTo(row::getUsername)
            .set(password).equalTo(row::getPassword)
            .set(nickname).equalTo(row::getNickname)
            .set(phone).equalTo(row::getPhone)
            .set(status).equalTo(row::getStatus)
            .set(createTime).equalTo(row::getCreateTime)
            .set(icon).equalTo(row::getIcon)
            .set(gender).equalTo(row::getGender)
            .set(birthday).equalTo(row::getBirthday)
            .set(city).equalTo(row::getCity)
            .set(job).equalTo(row::getJob)
            .set(personalizedSignature).equalTo(row::getPersonalizedSignature)
            .set(sourceType).equalTo(row::getSourceType)
            .set(integration).equalTo(row::getIntegration)
            .set(growth).equalTo(row::getGrowth)
            .set(luckeyCount).equalTo(row::getLuckeyCount)
            .set(historyIntegration).equalTo(row::getHistoryIntegration)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsMember row) {
        return update(c ->
            c.set(memberLevelId).equalToWhenPresent(row::getMemberLevelId)
            .set(username).equalToWhenPresent(row::getUsername)
            .set(password).equalToWhenPresent(row::getPassword)
            .set(nickname).equalToWhenPresent(row::getNickname)
            .set(phone).equalToWhenPresent(row::getPhone)
            .set(status).equalToWhenPresent(row::getStatus)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(icon).equalToWhenPresent(row::getIcon)
            .set(gender).equalToWhenPresent(row::getGender)
            .set(birthday).equalToWhenPresent(row::getBirthday)
            .set(city).equalToWhenPresent(row::getCity)
            .set(job).equalToWhenPresent(row::getJob)
            .set(personalizedSignature).equalToWhenPresent(row::getPersonalizedSignature)
            .set(sourceType).equalToWhenPresent(row::getSourceType)
            .set(integration).equalToWhenPresent(row::getIntegration)
            .set(growth).equalToWhenPresent(row::getGrowth)
            .set(luckeyCount).equalToWhenPresent(row::getLuckeyCount)
            .set(historyIntegration).equalToWhenPresent(row::getHistoryIntegration)
            .where(id, isEqualTo(row::getId))
        );
    }
}