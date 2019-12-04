package com.youyuan.decorator;

/**
 * @author zhangy
 * @version 1.0
 * @description 缓冲层
 * @date 2019/12/2 8:48
 */
public class Coffe extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
