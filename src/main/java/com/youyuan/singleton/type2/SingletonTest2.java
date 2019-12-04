package com.youyuan.singleton.type2;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—创建型—单例模式—静态代码块饿汉式
 * @date 2019/11/21 11:42
 */
public class SingletonTest2 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance hashCode:" + instance1.hashCode());
        System.out.println("instance hashCode:" + instance2.hashCode());
    }

}

/**
 * 单例对象
 */
class Singleton {
    //1、定义静态对象
    private static Singleton instance = null;

    //2、私有构造方法
    private Singleton() {
    }

    //3、定义静态代码块
    static {
        instance = new Singleton();
    }

    //4、定义静态方法供外部调用获取单例对象
    public static Singleton getInstance() {
        return instance;
    }
}
