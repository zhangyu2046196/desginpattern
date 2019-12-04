package com.youyuan.princple.uml.aggregation;

/**
 * @author zhangy
 * @version 1.0
 * @description  测试UML类的聚合关系  电脑类
 * @date 2019/11/21 9:35
 */
public class Computer {

    private Mouse mouse;
    private Monitor monitor;

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
