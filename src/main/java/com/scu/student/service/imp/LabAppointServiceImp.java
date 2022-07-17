package com.scu.student.service.imp;


import com.scu.student.dao.LabAppointDao;
import com.scu.student.entity.LabAppoint;
import com.scu.student.service.LabAppointService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class LabAppointServiceImp implements LabAppointService {
    @Resource
    LabAppointDao labAppointdao;

    @Override
    public LabAppoint getLabAppointById(String id) {
        return labAppointdao.getLabAppointById(id);
    }

    @Override
    public List<LabAppoint> getAllLabAppoint() {
        return labAppointdao.getAllLabAppoint();
    }
}
