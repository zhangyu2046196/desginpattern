package com.youyuan.decorator;

/**
 * @author zhangy
 * @version 1.0
 * @description 装饰者(豆浆调料)
 * @date 2019/12/2 9:04
 */
public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setDes("豆浆调料");
        setPrice(1.0f);
    }
}
