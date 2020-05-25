package com.my.ttms.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 类CommonController.java的实现描述：通用功能的控制类
 * @author frm
 * @date 2020年5月22日下午2:42:55
 */
@RestController
public class CommonController {
    @PostMapping(value = "/login")
    public String login( String name, String password) {
        System.err.println(name);
        System.err.println(password);
        return "ok";
    }
}