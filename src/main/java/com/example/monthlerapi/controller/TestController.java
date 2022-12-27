package com.example.monthlerapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping(value = "/api/test")
    public ResponseEntity<?> test() {
        Map<String, String> t1 = new HashMap<>();
        t1.put("name", "유자");
        t1.put("age", "27");

        Map<String, String> t2 = new HashMap<>();
        t2.put("name", "무지");
        t2.put("age", "31");

        Map<String, String> t3 = new HashMap<>();
        t3.put("name", "git merge 자동 Jenkins 빌드 테스트 + Pull request 자동 반영 테스트 + 브랜치명 변경");

        List<Object> list = new ArrayList<>();
        list.add(t1);
        list.add(t2);
        list.add(t3);

        Map<String, List> result = new HashMap<>();
        result.put("userData", list);

        return ResponseEntity.ok(result);
    }
}
