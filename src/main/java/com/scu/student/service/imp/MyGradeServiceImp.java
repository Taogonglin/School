package com.scu.student.service.imp;


import com.scu.student.dao.MyGradeDao;
import com.scu.student.entity.MyGrade;
import com.scu.student.service.MyGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


@Service
public class MyGradeServiceImp implements MyGradeService {
    @Autowired
    private MyGradeDao myGradedao;

    @Override
    public List<MyGrade> getMyGradeListBySid(String sid) {
        List<MyGrade> myGradeList = myGradedao.getMyGradeListBySid(sid);
        Collections.sort(myGradeList);
        return myGradeList;
    }
}
