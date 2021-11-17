package com.wang.controller;

import com.wang.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {
    @RequestMapping("/t1")
    public String test(){
        return "hello";
    }
    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:param=>" + name);
        if ("1".equals(name)) {
            response.getWriter().write("true");
        }else {
            response.getWriter().write("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("大大",3,"男"));
        userList.add(new User("打打",3,"男"));
        userList.add(new User("达达",3,"男"));

        return userList;
    }

    @RequestMapping("/b1")
    public String b1(String name,String pwd) {
        String msg = "";
        if (name!=null) {
            if ("admin".equals(name)) {
                msg = "ok";
            }else {
                msg = "用户名输入有误";
            }
        }

        if (pwd!=null) {
            if ("1".equals(pwd)) {
                msg = "ok";
            }else {
                msg = "密码输入有误";
            }
        }

        return msg;
    }


}
