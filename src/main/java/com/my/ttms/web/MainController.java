package com.my.ttms.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 主页控制器
 */

@Controller
public class MainController {
    private static final Long ROLE_USER_AUTHORITY_ID = 2L;


    @GetMapping("/")
    public String root(){
        return "index";
    }
//    @GetMapping("/index")
//    public String index(){
//        return "redirect:ok";
//    }


    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(String name, String password) {
        return "redirect:/login";
    }
    /**
     * 获取登录界面
     * @return
     */
//    @PostMapping("/login")
//    public String login(String name, String password){
//        System.err.println(name + password);
//
//    }

    @GetMapping("/login-error")
    public String loginError(Model model){
        model.addAttribute("loginError",true);
        model.addAttribute("errorMsg","登录失败，用户名或密码错误！");
        return "login";
    }


}
