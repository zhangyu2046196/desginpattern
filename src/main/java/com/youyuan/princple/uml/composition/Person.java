package com.youyuan.princple.uml.composition;

/**
 * @author zhangy
 * @version 1.0
 * @description 测试UML类中的组合关系  人类
 * @date 2019/11/21 9:47
 */
public class Person {
    private IDCard idCard;
    private Head head = new Head();
}
