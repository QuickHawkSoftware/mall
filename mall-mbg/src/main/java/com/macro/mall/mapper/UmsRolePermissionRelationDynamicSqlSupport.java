package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UmsRolePermissionRelationDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsRolePermissionRelation umsRolePermissionRelation = new UmsRolePermissionRelation();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = umsRolePermissionRelation.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> roleId = umsRolePermissionRelation.roleId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> permissionId = umsRolePermissionRelation.permissionId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsRolePermissionRelation extends AliasableSqlTable<UmsRolePermissionRelation> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> roleId = column("role_id", JDBCType.BIGINT);

        public final SqlColumn<Long> permissionId = column("permission_id", JDBCType.BIGINT);

        public UmsRolePermissionRelation() {
            super("ums_role_permission_relation", UmsRolePermissionRelation::new);
        }
    }
}