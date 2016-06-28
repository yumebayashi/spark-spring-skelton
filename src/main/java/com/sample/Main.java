package com.sample;

import com.sample.controller.ControllerConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static spark.Spark.get;

/**
 * Created by yumebayashi on 6/10/16.
 */
@Configuration
@ComponentScan({"com.sample"})
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);
        ctx.getBean(ControllerConfig.class);
    }

}
