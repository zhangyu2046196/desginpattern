package com.youyuan.adapter.objectadapter;

/**
 * @author zhangy
 * @version 1.0
 * @description 客户端调用充电操作
 * @date 2019/11/28 16:09
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        //充电
        phone.charing(new VoltageAdapter(new Voltage220V()));
    }

}
