package com.youyuan.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangy
 * @version 1.0
 * @description 大学
 * @date 2019/12/2 12:06
 */
public class University extends OrganizationComponent {

    /**
     * 存储学院信息
     */
    private List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public University(String name, String des) {
        super(name, des);
    }

    /**
     * 重写添加方法
     * @param organizationComponent
     */
    public void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    /**
     * 重写删除方法
     * @param organizationComponent
     */
    public void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    /**
     * 实现打印方法
     */
    public void print() {
        System.out.println("===========" + this.getName() + "============");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            System.out.println(organizationComponent.getName());
        }
    }
}
