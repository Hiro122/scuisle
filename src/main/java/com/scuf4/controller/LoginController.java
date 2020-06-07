package com.scuf4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author Hiro
 * @version V1.0
 * @Description: TODO
 * @date ${date} ${time}
 */
@Controller
public class LoginController {
    @RequestMapping("login")
    public String login(){
        return "redirect:/login.html";
    }

    @RequestMapping("test")
    public String test(){
        return "test";
    }
}
