package com.youyuan.facade;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—结构型—外观模式
 * <p>
 * 测试项目：家庭影院播放
 * <p>
 * dvd类
 * @date 2019/12/2 17:21
 */
public class DVDPlayer {
    private static DVDPlayer instance;

    /**
     * dcl方式的单例
     *
     * @return
     */
    public static DVDPlayer getInstance() {
        if (instance == null) {
            synchronized (DVDPlayer.class) {
                if (instance == null) {
                    instance = new DVDPlayer();
                }
            }
        }
        return instance;
    }

    public void on() {
        System.out.println("dvd打开......");
    }

    public void off() {
        System.out.println("dvd关闭......");
    }

    public void pause() {
        System.out.println("dvd暂停......");
    }

    public void play() {
        System.out.println("dvd播放.....");
    }
}
