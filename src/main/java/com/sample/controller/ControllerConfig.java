package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static spark.Spark.get;

/**
 * Created by yumebayashi on 6/19/16.
 */
@Component
public class ControllerConfig {

    @Autowired
    ApiController apiController;

    public ControllerConfig() {
        get("favicon.ico", (req, res) -> {
            res.status(404);
            return "";
        });
    }

}
