package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class CmsSubjectDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final CmsSubject cmsSubject = new CmsSubject();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = cmsSubject.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> categoryId = cmsSubject.categoryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> title = cmsSubject.title;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> pic = cmsSubject.pic;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> productCount = cmsSubject.productCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> recommendStatus = cmsSubject.recommendStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = cmsSubject.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> collectCount = cmsSubject.collectCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> readCount = cmsSubject.readCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> commentCount = cmsSubject.commentCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> albumPics = cmsSubject.albumPics;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> description = cmsSubject.description;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> showStatus = cmsSubject.showStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> forwardCount = cmsSubject.forwardCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> categoryName = cmsSubject.categoryName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> content = cmsSubject.content;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class CmsSubject extends AliasableSqlTable<CmsSubject> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> categoryId = column("category_id", JDBCType.BIGINT);

        public final SqlColumn<String> title = column("title", JDBCType.VARCHAR);

        public final SqlColumn<String> pic = column("pic", JDBCType.VARCHAR);

        public final SqlColumn<Integer> productCount = column("product_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> recommendStatus = column("recommend_status", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> collectCount = column("collect_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> readCount = column("read_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> commentCount = column("comment_count", JDBCType.INTEGER);

        public final SqlColumn<String> albumPics = column("album_pics", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<Integer> showStatus = column("show_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> forwardCount = column("forward_count", JDBCType.INTEGER);

        public final SqlColumn<String> categoryName = column("category_name", JDBCType.VARCHAR);

        public final SqlColumn<String> content = column("content", JDBCType.LONGVARCHAR);

        public CmsSubject() {
            super("cms_subject", CmsSubject::new);
        }
    }
}