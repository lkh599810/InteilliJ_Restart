package com.springweb.web;


import com.springweb.service.MemberService;
import com.springweb.web.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    //멤버 컨트롤러 : 가입요청, 가입처리, 로그인요청, 로그인처리

    //회원가입 페이지요청
    @GetMapping("/signup")
    public String membersignup(){

        return "signup";
    }


    //real signup task
    @PostMapping("/signup1")
    public String membersignup_c(MemberDto memberDto){
        memberService.membersave(memberDto);

        return "redirect:/signup";
    }


}
