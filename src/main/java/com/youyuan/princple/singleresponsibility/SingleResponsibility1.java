package com.youyuan.princple.singleresponsibility;

/**
 * @author zhangy
 * @version 1.0
 * @description 测试违反单一职责原则测试类
 * <p>
 * 概念：单一职责原则是指一个类只负责一个职责，如果一个类负责职责1、职责2时，在修改职责1时有可能会影响到职责2，所以要遵循单一职责原则
 * <p>
 * 以交通工具为例讲解
 * @date 2019/11/19 21:13
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");
    }

}

/**
 * 交通工具类
 *
 * 方案1分析
 * 1、如果参数为飞机就违反了单一职责原则
 * 2、解决方案：可以根据不同的交通工具类型创建多个类
 *
 */
class Vehicle {
    public void run(String vehicleName) {
        System.out.println(vehicleName + " 在公路运行...");
    }
}
