package com.scu.student.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class LabAppoint {
    String id;

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    Date openTime;

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    Date closeTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public LabAppoint() {
    }

    public LabAppoint(String id, Date openTime, Date closeTime) {
        this.id = id;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }
}
