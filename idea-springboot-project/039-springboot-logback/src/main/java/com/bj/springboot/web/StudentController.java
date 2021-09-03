package com.bj.springboot.web;

import com.bj.springboot.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student/count")
    public @ResponseBody String studentCount(){

        log.trace("吼吼吼吼吼吼吼吼吼吼吼吼吼吼吼吼");
        log.debug("吼吼吼吼吼吼吼吼吼吼吼吼吼吼吼吼");
        log.info("吼吼吼吼吼吼吼吼吼吼吼吼吼吼吼吼");
        log.warn("吼吼吼吼吼吼吼吼吼吼吼吼吼吼吼吼");
        log.error("吼吼吼吼吼吼吼吼吼吼吼吼吼吼吼吼");
        Integer studentCount = studentService.queryStudentCount();
        return "num:  "+studentCount;
    }
}
