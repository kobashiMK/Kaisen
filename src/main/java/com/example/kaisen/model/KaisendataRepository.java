package com.example.kaisen.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import static org.springframework.jdbc.core.BeanPropertyRowMapper.newInstance;

@Repository
public class KaisendataRepository {

    @Autowired
    private JdbcTemplate jdbc;
    public Kaisendata select(String count, String result){
        try {
            var sql = "select * from RESULT where count = ? and result = ?";
            return jdbc.queryForObject(sql, newInstance(Kaisendata.class),count,result );
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }
}
