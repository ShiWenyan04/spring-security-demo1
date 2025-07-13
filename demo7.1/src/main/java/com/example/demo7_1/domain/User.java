package com.example.demo7_1.domain;

import jakarta.persistence.*;

@Table (name = "user")//说明此实体类对应用数据库的user表
@Entity//说明这个类是个实体类
public class User {
//    属性名要与数据表中的字段名一致
//    主键自增int（10）对应long
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long uid;

//    用户名属性varchar对应string
    private String uname;

//    密码属性varchar对应string
    private String password;


//    对应的set  get方法
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public long getUid() {
        return uid;
    }

    public void setUid( long uid) {
        this.uid = uid;
    }
}
