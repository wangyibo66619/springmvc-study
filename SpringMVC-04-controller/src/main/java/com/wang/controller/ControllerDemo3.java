package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("c3")
public class ControllerDemo3 {
    @RequestMapping("t1")
    public String test3(Model model) {
        model.addAttribute("msg","test3");
        return "test";
    }
}
