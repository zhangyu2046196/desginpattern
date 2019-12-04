package com.youyuan.factory.abstractfactory.order;

/**
 * @author zhangy
 * @version 1.0
 * @description
 * @date 2019/11/27 18:39
 */
public class PizzaStore {

    public static void main(String[] args) {
//        new OrderPizza(new BJPizzaFactory());
        new OrderPizza(new LDPizzaFactory());
    }

}
