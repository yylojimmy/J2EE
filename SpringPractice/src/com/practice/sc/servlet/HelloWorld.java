package com.practice.sc.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
 
@Controller
public class HelloWorld {
    @RequestMapping(value="/hello.html", method=RequestMethod.GET)
    public String hello(@RequestParam("user") String user, Model m) {
    	System.out.println("test - helloworld");
        m.addAttribute("user", user);
        return "hello";
    }
}
