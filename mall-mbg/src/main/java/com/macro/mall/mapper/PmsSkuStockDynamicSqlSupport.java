package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.math.BigDecimal;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class PmsSkuStockDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final PmsSkuStock pmsSkuStock = new PmsSkuStock();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = pmsSkuStock.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productId = pmsSkuStock.productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> skuCode = pmsSkuStock.skuCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> price = pmsSkuStock.price;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> stock = pmsSkuStock.stock;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> lowStock = pmsSkuStock.lowStock;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> pic = pmsSkuStock.pic;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> sale = pmsSkuStock.sale;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> promotionPrice = pmsSkuStock.promotionPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> lockStock = pmsSkuStock.lockStock;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> spData = pmsSkuStock.spData;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class PmsSkuStock extends AliasableSqlTable<PmsSkuStock> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> productId = column("product_id", JDBCType.BIGINT);

        public final SqlColumn<String> skuCode = column("sku_code", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> price = column("price", JDBCType.DECIMAL);

        public final SqlColumn<Integer> stock = column("stock", JDBCType.INTEGER);

        public final SqlColumn<Integer> lowStock = column("low_stock", JDBCType.INTEGER);

        public final SqlColumn<String> pic = column("pic", JDBCType.VARCHAR);

        public final SqlColumn<Integer> sale = column("sale", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> promotionPrice = column("promotion_price", JDBCType.DECIMAL);

        public final SqlColumn<Integer> lockStock = column("lock_stock", JDBCType.INTEGER);

        public final SqlColumn<String> spData = column("sp_data", JDBCType.VARCHAR);

        public PmsSkuStock() {
            super("pms_sku_stock", PmsSkuStock::new);
        }
    }
}