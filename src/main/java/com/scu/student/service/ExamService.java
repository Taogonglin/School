package com.scu.student.service;

import com.scu.student.entity.Exam;

import java.util.List;


public interface ExamService {

    //获取指定学生指定学期的考试信息
    List<Exam> getExamListBySid(String sid);
}
