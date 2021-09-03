package com.bj.springboot.service.impl;

import com.bj.springboot.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String say() {
        return "say hello";
    }
}
