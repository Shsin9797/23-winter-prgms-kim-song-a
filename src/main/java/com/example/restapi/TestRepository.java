package com.example.restapi;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TestRepository { //저장소(DB)랑 대화해서, 서비스가 원하는 데이터를 주거나 /지우거나 /수정하거나  => CRUD 대신 해주는 친구

   //private Map<String ,String > db =new HashMap<>();
    //자바 (자료구조) 컬렉션 ... 중 실무는 2개만 알면 됨
    //list , map(hashmap)

    public String test() { // 나 레파지토리인데.. 내가 갖고잇는 test() 메시지 부르면.. 그값 찾아서 돌려줄게
        //DB 에서 데이터 select 해와서 return
        return "test";
    }

}
