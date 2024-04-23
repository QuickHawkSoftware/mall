package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class CmsHelpCategoryDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final CmsHelpCategory cmsHelpCategory = new CmsHelpCategory();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = cmsHelpCategory.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = cmsHelpCategory.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> icon = cmsHelpCategory.icon;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> helpCount = cmsHelpCategory.helpCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> showStatus = cmsHelpCategory.showStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> sort = cmsHelpCategory.sort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class CmsHelpCategory extends AliasableSqlTable<CmsHelpCategory> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> icon = column("icon", JDBCType.VARCHAR);

        public final SqlColumn<Integer> helpCount = column("help_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> showStatus = column("show_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public CmsHelpCategory() {
            super("cms_help_category", CmsHelpCategory::new);
        }
    }
}