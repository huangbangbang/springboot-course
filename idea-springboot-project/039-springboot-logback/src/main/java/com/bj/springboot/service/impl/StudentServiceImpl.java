package com.bj.springboot.service.impl;

import com.bj.springboot.mapper.StudentMapper;
import com.bj.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Integer queryStudentCount() {
        return studentMapper.selectStudentCount();
    }
}
