package com.scm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scm.entities.User;
import com.scm.forms.UserForm;
import com.scm.services.UserService;





@Controller
public class PageController {

    @Autowired
    private UserService userService;

    @RequestMapping("/home")
    public String home() {
        System.out.println("Home page Handler");
        return "home";
    }

    // about route
    @RequestMapping("/about")
    public String aboutPage() {

        return "about";
    }

    // Service route
    @RequestMapping("/services")
    public String servicesPageLoading() {
        return "services";
    }

    @RequestMapping("/contact")
    public String contact() {

        return "contact";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/register")
    public String register(Model model) {
        UserForm userForm = new UserForm();
        // Sending default data to form from backend
        // userForm.setName("@999_Jais");
        // userForm.setAbout("Write something about yourself");
        model.addAttribute("userForm",userForm);
        return "register";
    }

    // Processing Register
    @RequestMapping(value = "/do-register", method = RequestMethod.POST)
    public String processingRegister(@ModelAttribute UserForm userForm) {
        // creating model to store data into it - UserForm
        System.out.println(userForm);

        // fetch form data
        // validate form data
        // save to database
        // user service userForm ----> user
        User user = User.builder()
        .name(userForm.getName())
        .about(userForm.getAbout())
        .email(userForm.getEmail())
        .password(userForm.getPassword())
        .phoneNumber(userForm.getPhoneNumber())
        .profilePic("https://avatarfiles.alphacoders.com/375/375167.png")
        .build();

        User savedUser =userService.saveUser(user);

        System.out.println("User Saved");
        // message "Successful Registration"
        // redirect login page
        return "redirect:/register";
    }
}
