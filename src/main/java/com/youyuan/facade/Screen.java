package com.youyuan.facade;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—结构型—外观模式
 * <p>
 * 测试项目：家庭影院播放
 * <p>
 * 屏幕类
 * @date 2019/12/2 17:12
 */
public class Screen {
    private static Screen instance;

    /**
     * dcl方式的单例
     *
     * @return
     */
    public static Screen getInstance() {
        if (instance == null) {
            synchronized (Screen.class) {
                if (instance == null) {
                    instance = new Screen();
                }
            }
        }
        return instance;
    }

    public void up() {
        System.out.println("影院屏幕升起......");
    }

    public void down() {
        System.out.println("影院屏幕降下.....");
    }
}
