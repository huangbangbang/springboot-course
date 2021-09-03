package com.bj.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bj.springboot.service.StudentService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = StudentService.class,version = "0.0.1-SNAPSHOT",timeout = 15000)
public class StudentServiceImpl implements StudentService {
    @Override
    public Integer queryStudentCount() {
        return 10000;
    }
}
