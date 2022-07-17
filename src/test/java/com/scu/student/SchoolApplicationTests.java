package com.scu.student;

import com.scu.student.dao.CourseTableDao;
import com.scu.student.entity.Exam;
import com.scu.student.service.ExamService;
import com.scu.student.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SchoolApplicationTests{

    @Autowired
    ExamService examService;


    @Autowired
    CourseTableDao courseTabledao;


    @Autowired
    StudentService studentService;

    @Test
    public void testExam() {
        List<Exam> res;
        String sid = "2019080902003";
        res = examService.getExamListBySid(sid);
        int len = res.size();
        System.out.println(len);

    }

    @Test
    public void testCTable(){
        String sid = "2019080902003";
        List<String> semesterList = courseTabledao.getSemesterList(sid);
        int len = semesterList.size();
        System.out.println(len);
    }


    @Test
    public void testStudent(){
        String sid = "2020080902001";
        String password = "12345";
        studentService.login(sid, password);
    }


}
