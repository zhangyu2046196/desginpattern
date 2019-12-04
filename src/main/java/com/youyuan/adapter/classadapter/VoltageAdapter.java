package com.youyuan.adapter.classadapter;

/**
 * @author zhangy
 * @version 1.0
 * @description 适配器类，作用将被适配类的输出220v电压转成5v电压
 * @date 2019/11/28 16:07
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5v() {
        System.out.println("使用类适配器转换");
        int src = output220v();
        int dst = src / 44;
        return dst;
    }
}
