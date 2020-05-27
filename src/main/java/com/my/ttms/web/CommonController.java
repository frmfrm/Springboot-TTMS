package com.my.ttms.web;

import com.my.ttms.Service.UserService;
import com.my.ttms.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;


/**
 * 类CommonController.java的实现描述：通用功能的控制类
 * @author frm
 * @date 2020年5月22日下午2:42:55
 */
@Controller
public class CommonController {
    @Autowired
    private UserService userService;
    // 1 老板  2 经理 4 管理员 0 普通用户
    private static final String BOOS = "1";
    private static final String JL = "2";
    private static final String GLY = "4";
    private static final String USER = "0";
    @PostMapping(value = "/login")
    public String  login( String name, String password) {
        //Response response = new Response();
        User user = new User();
        user.setUserName(name);
        user.setUserPassword(password);
        System.err.println(name);
        System.err.println(password);
        User loginUser =  userService.Find(user);
        System.err.println(loginUser);
        if(loginUser!=null&&loginUser.getUserPassword().equals(password)) {
            //根据status 鉴权

            if(BOOS.equals(loginUser.getUserStatus())){
                return "";
            }else if(JL.equals(loginUser.getUserStatus())){
                return "main";
            }else if(GLY.equals(loginUser.getUserStatus())){
                return "";
            }else if(USER.equals(loginUser.getUserStatus())){
                return "cplay";
            }
        }
            return "index";
    }
}