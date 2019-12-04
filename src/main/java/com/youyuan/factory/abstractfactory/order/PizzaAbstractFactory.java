package com.youyuan.factory.abstractfactory.order;

import com.youyuan.factory.abstractfactory.pizza.Pizza;

/**
 * @author zhangy
 * @version 1.0
 * @description  定义接口工厂
 * @date 2019/11/27 18:32
 */
public interface PizzaAbstractFactory {

    public Pizza createPizza(String orderType);

}
