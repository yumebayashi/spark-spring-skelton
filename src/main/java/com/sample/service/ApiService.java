package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yumebayashi on 6/28/16.
 */
@Service
public class ApiService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public String getStr(String tmp) {
        try {
            List<String> names = jdbcTemplate.queryForList("select name from samples", String.class);
            return names.toString();
        } catch (Exception e) {
            System.out.println(e);
        }
        return "error";
    }
}
