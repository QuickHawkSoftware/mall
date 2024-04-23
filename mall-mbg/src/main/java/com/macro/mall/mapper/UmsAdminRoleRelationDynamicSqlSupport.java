package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UmsAdminRoleRelationDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsAdminRoleRelation umsAdminRoleRelation = new UmsAdminRoleRelation();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = umsAdminRoleRelation.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> adminId = umsAdminRoleRelation.adminId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> roleId = umsAdminRoleRelation.roleId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsAdminRoleRelation extends AliasableSqlTable<UmsAdminRoleRelation> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> adminId = column("admin_id", JDBCType.BIGINT);

        public final SqlColumn<Long> roleId = column("role_id", JDBCType.BIGINT);

        public UmsAdminRoleRelation() {
            super("ums_admin_role_relation", UmsAdminRoleRelation::new);
        }
    }
}