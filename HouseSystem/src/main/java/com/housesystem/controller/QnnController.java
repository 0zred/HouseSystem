package com.housesystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @PackageName:com.housesystem.controller
 * @ClassName:QnnController
 * @Description:问卷调查视图控制器
 * @Author:Ozred
 * @Date:2021/11/28/16:48
 */
@Controller
public class QnnController {

    @RequestMapping("/Qnn")
    public String toQun(){
        return "homepage/questionnaire";
    }
}
