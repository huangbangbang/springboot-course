package com.bj.springboot.web;


import com.bj.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {


    @RequestMapping(value = "/literal")
    public String inline(Model model){
        model.addAttribute("sex",1);
        model.addAttribute("data","hello");
        model.addAttribute("flag",true);

        User user = new User();
        user.setId(1001);
        user.setName("jack");

        User user1 = new User();

        model.addAttribute("user",user);
        model.addAttribute("user1",user1);
        return "literal";
    }


    @RequestMapping(value = "/splice")
    public String splice(Model model){
        model.addAttribute("totalRows",123);
        model.addAttribute("totalPage",13);
        model.addAttribute("currentPage",2);

        return "splice";
    }

}
