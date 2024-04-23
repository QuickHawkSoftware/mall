package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.math.BigDecimal;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UmsMemberTagDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsMemberTag umsMemberTag = new UmsMemberTag();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = umsMemberTag.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = umsMemberTag.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> finishOrderCount = umsMemberTag.finishOrderCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> finishOrderAmount = umsMemberTag.finishOrderAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsMemberTag extends AliasableSqlTable<UmsMemberTag> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> finishOrderCount = column("finish_order_count", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> finishOrderAmount = column("finish_order_amount", JDBCType.DECIMAL);

        public UmsMemberTag() {
            super("ums_member_tag", UmsMemberTag::new);
        }
    }
}