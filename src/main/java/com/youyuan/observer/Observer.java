package com.youyuan.observer;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—行为型—观察者模式
 * <p>
 * 观察者接口
 * @date 2019/12/9 9:14
 */
public interface Observer {
    /**
     * 获取更新的天气预报数据，供气象局调用
     *
     * @param temperature 温度
     * @param humidity    湿度
     * @param pressure    气压
     */
    public void update(float temperature, float humidity, float pressure);
}
