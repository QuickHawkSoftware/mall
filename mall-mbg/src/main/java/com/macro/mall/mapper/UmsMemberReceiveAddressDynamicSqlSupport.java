package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UmsMemberReceiveAddressDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = umsMemberReceiveAddress.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> memberId = umsMemberReceiveAddress.memberId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = umsMemberReceiveAddress.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> phoneNumber = umsMemberReceiveAddress.phoneNumber;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> defaultStatus = umsMemberReceiveAddress.defaultStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> postCode = umsMemberReceiveAddress.postCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> province = umsMemberReceiveAddress.province;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> city = umsMemberReceiveAddress.city;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> region = umsMemberReceiveAddress.region;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> detailAddress = umsMemberReceiveAddress.detailAddress;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsMemberReceiveAddress extends AliasableSqlTable<UmsMemberReceiveAddress> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> memberId = column("member_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> phoneNumber = column("phone_number", JDBCType.VARCHAR);

        public final SqlColumn<Integer> defaultStatus = column("default_status", JDBCType.INTEGER);

        public final SqlColumn<String> postCode = column("post_code", JDBCType.VARCHAR);

        public final SqlColumn<String> province = column("province", JDBCType.VARCHAR);

        public final SqlColumn<String> city = column("city", JDBCType.VARCHAR);

        public final SqlColumn<String> region = column("region", JDBCType.VARCHAR);

        public final SqlColumn<String> detailAddress = column("detail_address", JDBCType.VARCHAR);

        public UmsMemberReceiveAddress() {
            super("ums_member_receive_address", UmsMemberReceiveAddress::new);
        }
    }
}