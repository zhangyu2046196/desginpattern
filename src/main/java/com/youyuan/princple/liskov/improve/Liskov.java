package com.youyuan.princple.liskov.improve;

/**
 * @author zhangy
 * @version 1.0
 * @description 测试遵循里氏替换原则代码
 * <p>
 * 概念：里氏替换原则是解决在编程过程中正确使用继承，不建议子类重写父类方法，可以通过抽取公共基类、聚合、组合的方式解决问题
 * <p>
 * 示例通过抽取公共基类来遵循里氏替换原则
 * @date 2019/11/20 12:25
 */
public class Liskov {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        System.out.println(a.func1(12, 2));
        System.out.println("===================");
        System.out.println(b.func1(12, 2));
        System.out.println(b.func2(12, 2));
        System.out.println(b.func3(9, 2));

    }

}

/**
 * 公共基类
 */
class Base {

}

/**
 * 类A
 */
class A extends Base{
    public int func1(int a, int b) {
        return a - b;
    }
}


/**
 * 此处B继承类A 并且重写了A的func1方法，使得方法的逻辑完全不一样
 */
class B extends Base{
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return (a - b) + 9;
    }

    public int func3(int a, int b) {
        return a * b;
    }
}




