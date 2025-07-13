package com.example.demo7_1.service.serviceImpl;

import com.example.demo7_1.domain.User;
import com.example.demo7_1.repository.UserDao;
import com.example.demo7_1.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;


//    实现登录业务逻辑
    @Override
    public User loginService(String uname, String password) {
        // 如果账号密码都对则返回登录的用户对象，若有一个错误则返回null
        User user = userDao.findByUnameAndPassword(uname, password);
        if (user != null) {
            user.setPassword("");
        }
        return user;
    }

//    注册
    @Override
    public User registService(User user) {

        if (userDao.findByUname(user.getUname()) != null) {
            //当新用户的用户名已存在时
            return null;
        }else{
            //返回创建好的用户对象(带uid)
            User newUser =userDao.save(user);
            if (newUser != null) {
                newUser.setPassword("");
            }
            return newUser;
        }
    }
}
