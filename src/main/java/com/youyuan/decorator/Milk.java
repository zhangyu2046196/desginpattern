package com.youyuan.decorator;

/**
 * @author zhangy
 * @version 1.0
 * @description 装饰者(牛奶调料)
 * @date 2019/12/2 9:01
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶调料");
        setPrice(2.0f);
    }
}
