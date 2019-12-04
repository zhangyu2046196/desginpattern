package com.youyuan.proxy.jdkproxy;

/**
 * @author zhangy
 * @version 1.0
 * @description
 * @date 2019/12/3 10:19
 */
public class Client {

    public static void main(String[] args) {
        //目标对象
        ITeacherDao teacherDao = new TeacherDao();
        //代理工厂
        ProxyFactory factory = new ProxyFactory(teacherDao);
        //构建代理对象
        ITeacherDao proxy = (ITeacherDao) factory.getInstanceProxy();
        //调用目标对象方法
        proxy.teach();
    }

}
