package com.macro.mall.mapper;

import static com.macro.mall.mapper.PmsAlbumDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.macro.mall.model.PmsAlbum;
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
public interface PmsAlbumMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<PmsAlbum>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, coverPic, picCount, sort, description);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PmsAlbumResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="cover_pic", property="coverPic", jdbcType=JdbcType.VARCHAR),
        @Result(column="pic_count", property="picCount", jdbcType=JdbcType.INTEGER),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR)
    })
    List<PmsAlbum> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PmsAlbumResult")
    Optional<PmsAlbum> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, pmsAlbum, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, pmsAlbum, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(PmsAlbum row) {
        return MyBatis3Utils.insert(this::insert, row, pmsAlbum, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(coverPic).toProperty("coverPic")
            .map(picCount).toProperty("picCount")
            .map(sort).toProperty("sort")
            .map(description).toProperty("description")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<PmsAlbum> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, pmsAlbum, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(coverPic).toProperty("coverPic")
            .map(picCount).toProperty("picCount")
            .map(sort).toProperty("sort")
            .map(description).toProperty("description")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(PmsAlbum row) {
        return MyBatis3Utils.insert(this::insert, row, pmsAlbum, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(coverPic).toPropertyWhenPresent("coverPic", row::getCoverPic)
            .map(picCount).toPropertyWhenPresent("picCount", row::getPicCount)
            .map(sort).toPropertyWhenPresent("sort", row::getSort)
            .map(description).toPropertyWhenPresent("description", row::getDescription)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsAlbum> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, pmsAlbum, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsAlbum> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, pmsAlbum, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsAlbum> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, pmsAlbum, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsAlbum> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, pmsAlbum, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(PmsAlbum row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(name).equalTo(row::getName)
                .set(coverPic).equalTo(row::getCoverPic)
                .set(picCount).equalTo(row::getPicCount)
                .set(sort).equalTo(row::getSort)
                .set(description).equalTo(row::getDescription);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PmsAlbum row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(name).equalToWhenPresent(row::getName)
                .set(coverPic).equalToWhenPresent(row::getCoverPic)
                .set(picCount).equalToWhenPresent(row::getPicCount)
                .set(sort).equalToWhenPresent(row::getSort)
                .set(description).equalToWhenPresent(row::getDescription);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(PmsAlbum row) {
        return update(c ->
            c.set(name).equalTo(row::getName)
            .set(coverPic).equalTo(row::getCoverPic)
            .set(picCount).equalTo(row::getPicCount)
            .set(sort).equalTo(row::getSort)
            .set(description).equalTo(row::getDescription)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(PmsAlbum row) {
        return update(c ->
            c.set(name).equalToWhenPresent(row::getName)
            .set(coverPic).equalToWhenPresent(row::getCoverPic)
            .set(picCount).equalToWhenPresent(row::getPicCount)
            .set(sort).equalToWhenPresent(row::getSort)
            .set(description).equalToWhenPresent(row::getDescription)
            .where(id, isEqualTo(row::getId))
        );
    }
}