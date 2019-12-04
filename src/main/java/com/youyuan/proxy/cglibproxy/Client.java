package com.youyuan.proxy.cglibproxy;

/**
 * @author zhangy
 * @version 1.0
 * @description
 * @date 2019/12/3 11:42
 */
public class Client {

    public static void main(String[] args) {
        //目标对象
        TeacherDao target = new TeacherDao();
        //代理工厂构建代理对象
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();

        //代理对象执行目标方法
        proxyInstance.teach();
    }

}
