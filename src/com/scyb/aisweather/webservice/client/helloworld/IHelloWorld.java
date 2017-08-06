package com.scyb.aisweather.webservice.client.helloworld;

import javax.jws.WebService;

/**
 * Created by foo on 2015/4/11.
 */
@WebService
public interface IHelloWorld {

    public String sayHallo(String name);
}
