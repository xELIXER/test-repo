package com.org.testrepo.service;

import org.springframework.stereotype.Component;

@Component
public class TestService {

    public String getResponse() {
        return "hello from the other side, password: " + "pass11234124";
    }
}
