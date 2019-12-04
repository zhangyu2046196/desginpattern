package com.youyuan.factory.abstractfactory.order;

import com.youyuan.factory.abstractfactory.pizza.LDCheesePizza;
import com.youyuan.factory.abstractfactory.pizza.LDPepperPizza;
import com.youyuan.factory.abstractfactory.pizza.Pizza;
import org.apache.commons.lang3.StringUtils;

/**
 * @author zhangy
 * @version 1.0
 * @description 伦敦工厂类
 * @date 2019/11/27 18:35
 */
public class LDPizzaFactory implements PizzaAbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        if (StringUtils.isNotBlank(orderType)) {
            if (orderType.equals("cheese")) {
                return new LDCheesePizza();
            } else if (orderType.equals("pepper")) {
                return new LDPepperPizza();
            }
        }
        return null;
    }
}
