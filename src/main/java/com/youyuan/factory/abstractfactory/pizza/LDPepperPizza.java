package com.youyuan.factory.abstractfactory.pizza;

/**
 * @author zhangy
 * @version 1.0
 * @description 伦敦胡椒披萨
 * @date 2019/11/27 11:33
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("准备伦敦胡椒披萨");
    }
}
