package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping("/message")
    @ResponseBody
    public String sendMessage() {
        return "Hello Spring";
    }
}

//Controller, Model 파일이 앱 실행파일(DemoApplication)와 같은 패키지 내에 있어야 한다ㅠㅠㅠ
