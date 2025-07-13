package com.example.demo7_1.repository;

import com.example.demo7_1.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//添加注解
//接口要继承JpaRespository，这样jpa就能帮助我完成对数据库的映射，
//也就是说接口里写的方法只要符合格式可以不需要实现sql语句就能直接用了

public interface UserDao  extends JpaRepository<User, Long> /*实体类、实体类中对应表主键的数据类型*/{
    User findByUname(String uname);  //通过用户名uname查找用户，注意要按照jpa的格式使用驼峰命名法
    User findByUnameAndPassword(String uname,String password);//通过用户名和密码查找用户

//这里我们已经实现了根据用户名密码查找用户的方法，而插入用户信息的方法save(object o)JPA已经帮我们实现了，可以直接调用，这里就不需要写了。
}