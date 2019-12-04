package com.youyuan.facade;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—结构型—外观模式
 * <p>
 * 测试项目：家庭影院播放
 * <p>
 * 投影仪类
 * @date 2019/12/2 17:14
 */
public class Projector {
    private static Projector instance;

    /**
     * dcl方式的单例
     *
     * @return
     */
    public static Projector getInstance() {
        if (instance == null) {
            synchronized (Projector.class) {
                if (instance == null) {
                    instance = new Projector();
                }
            }
        }
        return instance;
    }

    public void on() {
        System.out.println("投影仪打开......");
    }

    public void off() {
        System.out.println("投影仪关闭.....");
    }
}
