package com.sunsan.beetsqltest.user.controller;

import com.sunsan.beetsqltest.user.entity.User;
import com.sunsan.beetsqltest.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/user/{id}")
    public @ResponseBody User say(@PathVariable Integer id) {
        User user = userService.getById(id);
        return user;
    }

    @RequestMapping("/user/query/{name}")
    public @ResponseBody List<User> say(@PathVariable String name) {
        List<User> users = userService.query(name);
        return users;
    }

    @RequestMapping("/user/query/{name}")
    public void say(@PathVariable String name) {

        List<User> users = userService.query(name);

    }
}
