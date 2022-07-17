package com.scu.student.service;


import com.scu.student.entity.Study;

import java.util.List;


public interface StudyService {
    List<Study> getStudyListBySid(String sid);
}
