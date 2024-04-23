package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SmsHomeBrandDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SmsHomeBrand smsHomeBrand = new SmsHomeBrand();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = smsHomeBrand.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> brandId = smsHomeBrand.brandId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> brandName = smsHomeBrand.brandName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> recommendStatus = smsHomeBrand.recommendStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> sort = smsHomeBrand.sort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SmsHomeBrand extends AliasableSqlTable<SmsHomeBrand> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> brandId = column("brand_id", JDBCType.BIGINT);

        public final SqlColumn<String> brandName = column("brand_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> recommendStatus = column("recommend_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public SmsHomeBrand() {
            super("sms_home_brand", SmsHomeBrand::new);
        }
    }
}