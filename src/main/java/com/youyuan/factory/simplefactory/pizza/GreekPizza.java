package com.youyuan.factory.simplefactory.pizza;

/**
 * @author zhangy
 * @version 1.0
 * @description  希腊披萨
 * @date 2019/11/27 9:08
 */
public class GreekPizza extends Pizza {

    public GreekPizza(String name){
        this.setName(name);
    }

    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
