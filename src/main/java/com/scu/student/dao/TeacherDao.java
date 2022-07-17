package com.scu.student.dao;

import com.scu.student.entity.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * author: Mr.Tao
 * description:
 * date: 2022-07-14-14-08
 */
public interface TeacherDao {

     /**
      *@Param: tid
      *@return: teacher
      *@Author: Mr.Tao
      *@Description: 根据教师id查询教师信息
     */
     @Select("SELECT * FROM teacher WHERE tid = #{tid}")
    Teacher getTeacherByTid(@Param("tid") String tid);
}
