package com.swx.superartwork.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.swx.superartwork.controller.utils.R;
import com.swx.superartwork.domain.User;
import com.swx.superartwork.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping
    public R getAll() {
        return new R(true, userService.list());
    }

    @PostMapping("/login")
    public R login(@RequestParam("username") String username ,@RequestParam("userpwd") String userpwd) {
        System.out.println(username);
        System.out.println(userpwd);
        User user = userService.getUserByName(username);
        if(user==null){
            return new R(false,"用户名不存在");
        }
        boolean equals = user.getUserpwd().equals(userpwd);
        if(equals){
            return new R(true,user);
        }else {
            return new R(false,"用户名或密码错误");
        }
    }

    @PostMapping("/register")
    public R register (@RequestParam("username") String username ,@RequestParam("userpwd") String userpwd){
        System.out.println(username);
        System.out.println(userpwd);
        User user = userService.getUserByName(username);
        if(user==null){
            userService.save(new User(username,userpwd));
            return new R(true,"注册成功");
        }else{
            return new R(false,"用户名已存在");
        }

    }

    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true, userService.getById(id));
    }

    @PostMapping("/updata")
    public R updata(@RequestBody User user){
        return new R(true,userService.updateById(user));
    }




}
