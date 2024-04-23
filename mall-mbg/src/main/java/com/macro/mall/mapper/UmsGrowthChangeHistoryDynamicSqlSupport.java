package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UmsGrowthChangeHistoryDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsGrowthChangeHistory umsGrowthChangeHistory = new UmsGrowthChangeHistory();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = umsGrowthChangeHistory.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> memberId = umsGrowthChangeHistory.memberId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = umsGrowthChangeHistory.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> changeType = umsGrowthChangeHistory.changeType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> changeCount = umsGrowthChangeHistory.changeCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> operateMan = umsGrowthChangeHistory.operateMan;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> operateNote = umsGrowthChangeHistory.operateNote;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> sourceType = umsGrowthChangeHistory.sourceType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsGrowthChangeHistory extends AliasableSqlTable<UmsGrowthChangeHistory> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> memberId = column("member_id", JDBCType.BIGINT);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> changeType = column("change_type", JDBCType.INTEGER);

        public final SqlColumn<Integer> changeCount = column("change_count", JDBCType.INTEGER);

        public final SqlColumn<String> operateMan = column("operate_man", JDBCType.VARCHAR);

        public final SqlColumn<String> operateNote = column("operate_note", JDBCType.VARCHAR);

        public final SqlColumn<Integer> sourceType = column("source_type", JDBCType.INTEGER);

        public UmsGrowthChangeHistory() {
            super("ums_growth_change_history", UmsGrowthChangeHistory::new);
        }
    }
}