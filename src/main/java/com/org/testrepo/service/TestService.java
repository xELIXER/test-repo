package com.org.testrepo.service;

import org.springframework.stereotype.Component;

@Component
public class TestService {

    public String getResponse() {
        return "hello from the other side";
    }

    public String getResponse2() {
        return "hello from the other side pt2, password: " + "pass11234124";
    }
}
