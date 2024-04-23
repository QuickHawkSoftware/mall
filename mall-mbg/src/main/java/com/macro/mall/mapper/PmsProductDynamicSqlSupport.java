package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class PmsProductDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final PmsProduct pmsProduct = new PmsProduct();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = pmsProduct.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> brandId = pmsProduct.brandId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productCategoryId = pmsProduct.productCategoryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> feightTemplateId = pmsProduct.feightTemplateId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productAttributeCategoryId = pmsProduct.productAttributeCategoryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = pmsProduct.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> pic = pmsProduct.pic;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productSn = pmsProduct.productSn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> deleteStatus = pmsProduct.deleteStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> publishStatus = pmsProduct.publishStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> newStatus = pmsProduct.newStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> recommandStatus = pmsProduct.recommandStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> verifyStatus = pmsProduct.verifyStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> sort = pmsProduct.sort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> sale = pmsProduct.sale;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> price = pmsProduct.price;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> promotionPrice = pmsProduct.promotionPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> giftGrowth = pmsProduct.giftGrowth;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> giftPoint = pmsProduct.giftPoint;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> usePointLimit = pmsProduct.usePointLimit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> subTitle = pmsProduct.subTitle;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> originalPrice = pmsProduct.originalPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> stock = pmsProduct.stock;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> lowStock = pmsProduct.lowStock;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> unit = pmsProduct.unit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> weight = pmsProduct.weight;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> previewStatus = pmsProduct.previewStatus;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> serviceIds = pmsProduct.serviceIds;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> keywords = pmsProduct.keywords;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> note = pmsProduct.note;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> albumPics = pmsProduct.albumPics;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> detailTitle = pmsProduct.detailTitle;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> promotionStartTime = pmsProduct.promotionStartTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> promotionEndTime = pmsProduct.promotionEndTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> promotionPerLimit = pmsProduct.promotionPerLimit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> promotionType = pmsProduct.promotionType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> brandName = pmsProduct.brandName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> productCategoryName = pmsProduct.productCategoryName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> description = pmsProduct.description;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> detailDesc = pmsProduct.detailDesc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> detailHtml = pmsProduct.detailHtml;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> detailMobileHtml = pmsProduct.detailMobileHtml;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class PmsProduct extends AliasableSqlTable<PmsProduct> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> brandId = column("brand_id", JDBCType.BIGINT);

        public final SqlColumn<Long> productCategoryId = column("product_category_id", JDBCType.BIGINT);

        public final SqlColumn<Long> feightTemplateId = column("feight_template_id", JDBCType.BIGINT);

        public final SqlColumn<Long> productAttributeCategoryId = column("product_attribute_category_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> pic = column("pic", JDBCType.VARCHAR);

        public final SqlColumn<String> productSn = column("product_sn", JDBCType.VARCHAR);

        public final SqlColumn<Integer> deleteStatus = column("delete_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> publishStatus = column("publish_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> newStatus = column("new_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> recommandStatus = column("recommand_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> verifyStatus = column("verify_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public final SqlColumn<Integer> sale = column("sale", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> price = column("price", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> promotionPrice = column("promotion_price", JDBCType.DECIMAL);

        public final SqlColumn<Integer> giftGrowth = column("gift_growth", JDBCType.INTEGER);

        public final SqlColumn<Integer> giftPoint = column("gift_point", JDBCType.INTEGER);

        public final SqlColumn<Integer> usePointLimit = column("use_point_limit", JDBCType.INTEGER);

        public final SqlColumn<String> subTitle = column("sub_title", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> originalPrice = column("original_price", JDBCType.DECIMAL);

        public final SqlColumn<Integer> stock = column("stock", JDBCType.INTEGER);

        public final SqlColumn<Integer> lowStock = column("low_stock", JDBCType.INTEGER);

        public final SqlColumn<String> unit = column("unit", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> weight = column("weight", JDBCType.DECIMAL);

        public final SqlColumn<Integer> previewStatus = column("preview_status", JDBCType.INTEGER);

        public final SqlColumn<String> serviceIds = column("service_ids", JDBCType.VARCHAR);

        public final SqlColumn<String> keywords = column("keywords", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<String> albumPics = column("album_pics", JDBCType.VARCHAR);

        public final SqlColumn<String> detailTitle = column("detail_title", JDBCType.VARCHAR);

        public final SqlColumn<Date> promotionStartTime = column("promotion_start_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> promotionEndTime = column("promotion_end_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> promotionPerLimit = column("promotion_per_limit", JDBCType.INTEGER);

        public final SqlColumn<Integer> promotionType = column("promotion_type", JDBCType.INTEGER);

        public final SqlColumn<String> brandName = column("brand_name", JDBCType.VARCHAR);

        public final SqlColumn<String> productCategoryName = column("product_category_name", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> detailDesc = column("detail_desc", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> detailHtml = column("detail_html", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> detailMobileHtml = column("detail_mobile_html", JDBCType.LONGVARCHAR);

        public PmsProduct() {
            super("pms_product", PmsProduct::new);
        }
    }
}