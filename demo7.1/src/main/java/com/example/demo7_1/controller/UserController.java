package com.example.demo7_1.controller;

import com.example.demo7_1.domain.User;
import com.example.demo7_1.service.UserService;
import com.example.demo7_1.utils.Result;
import jakarta.annotation.Resource;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")//是这个控制器类的基路由
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/login")//表示处理post请求，路由为/user/login
    public Result <User> loginController(@RequestParam String uname,@RequestParam String password){
        User user = userService.loginService(uname,password);
        if(user != null){
            return Result.success(user,"登陆成功！");
        }else{
            return Result.error("123","账号密码错误！");
        }
    }

    @PostMapping("/register")//表示处理post请求，路由为/user/register
    public Result<User> registerController(@RequestParam User newUser){
        User user = userService.registService(newUser);
        if(user != null){
            return Result.success(user,"注册成功！");
        }else{
            return Result.error("456","用户名已存在");
        }
    }
}
