package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.math.BigDecimal;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class PmsMemberPriceDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final PmsMemberPrice pmsMemberPrice = new PmsMemberPrice();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = pmsMemberPrice.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productId = pmsMemberPrice.productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> memberLevelId = pmsMemberPrice.memberLevelId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> memberPrice = pmsMemberPrice.memberPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> memberLevelName = pmsMemberPrice.memberLevelName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class PmsMemberPrice extends AliasableSqlTable<PmsMemberPrice> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> productId = column("product_id", JDBCType.BIGINT);

        public final SqlColumn<Long> memberLevelId = column("member_level_id", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> memberPrice = column("member_price", JDBCType.DECIMAL);

        public final SqlColumn<String> memberLevelName = column("member_level_name", JDBCType.VARCHAR);

        public PmsMemberPrice() {
            super("pms_member_price", PmsMemberPrice::new);
        }
    }
}