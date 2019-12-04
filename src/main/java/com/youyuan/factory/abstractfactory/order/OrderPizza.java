package com.youyuan.factory.abstractfactory.order;

import com.youyuan.factory.abstractfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zhangy
 * @version 1.0
 * @description
 * @date 2019/11/27 18:36
 */
public class OrderPizza {
    private PizzaAbstractFactory factory;

    public OrderPizza(PizzaAbstractFactory factory) {
        this.factory = factory;
        getPizza();
    }

    private void getPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        } while (true);

    }

    private String getType() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("请输入pizza类型");
            String s = bufferedReader.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
