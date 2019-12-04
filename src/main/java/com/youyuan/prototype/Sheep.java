package com.youyuan.prototype;

import java.util.Date;

/**
 * @author zhangy
 * @version 1.0
 * @description  设计模式—创建型—原型模式—浅克隆
 *
 * 项目：克隆羊
 * 思路：需要实现Cloneable接口，重写clone方法
 *
 * @date 2019/11/27 21:06
 */
public class Sheep implements Cloneable {

    private String name;
    private int age;
    private String color;
    private Date datetime;

    private SheepTarget sheepTarget;

    public Sheep(String name, int age, String color, Date datetime, SheepTarget sheepTarget) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.datetime = datetime;
        this.sheepTarget = sheepTarget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public SheepTarget getSheepTarget() {
        return sheepTarget;
    }

    public void setSheepTarget(SheepTarget sheepTarget) {
        this.sheepTarget = sheepTarget;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", datetime=" + datetime +
                ", sheepTarget=" + sheepTarget +
                '}';
    }
}
