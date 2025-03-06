package com.apple.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.ZonedDateTime;

@Controller
public class BasicController {
    @GetMapping("/")
//    @ResponseBody return 우측의 문자데이터를 그대로 보내는 데코레이터
    String hello(){
        return "index.html"; //스태틱폴더는 기본 폴더로 잡힌다
    }

    @GetMapping("/about")
    @ResponseBody
    String about(){
        return "피싱사이트에요";
    }

    @GetMapping("/mypage")
    @ResponseBody
    String mee(){
        return "마이페이지에요";
    }

    @GetMapping("/date")
    @ResponseBody
    String date(){
        return ZonedDateTime.now().toString();
    }
}
