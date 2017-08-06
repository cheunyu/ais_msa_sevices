package com.scyb.aisweather.webservice;

import javax.jws.WebService;

/**
 * Created by foo on 2015/4/11.
 */
@WebService()
public interface IHelloWorld {

    public int sayHallo(String name);
}