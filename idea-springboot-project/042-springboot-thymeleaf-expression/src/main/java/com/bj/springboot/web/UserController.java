package com.bj.springboot.web;

import com.bj.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {


    @RequestMapping(value = "/user/detail")
    public String message(Model model){

        User user = new User();
        user.setId(1001);
        user.setName("jack");
        user.setAge(18);
        model.addAttribute("user",user);
        return "userDetail";
    }

    @RequestMapping(value = "/url")
    public String url(Model model){

        model.addAttribute("id",1001);
        model.addAttribute("name","jack");
        model.addAttribute("age",18);
        return "url";
    }

    @RequestMapping(value = "/test")
    public @ResponseBody String test(String name){


        return "param   "+name;
    }

    @RequestMapping(value = "/test1")
    public @ResponseBody String test1(String name,Integer id,Integer age){


        return "params   "+id+name+age;
    }

    @RequestMapping(value = "/test2/{id}")
    public @ResponseBody String test2(@PathVariable("id")Integer id){


        return "param  "+id;
    }

    @RequestMapping(value = "/test3/{id}/{name}")
    public @ResponseBody String test3(@PathVariable("id")Integer id,
                                      @PathVariable("name") String name){


        return "param  "+id+name;
    }

    @RequestMapping(value = "/url2")
    public String url2(Model model){

        return "url2";
    }

    @RequestMapping(value = "/property")
    public String property(){
        return "property";
    }
}
