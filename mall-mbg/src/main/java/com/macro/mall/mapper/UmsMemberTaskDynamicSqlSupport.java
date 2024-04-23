package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UmsMemberTaskDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsMemberTask umsMemberTask = new UmsMemberTask();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = umsMemberTask.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = umsMemberTask.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> growth = umsMemberTask.growth;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> intergration = umsMemberTask.intergration;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> type = umsMemberTask.type;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsMemberTask extends AliasableSqlTable<UmsMemberTask> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> growth = column("growth", JDBCType.INTEGER);

        public final SqlColumn<Integer> intergration = column("intergration", JDBCType.INTEGER);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public UmsMemberTask() {
            super("ums_member_task", UmsMemberTask::new);
        }
    }
}