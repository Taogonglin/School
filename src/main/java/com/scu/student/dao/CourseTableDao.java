package com.scu.student.dao;

import com.scu.student.entity.*;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface CourseTableDao {

     /**
      * @description: 根据学生id和学期查找课表信息
      * @Author: Mr.Tao
      * @date: 2022/7/14
     */
     @Select("SELECT * FROM course_table WHERE sid = #{sid} AND semester = #{semester}")
     @Results({
             @Result(property = "student",column = "sid",
                     javaType = Student.class,
                     one = @One(select = "com.scu.student.dao.StudentDao.getStudentBySid")
             ),
             @Result(property = "teacher",column = "tid",
                     javaType = Teacher.class,
                     one = @One(select = "com.scu.student.dao.TeacherDao.getTeacherByTid")
             ),
             @Result(property = "courseTime",column = "time_id",
                     javaType = CourseTime.class,
                     one = @One(select = "com.scu.student.dao.CourseTimeDao.getCourseTimeById")
             ),
             @Result(property = "course",column = "cid",
                     javaType = Course.class,
                     one = @One(select = "com.scu.student.dao.CourseDao.getCourseByCid")
             ),
             @Result(property = "textbook",column = "bid",
                     javaType = Textbook.class,
                     one = @One(select = "com.scu.student.dao.TextbookDao.getTextbookById")
             ),

     })
     List<CourseTable> getCourseTableListBySid(@Param("sid") String sid, @Param("semester") String semester);

     /**
      * @description: 根据学生id和学期查找课程id集合
      * @Author: Mr.Tao
      * @date: 2022/7/14
     */
     @Select("SELECT cid FROM course_table WHERE sid = #{sid}")
     List<String> getCidListBySid(String sid);

     /**
      *@description:查找学生学期集合
      *@Author: Mr.Tao
      *@date: 2022/7/14
     */
     @Select("SELECT DISTINCT semester FROM course_table WHERE sid = #{sid}")
     List<String> getSemesterList(@Param("sid") String sid);



}
