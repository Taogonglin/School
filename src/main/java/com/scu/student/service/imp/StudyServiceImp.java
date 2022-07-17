package com.scu.student.service.imp;


import com.scu.student.dao.StudyDao;
import com.scu.student.entity.Study;
import com.scu.student.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyServiceImp implements StudyService {
    @Autowired
    private StudyDao studydao;

    @Override
    public List<Study> getStudyListBySid(String sid) {
        return studydao.getStudyListBySid(sid);
    }
}