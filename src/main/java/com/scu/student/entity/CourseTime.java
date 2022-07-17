package com.scu.student.entity;


public class CourseTime {
    private String id;
    private String weeks;
    private String sections;

    public CourseTime() {
    }

    public CourseTime(String id, String weeks, String sections) {
        this.id = id;
        this.weeks = weeks;
        this.sections = sections;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWeeks() {
        return weeks;
    }

    public void setWeeks(String weeks) {
        this.weeks = weeks;
    }

    public String getSections() {
        return sections;
    }

    public void setSections(String sections) {
        this.sections = sections;
    }

    @Override
    public String toString() {
        return "CourseTime{" +
                "id='" + id + '\'' +
                ", weeks='" + weeks + '\'' +
                ", sections='" + sections + '\'' +
                '}';
    }
}
