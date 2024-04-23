package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class PmsBrandDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final PmsBrand pmsBrand = new PmsBrand();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = pmsBrand.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = pmsBrand.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> firstLetter = pmsBrand.firstLetter;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> sort = pmsBrand.sort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> factoryStatus = pmsBrand.factoryStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> showStatus = pmsBrand.showStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> productCount = pmsBrand.productCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> productCommentCount = pmsBrand.productCommentCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> logo = pmsBrand.logo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> bigPic = pmsBrand.bigPic;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> brandStory = pmsBrand.brandStory;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class PmsBrand extends AliasableSqlTable<PmsBrand> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> firstLetter = column("first_letter", JDBCType.VARCHAR);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public final SqlColumn<Integer> factoryStatus = column("factory_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> showStatus = column("show_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> productCount = column("product_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> productCommentCount = column("product_comment_count", JDBCType.INTEGER);

        public final SqlColumn<String> logo = column("logo", JDBCType.VARCHAR);

        public final SqlColumn<String> bigPic = column("big_pic", JDBCType.VARCHAR);

        public final SqlColumn<String> brandStory = column("brand_story", JDBCType.LONGVARCHAR);

        public PmsBrand() {
            super("pms_brand", PmsBrand::new);
        }
    }
}