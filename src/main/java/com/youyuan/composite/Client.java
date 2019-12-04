package com.youyuan.composite;

/**
 * @author zhangy
 * @version 1.0
 * @description 客户端
 * @date 2019/12/2 12:13
 */
public class Client {

    public static void main(String[] args) {

        //大学
        OrganizationComponent university = new University("清华大学", "中国顶级学府");

        //学院
        OrganizationComponent computerCollege = new College("计算机学院", "计算机学院");
        OrganizationComponent infoCollege = new College("信息工程学院", "信息工程学院");

        //将学院添加大学
        university.add(computerCollege);
        university.add(infoCollege);

        //系
        OrganizationComponent software = new Department("软件工程系", "软件工程系");
        OrganizationComponent network = new Department("网络工程系", "网络工程系");
        OrganizationComponent communication = new Department("通信工程系", "通信工程系");
        OrganizationComponent info = new Department("信息工程系", "信息工程系");

        //将系添加到学院
        computerCollege.add(software);
        computerCollege.add(network);
        infoCollege.add(communication);
        infoCollege.add(info);

        //打印
        university.print();

        computerCollege.print();


    }

}
