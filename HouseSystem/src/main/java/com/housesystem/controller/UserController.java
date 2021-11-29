package com.housesystem.controller;

import com.housesystem.entity.User;
import com.housesystem.entity.UserInformation;
import com.housesystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @PackageName:com.housesystem.controller
 * @ClassName:UserController
 * @Description:视图控制块,完成登录以及注册
 * @Author:Ozred
 * @Date:2021/11/23/17:32
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /*登录*/
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model, HttpSession session) {

        User user = new User(username, password);

        boolean flag = userService.login(user);
        if (flag) {
            //登录正确
            session.setAttribute("loginUser", user);
            return "redirect:/main1.html";
        } else {
            //登录失败
            model.addAttribute("msg", "用户名或者密码错误");
            return "/login";
        }

    }

    /*注册*/
    @RequestMapping("/register")
    public String regist(@RequestParam("Uid") String uid,
                         @RequestParam("Upws") String upws,
                         @RequestParam("Uname") String uname,
                         @RequestParam("sex") int usex,
                         @RequestParam("tel") String utel,
                         @RequestParam("address") String uaddress,
                         Model model
    ) {

        User user = new User(uid, upws);
        UserInformation userInformation = new UserInformation(uid, uname, utel, usex, uaddress);

        boolean flag = userService.regist(user, userInformation);
        if (flag){
            return "redirect:/main2.html";
        }
        else {
            model.addAttribute("msg","注册失败");
            return "/regist";
        }

    }
}
