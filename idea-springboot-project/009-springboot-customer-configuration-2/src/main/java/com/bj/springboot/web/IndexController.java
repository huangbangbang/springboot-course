package com.bj.springboot.web;

import com.bj.springboot.config.Abc;
import com.bj.springboot.config.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {


    @Autowired
    private School school;
    @Autowired
    private Abc abc;



    @RequestMapping(value = "/say")
    public @ResponseBody Object say(){
        return "say multiple   "+school.getName()+school.getWebsite()+abc.getName()+abc.getWebsite();
    }
}
