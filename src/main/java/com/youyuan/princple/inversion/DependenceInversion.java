package com.youyuan.princple.inversion;

/**
 * @author zhangy
 * @version 1.0
 * @description 测试违反依赖倒转原则
 * <p>
 * 概念：面向接口编程，细节依赖抽象，抽象(接口或抽象类)不能依赖细节(实现类)
 * @date 2019/11/20 10:53
 */
public class DependenceInversion {

    public static void main(String[] args) {
        Email email = new Email();
        Person person = new Person();
        person.receive(email);
    }

}

class Email {
    public String getInfo() {
        return "发送email消息内容。。";
    }
}

/**
 * 问题：如果现在需要接受微信或短信的消息，需要重载receive方法，违反了依赖倒转原则
 */
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
