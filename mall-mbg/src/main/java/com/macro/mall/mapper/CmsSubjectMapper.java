package com.macro.mall.mapper;

import static com.macro.mall.mapper.CmsSubjectDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.CmsSubject;
import jakarta.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface CmsSubjectMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<CmsSubject>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, categoryId, title, pic, productCount, recommendStatus, createTime, collectCount, readCount, commentCount, albumPics, description, showStatus, forwardCount, categoryName, content);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CmsSubjectResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="category_id", property="categoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="pic", property="pic", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_count", property="productCount", jdbcType=JdbcType.INTEGER),
        @Result(column="recommend_status", property="recommendStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="collect_count", property="collectCount", jdbcType=JdbcType.INTEGER),
        @Result(column="read_count", property="readCount", jdbcType=JdbcType.INTEGER),
        @Result(column="comment_count", property="commentCount", jdbcType=JdbcType.INTEGER),
        @Result(column="album_pics", property="albumPics", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="show_status", property="showStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="forward_count", property="forwardCount", jdbcType=JdbcType.INTEGER),
        @Result(column="category_name", property="categoryName", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<CmsSubject> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CmsSubjectResult")
    Optional<CmsSubject> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cmsSubject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cmsSubject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(CmsSubject row) {
        return MyBatis3Utils.insert(this::insert, row, cmsSubject, c ->
            c.map(id).toProperty("id")
            .map(categoryId).toProperty("categoryId")
            .map(title).toProperty("title")
            .map(pic).toProperty("pic")
            .map(productCount).toProperty("productCount")
            .map(recommendStatus).toProperty("recommendStatus")
            .map(createTime).toProperty("createTime")
            .map(collectCount).toProperty("collectCount")
            .map(readCount).toProperty("readCount")
            .map(commentCount).toProperty("commentCount")
            .map(albumPics).toProperty("albumPics")
            .map(description).toProperty("description")
            .map(showStatus).toProperty("showStatus")
            .map(forwardCount).toProperty("forwardCount")
            .map(categoryName).toProperty("categoryName")
            .map(content).toProperty("content")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<CmsSubject> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, cmsSubject, c ->
            c.map(id).toProperty("id")
            .map(categoryId).toProperty("categoryId")
            .map(title).toProperty("title")
            .map(pic).toProperty("pic")
            .map(productCount).toProperty("productCount")
            .map(recommendStatus).toProperty("recommendStatus")
            .map(createTime).toProperty("createTime")
            .map(collectCount).toProperty("collectCount")
            .map(readCount).toProperty("readCount")
            .map(commentCount).toProperty("commentCount")
            .map(albumPics).toProperty("albumPics")
            .map(description).toProperty("description")
            .map(showStatus).toProperty("showStatus")
            .map(forwardCount).toProperty("forwardCount")
            .map(categoryName).toProperty("categoryName")
            .map(content).toProperty("content")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(CmsSubject row) {
        return MyBatis3Utils.insert(this::insert, row, cmsSubject, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(categoryId).toPropertyWhenPresent("categoryId", row::getCategoryId)
            .map(title).toPropertyWhenPresent("title", row::getTitle)
            .map(pic).toPropertyWhenPresent("pic", row::getPic)
            .map(productCount).toPropertyWhenPresent("productCount", row::getProductCount)
            .map(recommendStatus).toPropertyWhenPresent("recommendStatus", row::getRecommendStatus)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(collectCount).toPropertyWhenPresent("collectCount", row::getCollectCount)
            .map(readCount).toPropertyWhenPresent("readCount", row::getReadCount)
            .map(commentCount).toPropertyWhenPresent("commentCount", row::getCommentCount)
            .map(albumPics).toPropertyWhenPresent("albumPics", row::getAlbumPics)
            .map(description).toPropertyWhenPresent("description", row::getDescription)
            .map(showStatus).toPropertyWhenPresent("showStatus", row::getShowStatus)
            .map(forwardCount).toPropertyWhenPresent("forwardCount", row::getForwardCount)
            .map(categoryName).toPropertyWhenPresent("categoryName", row::getCategoryName)
            .map(content).toPropertyWhenPresent("content", row::getContent)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<CmsSubject> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, cmsSubject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<CmsSubject> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, cmsSubject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<CmsSubject> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, cmsSubject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<CmsSubject> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cmsSubject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(CmsSubject row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(categoryId).equalTo(row::getCategoryId)
                .set(title).equalTo(row::getTitle)
                .set(pic).equalTo(row::getPic)
                .set(productCount).equalTo(row::getProductCount)
                .set(recommendStatus).equalTo(row::getRecommendStatus)
                .set(createTime).equalTo(row::getCreateTime)
                .set(collectCount).equalTo(row::getCollectCount)
                .set(readCount).equalTo(row::getReadCount)
                .set(commentCount).equalTo(row::getCommentCount)
                .set(albumPics).equalTo(row::getAlbumPics)
                .set(description).equalTo(row::getDescription)
                .set(showStatus).equalTo(row::getShowStatus)
                .set(forwardCount).equalTo(row::getForwardCount)
                .set(categoryName).equalTo(row::getCategoryName)
                .set(content).equalTo(row::getContent);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CmsSubject row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(categoryId).equalToWhenPresent(row::getCategoryId)
                .set(title).equalToWhenPresent(row::getTitle)
                .set(pic).equalToWhenPresent(row::getPic)
                .set(productCount).equalToWhenPresent(row::getProductCount)
                .set(recommendStatus).equalToWhenPresent(row::getRecommendStatus)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(collectCount).equalToWhenPresent(row::getCollectCount)
                .set(readCount).equalToWhenPresent(row::getReadCount)
                .set(commentCount).equalToWhenPresent(row::getCommentCount)
                .set(albumPics).equalToWhenPresent(row::getAlbumPics)
                .set(description).equalToWhenPresent(row::getDescription)
                .set(showStatus).equalToWhenPresent(row::getShowStatus)
                .set(forwardCount).equalToWhenPresent(row::getForwardCount)
                .set(categoryName).equalToWhenPresent(row::getCategoryName)
                .set(content).equalToWhenPresent(row::getContent);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(CmsSubject row) {
        return update(c ->
            c.set(categoryId).equalTo(row::getCategoryId)
            .set(title).equalTo(row::getTitle)
            .set(pic).equalTo(row::getPic)
            .set(productCount).equalTo(row::getProductCount)
            .set(recommendStatus).equalTo(row::getRecommendStatus)
            .set(createTime).equalTo(row::getCreateTime)
            .set(collectCount).equalTo(row::getCollectCount)
            .set(readCount).equalTo(row::getReadCount)
            .set(commentCount).equalTo(row::getCommentCount)
            .set(albumPics).equalTo(row::getAlbumPics)
            .set(description).equalTo(row::getDescription)
            .set(showStatus).equalTo(row::getShowStatus)
            .set(forwardCount).equalTo(row::getForwardCount)
            .set(categoryName).equalTo(row::getCategoryName)
            .set(content).equalTo(row::getContent)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(CmsSubject row) {
        return update(c ->
            c.set(categoryId).equalToWhenPresent(row::getCategoryId)
            .set(title).equalToWhenPresent(row::getTitle)
            .set(pic).equalToWhenPresent(row::getPic)
            .set(productCount).equalToWhenPresent(row::getProductCount)
            .set(recommendStatus).equalToWhenPresent(row::getRecommendStatus)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(collectCount).equalToWhenPresent(row::getCollectCount)
            .set(readCount).equalToWhenPresent(row::getReadCount)
            .set(commentCount).equalToWhenPresent(row::getCommentCount)
            .set(albumPics).equalToWhenPresent(row::getAlbumPics)
            .set(description).equalToWhenPresent(row::getDescription)
            .set(showStatus).equalToWhenPresent(row::getShowStatus)
            .set(forwardCount).equalToWhenPresent(row::getForwardCount)
            .set(categoryName).equalToWhenPresent(row::getCategoryName)
            .set(content).equalToWhenPresent(row::getContent)
            .where(id, isEqualTo(row::getId))
        );
    }
}