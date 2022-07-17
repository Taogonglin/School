package com.scu.student.dao;

import com.scu.student.entity.Course;
import com.scu.student.entity.MyGrade;
import com.scu.student.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * author: Mr.Tao
 * description:
 * date: 2022-07-14-14-27
 */
public interface MyGradeDao {


    @Select("SELECT * FROM my_grade WHERE sid = #{sid}")
    @Results({

            @Result(property = "grade",column = "grade"),
            @Result(property = "makeupGrade",column = "makeup_grade"),
            @Result(property = "retakeMarks",column = "retake_marks"),
            @Result(property = "finalGrade", column = "final_grade"),


            @Result(property = "student",column = "sid",
                    javaType = Student.class,
                    one = @One(select = "com.scu.student.dao.StudentDao.getStudentBySid")
            ),

            @Result(property = "course",column = "cid",
                    javaType = Course.class,
                    one = @One(select = "com.scu.student.dao.CourseDao.getCourseByCid" )
            )

    }
    )

    List<MyGrade> getMyGradeListBySid(@Param("sid") String sid);
}
