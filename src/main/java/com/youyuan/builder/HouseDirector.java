package com.youyuan.builder;

/**
 * @author zhangy
 * @version 1.0
 * @description 对应角色Director(指挥者)
 * @date 2019/11/28 11:41
 */
public class HouseDirector {

    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 组拼建造过程
     */
    public void build() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        House house = houseBuilder.getHouse();
    }

}
