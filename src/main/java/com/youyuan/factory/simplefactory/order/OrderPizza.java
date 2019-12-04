package com.youyuan.factory.simplefactory.order;

import com.youyuan.factory.simplefactory.pizza.CheesePizza;
import com.youyuan.factory.simplefactory.pizza.GreekPizza;
import com.youyuan.factory.simplefactory.pizza.Pizza;
import sun.dc.pr.PRError;

import java.io.*;

/**
 * @author zhangy
 * @version 1.0
 * @description 订购披萨
 * @date 2019/11/27 9:11
 */
public class OrderPizza {

    /**
     * 构造方法
     */
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getNameType();
            pizza = SimpleFactory.createPizza(orderType);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }

        } while (true);
    }

    /**
     * 获取披萨类型
     *
     * @return
     */
    private String getNameType() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("请输出订购披萨的类型");
            String s = bufferedReader.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
