package com.youyuan.facade;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—结构型—外观模式
 * <p>
 * 测试项目：家庭影院播放
 * <p>
 * 音响类
 * @date 2019/12/2 17:06
 */
public class Stereo {
    private static Stereo instance;

    /**
     * dcl方式的单例
     *
     * @return
     */
    public static Stereo getInstance() {
        if (instance == null) {
            synchronized (Stereo.class) {
                if (instance == null) {
                    instance = new Stereo();
                }
            }
        }
        return instance;
    }

    public void on() {
        System.out.println("音响打开......");
    }

    public void off() {
        System.out.println("音响关闭......");
    }

    public void up() {
        System.out.println("音响声音调大......");
    }

    public void down() {
        System.out.println("音响声音调小.....");
    }
}
