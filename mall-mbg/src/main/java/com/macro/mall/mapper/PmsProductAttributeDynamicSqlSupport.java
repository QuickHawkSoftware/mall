package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class PmsProductAttributeDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final PmsProductAttribute pmsProductAttribute = new PmsProductAttribute();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = pmsProductAttribute.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productAttributeCategoryId = pmsProductAttribute.productAttributeCategoryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = pmsProductAttribute.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> selectType = pmsProductAttribute.selectType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> inputType = pmsProductAttribute.inputType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> inputList = pmsProductAttribute.inputList;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> sort = pmsProductAttribute.sort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> filterType = pmsProductAttribute.filterType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> searchType = pmsProductAttribute.searchType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> relatedStatus = pmsProductAttribute.relatedStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> handAddStatus = pmsProductAttribute.handAddStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> type = pmsProductAttribute.type;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class PmsProductAttribute extends AliasableSqlTable<PmsProductAttribute> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> productAttributeCategoryId = column("product_attribute_category_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> selectType = column("select_type", JDBCType.INTEGER);

        public final SqlColumn<Integer> inputType = column("input_type", JDBCType.INTEGER);

        public final SqlColumn<String> inputList = column("input_list", JDBCType.VARCHAR);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public final SqlColumn<Integer> filterType = column("filter_type", JDBCType.INTEGER);

        public final SqlColumn<Integer> searchType = column("search_type", JDBCType.INTEGER);

        public final SqlColumn<Integer> relatedStatus = column("related_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> handAddStatus = column("hand_add_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public PmsProductAttribute() {
            super("pms_product_attribute", PmsProductAttribute::new);
        }
    }
}