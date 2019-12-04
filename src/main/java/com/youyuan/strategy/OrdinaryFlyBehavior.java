package com.youyuan.strategy;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—行为型—策略模式
 * <p>
 * 飞的一般实现类
 * @date 2019/12/4 18:28
 */
public class OrdinaryFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.print("飞的一般");
    }
}
