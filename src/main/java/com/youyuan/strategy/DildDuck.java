package com.youyuan.strategy;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—行为型—策略模式
 * <p>
 * 野鸭
 * 野鸭飞的好，嘎嘎叫
 * @date 2019/12/4 18:36
 */
public class DildDuck extends Duck {

    public DildDuck(String name) {
        super(name);
        setFlyBehavior(new BadFlyBehavior());
        setQuackBehavior(new GaGaQuackBehavior());
    }
}
