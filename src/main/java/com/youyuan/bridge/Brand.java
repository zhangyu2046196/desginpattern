package com.youyuan.bridge;

/**
 * @author zhangy
 * @version 1.0
 * @description  设计模式—结构型—桥接模式
 *
 * 手机品牌接口
 *
 * @date 2019/11/28 18:10
 */
public interface Brand {
    /**
     * 开机
     */
    public void open();

    /**
     * 关机
     */
    public void close();

    /**
     * 打电话
     */
    public void call();
}
