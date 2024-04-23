package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UmsMemberMemberTagRelationDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsMemberMemberTagRelation umsMemberMemberTagRelation = new UmsMemberMemberTagRelation();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = umsMemberMemberTagRelation.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> memberId = umsMemberMemberTagRelation.memberId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> tagId = umsMemberMemberTagRelation.tagId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsMemberMemberTagRelation extends AliasableSqlTable<UmsMemberMemberTagRelation> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> memberId = column("member_id", JDBCType.BIGINT);

        public final SqlColumn<Long> tagId = column("tag_id", JDBCType.BIGINT);

        public UmsMemberMemberTagRelation() {
            super("ums_member_member_tag_relation", UmsMemberMemberTagRelation::new);
        }
    }
}