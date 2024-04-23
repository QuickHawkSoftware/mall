package com.macro.mall.mapper;

import static com.macro.mall.mapper.CmsMemberReportDynamicSqlSupport.*;

import com.macro.mall.model.CmsMemberReport;
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
public interface CmsMemberReportMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<CmsMemberReport>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, reportType, reportMemberName, createTime, reportObject, reportStatus, handleStatus, note);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CmsMemberReportResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT),
        @Result(column="report_type", property="reportType", jdbcType=JdbcType.INTEGER),
        @Result(column="report_member_name", property="reportMemberName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="report_object", property="reportObject", jdbcType=JdbcType.VARCHAR),
        @Result(column="report_status", property="reportStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="handle_status", property="handleStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR)
    })
    List<CmsMemberReport> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CmsMemberReportResult")
    Optional<CmsMemberReport> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cmsMemberReport, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cmsMemberReport, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(CmsMemberReport row) {
        return MyBatis3Utils.insert(this::insert, row, cmsMemberReport, c ->
            c.map(id).toProperty("id")
            .map(reportType).toProperty("reportType")
            .map(reportMemberName).toProperty("reportMemberName")
            .map(createTime).toProperty("createTime")
            .map(reportObject).toProperty("reportObject")
            .map(reportStatus).toProperty("reportStatus")
            .map(handleStatus).toProperty("handleStatus")
            .map(note).toProperty("note")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<CmsMemberReport> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, cmsMemberReport, c ->
            c.map(id).toProperty("id")
            .map(reportType).toProperty("reportType")
            .map(reportMemberName).toProperty("reportMemberName")
            .map(createTime).toProperty("createTime")
            .map(reportObject).toProperty("reportObject")
            .map(reportStatus).toProperty("reportStatus")
            .map(handleStatus).toProperty("handleStatus")
            .map(note).toProperty("note")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(CmsMemberReport row) {
        return MyBatis3Utils.insert(this::insert, row, cmsMemberReport, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(reportType).toPropertyWhenPresent("reportType", row::getReportType)
            .map(reportMemberName).toPropertyWhenPresent("reportMemberName", row::getReportMemberName)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(reportObject).toPropertyWhenPresent("reportObject", row::getReportObject)
            .map(reportStatus).toPropertyWhenPresent("reportStatus", row::getReportStatus)
            .map(handleStatus).toPropertyWhenPresent("handleStatus", row::getHandleStatus)
            .map(note).toPropertyWhenPresent("note", row::getNote)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<CmsMemberReport> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, cmsMemberReport, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<CmsMemberReport> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, cmsMemberReport, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<CmsMemberReport> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, cmsMemberReport, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cmsMemberReport, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(CmsMemberReport row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(reportType).equalTo(row::getReportType)
                .set(reportMemberName).equalTo(row::getReportMemberName)
                .set(createTime).equalTo(row::getCreateTime)
                .set(reportObject).equalTo(row::getReportObject)
                .set(reportStatus).equalTo(row::getReportStatus)
                .set(handleStatus).equalTo(row::getHandleStatus)
                .set(note).equalTo(row::getNote);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CmsMemberReport row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(reportType).equalToWhenPresent(row::getReportType)
                .set(reportMemberName).equalToWhenPresent(row::getReportMemberName)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(reportObject).equalToWhenPresent(row::getReportObject)
                .set(reportStatus).equalToWhenPresent(row::getReportStatus)
                .set(handleStatus).equalToWhenPresent(row::getHandleStatus)
                .set(note).equalToWhenPresent(row::getNote);
    }
}