package com.youyuan.bridge;

/**
 * @author zhangy
 * @version 1.0
 * @description  小米品牌手机
 * @date 2019/11/28 18:11
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
