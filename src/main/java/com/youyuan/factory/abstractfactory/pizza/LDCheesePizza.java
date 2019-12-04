package com.youyuan.factory.abstractfactory.pizza;

/**
 * @author zhangy
 * @version 1.0
 * @description 伦敦奶酪披萨
 * @date 2019/11/27 11:33
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("准备伦敦奶酪披萨");
    }
}
