package com.bj.springboot.web;


import com.bj.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/user")
public class UserController {


    @RequestMapping(value = "/login")
    public @ResponseBody Object login(HttpServletRequest request){
        User user = new User();
        user.setId(1001);
        user.setName("jack");
        request.getSession().setAttribute("user",user);

        return "login success";
    }

    @RequestMapping(value = "/center")
    public @ResponseBody Object center(){

        return "see center";
    }

    @RequestMapping(value = "/out")
    public @ResponseBody Object out(){

        return "out see";
    }


    @RequestMapping(value = "/error")
    public @ResponseBody Object error(){

        return "error";
    }
}
