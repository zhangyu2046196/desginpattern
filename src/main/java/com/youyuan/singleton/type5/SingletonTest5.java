package com.youyuan.singleton.type5;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—创建型—单例模式—dcl(双重检测锁)
 * @date 2019/11/26 9:33
 */
public class SingletonTest5 {

    public static void main(String[] args) {
        System.out.println("设计模式—创建型—单例模式—dcl(双重检测锁)");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1 hashCode:" + instance1.hashCode());
        System.out.println("instance2 hashCode:" + instance2.hashCode());
    }

}

class Singleton {
    //1、定义静态常量，用volatile关键字修饰(保证内存可见性)
    private static volatile Singleton instance;

    //2、构造方法私有化
    private Singleton() {
    }

    //3、定义静态方法，供外部调用获取实例对象
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
