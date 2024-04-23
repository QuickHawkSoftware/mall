package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.math.BigDecimal;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class PmsProductLadderDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final PmsProductLadder pmsProductLadder = new PmsProductLadder();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = pmsProductLadder.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productId = pmsProductLadder.productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> count = pmsProductLadder.count;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> discount = pmsProductLadder.discount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> price = pmsProductLadder.price;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class PmsProductLadder extends AliasableSqlTable<PmsProductLadder> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> productId = column("product_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> count = column("count", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> discount = column("discount", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> price = column("price", JDBCType.DECIMAL);

        public PmsProductLadder() {
            super("pms_product_ladder", PmsProductLadder::new);
        }
    }
}