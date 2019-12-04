package com.youyuan.facade;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—结构型—外观模式
 * <p>
 * 测试项目：家庭影院播放
 * <p>
 * 灯光类
 * @date 2019/12/2 17:19
 */
public class TheaterLights {
    private static TheaterLights instance;

    /**
     * dcl方式的单例
     *
     * @return
     */
    public static TheaterLights getInstance() {
        if (instance == null) {
            synchronized (TheaterLights.class) {
                if (instance == null) {
                    instance = new TheaterLights();
                }
            }
        }
        return instance;
    }

    public void on() {
        System.out.println("灯光打开......");
    }

    public void off() {
        System.out.println("灯光关闭......");
    }

    public void bright() {
        System.out.println("灯光调亮......");
    }

    public void dim() {
        System.out.println("灯光调暗.....");
    }
}
