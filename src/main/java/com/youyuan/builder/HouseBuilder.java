package com.youyuan.builder;

/**
 * @author zhangy
 * @version 1.0
 * @description  抽象类对应角色Builder(抽象建造者)
 * @date 2019/11/28 11:35
 */
public abstract class HouseBuilder {
    /**
     * 打地基
     */
    public abstract void buildBasic();

    /**
     * 砌墙
     */
    public abstract void buildWalls();

    /**
     * 封顶
     */
    public abstract void roofed();

    /**
     * 返回product
     * @return
     */
    public House getHouse(){
        return new House();
    }
}
