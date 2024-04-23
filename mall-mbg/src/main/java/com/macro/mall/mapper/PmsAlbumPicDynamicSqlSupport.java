package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class PmsAlbumPicDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final PmsAlbumPic pmsAlbumPic = new PmsAlbumPic();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = pmsAlbumPic.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> albumId = pmsAlbumPic.albumId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> pic = pmsAlbumPic.pic;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class PmsAlbumPic extends AliasableSqlTable<PmsAlbumPic> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> albumId = column("album_id", JDBCType.BIGINT);

        public final SqlColumn<String> pic = column("pic", JDBCType.VARCHAR);

        public PmsAlbumPic() {
            super("pms_album_pic", PmsAlbumPic::new);
        }
    }
}