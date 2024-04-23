package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.math.BigDecimal;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UmsMemberRuleSettingDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsMemberRuleSetting umsMemberRuleSetting = new UmsMemberRuleSetting();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = umsMemberRuleSetting.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> continueSignDay = umsMemberRuleSetting.continueSignDay;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> continueSignPoint = umsMemberRuleSetting.continueSignPoint;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> consumePerPoint = umsMemberRuleSetting.consumePerPoint;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> lowOrderAmount = umsMemberRuleSetting.lowOrderAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> maxPointPerOrder = umsMemberRuleSetting.maxPointPerOrder;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> type = umsMemberRuleSetting.type;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsMemberRuleSetting extends AliasableSqlTable<UmsMemberRuleSetting> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Integer> continueSignDay = column("continue_sign_day", JDBCType.INTEGER);

        public final SqlColumn<Integer> continueSignPoint = column("continue_sign_point", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> consumePerPoint = column("consume_per_point", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> lowOrderAmount = column("low_order_amount", JDBCType.DECIMAL);

        public final SqlColumn<Integer> maxPointPerOrder = column("max_point_per_order", JDBCType.INTEGER);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public UmsMemberRuleSetting() {
            super("ums_member_rule_setting", UmsMemberRuleSetting::new);
        }
    }
}