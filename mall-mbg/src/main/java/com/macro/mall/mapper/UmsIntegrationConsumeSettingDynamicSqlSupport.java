package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UmsIntegrationConsumeSettingDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsIntegrationConsumeSetting umsIntegrationConsumeSetting = new UmsIntegrationConsumeSetting();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = umsIntegrationConsumeSetting.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> deductionPerAmount = umsIntegrationConsumeSetting.deductionPerAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> maxPercentPerOrder = umsIntegrationConsumeSetting.maxPercentPerOrder;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> useUnit = umsIntegrationConsumeSetting.useUnit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> couponStatus = umsIntegrationConsumeSetting.couponStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsIntegrationConsumeSetting extends AliasableSqlTable<UmsIntegrationConsumeSetting> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Integer> deductionPerAmount = column("deduction_per_amount", JDBCType.INTEGER);

        public final SqlColumn<Integer> maxPercentPerOrder = column("max_percent_per_order", JDBCType.INTEGER);

        public final SqlColumn<Integer> useUnit = column("use_unit", JDBCType.INTEGER);

        public final SqlColumn<Integer> couponStatus = column("coupon_status", JDBCType.INTEGER);

        public UmsIntegrationConsumeSetting() {
            super("ums_integration_consume_setting", UmsIntegrationConsumeSetting::new);
        }
    }
}