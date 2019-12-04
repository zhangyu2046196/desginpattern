package com.youyuan.factory.simplefactory.pizza;

/**
 * @author zhangy
 * @version 1.0
 * @description  奶酪披萨
 * @date 2019/11/27 9:09
 */
public class CheesePizza extends Pizza {

    public CheesePizza(String name){
        this.setName(name);
    }

    @Override
    public void prepare() {
        System.out.println("给奶酪披萨准备原材料");
    }
}
