package com.youyuan.builder;

/**
 * @author zhangy
 * @version 1.0
 * @description  高楼对应角色ConcreteBuilder(具体建造者)
 * @date 2019/11/28 11:39
 */
public class HightHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基20m");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙30cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }
}
