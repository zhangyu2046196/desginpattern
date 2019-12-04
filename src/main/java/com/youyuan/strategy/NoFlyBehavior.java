package com.youyuan.strategy;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—行为型—策略模式
 * <p>
 * 不会飞实现类
 * @date 2019/12/4 18:27
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.print("不会飞");
    }
}
