package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.math.BigDecimal;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class PmsProductFullReductionDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final PmsProductFullReduction pmsProductFullReduction = new PmsProductFullReduction();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = pmsProductFullReduction.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productId = pmsProductFullReduction.productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> fullPrice = pmsProductFullReduction.fullPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> reducePrice = pmsProductFullReduction.reducePrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class PmsProductFullReduction extends AliasableSqlTable<PmsProductFullReduction> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> productId = column("product_id", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> fullPrice = column("full_price", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> reducePrice = column("reduce_price", JDBCType.DECIMAL);

        public PmsProductFullReduction() {
            super("pms_product_full_reduction", PmsProductFullReduction::new);
        }
    }
}