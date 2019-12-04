package com.youyuan.factory.factorymethod.order;

import com.youyuan.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * @author zhangy
 * @version 1.0
 * @description 订购披萨抽象类
 * @date 2019/11/27 11:35
 */
public abstract class OrderPizza {
    private Pizza pizza = null;
    private String orderType;

    public OrderPizza() {
        do {
            orderType = getOrderType();
            pizza = createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        } while (true);
    }

    public abstract Pizza createPizza(String orderType);

    /**
     * 获取订单类型
     *
     * @return
     */
    private String getOrderType() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("请输入pizza类型");
            String s = bufferedReader.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
