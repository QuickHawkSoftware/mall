package com.macro.mall.model;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UmsMemberStatisticsInfo implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long memberId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal consumeAmount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer orderCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer couponCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer commentCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer returnOrderCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer loginCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer attendCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer fansCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer collectProductCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer collectSubjectCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer collectTopicCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer collectCommentCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer inviteFriendCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date recentOrderTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private static final long serialVersionUID = 1L;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getMemberId() {
        return memberId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getConsumeAmount() {
        return consumeAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getOrderCount() {
        return orderCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCouponCount() {
        return couponCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCommentCount() {
        return commentCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getReturnOrderCount() {
        return returnOrderCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReturnOrderCount(Integer returnOrderCount) {
        this.returnOrderCount = returnOrderCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getLoginCount() {
        return loginCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getAttendCount() {
        return attendCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getFansCount() {
        return fansCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCollectProductCount() {
        return collectProductCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCollectProductCount(Integer collectProductCount) {
        this.collectProductCount = collectProductCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCollectSubjectCount() {
        return collectSubjectCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCollectSubjectCount(Integer collectSubjectCount) {
        this.collectSubjectCount = collectSubjectCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCollectTopicCount() {
        return collectTopicCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCollectTopicCount(Integer collectTopicCount) {
        this.collectTopicCount = collectTopicCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCollectCommentCount() {
        return collectCommentCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCollectCommentCount(Integer collectCommentCount) {
        this.collectCommentCount = collectCommentCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getInviteFriendCount() {
        return inviteFriendCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setInviteFriendCount(Integer inviteFriendCount) {
        this.inviteFriendCount = inviteFriendCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getRecentOrderTime() {
        return recentOrderTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRecentOrderTime(Date recentOrderTime) {
        this.recentOrderTime = recentOrderTime;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", consumeAmount=").append(consumeAmount);
        sb.append(", orderCount=").append(orderCount);
        sb.append(", couponCount=").append(couponCount);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", returnOrderCount=").append(returnOrderCount);
        sb.append(", loginCount=").append(loginCount);
        sb.append(", attendCount=").append(attendCount);
        sb.append(", fansCount=").append(fansCount);
        sb.append(", collectProductCount=").append(collectProductCount);
        sb.append(", collectSubjectCount=").append(collectSubjectCount);
        sb.append(", collectTopicCount=").append(collectTopicCount);
        sb.append(", collectCommentCount=").append(collectCommentCount);
        sb.append(", inviteFriendCount=").append(inviteFriendCount);
        sb.append(", recentOrderTime=").append(recentOrderTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}