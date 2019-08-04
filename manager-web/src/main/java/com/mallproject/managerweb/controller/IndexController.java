package com.mallproject.managerweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {


    //登录页
    @RequestMapping("/login")
    public String LoginHtml(){

        return "login";
    }

    //登录页
    @RequestMapping("/index")
    public String IndexHtml(){

        return "index";
    }

}
