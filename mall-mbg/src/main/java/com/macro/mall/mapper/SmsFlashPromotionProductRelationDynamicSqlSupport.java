package com.macro.mall.mapper;

import jakarta.annotation.Generated;
import java.math.BigDecimal;
import java.sql.JDBCType;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SmsFlashPromotionProductRelationDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SmsFlashPromotionProductRelation smsFlashPromotionProductRelation = new SmsFlashPromotionProductRelation();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = smsFlashPromotionProductRelation.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> flashPromotionId = smsFlashPromotionProductRelation.flashPromotionId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> flashPromotionSessionId = smsFlashPromotionProductRelation.flashPromotionSessionId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> productId = smsFlashPromotionProductRelation.productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> flashPromotionPrice = smsFlashPromotionProductRelation.flashPromotionPrice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> flashPromotionCount = smsFlashPromotionProductRelation.flashPromotionCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> flashPromotionLimit = smsFlashPromotionProductRelation.flashPromotionLimit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> sort = smsFlashPromotionProductRelation.sort;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SmsFlashPromotionProductRelation extends AliasableSqlTable<SmsFlashPromotionProductRelation> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> flashPromotionId = column("flash_promotion_id", JDBCType.BIGINT);

        public final SqlColumn<Long> flashPromotionSessionId = column("flash_promotion_session_id", JDBCType.BIGINT);

        public final SqlColumn<Long> productId = column("product_id", JDBCType.BIGINT);

        public final SqlColumn<BigDecimal> flashPromotionPrice = column("flash_promotion_price", JDBCType.DECIMAL);

        public final SqlColumn<Integer> flashPromotionCount = column("flash_promotion_count", JDBCType.INTEGER);

        public final SqlColumn<Integer> flashPromotionLimit = column("flash_promotion_limit", JDBCType.INTEGER);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public SmsFlashPromotionProductRelation() {
            super("sms_flash_promotion_product_relation", SmsFlashPromotionProductRelation::new);
        }
    }
}