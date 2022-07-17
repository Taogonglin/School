package com.scu.student.controller;


import com.scu.student.entity.Exam;
import com.scu.student.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/exam")
public class ExamController {
    //问题类
    @Autowired
    private ExamService examService;

     /**
      *@Author: Mr.Tao
      *@Description: 根据课程id查询课程信息
      *@date: 2022-7-14
     */
    //进入考试信息模块
     @RequestMapping(value = "/{sid}",method = RequestMethod.GET)
     public List<Exam> getExamListBySid(@PathVariable("sid") String sid){
         return examService.getExamListBySid(sid);
     }
}