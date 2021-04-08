package com.example.mvc_basics;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Instant;

@Controller
public class HomeController {

    @RequestMapping("/home")//localhost:800/home
    public String getHomePage(Model model)
    {
        model.addAttribute("welcomeMessage", Instant.now().toString());
        return "home";
    }

}


