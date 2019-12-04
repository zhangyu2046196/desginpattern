package com.youyuan.princple.singleresponsibility;

/**
 * @author zhangy
 * @version 1.0
 * @description 测试通过多个类的方式遵循单一职责原则
 * <p>
 * 概念：单一职责原则是指一个类只负责一个职责，如果一个类负责职责1、职责2时，在修改职责1时有可能会影响到职责2，所以要遵循单一职责原则
 * @date 2019/11/19 21:19
 */
public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadVehice roadVehice = new RoadVehice();
        roadVehice.run("汽车");
        AirVehice airVehice = new AirVehice();
        airVehice.run("飞机");
        WaterVehice waterVehice = new WaterVehice();
        waterVehice.run("轮船");
    }

}

/**
 *
 * 方案2分析
 * 1、遵循单一职责原则
 * 2、坏处：维护麻烦，增加新功能改动比较多
 * 3、解决方案：一个类多个方法来遵循单一职责原则
 *
 */

/**
 * 公路交通工具类
 */
class RoadVehice {
    public void run(String vehiceName) {
        System.out.println(vehiceName + " 在公路运行");
    }
}

/**
 * 天空交通工具类
 */
class AirVehice {
    public void run(String vehiceName) {
        System.out.println(vehiceName + " 在天空运行");
    }
}

/**
 * 水中交通工具类
 */
class WaterVehice {
    public void run(String vehiceName) {
        System.out.println(vehiceName + " 在水中运行");
    }
}

