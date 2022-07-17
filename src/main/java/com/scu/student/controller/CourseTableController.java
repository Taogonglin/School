package com.scu.student.controller;


import com.scu.student.entity.CourseTable;
import com.scu.student.entity.Textbook;
import com.scu.student.service.CourseTableService;
import com.scu.student.service.TextbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/courseTable")
public class CourseTableController {
    //问题类
    @Autowired
    private CourseTableService courseTableService;
    @Autowired
    private TextbookService textbookService;


    //课程表
    @RequestMapping(value = "/{sid}/{semester}",method = RequestMethod.GET)
    public List<CourseTable> getCourseTableBySid(@PathVariable("sid") String sid, @PathVariable("semester") String semester){
        return courseTableService.getCourseTableListBySid(sid,semester);
    }

    //进入课程表模块
    @RequestMapping(value = "/{sid}",method = RequestMethod.GET)
    @ResponseBody
    public List<CourseTable> getCourseTableBySid(@PathVariable("sid") String sid){
        return courseTableService.getCourseTableListBySid(sid,courseTableService.getSemester(sid));
    }

    //查看教科书详情
    @RequestMapping(value = "/textbook/{id}",method = RequestMethod.GET)
    public Textbook getTextbookById(@PathVariable("id") String id){
        return textbookService.getTextbookById(id);
    }
}