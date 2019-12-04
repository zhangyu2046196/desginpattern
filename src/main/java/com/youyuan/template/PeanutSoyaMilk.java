package com.youyuan.template;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—行为型—模板模式
 * <p>
 * 花生豆浆
 * @date 2019/12/3 21:02
 */
public class PeanutSoyaMilk extends SoyaMilk {
    @Override
    public void addIngredients() {
        System.out.println("添加好花生");
    }
}
