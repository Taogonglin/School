package com.scu.student.dao;


import com.scu.student.entity.Course;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

//http://localhost:8080/image/notice/1.png
public interface CourseDao {


    @Select("SELECT * FROM course WHERE cid = #{cid}")
    Course getCourseByCid(@Param("cid") String cid);

}
