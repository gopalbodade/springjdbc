package com.springjdbc.springjdbc.controller;

import com.springjdbc.springjdbc.dao.StudentDao;
import com.springjdbc.springjdbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentDao sd;

   @GetMapping(value = "/getdata")
   ResponseEntity<?>  get()

   {
//        List<Student> studentList =sd.getData();
//        System.out.println(studentList);
//        ResponseEntity<?>entity=ResponseEntity.ok(studentList);
        ResponseEntity<?>entity=ResponseEntity.ok(sd.getData());
        return entity;
    }
}
