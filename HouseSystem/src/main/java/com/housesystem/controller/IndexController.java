package com.housesystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @PackageName:com.housesystem.controller
 * @ClassName:IndexController
 * @Description:TODO
 * @Author:Ozred
 * @Date:2021/11/25/9:35
 */
@Controller
public class IndexController {

    @RequestMapping("/login")
    public String toLogin() {
        return "users/login";
    }

    @RequestMapping("/regist")
    public String toRegist(){
        return "users/regist";
    }

    @RequestMapping("/case")
    public String toCase(){
        return "homepage/case";
    }

}
