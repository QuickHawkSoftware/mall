package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UmsAdminPermissionRelationDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsAdminPermissionRelation umsAdminPermissionRelation = new UmsAdminPermissionRelation();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = umsAdminPermissionRelation.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> adminId = umsAdminPermissionRelation.adminId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> permissionId = umsAdminPermissionRelation.permissionId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> type = umsAdminPermissionRelation.type;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsAdminPermissionRelation extends AliasableSqlTable<UmsAdminPermissionRelation> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> adminId = column("admin_id", JDBCType.BIGINT);

        public final SqlColumn<Long> permissionId = column("permission_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public UmsAdminPermissionRelation() {
            super("ums_admin_permission_relation", UmsAdminPermissionRelation::new);
        }
    }
}