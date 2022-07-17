package com.scu.student.dao;

import com.scu.student.entity.Notice;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * author: Mr.Tao
 * description:Notice 数据库操作
 * date: 2022-07-14-14-15
 */
public interface NoticeDao {

    @Select("SELECT * FROM notice WHERE id = #{id}")
    Notice getNoticeById(@Param("id") String id);

    @Select("SELECT * FROM notice;")
    List<Notice> getAllNotice();

}
