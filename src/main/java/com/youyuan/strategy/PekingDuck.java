package com.youyuan.strategy;

/**
 * @author zhangy
 * @version 1.0
 * @description  设计模式—行为型—策略模式
 *
 * 北京鸭
 * 北京鸭飞的一般，咯咯叫
 *
 * @date 2019/12/4 18:38
 */
public class PekingDuck extends Duck {

    public PekingDuck(String name) {
        super(name);
        setFlyBehavior(new OrdinaryFlyBehavior());
        setQuackBehavior(new GeGeQuackBehavior());
    }
}
