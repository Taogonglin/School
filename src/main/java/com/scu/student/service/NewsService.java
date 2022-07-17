package com.scu.student.service;


import com.scu.student.entity.News;

import java.util.List;


public interface NewsService {
    News getNewsById(String id);

    List<News> getAllNews();
}
