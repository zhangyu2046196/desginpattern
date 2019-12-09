package com.youyuan.observer;

/**
 * @author zhangy
 * @version 1.0
 * @description
 * @date 2019/12/9 9:28
 */
public class Client {

    public static void main(String[] args) {
        //定义气象局实现类
        WeatherData weatherData = new WeatherData();

        //定义实际观察者
        CurrentConditons currentConditons = new CurrentConditons();

        //定义百度观察者
        BaiDuSite baiDuSite = new BaiDuSite();

        //注册
        weatherData.registerObserver(currentConditons);
        weatherData.registerObserver(baiDuSite);
        //设置气象数 据 信息 并展示
        weatherData.setData(25f, 140f, 120f);

        //删除当前观察者的注册信息
        weatherData.removeObserver(currentConditons);

        System.out.println("========删除当前观察者后=========");

        //设置气象数 据 信息 并展示
        weatherData.setData(25f, 140f, 120f);

    }

}
