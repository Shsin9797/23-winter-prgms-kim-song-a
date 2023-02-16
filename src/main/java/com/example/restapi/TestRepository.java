package com.example.restapi;

import org.springframework.stereotype.Repository;

@Repository
public class TestRepository { //저장소(DB)랑 대화하는 역할

    String Repo(String a){
        return a + " 입니다.";
    }

}
