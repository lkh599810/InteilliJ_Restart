package com.springweb.web;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    //똑같이 Getmapping
    @GetMapping("/signup")//회원가입 페이지로 보내주기
    public String signup(){
        return "signup";
    }
}
