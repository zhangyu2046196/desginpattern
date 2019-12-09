package com.youyuan.observer;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—行为型—观察者模式
 * <p>
 * 具体观察者
 * @date 2019/12/9 9:17
 */
public class CurrentConditons implements Observer {
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 气压
     */
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    /**
     * 展示信息
     */
    private void display() {
        System.out.println("=========气象网站显示气象信息如下=========");
        System.out.println("温度：" + this.temperature);
        System.out.println("湿度：" + this.humidity);
        System.out.println("气压：" + this.pressure);
    }
}
