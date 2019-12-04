package com.youyuan.prototype;

/**
 * @author zhangy
 * @version 1.0
 * @description  使用在浅克隆的引用类型上
 * @date 2019/11/28 9:42
 */
public class SheepTarget {

    private String name;

    public SheepTarget() {
    }

    public SheepTarget(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SheepTarget{" +
                "name='" + name + '\'' +
                '}';
    }
}
