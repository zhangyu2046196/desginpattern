package com.youyuan.strategy;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—行为型—策略模式
 * <p>
 * 叫声策略接口
 * @date 2019/12/4 18:29
 */
public interface QuackBehavior {
    /**
     * 叫声
     */
    public void quack();
}
