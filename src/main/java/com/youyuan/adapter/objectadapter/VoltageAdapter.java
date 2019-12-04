package com.youyuan.adapter.objectadapter;

/**
 * @author zhangy
 * @version 1.0
 * @description 适配器类，作用将被适配类的输出220v电压转成5v电压
 * @date 2019/11/28 16:07
 */
public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5v() {
        System.out.println("使用对象适配器转换");
        int dst = 0;
        if (voltage220V != null) {
            int src = voltage220V.output220v();
            dst = src / 44;
        }
        return dst;
    }
}
