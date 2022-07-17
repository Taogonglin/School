package com.scu.student.controller;


import com.scu.student.entity.LabAppoint;
import com.scu.student.service.LabAppointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@CrossOrigin
@RequestMapping("/lab")
public class LabAppointController {
    @Autowired
    private LabAppointService labAppointService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public LabAppoint getOneLabAppoint(@PathVariable("id") String id) {
        return labAppointService.getLabAppointById(id);
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<LabAppoint> getAllLabAppoint() {
        return labAppointService.getAllLabAppoint();
    }
}