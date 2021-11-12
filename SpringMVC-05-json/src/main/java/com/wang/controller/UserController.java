package com.wang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.wang.pojo.User;
import com.wang.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController // 它就不会走视图解析器，会直接返回字符串
public class UserController {

    @RequestMapping("/j1")
    public String json1() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        User user = new User(1,"王艺博",18);

        String str = mapper.writeValueAsString(user);

        return str;
    }

     @RequestMapping("/j2")
     public String json2() throws JsonProcessingException {

         ObjectMapper mapper = new ObjectMapper();
         User user = new User(1,"王艺博",18);
         User user2 = new User(2,"王艺博2",18);
         User user3 = new User(3,"王艺博3",18);
         User user4 = new User(4,"王艺博4",18);

         List<User> userList = new ArrayList<>();
         userList.add(user);
         userList.add(user2);
         userList.add(user3);
         userList.add(user4);

         String str = mapper.writeValueAsString(userList);

         return str;
     }


    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {

        Date date = new Date();


        return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
    }
}
