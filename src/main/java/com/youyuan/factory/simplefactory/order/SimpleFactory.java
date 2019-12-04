package com.youyuan.factory.simplefactory.order;

import com.youyuan.factory.simplefactory.pizza.CheesePizza;
import com.youyuan.factory.simplefactory.pizza.GreekPizza;
import com.youyuan.factory.simplefactory.pizza.Pizza;
import org.apache.commons.lang3.StringUtils;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—创建型—工厂模式—简单工厂(静态工程)
 * @date 2019/11/27 10:29
 */
public class SimpleFactory {

    /**
     * 静态工厂方法，根据类型创建pizza
     *
     * @param orderType 类型
     * @return 返回创建的pizza对象
     */
    public static Pizza createPizza(String orderType) {
        if (StringUtils.isNotBlank(orderType)) {
            if (orderType.equals("greek")) {//希腊披萨
                return new GreekPizza("希腊披萨");
            } else if (orderType.equals("cheese")) {//奶酪披萨
                return new CheesePizza("奶酪披萨");
            }
        }
        return null;
    }

}
