package com.youyuan.princple.segregation;

/**
 * @author zhangy
 * @version 1.0
 * @description 测试违反接口隔离原则
 * <p>
 * 概念：一个类不应该依赖它不需要的接口，类A依赖类B要建立在最小接口上
 * @date 2019/11/19 21:52
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
 * 接口
 */
interface Interface1 {
    public void operation1();

    public void operation2();

    public void operation3();

    public void operation4();

    public void operation5();
}

/**
 * 实现类
 */
class B implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("B类实现接口Interface1的operation1方法");
    }

    @Override
    public void operation2() {
        System.out.println("B类实现接口Interface1的operation2方法");
    }

    @Override
    public void operation3() {
        System.out.println("B类实现接口Interface1的operation3方法");
    }

    @Override
    public void operation4() {
        System.out.println("B类实现接口Interface1的operation4方法");
    }

    @Override
    public void operation5() {
        System.out.println("B类实现接口Interface1的operation5方法");
    }
}

/**
 * 实现类
 */
class D implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("D类实现接口Interface1的operation1方法");
    }

    @Override
    public void operation2() {
        System.out.println("D类实现接口Interface1的operation2方法");
    }

    @Override
    public void operation3() {
        System.out.println("D类实现接口Interface1的operation3方法");
    }

    @Override
    public void operation4() {
        System.out.println("D类实现接口Interface1的operation4方法");
    }

    @Override
    public void operation5() {
        System.out.println("D类实现接口Interface1的operation5方法");
    }
}

/**
 * 类A通过接口Interface1依赖实现类B，但是此处类A只需要方法1 、2 、3
 */
class A {
    public void operation1(Interface1 interface1) {
        interface1.operation1();
    }

    public void operation2(Interface1 interface1) {
        interface1.operation2();
    }

    public void operation3(Interface1 interface1) {
        interface1.operation3();
    }
}

/**
 * 类C通过接口Interface1依赖实现类D，但此处类C只需要方法1 、4 、5
 */
class C {
    public void operation1(Interface1 interface1) {
        interface1.operation1();
    }

    public void operation4(Interface1 interface1) {
        interface1.operation4();
    }

    public void operation5(Interface1 interface1) {
        interface1.operation5();
    }
}