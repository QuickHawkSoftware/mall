package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UmsIntegrationChangeHistoryDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsIntegrationChangeHistory umsIntegrationChangeHistory = new UmsIntegrationChangeHistory();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = umsIntegrationChangeHistory.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> memberId = umsIntegrationChangeHistory.memberId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = umsIntegrationChangeHistory.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> changeType = umsIntegrationChangeHistory.changeType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> changeCount = umsIntegrationChangeHistory.changeCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> operateMan = umsIntegrationChangeHistory.operateMan;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> operateNote = umsIntegrationChangeHistory.operateNote;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> sourceType = umsIntegrationChangeHistory.sourceType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsIntegrationChangeHistory extends AliasableSqlTable<UmsIntegrationChangeHistory> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> memberId = column("member_id", JDBCType.BIGINT);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> changeType = column("change_type", JDBCType.INTEGER);

        public final SqlColumn<Integer> changeCount = column("change_count", JDBCType.INTEGER);

        public final SqlColumn<String> operateMan = column("operate_man", JDBCType.VARCHAR);

        public final SqlColumn<String> operateNote = column("operate_note", JDBCType.VARCHAR);

        public final SqlColumn<Integer> sourceType = column("source_type", JDBCType.INTEGER);

        public UmsIntegrationChangeHistory() {
            super("ums_integration_change_history", UmsIntegrationChangeHistory::new);
        }
    }
}