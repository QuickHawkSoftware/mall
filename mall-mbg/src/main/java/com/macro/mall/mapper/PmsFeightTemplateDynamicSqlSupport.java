package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.math.BigDecimal;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class PmsFeightTemplateDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final PmsFeightTemplate pmsFeightTemplate = new PmsFeightTemplate();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = pmsFeightTemplate.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = pmsFeightTemplate.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> chargeType = pmsFeightTemplate.chargeType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> firstWeight = pmsFeightTemplate.firstWeight;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> firstFee = pmsFeightTemplate.firstFee;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> continueWeight = pmsFeightTemplate.continueWeight;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> continmeFee = pmsFeightTemplate.continmeFee;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dest = pmsFeightTemplate.dest;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class PmsFeightTemplate extends AliasableSqlTable<PmsFeightTemplate> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> chargeType = column("charge_type", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> firstWeight = column("first_weight", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> firstFee = column("first_fee", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> continueWeight = column("continue_weight", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> continmeFee = column("continme_fee", JDBCType.DECIMAL);

        public final SqlColumn<String> dest = column("dest", JDBCType.VARCHAR);

        public PmsFeightTemplate() {
            super("pms_feight_template", PmsFeightTemplate::new);
        }
    }
}