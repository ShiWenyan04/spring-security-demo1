package com.example.demo7_1.service;

import com.example.demo7_1.domain.User;
//    添加登录注册需要用到的业务逻辑方法

public interface UserService {
    /*
    登录
    @param uname 账户名
    @param password 密码
    @return
     */
    User loginService(String uname, String password);

    /*
    注册
    @param user 要注册的user对象，属性中主键uid为空，否则可能会覆盖已存在的user
    @return
    */
    User registService(User user);
}
