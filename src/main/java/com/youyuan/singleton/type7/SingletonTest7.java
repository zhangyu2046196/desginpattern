package com.youyuan.singleton.type7;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—创建型—单例模式—枚举
 * @date 2019/11/26 10:30
 */
public class SingletonTest7 {

    public static void main(String[] args) {
        System.out.println("设计模式—创建型—单例模式—枚举");
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
        System.out.println("instance1 hashCode:" + instance1.hashCode());
        System.out.println("instance2 hashCode:" + instance2.hashCode());
    }

}

enum Singleton {
    INSTANCE;

    public void sayOk() {
        System.out.println("ok");
    }
}
