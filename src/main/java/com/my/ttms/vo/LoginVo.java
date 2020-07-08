package com.my.ttms.vo;


import lombok.Data;

@Data
public class LoginVo {
    private String username;
    private String password;

    public LoginVo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public LoginVo() {
    }
}
