package com.youyuan.princple.inversion.improve;

/**
 * @author zhangy
 * @version 1.0
 * @description 遵循依赖倒转原则代码
 * <p>
 * 概念：面向接口编程，细节依赖抽象，抽象(接口或抽象类)不能依赖细节(实现类)
 * @date 2019/11/20 11:00
 */
public class DependenceInversion {

    public static void main(String[] args) {
        Email email = new Email();
        Weixin weixin = new Weixin();
        Person person = new Person();
        person.receive(email);
        person.receive(weixin);
    }

}

/**
 * 定义接口，依赖倒转原则的核心思想是面向接口编程
 */
interface IReceive {
    public String getInfo();
}

/**
 * email实现类
 */
class Email implements IReceive {

    @Override
    public String getInfo() {
        return "email发送消息...";
    }
}

/**
 * 微信实现类
 */
class Weixin implements IReceive {

    @Override
    public String getInfo() {
        return "微信发送消息";
    }
}

class Person {
    public void receive(IReceive iReceive) {
        System.out.println(iReceive.getInfo());
    }
}
