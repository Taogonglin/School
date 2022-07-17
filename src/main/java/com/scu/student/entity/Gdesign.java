package com.scu.student.entity;


public class Gdesign {
    private Student student;
    private Teacher teacher;
    private GdesignInfo gdesignInfo;
    private int grade;

    public Gdesign() {
    }

    public Gdesign(Student student, Teacher teacher, GdesignInfo gdesignInfo, int grade) {
        this.student = student;
        this.teacher = teacher;
        this.gdesignInfo = gdesignInfo;
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public GdesignInfo getGdesignInfo() {
        return gdesignInfo;
    }

    public void setGdesignInfo(GdesignInfo gdesignInfo) {
        this.gdesignInfo = gdesignInfo;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Gdesign{" +
                "student=" + student +
                ", teacher=" + teacher +
                ", gdesignInfo=" + gdesignInfo +
                ", grade=" + grade +
                '}';
    }
}
