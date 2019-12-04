package com.youyuan.singleton.type6;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—创建型—单例模式—静态内部类
 * @date 2019/11/26 9:52
 */
public class SingletonTest6 {

    public static void main(String[] args) {
        System.out.println("设计模式—创建型—单例模式—静态内部类");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1 hashCode:" + instance1.hashCode());
        System.out.println("instance2 hashCode:" + instance2.hashCode());
    }

}

/**
 * 静态内部类特点
 * 1、外部类装载时静态内部类不会被装载(保证懒加载)
 * 2、静态内部类的静态属性和方法只会初始化一次(保证线程安全)
 */
class Singleton {
    //1、构造方法私有化
    private Singleton() {
    }

    //2、定义静态内部类
    public static class SingletonInstance {
        //定义外部类对象
        private static final Singleton instance = new Singleton();
    }

    //3、定义静态方法获取单例对象
    public static Singleton getInstance() {
        return SingletonInstance.instance;
    }
}
