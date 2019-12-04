package com.youyuan.factory.factorymethod.order;

import com.youyuan.factory.factorymethod.pizza.LDCheesePizza;
import com.youyuan.factory.factorymethod.pizza.LDPepperPizza;
import com.youyuan.factory.factorymethod.pizza.Pizza;
import org.apache.commons.lang3.StringUtils;
import org.apache.el.lang.ELArithmetic;

/**
 * @author zhangy
 * @version 1.0
 * @description 伦敦创建披萨
 * @date 2019/11/27 11:41
 */
public class LDOrderPizza extends OrderPizza {
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
