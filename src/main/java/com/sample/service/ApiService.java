package com.sample.service;

import com.sample.dao.SampleDao;
import com.sample.dto.Sample;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yumebayashi on 6/28/16.
 */
@Service
public class ApiService {
    @Autowired
    SampleDao sampleDao;

    public List<Sample> getStr() {
        return sampleDao.findSamples();
    }
}
