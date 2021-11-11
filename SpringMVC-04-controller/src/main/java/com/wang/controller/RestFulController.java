package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestFulController {
    // http://localhost:8080/add/1/2
    @GetMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a,@PathVariable int b, Model model) {
        int rel = a + b;
        model.addAttribute("msg","结果1=" + rel);
        return "test";
    }
    // http://localhost:8080/add/1/3
    @PostMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a,@PathVariable int b, Model model) {
        int rel = a + b;
        model.addAttribute("msg","结果2=" + rel);
        return "test";
    }

}
