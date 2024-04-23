package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class OmsCompanyAddressDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final OmsCompanyAddress omsCompanyAddress = new OmsCompanyAddress();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = omsCompanyAddress.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> addressName = omsCompanyAddress.addressName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> sendStatus = omsCompanyAddress.sendStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> receiveStatus = omsCompanyAddress.receiveStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = omsCompanyAddress.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> phone = omsCompanyAddress.phone;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> province = omsCompanyAddress.province;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> city = omsCompanyAddress.city;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> region = omsCompanyAddress.region;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> detailAddress = omsCompanyAddress.detailAddress;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class OmsCompanyAddress extends AliasableSqlTable<OmsCompanyAddress> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> addressName = column("address_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> sendStatus = column("send_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> receiveStatus = column("receive_status", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public final SqlColumn<String> province = column("province", JDBCType.VARCHAR);

        public final SqlColumn<String> city = column("city", JDBCType.VARCHAR);

        public final SqlColumn<String> region = column("region", JDBCType.VARCHAR);

        public final SqlColumn<String> detailAddress = column("detail_address", JDBCType.VARCHAR);

        public OmsCompanyAddress() {
            super("oms_company_address", OmsCompanyAddress::new);
        }
    }
}