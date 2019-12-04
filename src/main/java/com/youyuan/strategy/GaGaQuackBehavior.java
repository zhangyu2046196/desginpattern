package com.youyuan.strategy;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—行为型—策略模式
 * <p>
 * 嘎嘎叫实现类
 * @date 2019/12/4 18:30
 */
public class GaGaQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.print("嘎嘎叫");
    }
}
