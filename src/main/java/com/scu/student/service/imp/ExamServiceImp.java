package com.scu.student.service.imp;


import com.scu.student.dao.CourseTableDao;
import com.scu.student.dao.ExamDao;
import com.scu.student.entity.Exam;
import com.scu.student.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


@Service
public class ExamServiceImp implements ExamService {

    @Autowired
    private CourseTableDao courseTabledao;
    @Autowired
    private ExamDao examdao;

    @Override
    public List<Exam> getExamListBySid(String sid) {
        List<String> cidList = courseTabledao.getCidListBySid(sid);
        List<Exam> examList = examdao.getExamListByCid(cidList);
        Collections.sort(examList);
        return examList;
    }

}