package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class CmsMemberReportDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final CmsMemberReport cmsMemberReport = new CmsMemberReport();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = cmsMemberReport.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> reportType = cmsMemberReport.reportType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> reportMemberName = cmsMemberReport.reportMemberName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = cmsMemberReport.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> reportObject = cmsMemberReport.reportObject;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> reportStatus = cmsMemberReport.reportStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> handleStatus = cmsMemberReport.handleStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> note = cmsMemberReport.note;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class CmsMemberReport extends AliasableSqlTable<CmsMemberReport> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Integer> reportType = column("report_type", JDBCType.INTEGER);

        public final SqlColumn<String> reportMemberName = column("report_member_name", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> reportObject = column("report_object", JDBCType.VARCHAR);

        public final SqlColumn<Integer> reportStatus = column("report_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> handleStatus = column("handle_status", JDBCType.INTEGER);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public CmsMemberReport() {
            super("cms_member_report", CmsMemberReport::new);
        }
    }
}