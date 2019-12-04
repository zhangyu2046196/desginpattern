package com.youyuan.bridge;

/**
 * @author zhangy
 * @version 1.0
 * @description  手机样式抽象类
 * @date 2019/11/28 18:13
 */
public abstract class AbstractorPhone {

    private Brand brand;

    public AbstractorPhone(Brand brand) {
        this.brand = brand;
    }

    /**
     * 手机开机
     */
    public void open(){
        brand.open();
    }

    /**
     * 手机关机
     */
    public void close(){
        brand.close();
    }

    /**
     * 手机打电话
     */
    public void call(){
        brand.call();
    }
}
