//package com.my.ttms.Service;
//
//
//import com.my.ttms.bean.Seat;
//import com.my.ttms.bean.User;
//import com.my.ttms.common.CodeMsg;
//import com.my.ttms.dao.SeatMapper;
//import com.my.ttms.utils.UUIDUtil;
//import com.my.ttms.vo.LoginVo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletResponse;
//import java.util.List;
//
///**
// * @author frm
// */
//@Service
//public class LoginService {
//    @Autowired
//    private SeatMapper seatMapper;
//    @Autowired
//    private UserService userService;
//
//
//    // 1 老板  2 经理 4 管理员 0 普通用户
//    private static final String BOOS = "1";
//    private static final String JL = "2";
//    private static final String GLY = "4";
//    private static final String USER = "0";
//
//    public CodeMsg login(HttpServletResponse response, LoginVo loginVo) {
//        if (loginVo == null) {
//            return CodeMsg.SERVER_ERROR;
//        }
//        //经过了依次MD5的密码
//        String username = loginVo.getUsername();
//        String formPass = loginVo.getPassword();
//        //用户是否存在
//        User loginUser =  userService.Find(loginVo.getUsername());
//        //查询不到该用户
//        if (loginUser == null) {
//            return CodeMsg.MOBILE_NOTEXIST;
//        }
//        if(loginUser.getUserPassword().equals(loginVo.getPassword())){
//            //生成cookie
//            String token = UUIDUtil.uuid();
//            addCookie(loginUser, token, response);
//            return CodeMsg.SUCCESS;
//        }
//    }
//    /**
//     *
//     * 添加或者叫做更新cookie
//     */
////    public void addCookie(User user,String token,HttpServletResponse response) {
////        // 可以用老的token，不用每次都生成cookie，可以用之前的
////        System.out.println("uuid:" + token);
////        // 将token写到cookie当中，然后传递给客户端
////        // 此token对应的是哪一个用户,将我们的私人信息存放到一个第三方的缓存中
////        // prefix:MiaoshaUserKey.token key:token value:用户的信息 -->以后拿到了token就知道对应的用户信息。
////        // MiaoshaUserKey.token-->
////        redisService.set(MiaoshaUserKey.token, token, user);
////        Cookie cookie = new Cookie(COOKIE1_NAME_TOKEN, token);
////        // 设置cookie的有效期，与session有效期一致
////        cookie.setMaxAge(MiaoshaUserKey.token.expireSeconds());
////        // 设置网站的根目录
////        cookie.setPath("/");
////        // 需要写到response中
////        response.addCookie(cookie);
////    }
//}
