package com.youyuan.factory.factorymethod.pizza;

/**
 * @author zhangy
 * @version 1.0
 * @description 北京胡椒披萨
 * @date 2019/11/27 11:32
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("准备北京胡椒披萨");
    }
}
