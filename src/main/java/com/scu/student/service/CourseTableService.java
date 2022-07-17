package com.scu.student.service;

import com.scu.student.entity.CourseTable;

import java.util.List;


public interface CourseTableService {
    //获取指定学生指定学期的课表信息
    List<CourseTable> getCourseTableListBySid(String sid, String semester);

    //获取指定学生当前学期
    String getSemester(String sid);
}