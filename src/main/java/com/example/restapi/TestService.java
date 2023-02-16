package com.example.restapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    TestRepository tr;

    String test(){
        //서비스가 로직짜는 애라고 했는데
        // return "test"를 repository 가 대신해주면
        // 여기서 서비스는 지금 이 로직상 repository 에게 일을 시켜서 받기만 하면됨


        return tr.test();
    }
}
