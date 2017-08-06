package com.scyb.aisweather.webservice.bo;

/**
 * Created by foo on 2015/4/11.
 */
public class HelloWorldBo {
    private int name;

    public HelloWorldBo() {
    }

    public HelloWorldBo(int name) {
        this.name = name;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloWorldBo{" +
                "name=" + name +
                '}';
    }
}
