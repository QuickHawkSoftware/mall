package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class OmsOrderOperateHistoryDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final OmsOrderOperateHistory omsOrderOperateHistory = new OmsOrderOperateHistory();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = omsOrderOperateHistory.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> orderId = omsOrderOperateHistory.orderId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> operateMan = omsOrderOperateHistory.operateMan;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createTime = omsOrderOperateHistory.createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> orderStatus = omsOrderOperateHistory.orderStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> note = omsOrderOperateHistory.note;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class OmsOrderOperateHistory extends AliasableSqlTable<OmsOrderOperateHistory> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> orderId = column("order_id", JDBCType.BIGINT);

        public final SqlColumn<String> operateMan = column("operate_man", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> orderStatus = column("order_status", JDBCType.INTEGER);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public OmsOrderOperateHistory() {
            super("oms_order_operate_history", OmsOrderOperateHistory::new);
        }
    }
}