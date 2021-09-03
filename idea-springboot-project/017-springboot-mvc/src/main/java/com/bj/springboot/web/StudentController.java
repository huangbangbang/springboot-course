package com.bj.springboot.web;

import com.bj.springboot.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
public class StudentController {


    @RequestMapping(value = "/student")
    //@ResponseBody
    public  Object student(){
        Student student=new Student();
        student.setId(1000);
        student.setName("jack");
        return student;
    }

    @RequestMapping(value = "/queryStudentById")
    public  Object queryStudentById(Integer id){
        Student student = new Student();
        student.setId(id);

        return student;
    }

    //@RequestMapping(value = "/queryStudentById2",method = RequestMethod.GET)
    @GetMapping(value = "/queryStudentById2")
    public  Object queryStudentById2(){


        return "get";
    }
}
