package com.sample.controller;

/**
 * Created by yumebayashi on 6/19/16.
 */
public abstract class Controller {

    public Controller() {
        setUp();
    }

    abstract void setUp();
}
