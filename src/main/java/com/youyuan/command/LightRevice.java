package com.youyuan.command;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—行为型—命令模式
 * <p>
 * 电灯执行者
 * @date 2019/12/4 8:22
 */
public class LightRevice {
    /**
     * 开
     */
    public void on() {
        System.out.println("电灯打开......");
    }

    /**
     * 关
     */
    public void off() {
        System.out.println("电灯关闭.....");
    }
}
