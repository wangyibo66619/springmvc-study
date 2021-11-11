package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelTest1 {
    // 没有配置视图解析器下转发
    @RequestMapping("/m1/t1")
    public String test1(Model model) {
        // 转发
        model.addAttribute("msg","ModelTest1");
        return "/WEB-INF/jsp/test.jsp";
    }
    // 没有配置视图解析器下转发
    @RequestMapping("/m1/t2")
    public String test2(Model model) {
        // 转发
        model.addAttribute("msg","ModelTest1");
        return "forward:/WEB-INF/jsp/test.jsp";
    }
    // 没有配置视图解析器下重定向
    @RequestMapping("/m1/t3")
    public String test3(Model model) {
        // 重定向
        model.addAttribute("msg","ModelTest1");
        return "redirect:/index.jsp";
    }
}
