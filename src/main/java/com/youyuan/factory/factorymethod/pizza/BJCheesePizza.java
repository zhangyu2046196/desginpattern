package com.youyuan.factory.factorymethod.pizza;

/**
 * @author zhangy
 * @version 1.0
 * @description 北京奶酪披萨
 * @date 2019/11/27 11:31
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("准备北京奶酪披萨原材料");
    }
}
