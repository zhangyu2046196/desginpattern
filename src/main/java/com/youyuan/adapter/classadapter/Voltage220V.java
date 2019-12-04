package com.youyuan.adapter.classadapter;

/**
 * @author zhangy
 * @version 1.0
 * @description 被适配类
 * @date 2019/11/28 16:05
 */
public class Voltage220V {
    /**
     * 被适配类输出220v电压方法
     *
     * @return
     */
    public int output220v() {
        int src = 220;
        System.out.println("被适配类输出电压:" + src + "伏");
        return src;
    }
}
