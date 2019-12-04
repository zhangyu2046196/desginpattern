package com.youyuan.decorator;

/**
 * @author zhangy
 * @version 1.0
 * @description 饮料抽象类
 * @date 2019/12/2 8:46
 */
public abstract class Drink {
    /**
     * 描述
     */
    private String des;
    /**
     * 价格
     */
    private float price;

    /**
     * 费用计算方法
     *
     * @return
     */
    public abstract float cost();

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
