package com.macro.mall.mapper;

import static com.macro.mall.mapper.PmsAlbumPicDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.PmsAlbumPic;
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
public interface PmsAlbumPicMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<PmsAlbumPic>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, albumId, pic);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PmsAlbumPicResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="album_id", property="albumId", jdbcType=JdbcType.BIGINT),
        @Result(column="pic", property="pic", jdbcType=JdbcType.VARCHAR)
    })
    List<PmsAlbumPic> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PmsAlbumPicResult")
    Optional<PmsAlbumPic> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, pmsAlbumPic, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, pmsAlbumPic, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(PmsAlbumPic row) {
        return MyBatis3Utils.insert(this::insert, row, pmsAlbumPic, c ->
            c.map(id).toProperty("id")
            .map(albumId).toProperty("albumId")
            .map(pic).toProperty("pic")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<PmsAlbumPic> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, pmsAlbumPic, c ->
            c.map(id).toProperty("id")
            .map(albumId).toProperty("albumId")
            .map(pic).toProperty("pic")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(PmsAlbumPic row) {
        return MyBatis3Utils.insert(this::insert, row, pmsAlbumPic, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(albumId).toPropertyWhenPresent("albumId", row::getAlbumId)
            .map(pic).toPropertyWhenPresent("pic", row::getPic)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsAlbumPic> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, pmsAlbumPic, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsAlbumPic> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, pmsAlbumPic, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsAlbumPic> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, pmsAlbumPic, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsAlbumPic> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, pmsAlbumPic, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(PmsAlbumPic row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(albumId).equalTo(row::getAlbumId)
                .set(pic).equalTo(row::getPic);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PmsAlbumPic row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(albumId).equalToWhenPresent(row::getAlbumId)
                .set(pic).equalToWhenPresent(row::getPic);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(PmsAlbumPic row) {
        return update(c ->
            c.set(albumId).equalTo(row::getAlbumId)
            .set(pic).equalTo(row::getPic)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(PmsAlbumPic row) {
        return update(c ->
            c.set(albumId).equalToWhenPresent(row::getAlbumId)
            .set(pic).equalToWhenPresent(row::getPic)
            .where(id, isEqualTo(row::getId))
        );
    }
}