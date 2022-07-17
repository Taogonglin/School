package com.scu.student.dao;

import com.scu.student.entity.Gdesign;
import com.scu.student.entity.GdesignInfo;
import com.scu.student.entity.Student;
import com.scu.student.entity.Teacher;
import org.apache.ibatis.annotations.*;

public interface GdesignDao {

    @Select("SELECT * FROM gdesign WHERE sid = #{sid}")

    @Results({


            @Result(property = "student",column = "sid",
                    javaType = Student.class,
                    one = @One(select = "com.scu.student.dao.StudentDao.getStudentBySid")
            ),

            @Result(property = "teacher",column = "tid",
                    javaType = Teacher.class,
                    one = @One(select = "com.scu.student.dao.TeacherDao.getTeacherByTid")
            ),

            @Result(property = "gdesignInfo",column = "gid",
                    javaType = GdesignInfo.class,
                    one = @One(select = "com.scu.student.dao.GdesignInfoDao.getGdesignInfoById")
            ),
    })
    Gdesign getGdesignBySid(@Param("sid") String sid);

}
