package com.my.ttms.web;

import com.my.ttms.Service.UserService;
import com.my.ttms.bean.User;
import com.my.ttms.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * 类CommonController.java的实现描述：通用功能的控制类
 *
 * @author frm
 * @date 2020年5月22日下午2:42:55
 */
@Controller
public class CommonController {
    @Autowired
    private UserService userService;
//    @Autowired
//    private LoginService loginService;
//
//    @PostMapping(value = "/login")
//    public String login(LoginVo loginVo) {
//        //loginService.login(response,loginVo);
//
//        System.err.println(loginUser);
//        HttpSession httpSession
//        if (loginUser != null && loginUser.getUserPassword().equals(password)) {
//            //根据status 鉴权
//
//            if (BOOS.equals(loginUser.getUserStatus())) {
//                return "";
//            } else if (JL.equals(loginUser.getUserStatus())) {
//                return "/main";
//            } else if (GLY.equals(loginUser.getUserStatus())) {
//                return "";
//            } else if (USER.equals(loginUser.getUserStatus())) {
//                return "/cplay";
//            }
//        }
//        return "/cplay";
//    }

    @PostMapping("/login")
    public String login(String name,String password ,HttpSession session, HttpServletResponse response, String pwdcokie) {
        User loginUser = userService.Find(name);
        if (loginUser != null) {
            //把用户信息存入session
            session.setAttribute("user",loginUser);
            if (pwdcokie != null) {
                //把用户信息存入cookie
                //从对象中取出名字 密码
                // new cookie 空间
                Cookie cname = new Cookie("name", name);
                Cookie cpwd = new Cookie("pwd", password);
                //设置cookie过期时间
                cname.setMaxAge(60 * 60);
                cpwd.setMaxAge(60 * 60);
                //设置全路径
                cname.setPath("/");
                cpwd.setPath("/");
                //响应请求 存入cookie
                response.addCookie(cname);
                response.addCookie(cpwd);
            } else {
                // new cookie 空间
                Cookie cname = new Cookie("name", name);
                Cookie cpwd = new Cookie("pwd", password);
                //设置cookie过期时间
                cname.setMaxAge(0);
                cpwd.setMaxAge(0);
                //设置全路径
                cname.setPath("/");
                cpwd.setPath("/");
                //响应请求 存入cookie
                response.addCookie(cname);
                response.addCookie(cpwd);

            }

            //把用户名放入session
            session.setAttribute("p", pwdcokie);
            session.setAttribute("name", loginUser.getUserName());
            return "/cplay";
        }
        return "login";
    }

}