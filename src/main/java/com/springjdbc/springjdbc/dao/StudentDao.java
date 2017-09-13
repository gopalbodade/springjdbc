package com.springjdbc.springjdbc.dao;


import com.springjdbc.springjdbc.model.Student;
import com.springjdbc.springjdbc.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDao implements StudentRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> getData()
    {
     String sql="select * from student";
     List<Student>list=jdbcTemplate.query(sql,new BeanPropertyRowMapper<Student>(Student.class));
     return list;
    }

}
