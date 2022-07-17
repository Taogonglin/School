package com.scu.student.controller;


import com.scu.student.entity.News;
import com.scu.student.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

     /**
      *@Author: Mr.Tao
      *@Description: 根据新闻id查询，或者直接查询全部
      *@date: 2022-7-14
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public News getOneNews(@PathVariable("id") String id) {
        return newsService.getNewsById(id);
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<News> getAllNotice() {
        return newsService.getAllNews();
    }
}
