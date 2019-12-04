package com.youyuan.princple.singleresponsibility;

/**
 * @author zhangy
 * @version 1.0
 * @description 一个类多个方法方式遵循单一职责原则
 * <p>
 * 概念：单一职责原则是指一个类只负责一个职责，如果一个类负责职责1、职责2时，在修改职责1时有可能会影响到职责2，所以要遵循单一职责原则
 * @date 2019/11/19 21:25
 */
public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runRoad("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }

}

/**
 * 交通工具类
 *
 * 方案3分析
 * 1、遵循单一职责原则
 * 2、通过一个类多个方法来遵循单一职责原则，是方法级别的
 *
 */
class Vehicle2 {
    /**
     * 交通工具在公路运行方法
     *
     * @param vehiceName
     */
    public void runRoad(String vehiceName) {
        System.out.println(vehiceName + " 在公路运行");
    }

    /**
     * 交通工具在天空运行方法
     *
     * @param vehiceName
     */
    public void runAir(String vehiceName) {
        System.out.println(vehiceName + " 在天空运行");
    }

    /**
     * 交通工具在水中运行方法
     *
     * @param vehiceName
     */
    public void runWater(String vehiceName) {
        System.out.println(vehiceName + " 在水中运行");
    }
}