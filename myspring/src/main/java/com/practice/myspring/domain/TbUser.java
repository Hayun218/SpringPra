package com.practice.myspring.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Entity
public class TbUser {
    @Id private String id;

    @Setter @Column(nullable = false) private String deleted; // 삭제여부
    @Setter @Column(nullable = false) private String username;
    @Setter @Column(nullable = false) private String password;
    @Setter @Column(nullable = false) private String name;
    @Setter @Column(nullable = false) private String nick;
    @Setter @Column(nullable = false) private String birth;
    @Setter @Column(nullable = false) private String phone;
    @Setter @Column(nullable = false) private String mpic; // 프로필사진
    @Setter @Column(nullable = false, length=2000000) @Lob
        private String content; // 본문

    protected TbUser(){}

    // Model 정의
    private TbUser(String username, String password, String name, String nick, String birth, String phone, String mpic, String content) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.nick = nick;
        this.nick = birth;
        this.phone = phone;
        this.mpic = mpic;
        this.content = content;
    }

    public static TbUser of(String username, String password) {
        return new TbUser(username, password, "", "", "", "", "", "");
    }

    // ID 랜덤생성 및 deleted => N 저장
    @PrePersist
    public void onPrePersist() {
        this.id = UUID.randomUUID().toString().replace("-", "");
        this.deleted ="N";
    }


}
