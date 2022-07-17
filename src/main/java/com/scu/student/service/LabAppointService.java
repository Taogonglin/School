package com.scu.student.service;


import com.scu.student.entity.LabAppoint;

import java.util.List;


public interface LabAppointService {
    LabAppoint getLabAppointById(String id);

    List<LabAppoint> getAllLabAppoint();
}
