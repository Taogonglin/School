package com.scu.student.dao;


import com.scu.student.entity.Exam;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ExamDao {

    //根据课程id对应考试情况
    @Select({
            "<script>" +
                    "SELECT * FROM exam WHERE cid IN" +
                    "<foreach collection=\"cidList\" item=\"cid\" open=\"(\" close=\")\" separator=\",\">" +
                    "#{cid}" +
                    "</foreach>" +
                    "</script>"
    })
    List<Exam> getExamListByCid(@Param("cidList")List<String> cidList );

}
