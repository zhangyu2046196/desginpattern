package com.youyuan.builder;

/**
 * @author zhangy
 * @version 1.0
 * @description  普通房对应角色ConcreteBuilder(具体建造者)
 * @date 2019/11/28 11:38
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房打地基5m");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房封顶");
    }
}
