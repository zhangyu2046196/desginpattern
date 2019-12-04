package com.youyuan.prototype;

import java.util.Date;

/**
 * @author zhangy
 * @version 1.0
 * @description 测试原型模式
 * @date 2019/11/27 21:09
 */
public class Clinet {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date datetime = new Date(998800989878829898L);
        Sheep sheep1 = new Sheep("tom", 2, "白色", datetime,new SheepTarget("德国"));
        Sheep sheep2 = (Sheep) sheep1.clone();
        Sheep sheep3 = (Sheep) sheep1.clone();
        Sheep sheep4 = (Sheep) sheep1.clone();
        Sheep sheep5 = (Sheep) sheep1.clone();

        System.out.println("克隆后的值");
        System.out.println("sheep1:" + sheep1 + "hashCode:" + sheep1.getSheepTarget().hashCode());
        System.out.println("sheep2:" + sheep2 + "hashCode:" + sheep2.getSheepTarget().hashCode());
        System.out.println("sheep3:" + sheep3 + "hashCode:" + sheep3.getSheepTarget().hashCode());
        System.out.println("sheep4:" + sheep4 + "hashCode:" + sheep4.getSheepTarget().hashCode());
        System.out.println("sheep5:" + sheep5 + "hashCode:" + sheep5.getSheepTarget().hashCode());

        //修改被克隆的值
        datetime = new Date(871288217837897889L);
        sheep1.setDatetime(datetime);

        sheep1.setSheepTarget(new SheepTarget("内蒙"));

        System.out.println("修改被克隆的datetime和sheepTarget属性值后");
        System.out.println("sheep1:" + sheep1 + "hashCode:" + sheep1.getSheepTarget().hashCode());
        System.out.println("sheep2:" + sheep2 + "hashCode:" + sheep2.getSheepTarget().hashCode());
        System.out.println("sheep3:" + sheep3 + "hashCode:" + sheep3.getSheepTarget().hashCode());
        System.out.println("sheep4:" + sheep4 + "hashCode:" + sheep4.getSheepTarget().hashCode());
        System.out.println("sheep5:" + sheep5 + "hashCode:" + sheep5.getSheepTarget().hashCode());
    }

}
