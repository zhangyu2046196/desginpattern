package com.youyuan.decorator;

/**
 * @author zhangy
 * @version 1.0
 * @description 被装饰者 意大利咖啡
 * @date 2019/12/2 8:55
 */
public class Espresso extends Coffe {
    public Espresso() {
        setDes("意大利咖啡");
        setPrice(6.0f);
    }
}
