package com.scu.student.service.imp;


import com.scu.student.dao.StudentDao;
import com.scu.student.entity.Student;
import com.scu.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentDao studentdao;

    @Override
    public Student login(String sid, String password) {
        return studentdao.getStudentBySidAndPassword(sid,password);
    }

    @Override
    public Student getStudentBySid(String sid) {
        return studentdao.getStudentBySid(sid);
    }

    @Override
    public void modifyPhone(String sid, String phone) {
        studentdao.modifyPhone(sid, phone);
    }
}
