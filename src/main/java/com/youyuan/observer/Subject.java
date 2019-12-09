package com.youyuan.observer;

/**
 * @author zhangy
 * @version 1.0
 * @description 设计模式—行为型—观察者模式
 * <p>
 * 气象站接口
 * @date 2019/12/9 9:23
 */
public interface Subject {
    /**
     * 注册
     *
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 移除
     *
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 通知
     */
    public void notifyObservers();
}
