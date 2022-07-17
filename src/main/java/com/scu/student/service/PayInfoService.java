package com.scu.student.service;


import com.scu.student.entity.PayInfo;

import java.util.List;


public interface PayInfoService {

    PayInfo getOnePayInfo(String sid, String id);

    List<PayInfo> getAllPayInfoBySid(String sid);
}
