package com.youyuan.factory.abstractfactory.order;

import com.youyuan.factory.abstractfactory.pizza.BJCheesePizza;
import com.youyuan.factory.abstractfactory.pizza.BJPepperPizza;
import com.youyuan.factory.abstractfactory.pizza.Pizza;
import org.apache.commons.lang3.StringUtils;

/**
 * @author zhangy
 * @version 1.0
 * @description 北京工厂类
 * @date 2019/11/27 18:33
 */
public class BJPizzaFactory implements PizzaAbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        if (StringUtils.isNotBlank(orderType)) {
            if (orderType.equals("cheese")) {
                return new BJCheesePizza();
            } else if (orderType.equals("pepper")) {
                return new BJPepperPizza();
            }
        }
        return null;
    }
}
