package com.zsh.web.controller;

import com.zsh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserControl {
    @Autowired
    private UserService userService;
    @RequestMapping("/register")
    @ResponseBody
    public String register(String username,String password) {
        userService.register(username,password);
        return "success";
    }
     @RequestMapping("/login")
     public String login(String username){
           return "user/list";
    }
}
