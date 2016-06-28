package com.sample.controller;

import com.sample.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static spark.Spark.get;

/**
 * Created by yumebayashi on 6/28/16.
 */
@Component
public class ApiController extends Controller {

    @Autowired
    private ApiService apiService;

    @Override
    void setUp() {
        get("sample", (req, res) -> {
            String param = req.queryMap("param").value();
            String ret = apiService.getStr(param);
            return ret;
        });

    }
}
