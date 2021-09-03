package com.bj.springboot.web;

import com.bj.springboot.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

//@Controller
@RestController
public class StudentController {


    @RequestMapping(value = "/student")
    public  Object student(Integer id,Integer age){
        Student student=new Student();
        student.setId(id);
        student.setAge(age);
        return student;
    }

    //@RequestMapping(value = "/student/detail/{id}/{age}")
    @GetMapping(value = "/student/detail/{id}/{age}")
    public  Object student1(@PathVariable("id") Integer id,
    @PathVariable("age") Integer age){

        Map<String,Object> retMap = new HashMap<>();

        retMap.put("id",id);
        retMap.put("age",age);
        return retMap;
    }

    //@RequestMapping(value = "/student/detail/{id}/{status}")
    @DeleteMapping(value = "/student/detail/{id}/{status}")
    public  Object student2(@PathVariable("id") Integer id,
                            @PathVariable("status") Integer status){

        Map<String,Object> retMap = new HashMap<>();

        retMap.put("id",id);
        retMap.put("status",status);
        return retMap;
    }

    @DeleteMapping(value = "/student/{id}/detail/{city}")
    public  Object student3(@PathVariable("id") Integer id,
                            @PathVariable("city") Integer city){

        Map<String,Object> retMap = new HashMap<>();

        retMap.put("id",id);
        retMap.put("city",city);
        return retMap;
    }


    @PostMapping(value = "/student/{id}")
    public  Object student4(@PathVariable("id") Integer id){

        return "post id";
    }


    @PutMapping(value = "/student/{id}")
    public  Object student5(@PathVariable("id") Integer id){

        return "put id";
    }

}
