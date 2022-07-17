package com.scu.student.service.imp;


import com.scu.student.dao.GdesignDao;
import com.scu.student.entity.Gdesign;
import com.scu.student.service.GdesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GdesignServiceImp implements GdesignService {
    @Autowired
    private GdesignDao gdesigndao;

    @Override
    public Gdesign getGdesignBySid(String sid) {
        return gdesigndao.getGdesignBySid(sid);
    }
}