package com.bj.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class UserController {


    @RequestMapping(value = "/function")
    public String function(Model model){
        model.addAttribute("time",new Date());
        model.addAttribute("data","hello");

        return "function";
    }

}
