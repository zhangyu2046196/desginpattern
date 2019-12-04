package com.youyuan.bridge;

/**
 * @author zhangy
 * @version 1.0
 * @description  vivo手机品牌
 * @date 2019/11/28 18:12
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("vivo手机开机");
    }

    @Override
    public void close() {
        System.out.println("vivo手机关机");
    }

    @Override
    public void call() {
        System.out.println("vivo手机打电话");
    }
}
