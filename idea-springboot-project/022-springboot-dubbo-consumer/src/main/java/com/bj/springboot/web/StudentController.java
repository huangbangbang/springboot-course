package com.bj.springboot.web;


import com.alibaba.dubbo.config.annotation.Reference;
import com.bj.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Reference(interfaceClass = StudentService.class,version = "0.0.1-SNAPSHOT",check = false)
    private StudentService studentService;

    @RequestMapping(value = "/student/count")
    public @ResponseBody Object studentCount(){
        Integer allStudentCount = studentService.queryStudentCount();
        return allStudentCount;
    }
}
