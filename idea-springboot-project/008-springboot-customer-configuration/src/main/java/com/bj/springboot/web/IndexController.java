package com.bj.springboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {


    @Value("${school.name}")
    private String schoolName;
    @Value("${website}")
    private String website;
    @RequestMapping(value = "/say")
    public @ResponseBody Object say(){
        return "say multiple   "+schoolName+website;
    }
}
