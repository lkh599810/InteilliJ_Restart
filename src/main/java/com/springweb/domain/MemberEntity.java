package com.springweb.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String memberid;

    @Column
    private String pw;

    @Column
    private String name;

    @Builder
    public MemberEntity(Long id,String memberid, String pw, String name){
        this.id=id;
        this.memberid=memberid;
        this.pw=pw;
        this.name=name;
    }


}
