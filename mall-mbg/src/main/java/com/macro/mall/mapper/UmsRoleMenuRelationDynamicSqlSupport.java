package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UmsRoleMenuRelationDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsRoleMenuRelation umsRoleMenuRelation = new UmsRoleMenuRelation();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = umsRoleMenuRelation.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> roleId = umsRoleMenuRelation.roleId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> menuId = umsRoleMenuRelation.menuId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsRoleMenuRelation extends AliasableSqlTable<UmsRoleMenuRelation> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> roleId = column("role_id", JDBCType.BIGINT);

        public final SqlColumn<Long> menuId = column("menu_id", JDBCType.BIGINT);

        public UmsRoleMenuRelation() {
            super("ums_role_menu_relation", UmsRoleMenuRelation::new);
        }
    }
}