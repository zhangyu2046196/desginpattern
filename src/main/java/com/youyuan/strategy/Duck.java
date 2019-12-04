package com.youyuan.strategy;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—行为型—策略模式
 * <p>
 * 鸭子抽象接口
 * <p>
 * 测试：野鸭飞的好，嘎嘎叫
 * 北京鸭飞的一般，咯咯叫
 * 玩具鸭不会飞
 * @date 2019/12/4 18:31
 */
public class Duck {
    /**
     * 飞行策略
     */
    private FlyBehavior flyBehavior;
    /**
     * 叫声策略
     */
    private QuackBehavior quackBehavior;
    /**
     * 名字
     */
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    /**
     * 叫声
     */
    public void quack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    /**
     * 飞行
     */
    public void fly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    /**
     * 游泳
     */
    public void swim() {
        System.out.print("会游泳");
    }

    /**
     * 打印信息
     */
    public void display(){
        System.out.print("这是" + this.name + " 飞行水平");
        fly();
        System.out.print(" 叫声");
        quack();
        System.out.println("");
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
