package com.zy.feign;

import org.springframework.stereotype.Component;

@Component
public class SchedualClientServerHystric implements SchedualClientServer{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
