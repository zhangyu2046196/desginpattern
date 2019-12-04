package com.youyuan.decorator;

/**
 * @author zhangy
 * @version 1.0
 * @description 装饰者 此处代表调料
 * @date 2019/12/2 8:56
 */
public class Decorator extends Drink {
    /**
     * 被装饰者
     */
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        //调料的价格+被装饰者(咖啡)的价格
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + " " + super.getPrice() + " && " + drink.getDes();
    }
}
