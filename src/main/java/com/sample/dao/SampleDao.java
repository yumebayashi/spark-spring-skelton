package com.sample.dao;

import com.sample.dto.Sample;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yumebayashi on 6/30/16.
 */
@Component
public class SampleDao {

    @Autowired
    NamedParameterJdbcTemplate npJdbcTemplate;

    public List<Sample> findSamples() {
        try {
            RowMapper<Sample> mapper = new BeanPropertyRowMapper(Sample.class);
            return npJdbcTemplate.query("select * from samples", mapper);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;

    }
}
