package com.scu.student.controller;


import com.scu.student.entity.PayInfo;
import com.scu.student.service.PayInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/pay")
public class PayInfoController {
    @Autowired
    PayInfoService payInfoService;

     /**
      *@Author: Mr.Tao
      *@Description: 根据学生id和消费id查询学生消费信息
      *@date: 2022-7-14
     */
    @RequestMapping(value="/{sid}/{id}", method = RequestMethod.GET)
    public PayInfo getOnePay(@PathVariable("sid") String sid, @PathVariable("id") String id) {
        return payInfoService.getOnePayInfo(sid, id);
    }

    @RequestMapping(value="/{sid}", method = RequestMethod.GET)
    public List<PayInfo> getAllPay(@PathVariable("sid") String sid) {
        return payInfoService.getAllPayInfoBySid(sid);
    }
}