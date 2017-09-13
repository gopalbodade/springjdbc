package com.springjdbc.springjdbc.repo;

import com.springjdbc.springjdbc.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface StudentRepo
{
List<Student> getData();
}
