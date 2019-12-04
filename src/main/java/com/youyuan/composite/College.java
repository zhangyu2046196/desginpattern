package com.youyuan.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangy
 * @version 1.0
 * @description 学院
 * @date 2019/12/2 12:11
 */
public class College extends OrganizationComponent {
    /**
     * 存储系信息
     */
    private List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public College(String name, String des) {
        super(name, des);
    }

    /**
     * 重写添加方法
     *
     * @param organizationComponent
     */
    public void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    /**
     * 重写删除方法
     *
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
