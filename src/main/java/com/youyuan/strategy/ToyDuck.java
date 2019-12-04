package com.youyuan.strategy;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—行为型—策略模式
 * <p>
 * 玩具鸭
 * 玩具鸭不会飞
 * @date 2019/12/4 18:43
 */
public class ToyDuck extends Duck {
    public ToyDuck(String name) {
        super(name);
        setFlyBehavior(new NoFlyBehavior());
    }
}
