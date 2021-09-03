package com.bj.springboot.web;

import com.bj.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/put")
    public @ResponseBody Object student(String key, String value){
        studentService.put(key,value);
        return "hhhhhhhhhhhh";
    }

    @RequestMapping(value = "/get")
    public @ResponseBody String get(){
        String value = studentService.get("count");
        return "bbbbbbbbb"+value;
    }


}
