package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class CmsPrefrenceAreaDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final CmsPrefrenceArea cmsPrefrenceArea = new CmsPrefrenceArea();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = cmsPrefrenceArea.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = cmsPrefrenceArea.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> subTitle = cmsPrefrenceArea.subTitle;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> sort = cmsPrefrenceArea.sort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> showStatus = cmsPrefrenceArea.showStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<byte[]> pic = cmsPrefrenceArea.pic;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class CmsPrefrenceArea extends AliasableSqlTable<CmsPrefrenceArea> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> subTitle = column("sub_title", JDBCType.VARCHAR);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public final SqlColumn<Integer> showStatus = column("show_status", JDBCType.INTEGER);

        public final SqlColumn<byte[]> pic = column("pic", JDBCType.VARBINARY);

        public CmsPrefrenceArea() {
            super("cms_prefrence_area", CmsPrefrenceArea::new);
        }
    }
}