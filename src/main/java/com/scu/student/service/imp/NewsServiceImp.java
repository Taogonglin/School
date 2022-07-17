package com.scu.student.service.imp;


import com.scu.student.dao.NewsDao;
import com.scu.student.entity.News;
import com.scu.student.service.NewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class NewsServiceImp implements NewsService {

    @Resource
    NewsDao newsMapper;

    @Override
    public News getNewsById(String id) {
        return newsMapper.getNewsById(id);
    }

    @Override
    public List<News> getAllNews() {
        return newsMapper.getAllNews();
    }
}
