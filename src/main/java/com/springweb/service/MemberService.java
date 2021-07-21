package com.springweb.service;

import com.springweb.domain.MemberRepository;
import com.springweb.web.dto.MemberDto;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MemberService {

    private MemberRepository memberRepository;

    public Long membersave(MemberDto memberDto){
        return memberRepository.save(memberDto.toEntity()).getId();
    }

}
