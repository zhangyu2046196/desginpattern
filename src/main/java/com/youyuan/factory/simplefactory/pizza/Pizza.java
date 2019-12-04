package com.youyuan.factory.simplefactory.pizza;

/**
 * @author zhangy
 * @version 1.0
 * @description pizza的抽象类
 * @date 2019/11/27 9:04
 */
public abstract class Pizza {

    /**
     * pizza的名字
     */
    private String name;

    /**
     * 给披萨准备原材料
     */
    public abstract void prepare();

    /**
     * 烘焙方法
     */
    public void bake() {
        System.out.println(name + " baking");
    }

    /**
     * 切割方法
     */
    public void cut() {
        System.out.println(name + " cuting");
    }

    /**
     * 打包方法
     */
    public void box() {
        System.out.println(name + " boxing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
