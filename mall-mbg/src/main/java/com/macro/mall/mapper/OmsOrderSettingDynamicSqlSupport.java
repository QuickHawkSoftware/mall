package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class OmsOrderSettingDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final OmsOrderSetting omsOrderSetting = new OmsOrderSetting();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = omsOrderSetting.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> flashOrderOvertime = omsOrderSetting.flashOrderOvertime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> normalOrderOvertime = omsOrderSetting.normalOrderOvertime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> confirmOvertime = omsOrderSetting.confirmOvertime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> finishOvertime = omsOrderSetting.finishOvertime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> commentOvertime = omsOrderSetting.commentOvertime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class OmsOrderSetting extends AliasableSqlTable<OmsOrderSetting> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Integer> flashOrderOvertime = column("flash_order_overtime", JDBCType.INTEGER);

        public final SqlColumn<Integer> normalOrderOvertime = column("normal_order_overtime", JDBCType.INTEGER);

        public final SqlColumn<Integer> confirmOvertime = column("confirm_overtime", JDBCType.INTEGER);

        public final SqlColumn<Integer> finishOvertime = column("finish_overtime", JDBCType.INTEGER);

        public final SqlColumn<Integer> commentOvertime = column("comment_overtime", JDBCType.INTEGER);

        public OmsOrderSetting() {
            super("oms_order_setting", OmsOrderSetting::new);
        }
    }
}