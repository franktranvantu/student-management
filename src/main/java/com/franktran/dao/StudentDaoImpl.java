package com.franktran.dao;

import com.franktran.mapper.StudentRowMapper;
import com.franktran.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    private final JdbcTemplate jdbcTemplate;
    private final StudentRowMapper studentRowMapper;

    public StudentDaoImpl(JdbcTemplate jdbcTemplate, StudentRowMapper studentRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.studentRowMapper = studentRowMapper;
    }

    @Override
    public List<Student> getStudentList() {
        String sql = "SELECT * FROM students";
        return jdbcTemplate.query(sql, studentRowMapper);
    }

    @Override
    public void createStudent(Student student) {
        String sql = "INSERT INTO students(name, mobile, country) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, student.getName(), student.getMobile(), student.getCountry());
    }

    @Override
    public Student getStudentById(int id) {
        String sql = "SELECT * FROM students WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, studentRowMapper, id);
    }

    @Override
    public void updateStudent(Integer id, Student student) {
        String sql = "UPDATE students SET name = ?, mobile = ?, country = ? WHERE id = ?";
        jdbcTemplate.update(sql, student.getName(), student.getMobile(), student.getCountry(), student.getId());
    }
}
