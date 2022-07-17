package com.scu.student.dao;

import com.scu.student.entity.Course;
import com.scu.student.entity.Student;
import com.scu.student.entity.Study;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * author: Mr.Tao
 * description: 控制study数据库
 * date: 2022-07-14-14
 */
public interface StudyDao {


    @Select("SELECT * FROM study WHERE sid = #{sid}")
    @Results({
            @Result(property = "student",column = "sid",
                    javaType = Student.class,
                    one = @One(select = "com.scu.student.dao.StudentDao.getStudentBySid")
            ),

            @Result(property = "course",column = "cid",
                    javaType = Course.class,
                    one = @One(select = "com.scu.student.dao.CourseDao.getCourseByCid" )
            )

    })
    List<Study> getStudyListBySid(@Param("sid") String sid);


}
