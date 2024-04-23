package com.macro.mall.mapper;

import static com.macro.mall.mapper.PmsCommentDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.PmsComment;
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
public interface PmsCommentMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<PmsComment>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, productId, memberNickName, productName, star, memberIp, createTime, showStatus, productAttribute, collectCouont, readCount, pics, memberIcon, replayCount, content);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PmsCommentResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.BIGINT),
        @Result(column="member_nick_name", property="memberNickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_name", property="productName", jdbcType=JdbcType.VARCHAR),
        @Result(column="star", property="star", jdbcType=JdbcType.INTEGER),
        @Result(column="member_ip", property="memberIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="show_status", property="showStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="product_attribute", property="productAttribute", jdbcType=JdbcType.VARCHAR),
        @Result(column="collect_couont", property="collectCouont", jdbcType=JdbcType.INTEGER),
        @Result(column="read_count", property="readCount", jdbcType=JdbcType.INTEGER),
        @Result(column="pics", property="pics", jdbcType=JdbcType.VARCHAR),
        @Result(column="member_icon", property="memberIcon", jdbcType=JdbcType.VARCHAR),
        @Result(column="replay_count", property="replayCount", jdbcType=JdbcType.INTEGER),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<PmsComment> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PmsCommentResult")
    Optional<PmsComment> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, pmsComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, pmsComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(PmsComment row) {
        return MyBatis3Utils.insert(this::insert, row, pmsComment, c ->
            c.map(id).toProperty("id")
            .map(productId).toProperty("productId")
            .map(memberNickName).toProperty("memberNickName")
            .map(productName).toProperty("productName")
            .map(star).toProperty("star")
            .map(memberIp).toProperty("memberIp")
            .map(createTime).toProperty("createTime")
            .map(showStatus).toProperty("showStatus")
            .map(productAttribute).toProperty("productAttribute")
            .map(collectCouont).toProperty("collectCouont")
            .map(readCount).toProperty("readCount")
            .map(pics).toProperty("pics")
            .map(memberIcon).toProperty("memberIcon")
            .map(replayCount).toProperty("replayCount")
            .map(content).toProperty("content")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<PmsComment> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, pmsComment, c ->
            c.map(id).toProperty("id")
            .map(productId).toProperty("productId")
            .map(memberNickName).toProperty("memberNickName")
            .map(productName).toProperty("productName")
            .map(star).toProperty("star")
            .map(memberIp).toProperty("memberIp")
            .map(createTime).toProperty("createTime")
            .map(showStatus).toProperty("showStatus")
            .map(productAttribute).toProperty("productAttribute")
            .map(collectCouont).toProperty("collectCouont")
            .map(readCount).toProperty("readCount")
            .map(pics).toProperty("pics")
            .map(memberIcon).toProperty("memberIcon")
            .map(replayCount).toProperty("replayCount")
            .map(content).toProperty("content")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(PmsComment row) {
        return MyBatis3Utils.insert(this::insert, row, pmsComment, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(productId).toPropertyWhenPresent("productId", row::getProductId)
            .map(memberNickName).toPropertyWhenPresent("memberNickName", row::getMemberNickName)
            .map(productName).toPropertyWhenPresent("productName", row::getProductName)
            .map(star).toPropertyWhenPresent("star", row::getStar)
            .map(memberIp).toPropertyWhenPresent("memberIp", row::getMemberIp)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(showStatus).toPropertyWhenPresent("showStatus", row::getShowStatus)
            .map(productAttribute).toPropertyWhenPresent("productAttribute", row::getProductAttribute)
            .map(collectCouont).toPropertyWhenPresent("collectCouont", row::getCollectCouont)
            .map(readCount).toPropertyWhenPresent("readCount", row::getReadCount)
            .map(pics).toPropertyWhenPresent("pics", row::getPics)
            .map(memberIcon).toPropertyWhenPresent("memberIcon", row::getMemberIcon)
            .map(replayCount).toPropertyWhenPresent("replayCount", row::getReplayCount)
            .map(content).toPropertyWhenPresent("content", row::getContent)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsComment> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, pmsComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsComment> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, pmsComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsComment> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, pmsComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsComment> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, pmsComment, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(PmsComment row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(productId).equalTo(row::getProductId)
                .set(memberNickName).equalTo(row::getMemberNickName)
                .set(productName).equalTo(row::getProductName)
                .set(star).equalTo(row::getStar)
                .set(memberIp).equalTo(row::getMemberIp)
                .set(createTime).equalTo(row::getCreateTime)
                .set(showStatus).equalTo(row::getShowStatus)
                .set(productAttribute).equalTo(row::getProductAttribute)
                .set(collectCouont).equalTo(row::getCollectCouont)
                .set(readCount).equalTo(row::getReadCount)
                .set(pics).equalTo(row::getPics)
                .set(memberIcon).equalTo(row::getMemberIcon)
                .set(replayCount).equalTo(row::getReplayCount)
                .set(content).equalTo(row::getContent);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PmsComment row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(productId).equalToWhenPresent(row::getProductId)
                .set(memberNickName).equalToWhenPresent(row::getMemberNickName)
                .set(productName).equalToWhenPresent(row::getProductName)
                .set(star).equalToWhenPresent(row::getStar)
                .set(memberIp).equalToWhenPresent(row::getMemberIp)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(showStatus).equalToWhenPresent(row::getShowStatus)
                .set(productAttribute).equalToWhenPresent(row::getProductAttribute)
                .set(collectCouont).equalToWhenPresent(row::getCollectCouont)
                .set(readCount).equalToWhenPresent(row::getReadCount)
                .set(pics).equalToWhenPresent(row::getPics)
                .set(memberIcon).equalToWhenPresent(row::getMemberIcon)
                .set(replayCount).equalToWhenPresent(row::getReplayCount)
                .set(content).equalToWhenPresent(row::getContent);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(PmsComment row) {
        return update(c ->
            c.set(productId).equalTo(row::getProductId)
            .set(memberNickName).equalTo(row::getMemberNickName)
            .set(productName).equalTo(row::getProductName)
            .set(star).equalTo(row::getStar)
            .set(memberIp).equalTo(row::getMemberIp)
            .set(createTime).equalTo(row::getCreateTime)
            .set(showStatus).equalTo(row::getShowStatus)
            .set(productAttribute).equalTo(row::getProductAttribute)
            .set(collectCouont).equalTo(row::getCollectCouont)
            .set(readCount).equalTo(row::getReadCount)
            .set(pics).equalTo(row::getPics)
            .set(memberIcon).equalTo(row::getMemberIcon)
            .set(replayCount).equalTo(row::getReplayCount)
            .set(content).equalTo(row::getContent)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(PmsComment row) {
        return update(c ->
            c.set(productId).equalToWhenPresent(row::getProductId)
            .set(memberNickName).equalToWhenPresent(row::getMemberNickName)
            .set(productName).equalToWhenPresent(row::getProductName)
            .set(star).equalToWhenPresent(row::getStar)
            .set(memberIp).equalToWhenPresent(row::getMemberIp)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(showStatus).equalToWhenPresent(row::getShowStatus)
            .set(productAttribute).equalToWhenPresent(row::getProductAttribute)
            .set(collectCouont).equalToWhenPresent(row::getCollectCouont)
            .set(readCount).equalToWhenPresent(row::getReadCount)
            .set(pics).equalToWhenPresent(row::getPics)
            .set(memberIcon).equalToWhenPresent(row::getMemberIcon)
            .set(replayCount).equalToWhenPresent(row::getReplayCount)
            .set(content).equalToWhenPresent(row::getContent)
            .where(id, isEqualTo(row::getId))
        );
    }
}