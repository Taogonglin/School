package com.scu.student.controller;


import com.scu.student.entity.Student;
import com.scu.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

     /**
      *@Author: Mr.Tao
      *@Description: 根据学生id查询学生信息
      *@date: 2022-7-14
     */
     @RequestMapping(value = "/{sid}/{password}",method = RequestMethod.POST)
     public Student login(@PathVariable("sid") String sid,@PathVariable("password") String password){
         return studentService.login(sid,password);
     }

    @RequestMapping(value = "/{sid}", method = RequestMethod.GET)
    public Student info(@PathVariable("sid") String sid) {
        Student student = studentService.getStudentBySid(sid);
        if(student != null) student.setPassword(null);
        return student;
    }


    /**
     *@Author: Mr.Tao
     *@Description: 根据学生id修改学生信息
     *@date: 2022-7-14
     */
    @RequestMapping(value = "/{sid}", method = RequestMethod.POST)
    public String modify(@PathVariable("sid") String sid, @RequestParam("phone") String phone) {
        studentService.modifyPhone(sid, phone);
        return "Modify Success";
    }
}