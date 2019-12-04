package com.youyuan.factory.factorymethod.order;

import com.youyuan.factory.factorymethod.pizza.BJCheesePizza;
import com.youyuan.factory.factorymethod.pizza.BJPepperPizza;
import com.youyuan.factory.factorymethod.pizza.Pizza;
import org.apache.commons.lang3.StringUtils;

/**
 * @author zhangy
 * @version 1.0
 * @description 北京创建披萨
 * @date 2019/11/27 11:39
 */
public class BJOrderPizza extends OrderPizza {
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
