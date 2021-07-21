package com.springweb.web.dto;


import com.springweb.domain.MemberEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MemberDto {

    private Long id;

    private String memberid;

    private String pw;

    private String name;


    @Builder
    public MemberDto(Long id, String memberid, String pw, String name){
        this.id=id;
        this.memberid=memberid;
        this.pw=pw;
        this.name=name;
    }

    public MemberDto(MemberEntity entity){
        this.memberid=entity.getMemberid();
        this.pw= entity.getPw();
        this.name=entity.getName();

    }

    //DTO
    public MemberEntity toEntity(){

        return MemberEntity.builder()
                .id(id)
                .memberid(memberid)
                .pw(pw)
                .name(name)
                .build();

    }

}
