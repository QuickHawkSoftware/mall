package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class CmsTopicCategoryDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final CmsTopicCategory cmsTopicCategory = new CmsTopicCategory();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = cmsTopicCategory.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = cmsTopicCategory.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> icon = cmsTopicCategory.icon;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> subjectCount = cmsTopicCategory.subjectCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> showStatus = cmsTopicCategory.showStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> sort = cmsTopicCategory.sort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class CmsTopicCategory extends AliasableSqlTable<CmsTopicCategory> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> icon = column("icon", JDBCType.VARCHAR);

        public final SqlColumn<Integer> subjectCount = column("subject_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> showStatus = column("show_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public CmsTopicCategory() {
            super("cms_topic_category", CmsTopicCategory::new);
        }
    }
}