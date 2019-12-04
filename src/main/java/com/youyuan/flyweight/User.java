package com.youyuan.flyweight;

/**
 * @author zhangy
 * @version 1.0
 * @description  用户  外部状态
 * @date 2019/12/2 21:12
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
