package com.youyuan.builder;

/**
 * @author zhangy
 * @version 1.0
 * @description  模拟客户端
 * @date 2019/11/28 11:42
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("--------建造普通房----------");

        HouseDirector houseDirector = new HouseDirector(new CommonHouse());
        houseDirector.build();

        System.out.println("--------建造高楼-----------");

        HouseDirector houseDirector1 = new HouseDirector(new HightHouse());
        houseDirector1.build();

    }

}
