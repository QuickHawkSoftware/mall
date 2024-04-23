package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class PmsAlbumDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final PmsAlbum pmsAlbum = new PmsAlbum();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = pmsAlbum.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = pmsAlbum.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> coverPic = pmsAlbum.coverPic;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> picCount = pmsAlbum.picCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> sort = pmsAlbum.sort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> description = pmsAlbum.description;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class PmsAlbum extends AliasableSqlTable<PmsAlbum> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> coverPic = column("cover_pic", JDBCType.VARCHAR);

        public final SqlColumn<Integer> picCount = column("pic_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public PmsAlbum() {
            super("pms_album", PmsAlbum::new);
        }
    }
}