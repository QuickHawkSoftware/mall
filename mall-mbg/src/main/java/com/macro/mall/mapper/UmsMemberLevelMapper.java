package com.macro.mall.mapper;

import static com.macro.mall.mapper.UmsMemberLevelDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.UmsMemberLevel;
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
public interface UmsMemberLevelMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<UmsMemberLevel>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, growthPoint, defaultStatus, freeFreightPoint, commentGrowthPoint, priviledgeFreeFreight, priviledgeSignIn, priviledgeComment, priviledgePromotion, priviledgeMemberPrice, priviledgeBirthday, note);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsMemberLevelResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="growth_point", property="growthPoint", jdbcType=JdbcType.INTEGER),
        @Result(column="default_status", property="defaultStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="free_freight_point", property="freeFreightPoint", jdbcType=JdbcType.DECIMAL),
        @Result(column="comment_growth_point", property="commentGrowthPoint", jdbcType=JdbcType.INTEGER),
        @Result(column="priviledge_free_freight", property="priviledgeFreeFreight", jdbcType=JdbcType.INTEGER),
        @Result(column="priviledge_sign_in", property="priviledgeSignIn", jdbcType=JdbcType.INTEGER),
        @Result(column="priviledge_comment", property="priviledgeComment", jdbcType=JdbcType.INTEGER),
        @Result(column="priviledge_promotion", property="priviledgePromotion", jdbcType=JdbcType.INTEGER),
        @Result(column="priviledge_member_price", property="priviledgeMemberPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="priviledge_birthday", property="priviledgeBirthday", jdbcType=JdbcType.INTEGER),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR)
    })
    List<UmsMemberLevel> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsMemberLevelResult")
    Optional<UmsMemberLevel> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsMemberLevel, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsMemberLevel, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsMemberLevel row) {
        return MyBatis3Utils.insert(this::insert, row, umsMemberLevel, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(growthPoint).toProperty("growthPoint")
            .map(defaultStatus).toProperty("defaultStatus")
            .map(freeFreightPoint).toProperty("freeFreightPoint")
            .map(commentGrowthPoint).toProperty("commentGrowthPoint")
            .map(priviledgeFreeFreight).toProperty("priviledgeFreeFreight")
            .map(priviledgeSignIn).toProperty("priviledgeSignIn")
            .map(priviledgeComment).toProperty("priviledgeComment")
            .map(priviledgePromotion).toProperty("priviledgePromotion")
            .map(priviledgeMemberPrice).toProperty("priviledgeMemberPrice")
            .map(priviledgeBirthday).toProperty("priviledgeBirthday")
            .map(note).toProperty("note")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UmsMemberLevel> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsMemberLevel, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(growthPoint).toProperty("growthPoint")
            .map(defaultStatus).toProperty("defaultStatus")
            .map(freeFreightPoint).toProperty("freeFreightPoint")
            .map(commentGrowthPoint).toProperty("commentGrowthPoint")
            .map(priviledgeFreeFreight).toProperty("priviledgeFreeFreight")
            .map(priviledgeSignIn).toProperty("priviledgeSignIn")
            .map(priviledgeComment).toProperty("priviledgeComment")
            .map(priviledgePromotion).toProperty("priviledgePromotion")
            .map(priviledgeMemberPrice).toProperty("priviledgeMemberPrice")
            .map(priviledgeBirthday).toProperty("priviledgeBirthday")
            .map(note).toProperty("note")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsMemberLevel row) {
        return MyBatis3Utils.insert(this::insert, row, umsMemberLevel, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(growthPoint).toPropertyWhenPresent("growthPoint", row::getGrowthPoint)
            .map(defaultStatus).toPropertyWhenPresent("defaultStatus", row::getDefaultStatus)
            .map(freeFreightPoint).toPropertyWhenPresent("freeFreightPoint", row::getFreeFreightPoint)
            .map(commentGrowthPoint).toPropertyWhenPresent("commentGrowthPoint", row::getCommentGrowthPoint)
            .map(priviledgeFreeFreight).toPropertyWhenPresent("priviledgeFreeFreight", row::getPriviledgeFreeFreight)
            .map(priviledgeSignIn).toPropertyWhenPresent("priviledgeSignIn", row::getPriviledgeSignIn)
            .map(priviledgeComment).toPropertyWhenPresent("priviledgeComment", row::getPriviledgeComment)
            .map(priviledgePromotion).toPropertyWhenPresent("priviledgePromotion", row::getPriviledgePromotion)
            .map(priviledgeMemberPrice).toPropertyWhenPresent("priviledgeMemberPrice", row::getPriviledgeMemberPrice)
            .map(priviledgeBirthday).toPropertyWhenPresent("priviledgeBirthday", row::getPriviledgeBirthday)
            .map(note).toPropertyWhenPresent("note", row::getNote)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMemberLevel> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsMemberLevel, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMemberLevel> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsMemberLevel, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsMemberLevel> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsMemberLevel, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsMemberLevel> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsMemberLevel, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsMemberLevel row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(name).equalTo(row::getName)
                .set(growthPoint).equalTo(row::getGrowthPoint)
                .set(defaultStatus).equalTo(row::getDefaultStatus)
                .set(freeFreightPoint).equalTo(row::getFreeFreightPoint)
                .set(commentGrowthPoint).equalTo(row::getCommentGrowthPoint)
                .set(priviledgeFreeFreight).equalTo(row::getPriviledgeFreeFreight)
                .set(priviledgeSignIn).equalTo(row::getPriviledgeSignIn)
                .set(priviledgeComment).equalTo(row::getPriviledgeComment)
                .set(priviledgePromotion).equalTo(row::getPriviledgePromotion)
                .set(priviledgeMemberPrice).equalTo(row::getPriviledgeMemberPrice)
                .set(priviledgeBirthday).equalTo(row::getPriviledgeBirthday)
                .set(note).equalTo(row::getNote);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsMemberLevel row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(name).equalToWhenPresent(row::getName)
                .set(growthPoint).equalToWhenPresent(row::getGrowthPoint)
                .set(defaultStatus).equalToWhenPresent(row::getDefaultStatus)
                .set(freeFreightPoint).equalToWhenPresent(row::getFreeFreightPoint)
                .set(commentGrowthPoint).equalToWhenPresent(row::getCommentGrowthPoint)
                .set(priviledgeFreeFreight).equalToWhenPresent(row::getPriviledgeFreeFreight)
                .set(priviledgeSignIn).equalToWhenPresent(row::getPriviledgeSignIn)
                .set(priviledgeComment).equalToWhenPresent(row::getPriviledgeComment)
                .set(priviledgePromotion).equalToWhenPresent(row::getPriviledgePromotion)
                .set(priviledgeMemberPrice).equalToWhenPresent(row::getPriviledgeMemberPrice)
                .set(priviledgeBirthday).equalToWhenPresent(row::getPriviledgeBirthday)
                .set(note).equalToWhenPresent(row::getNote);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsMemberLevel row) {
        return update(c ->
            c.set(name).equalTo(row::getName)
            .set(growthPoint).equalTo(row::getGrowthPoint)
            .set(defaultStatus).equalTo(row::getDefaultStatus)
            .set(freeFreightPoint).equalTo(row::getFreeFreightPoint)
            .set(commentGrowthPoint).equalTo(row::getCommentGrowthPoint)
            .set(priviledgeFreeFreight).equalTo(row::getPriviledgeFreeFreight)
            .set(priviledgeSignIn).equalTo(row::getPriviledgeSignIn)
            .set(priviledgeComment).equalTo(row::getPriviledgeComment)
            .set(priviledgePromotion).equalTo(row::getPriviledgePromotion)
            .set(priviledgeMemberPrice).equalTo(row::getPriviledgeMemberPrice)
            .set(priviledgeBirthday).equalTo(row::getPriviledgeBirthday)
            .set(note).equalTo(row::getNote)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsMemberLevel row) {
        return update(c ->
            c.set(name).equalToWhenPresent(row::getName)
            .set(growthPoint).equalToWhenPresent(row::getGrowthPoint)
            .set(defaultStatus).equalToWhenPresent(row::getDefaultStatus)
            .set(freeFreightPoint).equalToWhenPresent(row::getFreeFreightPoint)
            .set(commentGrowthPoint).equalToWhenPresent(row::getCommentGrowthPoint)
            .set(priviledgeFreeFreight).equalToWhenPresent(row::getPriviledgeFreeFreight)
            .set(priviledgeSignIn).equalToWhenPresent(row::getPriviledgeSignIn)
            .set(priviledgeComment).equalToWhenPresent(row::getPriviledgeComment)
            .set(priviledgePromotion).equalToWhenPresent(row::getPriviledgePromotion)
            .set(priviledgeMemberPrice).equalToWhenPresent(row::getPriviledgeMemberPrice)
            .set(priviledgeBirthday).equalToWhenPresent(row::getPriviledgeBirthday)
            .set(note).equalToWhenPresent(row::getNote)
            .where(id, isEqualTo(row::getId))
        );
    }
}