package com.scu.student.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;


public class Exam implements Comparable<Exam>{
    private String cid;
    private String name;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date date;
    private String time;
    private String location;
    private String seatNum;
    private String remark;

    public Exam() {
    }

    public Exam(String cid, String name, Date date, String time, String location, String seatNum, String remark) {
        this.cid = cid;
        this.name = name;
        this.date = date;
        this.time = time;
        this.location = location;
        this.seatNum = seatNum;
        this.remark = remark;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(String seatNum) {
        this.seatNum = seatNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "cid='" + cid + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", time='" + time + '\'' +
                ", location='" + location + '\'' +
                ", seatNum='" + seatNum + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    @Override
    public int compareTo(Exam o) {
        return o.date.compareTo(this.date);
    }
}