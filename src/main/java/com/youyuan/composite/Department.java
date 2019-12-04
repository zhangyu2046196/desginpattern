package com.youyuan.composite;

/**
 * @author zhangy
 * @version 1.0
 * @description 系
 * @date 2019/12/2 12:12
 */
public class Department extends OrganizationComponent {
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public void print() {
        System.out.println("=========" + this.getName() + "=========");
    }
}
