package com.scu.student.service.imp;



import com.scu.student.dao.PayInfoDao;
import com.scu.student.entity.PayInfo;
import com.scu.student.service.PayInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class PayInfoServiceImpl implements PayInfoService {
    @Resource
    PayInfoDao payInfodao;

    @Override
    public PayInfo getOnePayInfo(String sid, String id) {
        return payInfodao.getOnePayInfo(sid, id);
    }

    @Override
    public List<PayInfo> getAllPayInfoBySid(String sid) {
        return payInfodao.getAllPayInfoBySid(sid);
    }
}
