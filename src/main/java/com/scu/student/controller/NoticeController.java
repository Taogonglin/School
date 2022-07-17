package com.scu.student.controller;


import com.scu.student.entity.Notice;
import com.scu.student.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/notice")
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

     /**
      *@Author: Mr.Tao
      *@Description: 根据id或者全部查询通知
      *@date: 2022-7-14
     */
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Notice getOneNotice(@PathVariable("id") String id) {
        return noticeService.getNoticeById(id);
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<Notice> getAllNotice() {
        return noticeService.getAllNotice();
    }
}
