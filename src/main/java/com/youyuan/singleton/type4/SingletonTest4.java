package com.youyuan.singleton.type4;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—创建型—单例模式—线程安全懒汉式
 * @date 2019/11/26 9:07
 */
public class SingletonTest4 {

    public static void main(String[] args) {
        System.out.println("设计模式—创建型—单例模式—线程安全懒汉式");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1 hashCode:" + instance1.hashCode());
        System.out.println("instance2 hashCode:" + instance2.hashCode());
    }

}

class Singleton {
    //1、定义静态常量
    private static Singleton instance;

    //2、定义私有构造方法
    private Singleton() {
    }

    //3、定义同步方法
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
