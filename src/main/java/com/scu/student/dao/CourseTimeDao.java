package com.scu.student.dao;


import com.scu.student.entity.CourseTime;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * author: Mr.Tao
 * description:
 * date: 2022-07-14-14-34
 */
public interface CourseTimeDao {


    @Select("SELECT * FROM course_time WHERE id = #{id}")
    CourseTime getCourseTimeById(@Param("id") String id);

}
