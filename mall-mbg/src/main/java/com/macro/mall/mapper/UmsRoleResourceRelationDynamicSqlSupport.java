package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UmsRoleResourceRelationDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsRoleResourceRelation umsRoleResourceRelation = new UmsRoleResourceRelation();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = umsRoleResourceRelation.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> roleId = umsRoleResourceRelation.roleId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> resourceId = umsRoleResourceRelation.resourceId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsRoleResourceRelation extends AliasableSqlTable<UmsRoleResourceRelation> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> roleId = column("role_id", JDBCType.BIGINT);

        public final SqlColumn<Long> resourceId = column("resource_id", JDBCType.BIGINT);

        public UmsRoleResourceRelation() {
            super("ums_role_resource_relation", UmsRoleResourceRelation::new);
        }
    }
}