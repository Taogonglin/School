package com.scu.student.service.imp;

import com.scu.student.dao.NoticeDao;
import com.scu.student.entity.Notice;
import com.scu.student.service.NoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class NoticeServiceImp implements NoticeService {
    @Resource
    NoticeDao noticedao;

    @Override
    public Notice getNoticeById(String id) {
        return noticedao.getNoticeById(id);
    }

    @Override
    public List<Notice> getAllNotice() {
        return noticedao.getAllNotice();
    }

//    @Override
//    public void addNoticeByNid(Notice notice) {
//        noticeMapper.addNoticeByNid(notice);
//    }
}
