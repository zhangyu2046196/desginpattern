package com.youyuan.singleton.type3;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—创建型—单例模式—线程不安全懒汉式
 * @date 2019/11/26 8:55
 */
public class SingletonTest3 {

    public static void main(String[] args) {
        System.out.println("设计模式—创建型—单例模式—线程不安全懒汉式");
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

    //2、构造方法私有
    private Singleton() {
    }

    //3、定义静态方法供外部获取单例对象
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
