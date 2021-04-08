package com.franktran.mapper;

import com.franktran.model.Student;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        long mobile = rs.getLong("mobile");
        String country = rs.getString("country");
        return new Student(id, name, mobile, country);
    }
}
