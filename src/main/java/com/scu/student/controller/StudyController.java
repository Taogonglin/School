package com.scu.student.controller;


import com.scu.student.entity.Study;
import com.scu.student.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/study")
public class StudyController {
    //根据学生id查询学生的学习信息
    @Autowired
    private StudyService studyService;

    @RequestMapping(value = "/{sid}",method = RequestMethod.GET)
    public List<Study> getStudyListBySid(@PathVariable("sid") String sid){
        return studyService.getStudyListBySid(sid);
    }
}