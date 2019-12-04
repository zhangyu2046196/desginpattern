package com.youyuan.composite;

/**
 * @author zhangy
 * @version 1.0
 * @description 抽象类，为大学、学院、系的基类
 * <p>
 * 测试项目:编写程序展示一个学校院系结构：需求是这样，要在一个页面中展示出学校的院系组成，一个学校有多个学院，一个学院有多个系
 * @date 2019/12/2 12:01
 */
public abstract class OrganizationComponent {
    /**
     * 名字
     */
    private String name;
    /**
     * 描述
     */
    private String des;

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    /**
     * 添加   增加默认的实现方法
     *
     * @param organizationComponent
     */
    public void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 删除   增加默认的实现方法
     *
     * @param organizationComponent
     */
    public void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 打印树形结构
     */
    public abstract void print();
}
