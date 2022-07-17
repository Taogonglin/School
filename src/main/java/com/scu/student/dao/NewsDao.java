package com.scu.student.dao;

import com.scu.student.entity.News;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * author: Mr.Tao
 * description:操控new数据库
 * date: 2022-07-14-14-12
 */
public interface NewsDao {

    @Select("SELECT * FROM news WHERE id = #{id}")
    News getNewsById(@Param("id") String id);

    @Select("SELECT * FROM news;")
    List<News> getAllNews();
}
