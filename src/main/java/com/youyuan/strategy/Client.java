package com.youyuan.strategy;

/**
 * @author zhangy
 * @version 1.0
 * @description
 * @date 2019/12/4 18:45
 */
public class Client {

    public static void main(String[] args) {

        Duck dildDuck = new DildDuck("野鸭");
        dildDuck.display();

        Duck pekingDuck = new PekingDuck("北京鸭");
        pekingDuck.display();

        Duck toyDuck = new ToyDuck("玩具鸭");
        toyDuck.display();
    }

}
