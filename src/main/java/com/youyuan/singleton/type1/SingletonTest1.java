package com.youyuan.singleton.type1;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—创建型—单例模式—静态常量饿汉式
 * @date 2019/11/21 11:27
 */
public class SingletonTest1 {

    public static void main(String[] args) {
        //测试静态常量饿汉式单例模式
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1 hashCode:" + instance1.hashCode());
        System.out.println("instance2 hashCode:" + instance2.hashCode());
    }

}

/**
 * 单例模式的类
 */
class Singleton {
    //1、定义静态常量
    private final static Singleton instance = new Singleton();  //直接new出来赋值给静态常量

    //2、构造方法私有
    private Singleton() {
    }

    //3、提供一个静态方法供外部调用获取单例对象
    public static Singleton getInstance() {
        return instance;
    }
}
