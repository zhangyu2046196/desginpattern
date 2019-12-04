package com.youyuan.decorator;

/**
 * @author zhangy
 * @version 1.0
 * @description 装饰者(巧克力调料)
 * @date 2019/12/2 9:03
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力调料");
        setPrice(3.0f);
    }
}
