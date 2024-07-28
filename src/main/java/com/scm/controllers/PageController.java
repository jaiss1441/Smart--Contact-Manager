package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("isLogin",true);
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
}
