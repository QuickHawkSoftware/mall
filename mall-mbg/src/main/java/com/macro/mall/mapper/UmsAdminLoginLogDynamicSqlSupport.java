package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UmsAdminLoginLogDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsAdminLoginLog umsAdminLoginLog = new UmsAdminLoginLog();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = umsAdminLoginLog.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> adminId = umsAdminLoginLog.adminId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = umsAdminLoginLog.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ip = umsAdminLoginLog.ip;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> address = umsAdminLoginLog.address;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> userAgent = umsAdminLoginLog.userAgent;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsAdminLoginLog extends AliasableSqlTable<UmsAdminLoginLog> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> adminId = column("admin_id", JDBCType.BIGINT);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> ip = column("ip", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<String> userAgent = column("user_agent", JDBCType.VARCHAR);

        public UmsAdminLoginLog() {
            super("ums_admin_login_log", UmsAdminLoginLog::new);
        }
    }
}