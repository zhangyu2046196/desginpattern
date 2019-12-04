package com.youyuan.princple.segregation.improve;

/**
 * @author zhangy
 * @version 1.0
 * @description 遵循接口隔离原则测试代码
 * <p>
 * 概念：一个类不应该依赖它不需要的接口，类A依赖类B要建立在最小接口上
 * @date 2019/11/20 9:22
 */
public class Segregation {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.operation1(b);
        a.operation2(b);
        a.operation3(b);

        c.operation1(d);
        c.operation4(d);
        c.operation5(d);
    }

}

/**
 * 接口1
 */
interface Interface1 {
    public void operation1();
}

/**
 * 接口2
 */
interface Interface2 {
    public void operation2();

    public void operation3();
}

/**
 * 接口3
 */
interface Interface3 {
    public void operation4();

    public void operation5();
}

/**
 * 实现类
 */
class B implements Interface1, Interface2 {

    @Override
    public void operation1() {
        System.out.println("B实现了接口Interface1的operation1方法");
    }

    @Override
    public void operation2() {
        System.out.println("B实现了接口Interface2的operation2方法");
    }

    @Override
    public void operation3() {
        System.out.println("B实现了接口Interface2的operation3方法");
    }
}

/**
 * 实现类
 */
class D implements Interface1, Interface3 {

    @Override
    public void operation1() {
        System.out.println("D实现了接口Interface1的operation1方法");
    }

    @Override
    public void operation4() {
        System.out.println("D实现了接口Interface3的operation4方法");
    }

    @Override
    public void operation5() {
        System.out.println("D实现了接口Interface3的operation5方法");
    }
}

/**
 * 类A通过接口Interface1、Interface2依赖实现类B
 */
class A {
    public void operation1(Interface1 interface1) {
        interface1.operation1();
    }

    public void operation2(Interface2 interface2) {
        interface2.operation2();
    }

    public void operation3(Interface2 interface2) {
        interface2.operation3();
    }
}

/**
 * 类C通过接口Interface1、Interface3依赖实现类D
 */
class C {
    public void operation1(Interface1 interface1) {
        interface1.operation1();
    }

    public void operation4(Interface3 interface3) {
        interface3.operation4();
    }

    public void operation5(Interface3 interface3) {
        interface3.operation5();
    }
}