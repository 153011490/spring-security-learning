package com.samson.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/course")
    public String course(){
        return "course";
    }

    @GetMapping("/score")
    public String score(){
        return "score";
    }

    @GetMapping("/studentManagement")
    public String studentManagement(){
        return "studentManagement";
    }

    @GetMapping("/teacherManagement")
    public String teacherManagement(){
        return "teacherManagement";
    }


}
