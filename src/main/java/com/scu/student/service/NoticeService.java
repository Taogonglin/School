package com.scu.student.service;

import com.scu.student.entity.Notice;

import java.util.List;


public interface NoticeService {
    Notice getNoticeById(String id);

    List<Notice> getAllNotice();

//    void addNoticeByNid(Notice notice);
}
