package com.scu.student.service;

import com.scu.student.entity.MyGrade;

import java.util.List;


public interface MyGradeService {
    List<MyGrade> getMyGradeListBySid(String sid);
}
