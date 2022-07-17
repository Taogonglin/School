package com.scu.student.service.imp;

import com.scu.student.dao.CourseTableDao;
import com.scu.student.entity.CourseTable;
import com.scu.student.service.CourseTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseTableServiceImp implements CourseTableService {
    @Autowired
    private CourseTableDao courseTabledao;
    @Override
    public List<CourseTable> getCourseTableListBySid(String sid,String semester) {
        return courseTabledao.getCourseTableListBySid(sid,semester);
    }
    @Override
    public String getSemester(String sid) {
        List<String> semesterList = courseTabledao.getSemesterList(sid);

        int s = 0;
        for(String semester : semesterList){
            if(Integer.parseInt(semester) > s){
                s = Integer.parseInt(semester);
            }
        }

        return String.valueOf(s);
    }
}