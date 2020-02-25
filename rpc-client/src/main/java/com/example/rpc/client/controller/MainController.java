package com.example.rpc.client.controller;

import com.example.rpc.client.remoteservice.SchoolService;
import com.example.rpc.client.remoteservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: study_rpc
 * @description:
 * @author: gaojme
 * @create: 2020-02-25 10:27
 */
@RestController
public class MainController {

    @Autowired
    private UserService userService;
    @Autowired
    private SchoolService schoolService;

    @RequestMapping("/getUserCount")
    public String getUserCount() {
        Integer userCount = userService.getUserCount();
        return userCount.toString();
    }

    @RequestMapping("/getUserInfo")
    public String getUserInfo() {
        String userInfo = userService.getUserInfo(1);
        return userInfo;
    }

    @RequestMapping("/addUser")
    public String addUser() {
        Integer userId = userService.addUser("name", "abc@gmail.com", 16, 0, "Garden School");
        return userId.toString();
    }

    @RequestMapping("/querySchoolName")
    public String querySchoolName() {
        return schoolService.querySchoolName(5);
    }

}
