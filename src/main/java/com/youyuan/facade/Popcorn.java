package com.youyuan.facade;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—结构型—外观模式
 * <p>
 * 测试项目：家庭影院播放
 * <p>
 * 爆米花类
 * @date 2019/12/2 17:16
 */
public class Popcorn {
    private static Popcorn instance;

    /**
     * dcl方式的单例
     *
     * @return
     */
    public static Popcorn getInstance() {
        if (instance == null) {
            synchronized (Popcorn.class) {
                if (instance == null) {
                    instance = new Popcorn();
                }
            }
        }
        return instance;
    }

    public void on() {
        System.out.println("爆米花打开......");
    }

    public void off() {
        System.out.println("爆米花关闭......");
    }

    public void pop(){
        System.out.println("爆米花生产出爆米花.....");
    }
}
