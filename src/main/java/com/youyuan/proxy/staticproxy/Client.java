package com.youyuan.proxy.staticproxy;

/**
 * @author zhangy
 * @version 1.0
 * @description
 * @date 2019/12/3 9:14
 */
public class Client {

    public static void main(String[] args) {
        //目标对象
        ITeacherDao teacherDao = new TeacherDao();
        //代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        //通过代理对象执行目标方法
        teacherDaoProxy.teach();
    }

}
