package com.scu.student.dao;


import com.scu.student.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface StudentDao {

    //通过id查找学生信息
    @Select("SELECT * FROM student WHERE sid = #{sid}")
    Student getStudentBySid(@Param("sid") String sid);


    @Select("SELECT * FROM student WHERE sid = #{sid} AND password = #{password}")
    //根据学生id和密码查找学生信息
    Student getStudentBySidAndPassword(@Param("sid") String sid,@Param("password") String password);

    //修改学生信息
    @Update("update student set phone = #{phone} where sid = #{sid}")
    void modifyPhone(@Param("sid") String sid,  @Param("phone") String phone);
}
