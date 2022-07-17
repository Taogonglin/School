package com.scu.student.service;


import com.scu.student.entity.Student;


public interface StudentService {
    Student login(String sid, String password);

    Student getStudentBySid(String sid);

    void modifyPhone(String sid, String phone);
}
