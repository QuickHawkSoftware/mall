package com.macro.mall.mapper;

import static com.macro.mall.mapper.PmsProductVertifyRecordDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.PmsProductVertifyRecord;
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
public interface PmsProductVertifyRecordMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<PmsProductVertifyRecord>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, productId, createTime, vertifyMan, status, detail);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PmsProductVertifyRecordResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="vertify_man", property="vertifyMan", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="detail", property="detail", jdbcType=JdbcType.VARCHAR)
    })
    List<PmsProductVertifyRecord> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PmsProductVertifyRecordResult")
    Optional<PmsProductVertifyRecord> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, pmsProductVertifyRecord, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, pmsProductVertifyRecord, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(PmsProductVertifyRecord row) {
        return MyBatis3Utils.insert(this::insert, row, pmsProductVertifyRecord, c ->
            c.map(id).toProperty("id")
            .map(productId).toProperty("productId")
            .map(createTime).toProperty("createTime")
            .map(vertifyMan).toProperty("vertifyMan")
            .map(status).toProperty("status")
            .map(detail).toProperty("detail")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<PmsProductVertifyRecord> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, pmsProductVertifyRecord, c ->
            c.map(id).toProperty("id")
            .map(productId).toProperty("productId")
            .map(createTime).toProperty("createTime")
            .map(vertifyMan).toProperty("vertifyMan")
            .map(status).toProperty("status")
            .map(detail).toProperty("detail")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(PmsProductVertifyRecord row) {
        return MyBatis3Utils.insert(this::insert, row, pmsProductVertifyRecord, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(productId).toPropertyWhenPresent("productId", row::getProductId)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(vertifyMan).toPropertyWhenPresent("vertifyMan", row::getVertifyMan)
            .map(status).toPropertyWhenPresent("status", row::getStatus)
            .map(detail).toPropertyWhenPresent("detail", row::getDetail)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsProductVertifyRecord> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, pmsProductVertifyRecord, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsProductVertifyRecord> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, pmsProductVertifyRecord, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsProductVertifyRecord> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, pmsProductVertifyRecord, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsProductVertifyRecord> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, pmsProductVertifyRecord, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(PmsProductVertifyRecord row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(productId).equalTo(row::getProductId)
                .set(createTime).equalTo(row::getCreateTime)
                .set(vertifyMan).equalTo(row::getVertifyMan)
                .set(status).equalTo(row::getStatus)
                .set(detail).equalTo(row::getDetail);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PmsProductVertifyRecord row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(productId).equalToWhenPresent(row::getProductId)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(vertifyMan).equalToWhenPresent(row::getVertifyMan)
                .set(status).equalToWhenPresent(row::getStatus)
                .set(detail).equalToWhenPresent(row::getDetail);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(PmsProductVertifyRecord row) {
        return update(c ->
            c.set(productId).equalTo(row::getProductId)
            .set(createTime).equalTo(row::getCreateTime)
            .set(vertifyMan).equalTo(row::getVertifyMan)
            .set(status).equalTo(row::getStatus)
            .set(detail).equalTo(row::getDetail)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(PmsProductVertifyRecord row) {
        return update(c ->
            c.set(productId).equalToWhenPresent(row::getProductId)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(vertifyMan).equalToWhenPresent(row::getVertifyMan)
            .set(status).equalToWhenPresent(row::getStatus)
            .set(detail).equalToWhenPresent(row::getDetail)
            .where(id, isEqualTo(row::getId))
        );
    }
}