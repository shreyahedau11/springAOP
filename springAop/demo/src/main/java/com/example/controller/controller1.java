package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller1 {

    @GetMapping("/welcome")
    public String index1() {
        try {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("welcome");
            return "welcome";
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return "welcome";
    }

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "welcomehome";
    }

}
