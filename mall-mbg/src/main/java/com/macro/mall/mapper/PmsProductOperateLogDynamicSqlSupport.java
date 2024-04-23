package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class PmsProductOperateLogDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final PmsProductOperateLog pmsProductOperateLog = new PmsProductOperateLog();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = pmsProductOperateLog.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productId = pmsProductOperateLog.productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> priceOld = pmsProductOperateLog.priceOld;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> priceNew = pmsProductOperateLog.priceNew;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> salePriceOld = pmsProductOperateLog.salePriceOld;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> salePriceNew = pmsProductOperateLog.salePriceNew;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> giftPointOld = pmsProductOperateLog.giftPointOld;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> giftPointNew = pmsProductOperateLog.giftPointNew;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> usePointLimitOld = pmsProductOperateLog.usePointLimitOld;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> usePointLimitNew = pmsProductOperateLog.usePointLimitNew;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> operateMan = pmsProductOperateLog.operateMan;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = pmsProductOperateLog.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class PmsProductOperateLog extends AliasableSqlTable<PmsProductOperateLog> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> productId = column("product_id", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> priceOld = column("price_old", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> priceNew = column("price_new", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> salePriceOld = column("sale_price_old", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> salePriceNew = column("sale_price_new", JDBCType.DECIMAL);

        public final SqlColumn<Integer> giftPointOld = column("gift_point_old", JDBCType.INTEGER);

        public final SqlColumn<Integer> giftPointNew = column("gift_point_new", JDBCType.INTEGER);

        public final SqlColumn<Integer> usePointLimitOld = column("use_point_limit_old", JDBCType.INTEGER);

        public final SqlColumn<Integer> usePointLimitNew = column("use_point_limit_new", JDBCType.INTEGER);

        public final SqlColumn<String> operateMan = column("operate_man", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public PmsProductOperateLog() {
            super("pms_product_operate_log", PmsProductOperateLog::new);
        }
    }
}