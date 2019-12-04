package com.youyuan.adapter.objectadapter;

/**
 * @author zhangy
 * @version 1.0
 * @description 手机，用于充电
 * @date 2019/11/28 16:08
 */
public class Phone {

    public void charing(IVoltage5V iVoltage5V) {
        int dst = iVoltage5V.output5v();
        if (dst == 5) {
            System.out.println("输出5v电压,可以充电");
        } else {
            System.out.println("输出电压过高或过低,不能充电");
        }
    }

}
