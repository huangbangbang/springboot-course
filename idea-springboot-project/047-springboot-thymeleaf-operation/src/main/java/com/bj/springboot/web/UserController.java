package com.bj.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {


    @RequestMapping(value = "/operator")
    public String operator(Model model){
        model.addAttribute("sex",1);
        model.addAttribute("flag",1);
        model.addAttribute("currentPage",2);

        return "operator";
    }

}
