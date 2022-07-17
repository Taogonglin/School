package com.scu.student.controller;


import com.scu.student.entity.Gdesign;
import com.scu.student.service.GdesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/gdesign")
public class GdesignController {
    @Autowired
    private GdesignService gdesignService;

     /**
      *@Author: Mr.Tao
      *@Description: 根据学生信息查询学生毕设
      *@date: 2022-7-14
     */
    @RequestMapping(value = "/{sid}",method = RequestMethod.GET)
    public Gdesign getGdesignBySid(@PathVariable("sid") String sid){
        return gdesignService.getGdesignBySid(sid);
    }
}