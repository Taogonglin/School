package com.scu.student.controller;


import com.scu.student.entity.MyGrade;
import com.scu.student.service.MyGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/myGrade")
public class MyGradeController {
    //问题类
    @Autowired
    private MyGradeService myGradeService;

     /**
      *@Author: Mr.Tao
      *@Description: 根据学生id查询成绩
      *@date: 2022-7-14
     */
    @RequestMapping(value = "/{sid}",method = RequestMethod.GET)
    public List<MyGrade> getMyGradeListBySid(@PathVariable("sid") String sid){
        return myGradeService.getMyGradeListBySid(sid);
    }
}