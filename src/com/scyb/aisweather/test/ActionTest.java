package com.scyb.aisweather.test;

import com.opensymphony.xwork2.Action;

import java.util.logging.Logger;

/**
 * Created by foo on 2015/5/25.
 */
public class ActionTest implements Action {

    private Logger log = Logger.getLogger(this.getClass().getName());
    @Override
    public String execute() throws Exception {
        log.info("test action succes!");
        return null;
    }
}
