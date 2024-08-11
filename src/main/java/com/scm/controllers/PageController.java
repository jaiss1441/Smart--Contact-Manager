package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(){
        System.out.println("Home page Handler");
        return "home";
    }

    //about route
    @RequestMapping("/about")
    public String aboutPage(){

        return "about";
    }
    //Service route
    @RequestMapping("/services")
    public String servicesPageLoading(){
        return "services";
    }

    @RequestMapping("/contact")
    public String contact(){

        return "contact";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }
}
