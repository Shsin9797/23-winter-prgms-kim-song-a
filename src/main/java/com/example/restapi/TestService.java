package com.example.restapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    TestRepository tr;

    String test(){
        return tr.Repo("test");
    }
}
